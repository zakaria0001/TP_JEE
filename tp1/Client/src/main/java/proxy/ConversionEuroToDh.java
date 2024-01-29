
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionEuroToDh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConversionEuroToDh">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MTT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionEuroToDh", propOrder = {
    "mtt"
})
public class ConversionEuroToDh {

    @XmlElement(name = "MTT")
    protected double mtt;

    /**
     * Gets the value of the mtt property.
     * 
     */
    public double getMTT() {
        return mtt;
    }

    /**
     * Sets the value of the mtt property.
     * 
     */
    public void setMTT(double value) {
        this.mtt = value;
    }

}
