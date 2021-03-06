package net.sf.ictalive.service.enactment.simpleevents;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.net.URI;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.mindswap.exceptions.ExecutionException;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.execution.DefaultProcessMonitor;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.query.ValueMap;

public class SimpleSerializationEnactmentListener extends DefaultProcessMonitor {

	OutputStream out;
	PrintStream logPrintStream;
	Marshaller marshaller;

	public SimpleSerializationEnactmentListener(OutputStream os)
			throws IOException, JAXBException {
		out = os;
		logPrintStream = new PrintStream(out);
		JAXBContext jc = JAXBContext
				.newInstance("eu.istalive.service.enactment.simpleevents");
		marshaller = jc.createMarshaller();

	}

	@Override
	public void executionFinished(Process process,
			ValueMap<Input, OWLValue> inputs, ValueMap<Output, OWLValue> outputs) {
		ServiceSuccessEvent successEvent = new ServiceSuccessEvent();
		successEvent.setService(process.getService().getURI());
		successEvent.setProcess(process.getURI());

		HashMap<URI, String> inputmap = new HashMap<URI, String>();
		for (Entry<Input, OWLValue> entry : inputs) {
			inputmap.put(entry.getKey().getURI(), entry.getValue().toString());
		}
		successEvent.setInputs(inputmap);

		HashMap<URI, String> outputmap = new HashMap<URI, String>();
		for (Entry<Output, OWLValue> entry : outputs) {
			outputmap.put(entry.getKey().getURI(), entry.getValue().toString());
		}
		successEvent.setOutputs(outputmap);
		doLog(successEvent);
	}

	@Override
	public void executionFailed(ExecutionException e) {
		ServiceFailedEvent sfe = new ServiceFailedEvent();
		sfe.setStatusMessage(e.getMessage().replaceAll("\n", "\\"));
		sfe.setProcess(e.getProcess().getURI());
		sfe.setService(e.getProcess().getService().getURI());

		doLog(sfe);
	}

	synchronized void doLog(SimpleEnactmentEvent event) {
		try {
			StringWriter sw = new StringWriter();

			marshaller.marshal(event, sw);
			// HACKTASTIC
			String logString = sw
					.toString()
					.replace(
							"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>",
							"");
			logPrintStream.println(logString);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void close() throws IOException {
		out.close();
	}
}
