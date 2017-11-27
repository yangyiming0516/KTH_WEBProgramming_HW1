//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.01.31 ʱ�� 11:06:36 PM CET 
//


package org.example.newxmlschema2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="applicantname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="applicantage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="companies"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="company" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="numberofemployees" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="companyname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "applicantname",
    "applicantage",
    "companies"
})
@XmlRootElement(name = "companyinfo")
public class Companyinfo {

    @XmlElement(required = true)
    protected String applicantname;
    protected int applicantage;
    @XmlElement(required = true)
    protected Companyinfo.Companies companies;

    /**
     * ��ȡapplicantname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantname() {
        return applicantname;
    }

    /**
     * ����applicantname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantname(String value) {
        this.applicantname = value;
    }

    /**
     * ��ȡapplicantage���Ե�ֵ��
     * 
     */
    public int getApplicantage() {
        return applicantage;
    }

    /**
     * ����applicantage���Ե�ֵ��
     * 
     */
    public void setApplicantage(int value) {
        this.applicantage = value;
    }

    /**
     * ��ȡcompanies���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Companyinfo.Companies }
     *     
     */
    public Companyinfo.Companies getCompanies() {
        return companies;
    }

    /**
     * ����companies���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Companyinfo.Companies }
     *     
     */
    public void setCompanies(Companyinfo.Companies value) {
        this.companies = value;
    }


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
     *         &lt;element name="company" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="numberofemployees" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="companyname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
        "company"
    })
    public static class Companies {

        protected List<Companyinfo.Companies.Company> company;

        /**
         * Gets the value of the company property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the company property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompany().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Companyinfo.Companies.Company }
         * 
         * 
         */
        public List<Companyinfo.Companies.Company> getCompany() {
            if (company == null) {
                company = new ArrayList<Companyinfo.Companies.Company>();
            }
            return this.company;
        }


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
         *         &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="numberofemployees" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="companyname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "headquator",
            "type",
            "numberofemployees"
        })
        public static class Company {

            @XmlElement(required = true)
            protected String headquator;
            @XmlElement(required = true)
            protected String type;
            protected int numberofemployees;
            @XmlAttribute(name = "companyname")
            @XmlSchemaType(name = "anySimpleType")
            protected String companyname;

            /**
             * ��ȡheadquator���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHeadquator() {
                return headquator;
            }

            /**
             * ����headquator���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHeadquator(String value) {
                this.headquator = value;
            }

            /**
             * ��ȡtype���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * ����type���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * ��ȡnumberofemployees���Ե�ֵ��
             * 
             */
            public int getNumberofemployees() {
                return numberofemployees;
            }

            /**
             * ����numberofemployees���Ե�ֵ��
             * 
             */
            public void setNumberofemployees(int value) {
                this.numberofemployees = value;
            }

            /**
             * ��ȡcompanyname���Ե�ֵ��
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
             * ����companyname���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyname(String value) {
                this.companyname = value;
            }

        }

    }

}