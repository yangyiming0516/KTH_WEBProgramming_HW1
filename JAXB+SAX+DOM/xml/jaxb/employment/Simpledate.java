//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.01.31 ʱ�� 10:45:08 PM CET 
//


package abc.unknown.hw1.employment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>simpledate complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="simpledate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="day" type="{http://unknown.abc/HW1/employment}D"/&gt;
 *         &lt;element name="month" type="{http://unknown.abc/HW1/employment}M"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpledate", propOrder = {
    "day",
    "month"
})
@XmlSeeAlso({
    Date.class
})
public class Simpledate {

    @XmlSchemaType(name = "integer")
    protected int day;
    @XmlSchemaType(name = "integer")
    protected int month;

    /**
     * ��ȡday���Ե�ֵ��
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * ����day���Ե�ֵ��
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * ��ȡmonth���Ե�ֵ��
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * ����month���Ե�ֵ��
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

}
