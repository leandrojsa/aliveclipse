/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import net.sf.ictalive.runtime.fact.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactFactoryImpl extends EFactoryImpl implements FactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FactFactory init() {
		try {
			FactFactory theFactFactory = (FactFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/RunTime/facts"); 
			if (theFactFactory != null) {
				return theFactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FactPackage.STARTED_ACT: return createStartedAct();
			case FactPackage.EXECUTED_ACT: return createExecutedAct();
			case FactPackage.FAILURE_ACT: return createFailureAct();
			case FactPackage.DISASTER: return createDisaster();
			case FactPackage.RECEIVE_ACT: return createReceiveAct();
			case FactPackage.SEND_ACT: return createSendAct();
			case FactPackage.MESSAGE: return createMessage();
			case FactPackage.CONTENT: return createContent();
			case FactPackage.DEADLINE_VIOLATION: return createDeadlineViolation();
			case FactPackage.TASK_VIOLATION: return createTaskViolation();
			case FactPackage.AVAILABILITY: return createAvailability();
			case FactPackage.LANDMARK_FULFILMENT: return createLandmarkFulfilment();
			case FactPackage.NORM_CONDITION_FULFILMENT: return createNormConditionFulfilment();
			case FactPackage.OBJECTIVE_FULFILMENT: return createObjectiveFulfilment();
			case FactPackage.PLAYER_FULFILMENT: return createPlayerFulfilment();
			case FactPackage.NORM_INSTANCE_VIOLATED: return createNormInstanceViolated();
			case FactPackage.NORM_INSTANCE_ACTIVATED: return createNormInstanceActivated();
			case FactPackage.NORM_INSTANCE_EXPIRED: return createNormInstanceExpired();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FactPackage.AVAILABILITY_KIND:
				return createAvailabilityKindFromString(eDataType, initialValue);
			case FactPackage.NORM_TYPE:
				return createNormTypeFromString(eDataType, initialValue);
			case FactPackage.FAILURE_REASONS:
				return createFailureReasonsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FactPackage.AVAILABILITY_KIND:
				return convertAvailabilityKindToString(eDataType, instanceValue);
			case FactPackage.NORM_TYPE:
				return convertNormTypeToString(eDataType, instanceValue);
			case FactPackage.FAILURE_REASONS:
				return convertFailureReasonsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartedAct createStartedAct() {
		StartedActImpl startedAct = new StartedActImpl();
		return startedAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutedAct createExecutedAct() {
		ExecutedActImpl executedAct = new ExecutedActImpl();
		return executedAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureAct createFailureAct() {
		FailureActImpl failureAct = new FailureActImpl();
		return failureAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disaster createDisaster() {
		DisasterImpl disaster = new DisasterImpl();
		return disaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveAct createReceiveAct() {
		ReceiveActImpl receiveAct = new ReceiveActImpl();
		return receiveAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendAct createSendAct() {
		SendActImpl sendAct = new SendActImpl();
		return sendAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineViolation createDeadlineViolation() {
		DeadlineViolationImpl deadlineViolation = new DeadlineViolationImpl();
		return deadlineViolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskViolation createTaskViolation() {
		TaskViolationImpl taskViolation = new TaskViolationImpl();
		return taskViolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandmarkFulfilment createLandmarkFulfilment() {
		LandmarkFulfilmentImpl landmarkFulfilment = new LandmarkFulfilmentImpl();
		return landmarkFulfilment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormConditionFulfilment createNormConditionFulfilment() {
		NormConditionFulfilmentImpl normConditionFulfilment = new NormConditionFulfilmentImpl();
		return normConditionFulfilment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveFulfilment createObjectiveFulfilment() {
		ObjectiveFulfilmentImpl objectiveFulfilment = new ObjectiveFulfilmentImpl();
		return objectiveFulfilment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerFulfilment createPlayerFulfilment() {
		PlayerFulfilmentImpl playerFulfilment = new PlayerFulfilmentImpl();
		return playerFulfilment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstanceViolated createNormInstanceViolated() {
		NormInstanceViolatedImpl normInstanceViolated = new NormInstanceViolatedImpl();
		return normInstanceViolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstanceActivated createNormInstanceActivated() {
		NormInstanceActivatedImpl normInstanceActivated = new NormInstanceActivatedImpl();
		return normInstanceActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstanceExpired createNormInstanceExpired() {
		NormInstanceExpiredImpl normInstanceExpired = new NormInstanceExpiredImpl();
		return normInstanceExpired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityKind createAvailabilityKindFromString(EDataType eDataType, String initialValue) {
		AvailabilityKind result = AvailabilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormType createNormTypeFromString(EDataType eDataType, String initialValue) {
		NormType result = NormType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureReasons createFailureReasonsFromString(EDataType eDataType, String initialValue) {
		FailureReasons result = FailureReasons.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureReasonsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactPackage getFactPackage() {
		return (FactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FactPackage getPackage() {
		return FactPackage.eINSTANCE;
	}

} //FactFactoryImpl
