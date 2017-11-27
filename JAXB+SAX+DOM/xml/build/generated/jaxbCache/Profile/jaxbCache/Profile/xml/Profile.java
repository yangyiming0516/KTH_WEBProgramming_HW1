//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.02.01 ʱ�� 03:30:53 AM CET 
//


package jaxbCache.Profile.xml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullname" type="{http://unknown.abc/HW1/Profile}personname"/>
 *         &lt;element name="ID" type="{http://unknown.abc/HW1/Profile}personalID"/>
 *         &lt;element name="selfdescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wantedplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wantedtype">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="permanent"/>
 *               &lt;enumeration value="parttime"/>
 *               &lt;enumeration value="contract"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="education">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="university" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="totalcredit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="averageGPA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="working">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="record" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="from" type="{http://unknown.abc/HW1/Profile}date"/>
 *                             &lt;element name="to" type="{http://unknown.abc/HW1/Profile}date"/>
 *                             &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="companytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="employees" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
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
    "fullname",
    "id",
    "selfdescription",
    "wantedplace",
    "wantedtype",
    "education",
    "working"
})
@XmlRootElement(name = "profile")
public class Profile {

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
    @XmlElement(required = true)
    protected Profile.Education education;
    @XmlElement(required = true)
    protected Profile.Working working;

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

    /**
     * ��ȡeducation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Profile.Education }
     *     
     */
    public Profile.Education getEducation() {
        return education;
    }

    /**
     * ����education���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Education }
     *     
     */
    public void setEducation(Profile.Education value) {
        this.education = value;
    }

    /**
     * ��ȡworking���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Profile.Working }
     *     
     */
    public Profile.Working getWorking() {
        return working;
    }

    /**
     * ����working���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Working }
     *     
     */
    public void setWorking(Profile.Working value) {
        this.working = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="university" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="totalcredit" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="averageGPA" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
        "university",
        "degree",
        "year",
        "totalcredit",
        "averageGPA"
    })
    public static class Education {

        @XmlElement(required = true)
        protected String university;
        @XmlElement(required = true)
        protected String degree;
        @XmlElement(required = true)
        protected BigInteger year;
        protected double totalcredit;
        protected double averageGPA;

        /**
         * ��ȡuniversity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUniversity() {
            return university;
        }

        /**
         * ����university���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUniversity(String value) {
            this.university = value;
        }

        /**
         * ��ȡdegree���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDegree() {
            return degree;
        }

        /**
         * ����degree���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDegree(String value) {
            this.degree = value;
        }

        /**
         * ��ȡyear���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getYear() {
            return year;
        }

        /**
         * ����year���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setYear(BigInteger value) {
            this.year = value;
        }

        /**
         * ��ȡtotalcredit���Ե�ֵ��
         * 
         */
        public double getTotalcredit() {
            return totalcredit;
        }

        /**
         * ����totalcredit���Ե�ֵ��
         * 
         */
        public void setTotalcredit(double value) {
            this.totalcredit = value;
        }

        /**
         * ��ȡaverageGPA���Ե�ֵ��
         * 
         */
        public double getAverageGPA() {
            return averageGPA;
        }

        /**
         * ����averageGPA���Ե�ֵ��
         * 
         */
        public void setAverageGPA(double value) {
            this.averageGPA = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="record" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="from" type="{http://unknown.abc/HW1/Profile}date"/>
     *                   &lt;element name="to" type="{http://unknown.abc/HW1/Profile}date"/>
     *                   &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="companytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="employees" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "record"
    })
    public static class Working {

        @XmlElement(required = true)
        protected List<Profile.Working.Record> record;

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Profile.Working.Record }
         * 
         * 
         */
        public List<Profile.Working.Record> getRecord() {
            if (record == null) {
                record = new ArrayList<Profile.Working.Record>();
            }
            return this.record;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="from" type="{http://unknown.abc/HW1/Profile}date"/>
         *         &lt;element name="to" type="{http://unknown.abc/HW1/Profile}date"/>
         *         &lt;element name="headquator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="companytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="employees" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "company",
            "from",
            "to",
            "headquator",
            "companytype",
            "employees"
        })
        public static class Record {

            @XmlElement(required = true)
            protected String company;
            @XmlElement(required = true)
            protected Date from;
            @XmlElement(required = true)
            protected Date to;
            @XmlElement(required = true)
            protected String headquator;
            @XmlElement(required = true)
            protected String companytype;
            @XmlElement(required = true)
            protected BigInteger employees;

            /**
             * ��ȡcompany���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompany() {
                return company;
            }

            /**
             * ����company���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompany(String value) {
                this.company = value;
            }

            /**
             * ��ȡfrom���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Date }
             *     
             */
            public Date getFrom() {
                return from;
            }

            /**
             * ����from���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Date }
             *     
             */
            public void setFrom(Date value) {
                this.from = value;
            }

            /**
             * ��ȡto���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Date }
             *     
             */
            public Date getTo() {
                return to;
            }

            /**
             * ����to���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Date }
             *     
             */
            public void setTo(Date value) {
                this.to = value;
            }

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
             * ��ȡcompanytype���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanytype() {
                return companytype;
            }

            /**
             * ����companytype���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanytype(String value) {
                this.companytype = value;
            }

            /**
             * ��ȡemployees���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getEmployees() {
                return employees;
            }

            /**
             * ����employees���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setEmployees(BigInteger value) {
                this.employees = value;
            }

        }

    }

}
