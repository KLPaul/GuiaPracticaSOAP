
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FSenos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FSenos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anguloA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="anguloB" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FSenos", propOrder = {
    "anguloA",
    "anguloB"
})
public class FSenos {

    protected double anguloA;
    protected double anguloB;

    /**
     * Gets the value of the anguloA property.
     * 
     */
    public double getAnguloA() {
        return anguloA;
    }

    /**
     * Sets the value of the anguloA property.
     * 
     */
    public void setAnguloA(double value) {
        this.anguloA = value;
    }

    /**
     * Gets the value of the anguloB property.
     * 
     */
    public double getAnguloB() {
        return anguloB;
    }

    /**
     * Sets the value of the anguloB property.
     * 
     */
    public void setAnguloB(double value) {
        this.anguloB = value;
    }

}
