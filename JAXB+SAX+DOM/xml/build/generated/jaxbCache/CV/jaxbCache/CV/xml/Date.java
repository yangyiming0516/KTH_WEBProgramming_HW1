//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.5-2 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.02.01 时间 03:30:30 AM CET 
//


package jaxbCache.CV.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>date complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取year属性的值。
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
