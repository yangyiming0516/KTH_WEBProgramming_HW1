//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.01.31 ʱ�� 10:44:56 PM CET 
//


package abc.unknown.hw1.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfullname���Ե�ֵ��
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
     * ����fullname���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
     * ��ȡselfdescription���Ե�ֵ��
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
     * ����selfdescription���Ե�ֵ��
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
     * ��ȡwantedplace���Ե�ֵ��
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
     * ����wantedplace���Ե�ֵ��
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
     * ��ȡwantedtype���Ե�ֵ��
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
     * ����wantedtype���Ե�ֵ��
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
