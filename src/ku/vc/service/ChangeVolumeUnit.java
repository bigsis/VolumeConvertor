
package ku.vc.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolumeValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromVolumeUnit" type="{http://www.webserviceX.NET/}Volumes"/>
 *         &lt;element name="toVolumeUnit" type="{http://www.webserviceX.NET/}Volumes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeValue",
    "fromVolumeUnit",
    "toVolumeUnit"
})
@XmlRootElement(name = "ChangeVolumeUnit")
public class ChangeVolumeUnit {

    @XmlElement(name = "VolumeValue")
    protected double volumeValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Volumes fromVolumeUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Volumes toVolumeUnit;

    /**
     * Gets the value of the volumeValue property.
     * 
     */
    public double getVolumeValue() {
        return volumeValue;
    }

    /**
     * Sets the value of the volumeValue property.
     * 
     */
    public void setVolumeValue(double value) {
        this.volumeValue = value;
    }

    /**
     * Gets the value of the fromVolumeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Volumes }
     *     
     */
    public Volumes getFromVolumeUnit() {
        return fromVolumeUnit;
    }

    /**
     * Sets the value of the fromVolumeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volumes }
     *     
     */
    public void setFromVolumeUnit(Volumes value) {
        this.fromVolumeUnit = value;
    }

    /**
     * Gets the value of the toVolumeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Volumes }
     *     
     */
    public Volumes getToVolumeUnit() {
        return toVolumeUnit;
    }

    /**
     * Sets the value of the toVolumeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volumes }
     *     
     */
    public void setToVolumeUnit(Volumes value) {
        this.toVolumeUnit = value;
    }

}
