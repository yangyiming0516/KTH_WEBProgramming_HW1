//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.5-2 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.02.01 时间 03:30:30 AM CET 
//


package jaxbCache.Transcript.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxbCache.Transcript.xml package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxbCache.Transcript.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Transcripts }
     * 
     */
    public Transcripts createTranscripts() {
        return new Transcripts();
    }

    /**
     * Create an instance of {@link Transcripts.Transcript }
     * 
     */
    public Transcripts.Transcript createTranscriptsTranscript() {
        return new Transcripts.Transcript();
    }

    /**
     * Create an instance of {@link Transcripts.Transcript.Courses }
     * 
     */
    public Transcripts.Transcript.Courses createTranscriptsTranscriptCourses() {
        return new Transcripts.Transcript.Courses();
    }

    /**
     * Create an instance of {@link Transcripts.Transcript.Courses.Course }
     * 
     */
    public Transcripts.Transcript.Courses.Course createTranscriptsTranscriptCoursesCourse() {
        return new Transcripts.Transcript.Courses.Course();
    }

}
