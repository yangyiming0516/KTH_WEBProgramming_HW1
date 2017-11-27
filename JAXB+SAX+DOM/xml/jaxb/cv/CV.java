//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.01.31 时间 10:44:56 PM CET 
//


package abc.unknown.hw1.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullname" type="{http://unknown.abc/HW1/CV}personname"/&gt;
 *         &lt;element name="ID" type="{http://unknown.abc/HW1/CV}personalID"/&gt;
 *         &lt;element name="selfdescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wantedplace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wantedtype"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="permanent"/&gt;
 *               &lt;enumeration value="parttime"/&gt;
 *               &lt;enumeration value="contract"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "fullname",
    "id",
    "selfdescription",
    "wantedplace",
    "wantedtype"
})
@XmlRootElement(name = "CV")
public class CV {

    @XmlElement(required = true)
    protected Personname fullname;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(required = true)
    protected String selfdescription;
    @XmlElement(required = true)
    protected String wantedplace;
    @XmlElement(required = true)
    protected String wantedtype;

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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取selfdescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfdescription() {
        return selfdescription;
    }

    /**
     * 设置selfdescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfdescription(String value) {
        this.selfdescription = value;
    }

    /**
     * 获取wantedplace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWantedplace() {
        return wantedplace;
    }

    /**
     * 设置wantedplace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWantedplace(String value) {
        this.wantedplace = value;
    }

    /**
     * 获取wantedtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWantedtype() {
        return wantedtype;
    }

    /**
     * 设置wantedtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWantedtype(String value) {
        this.wantedtype = value;
    }

}
