//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.01.31 时间 10:45:08 PM CET 
//


package abc.unknown.hw1.employment;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>singlerecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="singlerecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullname" type="{http://unknown.abc/HW1/employment}personname"/&gt;
 *         &lt;element name="experience" type="{http://unknown.abc/HW1/employment}singleexperience" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singlerecord", propOrder = {
    "fullname",
    "experience"
})
public class Singlerecord {

    @XmlElement(required = true)
    protected Personname fullname;
    @XmlElement(required = true)
    protected List<Singleexperience> experience;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * 获取fullname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Personname }
     *     
     */
    public Personname getFullname() {
        return fullname;
    }

    /**
     * 设置fullname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Personname }
     *     
     */
    public void setFullname(Personname value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the experience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Singleexperience }
     * 
     * 
     */
    public List<Singleexperience> getExperience() {
        if (experience == null) {
            experience = new ArrayList<Singleexperience>();
        }
        return this.experience;
    }

    /**
     * 获取number属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}
