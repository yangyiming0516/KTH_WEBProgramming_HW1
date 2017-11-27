//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.01.31 时间 10:45:08 PM CET 
//


package abc.unknown.hw1.employment;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abc.unknown.hw1.employment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abc.unknown.hw1.employment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employment }
     * 
     */
    public Employment createEmployment() {
        return new Employment();
    }

    /**
     * Create an instance of {@link Singlerecord }
     * 
     */
    public Singlerecord createSinglerecord() {
        return new Singlerecord();
    }

    /**
     * Create an instance of {@link Personname }
     * 
     */
    public Personname createPersonname() {
        return new Personname();
    }

    /**
     * Create an instance of {@link Simpledate }
     * 
     */
    public Simpledate createSimpledate() {
        return new Simpledate();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Singleexperience }
     * 
     */
    public Singleexperience createSingleexperience() {
        return new Singleexperience();
    }

}
