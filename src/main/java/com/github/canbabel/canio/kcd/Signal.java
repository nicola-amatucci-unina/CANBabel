//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.12 at 11:35:34 AM CET 
//


package com.github.canbabel.canio.kcd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{}BasicSignalType">
 *       &lt;sequence>
 *         &lt;element ref="{}Notes" minOccurs="0"/>
 *         &lt;element ref="{}Consumer" minOccurs="0"/>
 *         &lt;element ref="{}Value" minOccurs="0"/>
 *         &lt;element ref="{}LabelSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notes",
    "consumer",
    "value",
    "labelSet"
})
@XmlRootElement(name = "Signal")
public class Signal
    extends BasicSignalType
{

    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Consumer")
    protected Consumer consumer;
    @XmlElement(name = "Value")
    protected Value value;
    @XmlElement(name = "LabelSet")
    protected LabelSet labelSet;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link Consumer }
     *     
     */
    public Consumer getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumer }
     *     
     */
    public void setConsumer(Consumer value) {
        this.consumer = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the labelSet property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSet }
     *     
     */
    public LabelSet getLabelSet() {
        return labelSet;
    }

    /**
     * Sets the value of the labelSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSet }
     *     
     */
    public void setLabelSet(LabelSet value) {
        this.labelSet = value;
    }

}
