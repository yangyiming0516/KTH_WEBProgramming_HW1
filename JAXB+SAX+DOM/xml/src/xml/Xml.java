/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import javax.xml.bind.*;
import javax.xml.bind.util.*;
import javax.xml.bind.helpers.*;
import javax.xml.bind.JAXBContext;
import jaxbCache.CV.xml.CV;
import jaxbCache.Employment.xml.Employment;
import jaxbCache.Company_info.xml.Companyinfo;
import jaxbCache.Transcript.xml.Transcripts;
import jaxbCache.Profile.xml.*;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.Stack;
import java.util.HashMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


/**
 *
 * @author YY_More
 */
public class Xml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        UserHandler uh = new UserHandler();
        try{
            File inputFile = new File("CV.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(inputFile, uh);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JAXBContext jcCV = JAXBContext.newInstance("jaxbCache.CV.xml");
        Unmarshaller unmarshallerCV = jcCV.createUnmarshaller();
        //CV cv= (CV)unmarshallerCV.unmarshal(new File( "CV.xml"));
        //System.out.print(cv.getFullname().getFirstname());\
        jaxbCache.CV.xml.ObjectFactory objFactoryCV = new jaxbCache.CV.xml.ObjectFactory();
        CV cv = (CV) objFactoryCV.createCV();
        cv.setFullname(objFactoryCV.createPersonname());
        
        cv.getFullname().setFirstname(uh.mp.get("firstname"));
        cv.getFullname().setLastname(uh.mp.get("lastname"));
        
        JAXBContext jcEm = JAXBContext.newInstance("jaxbCache.Employment.xml");
        Unmarshaller unmarshallerEm = jcEm.createUnmarshaller();
        Employment em= (Employment)unmarshallerEm.unmarshal(new File( "Employment.xml"));
        //System.out.print( em.getRecord().get(0).getFullname().getFirstname()  ); 
        
        JAXBContext jcCo = JAXBContext.newInstance("jaxbCache.Company_info.xml");
        Unmarshaller unmarshallerCo = jcCo.createUnmarshaller();
        Companyinfo co= (Companyinfo)unmarshallerCo.unmarshal(new File( "Company_info.xml"));
        //System.out.print( co.getCompanies().getCompany().get(0).getCompanyname()  ); 
        
        JAXBContext jcTr = JAXBContext.newInstance("jaxbCache.Transcript.xml");
        Unmarshaller unmarshallerTr = jcTr.createUnmarshaller();
        Transcripts tr= (Transcripts)unmarshallerTr.unmarshal(new File( "transcript.xml"));
        //System.out.print( tr.getTranscript().get(0).getDegree()  );
        /*
        JAXBContext jcPr = JAXBContext.newInstance("jaxbCache.Profile.xml");
        Unmarshaller unmarshallerPr = jcPr.createUnmarshaller();
        Profile Pr= (Profile)unmarshallerPr.unmarshal(new File( "profile.xml"));
        System.out.print( Pr.getEducation().getUniversity()  );
        */
        
        
        
        ObjectFactory objFactory = new ObjectFactory();
        Profile nPr= (Profile) objFactory.createProfile();
        nPr.setFullname( (Personname) objFactory.createPersonname()  );
        nPr.setEducation((Profile.Education) objFactory.createProfileEducation());
        nPr.setWorking(   (Profile.Working)objFactory.createProfileWorking() );
        
        nPr.getFullname().setFirstname(cv.getFullname().getFirstname());
        nPr.getFullname().setLastname(cv.getFullname().getLastname());
        nPr.setID(" ");
        nPr.setSelfdescription(" ");
        nPr.setWantedplace(" ");
        nPr.setWantedtype(" ");
        
        
        double sum=0, credit=0;
        for (int i=0;i<tr.getTranscript().size();i++)
            if (tr.getTranscript().get(i).getName().equals(cv.getFullname().getFirstname()+" "+cv.getFullname().getLastname())){
                nPr.getEducation().setDegree(tr.getTranscript().get(i).getDegree());
                nPr.getEducation().setUniversity(tr.getTranscript().get(i).getUniversity());
                nPr.getEducation().setYear(BigInteger.valueOf(tr.getTranscript().get(i).getYear()));
                for (int j=0;j<tr.getTranscript().get(i).getCourses().getCourse().size();j++){
                    credit+=tr.getTranscript().get(i).getCourses().getCourse().get(j).getValue();
                    sum+=tr.getTranscript().get(i).getCourses().getCourse().get(j).getValue()*tr.getTranscript().get(i).getCourses().getCourse().get(j).getScore();
                }
            }
        nPr.getEducation().setAverageGPA(sum/credit);
        nPr.getEducation().setTotalcredit(credit);
        
        for (int i=0;i<em.getRecord().size();i++){
            if (em.getRecord().get(i).getFullname().getFirstname().equals(cv.getFullname().getFirstname()) && em.getRecord().get(i).getFullname().getLastname().equals(cv.getFullname().getLastname()))
                for (int j=0;j<em.getRecord().get(i).getExperience().size();j++)
                    for (int k=0;k<co.getCompanies().getCompany().size();k++)
                    if (em.getRecord().get(i).getExperience().get(j).getCompanyname().equals(co.getCompanies().getCompany().get(k).getCompanyname()))
                    {
                        Profile.Working.Record tmp = objFactory.createProfileWorkingRecord();
                        tmp.setFrom( (Date) objFactory.createDate() );
                        tmp.setTo( (Date) objFactory.createDate() );
                        
                        tmp.setCompany(co.getCompanies().getCompany().get(k).getCompanyname());
                        tmp.getFrom().setYear(em.getRecord().get(i).getExperience().get(j).getFrom().getYear());
                        tmp.getFrom().setMonth(em.getRecord().get(i).getExperience().get(j).getFrom().getMonth());
                        tmp.getFrom().setDay(em.getRecord().get(i).getExperience().get(j).getFrom().getDay());
                        tmp.getTo().setYear(em.getRecord().get(i).getExperience().get(j).getTo().getYear());
                        tmp.getTo().setMonth(em.getRecord().get(i).getExperience().get(j).getTo().getMonth());
                        tmp.getTo().setDay(em.getRecord().get(i).getExperience().get(j).getTo().getDay());
                        tmp.setHeadquator(co.getCompanies().getCompany().get(k).getHeadquator());
                        tmp.setEmployees(BigInteger.valueOf(co.getCompanies().getCompany().get(k).getNumberofemployees()));
                        tmp.setCompanytype(co.getCompanies().getCompany().get(k).getType());
                        nPr.getWorking().getRecord().add(tmp);
                    }
        }
        
        JAXBContext jaxbContext = JAXBContext.newInstance("jaxbCache.Profile.xml");
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,new Boolean(true));

        marshaller.marshal(nPr,new FileOutputStream("jaxbOutput.xml"));
        
       
        try {
            File inputFile = new File("jaxbOutput.xml"); 	    	
            DocumentBuilderFactory docFactory =
            DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = 
            docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            doc.getElementsByTagName("ID").item(0).setTextContent(uh.mp.get("ID"));
            doc.getElementsByTagName("selfdescription").item(0).setTextContent(uh.mp.get("selfdescription"));
            doc.getElementsByTagName("wantedplace").item(0).setTextContent(uh.mp.get("wantedplace"));
            doc.getElementsByTagName("wantedtype").item(0).setTextContent(uh.mp.get("wantedtype"));
           
               // write the content on console
               TransformerFactory transformerFactory = 
               TransformerFactory.newInstance();
               Transformer transformer = transformerFactory.newTransformer();
               DOMSource source = new DOMSource(doc);
               System.out.println("-----------Modified File-----------");
               StreamResult consoleResult = new StreamResult(new File("jaxbOutput2.xml") );
               transformer.transform(source, consoleResult);
            } catch (Exception e) {
               e.printStackTrace();
      }
        
        
        
        
    }
    
}

class UserHandler extends DefaultHandler {
    
    Stack<String> st = new Stack<>();
    HashMap<String,String> mp = new HashMap<String,String>();
    
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)throws SAXException{ 

        st.push(qName);
        
    }        
    
    @Override
     public void characters(char ch[], int start, int length) throws SAXException {
         String str=new String(ch,start,length);
         mp.put(st.peek(), str);
     }
     
    @Override
    public void endElement(String uri, String localName, String qName)throws SAXException{ 
        
        st.pop();
        
    }    
}