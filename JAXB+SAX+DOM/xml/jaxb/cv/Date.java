//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.01.31 ʱ�� 10:44:56 PM CET 
//


package abc.unknown.hw1.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>date complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="date"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unknown.abc/HW1/CV}simpledate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="year" type="{http://unknown.abc/HW1/CV}Y"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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

    @XmlSchemaType(name = "integer")
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
