This xsl file implemented the function of transfing and combining 4 xml files(CV,transcript,employment,companyinfo) into 1 xml file, including the calculation of weighted average of GPA.
XSLT document() function is used in order to access several files at the same time. xPath is used in different ways in order to select elements.

transfer.xsl can be performed on any one of the 4 xml files, but all files should be in the same folder,profile.xml is the result.

Note that this xsl file is based on XSLT2.0, so a XSLT2.0 compiler is need. For example Saxon. saxon9he.jar is a free version of the compiler. 
see here to use jar file http://www.saxonica.com/documentation9.5/using-xsl/commandline.html
Also the default compiler of java can be replaced, see here http://www.saxonica.com/documentation9.5/using-xsl/embedding/

Thank you.

IDE£ºnetbeans+Saxon 9 home edition