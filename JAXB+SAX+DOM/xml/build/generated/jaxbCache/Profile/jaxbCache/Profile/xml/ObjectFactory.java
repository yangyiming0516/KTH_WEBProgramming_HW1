//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.02.01 ʱ�� 03:30:53 AM CET 
//


package jaxbCache.Profile.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxbCache.Profile.xml package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxbCache.Profile.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link Profile.Working }
     * 
     */
    public Profile.Working createProfileWorking() {
        return new Profile.Working();
    }

    /**
     * Create an instance of {@link Personname }
     * 
     */
    public Personname createPersonname() {
        return new Personname();
    }

    /**
     * Create an instance of {@link Profile.Education }
     * 
     */
    public Profile.Education createProfileEducation() {
        return new Profile.Education();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Simpledate }
     * 
     */
    public Simpledate createSimpledate() {
        return new Simpledate();
    }

    /**
     * Create an instance of {@link Profile.Working.Record }
     * 
     */
    public Profile.Working.Record createProfileWorkingRecord() {
        return new Profile.Working.Record();
    }

}
