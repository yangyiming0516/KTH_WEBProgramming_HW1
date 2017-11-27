//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.01.31 时间 10:45:08 PM CET 
//


package abc.unknown.hw1.employment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>singleexperience complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="singleexperience"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="from" type="{http://unknown.abc/HW1/employment}date"/&gt;
 *         &lt;element name="to" type="{http://unknown.abc/HW1/employment}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleexperience", propOrder = {
    "companyname",
    "from",
    "to"
})
public class Singleexperience {

    @XmlElement(required = true)
    protected String companyname;
    @XmlElement(required = true)
    protected Date from;
    @XmlElement(required = true)
    protected Date to;

    /**
     * 获取companyname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * 设置companyname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyname(String value) {
        this.companyname = value;
    }

    /**
     * 获取from属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFrom() {
        return from;
    }

    /**
     * 设置from属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFrom(Date value) {
        this.from = value;
    }

    /**
     * 获取to属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getTo() {
        return to;
    }

    /**
     * 设置to属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setTo(Date value) {
        this.to = value;
    }

}
