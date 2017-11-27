This is a method combined with JAXB, SAX and DOM

However,remember that there is at first a complete implement based on JAXB. The output is totally correct.

In order to user SAX and DOM method. Some code that deals with CV.xml is removed(both input and output function).
Instead, we use SAX to read and get data from CV.xml, then we use Java DOM method to complete these these data to output file.

jaxvOutput.xml is an intermediate result, it shows the result after removing some code of JAXB.
jaxbOutput2.xml is the final result after perfoming SAX and DOM.

all code can be found at /src/xml/Xml.java

IDE:Netbeans

Thank you