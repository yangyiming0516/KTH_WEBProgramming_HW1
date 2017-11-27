//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.02.01 ʱ�� 03:30:30 AM CET 
//


package jaxbCache.Transcript.xml;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transcript" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="university" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="year">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1950"/>
 *                         &lt;maxInclusive value="2017"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="courses">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="course" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="CourseName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "transcript"
})
@XmlRootElement(name = "transcripts")
public class Transcripts {

    protected List<Transcripts.Transcript> transcript;

    /**
     * Gets the value of the transcript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transcripts.Transcript }
     * 
     * 
     */
    public List<Transcripts.Transcript> getTranscript() {
        if (transcript == null) {
            transcript = new ArrayList<Transcripts.Transcript>();
        }
        return this.transcript;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="university" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="year">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1950"/>
     *               &lt;maxInclusive value="2017"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="courses">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="course" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="CourseName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "name",
        "university",
        "degree",
        "year",
        "courses"
    })
    public static class Transcript {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String university;
        @XmlElement(required = true)
        protected String degree;
        protected int year;
        @XmlElement(required = true)
        protected Transcripts.Transcript.Courses courses;

        /**
         * ��ȡname���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

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

        /**
         * ��ȡcourses���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Transcripts.Transcript.Courses }
         *     
         */
        public Transcripts.Transcript.Courses getCourses() {
            return courses;
        }

        /**
         * ����courses���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Transcripts.Transcript.Courses }
         *     
         */
        public void setCourses(Transcripts.Transcript.Courses value) {
            this.courses = value;
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
         *         &lt;element name="course" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="CourseName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "course"
        })
        public static class Courses {

            protected List<Transcripts.Transcript.Courses.Course> course;

            /**
             * Gets the value of the course property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the course property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCourse().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transcripts.Transcript.Courses.Course }
             * 
             * 
             */
            public List<Transcripts.Transcript.Courses.Course> getCourse() {
                if (course == null) {
                    course = new ArrayList<Transcripts.Transcript.Courses.Course>();
                }
                return this.course;
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
             *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *       &lt;/sequence>
             *       &lt;attribute name="CourseName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "score",
                "value"
            })
            public static class Course {

                protected int score;
                protected double value;
                @XmlAttribute(name = "CourseName")
                @XmlSchemaType(name = "anySimpleType")
                protected String courseName;

                /**
                 * ��ȡscore���Ե�ֵ��
                 * 
                 */
                public int getScore() {
                    return score;
                }

                /**
                 * ����score���Ե�ֵ��
                 * 
                 */
                public void setScore(int value) {
                    this.score = value;
                }

                /**
                 * ��ȡvalue���Ե�ֵ��
                 * 
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * ����value���Ե�ֵ��
                 * 
                 */
                public void setValue(double value) {
                    this.value = value;
                }

                /**
                 * ��ȡcourseName���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCourseName() {
                    return courseName;
                }

                /**
                 * ����courseName���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCourseName(String value) {
                    this.courseName = value;
                }

            }

        }

    }

}
