//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.26 at 02:55:59 PM ICT 
//


package com.clovis.cw.genericeditor.gen.metaclasses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MenuFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NodeInfo" type="{}MetaClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EdgeInfo" type="{}MetaClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "menuFilePath",
    "nodeInfo",
    "edgeInfo"
})
@XmlRootElement(name = "EditorInfo")
public class EditorInfo {

    @XmlElement(name = "MenuFilePath", required = true)
    protected String menuFilePath;
    @XmlElement(name = "NodeInfo")
    protected List<MetaClass> nodeInfo;
    @XmlElement(name = "EdgeInfo")
    protected List<MetaClass> edgeInfo;

    /**
     * Gets the value of the menuFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuFilePath() {
        return menuFilePath;
    }

    /**
     * Sets the value of the menuFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuFilePath(String value) {
        this.menuFilePath = value;
    }

    /**
     * Gets the value of the nodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaClass }
     * 
     * 
     */
    public List<MetaClass> getNodeInfo() {
        if (nodeInfo == null) {
            nodeInfo = new ArrayList<MetaClass>();
        }
        return this.nodeInfo;
    }

    /**
     * Gets the value of the edgeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the edgeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdgeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaClass }
     * 
     * 
     */
    public List<MetaClass> getEdgeInfo() {
        if (edgeInfo == null) {
            edgeInfo = new ArrayList<MetaClass>();
        }
        return this.edgeInfo;
    }

}