//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.07 at 04:10:50 PM CEST 
//


package net.sf.ictalive.monitoring.rules.drools.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://drools.org/drools-5.0}restrictionElementType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://drools.org/drools-5.0}abstractRestrictionConnective"/>
 *       &lt;/choice>
 *       &lt;attribute name="field-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abstractRestrictionConnective"
})
@XmlRootElement(name = "field-constraint")
public class FieldConstraint
    extends RestrictionElementType
{

    @XmlElementRef(name = "abstractRestrictionConnective", namespace = "http://drools.org/drools-5.0", type = JAXBElement.class)
    protected List<JAXBElement<? extends RestrictionElementType>> abstractRestrictionConnective;
    @XmlAttribute(name = "field-name", required = true)
    protected String fieldName;

    /**
     * Gets the value of the abstractRestrictionConnective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractRestrictionConnective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractRestrictionConnective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OrRestrictionConnective }{@code >}
     * {@link JAXBElement }{@code <}{@link RestrictionElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link AndRestrictionConnective }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends RestrictionElementType>> getAbstractRestrictionConnective() {
        if (abstractRestrictionConnective == null) {
            abstractRestrictionConnective = new ArrayList<JAXBElement<? extends RestrictionElementType>>();
        }
        return this.abstractRestrictionConnective;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

}
