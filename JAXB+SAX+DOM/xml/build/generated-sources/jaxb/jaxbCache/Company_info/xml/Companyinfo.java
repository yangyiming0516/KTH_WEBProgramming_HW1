//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.5-2 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.02.01 时间 03:30:30 AM CET 
//


package jaxbCache.Company_info.xml;

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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companies">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="company" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numberofemployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="companyname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companies"
})
@XmlRootElement(name = "companyinfo")
public class Companyinfo {

    @XmlElement(required = true)
    protected Companyinfo.Companies companies;

    /**
     * 获取companies属性的值。
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
     * 设置companies属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="company" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numberofemployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="companyname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numberofemployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *       &lt;attribute name="companyname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
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
             * 获取headquator属性的值。
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
             * 设置headquator属性的值。
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
             * 获取type属性的值。
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
             * 设置type属性的值。
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
             * 获取numberofemployees属性的值。
             * 
             */
            public int getNumberofemployees() {
                return numberofemployees;
            }

            /**
             * 设置numberofemployees属性的值。
             * 
             */
            public void setNumberofemployees(int value) {
                this.numberofemployees = value;
            }

            /**
             * 获取companyname属性的值。
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
             * 设置companyname属性的值。
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
