//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.26 at 02:56:00 PM ICT 
//


package com.clovis.common.utils.menu.gen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MenuItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MenuItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Hint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tooltip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Component" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ActionClass" type="{}ActionClass" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Separator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MenuItem", propOrder = {
    "name",
    "label",
    "hint",
    "icon",
    "tooltip",
    "component",
    "_default",
    "actionClass",
    "displayOrder",
    "separator"
})
@XmlSeeAlso({
    Menu.class
})
public class MenuItem {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "Hint", required = true)
    protected String hint;
    @XmlElement(name = "Icon", required = true)
    protected String icon;
    @XmlElement(name = "Tooltip", required = true)
    protected String tooltip;
    @XmlElement(name = "Component", required = true)
    protected String component;
    @XmlElement(name = "Default")
    protected boolean _default;
    @XmlElement(name = "ActionClass", required = true)
    protected List<ActionClass> actionClass;
    @XmlElement(name = "DisplayOrder", required = true)
    protected BigInteger displayOrder;
    @XmlElement(name = "Separator")
    protected boolean separator;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Gets the value of the default property.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the actionClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actionClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionClass }
     * 
     * 
     */
    public List<ActionClass> getActionClass() {
        if (actionClass == null) {
            actionClass = new ArrayList<ActionClass>();
        }
        return this.actionClass;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayOrder(BigInteger value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the separator property.
     * 
     */
    public boolean isSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     */
    public void setSeparator(boolean value) {
        this.separator = value;
    }

}
