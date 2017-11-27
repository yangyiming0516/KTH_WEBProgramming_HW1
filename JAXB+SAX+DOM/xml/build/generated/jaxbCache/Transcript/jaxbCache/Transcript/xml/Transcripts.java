//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.5-2 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.02.01 时间 03:30:30 AM CET 
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取name属性的值。
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
         * 设置name属性的值。
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
         * 获取university属性的值。
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
         * 设置university属性的值。
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
         * 获取degree属性的值。
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
         * 设置degree属性的值。
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

        /**
         * 获取courses属性的值。
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
         * 设置courses属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
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
                 * 获取score属性的值。
                 * 
                 */
                public int getScore() {
                    return score;
                }

                /**
                 * 设置score属性的值。
                 * 
                 */
                public void setScore(int value) {
                    this.score = value;
                }

                /**
                 * 获取value属性的值。
                 * 
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 */
                public void setValue(double value) {
                    this.value = value;
                }

                /**
                 * 获取courseName属性的值。
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
                 * 设置courseName属性的值。
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
