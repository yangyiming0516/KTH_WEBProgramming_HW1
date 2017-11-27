//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.01.31 ʱ�� 11:06:36 PM CET 
//


package org.example.newxmlschema2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.newxmlschema2 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.newxmlschema2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Companyinfo }
     * 
     */
    public Companyinfo createCompanyinfo() {
        return new Companyinfo();
    }

    /**
     * Create an instance of {@link Companyinfo.Companies }
     * 
     */
    public Companyinfo.Companies createCompanyinfoCompanies() {
        return new Companyinfo.Companies();
    }

    /**
     * Create an instance of {@link Companyinfo.Companies.Company }
     * 
     */
    public Companyinfo.Companies.Company createCompanyinfoCompaniesCompany() {
        return new Companyinfo.Companies.Company();
    }

}
