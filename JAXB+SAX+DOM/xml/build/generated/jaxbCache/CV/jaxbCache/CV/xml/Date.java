//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.02.01 ʱ�� 03:30:30 AM CET 
//


package jaxbCache.CV.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>date complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="date">
 *   &lt;complexContent>
 *     &lt;extension base="{http://unknown.abc/HW1/CV}simpledate">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://unknown.abc/HW1/CV}Y"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "date", propOrder = {
    "year"
})
public class Date
    extends Simpledate
{

    protected int year;

    /**
     * ��ȡyear���Ե�ֵ��
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * ����year���Ե�ֵ��
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
