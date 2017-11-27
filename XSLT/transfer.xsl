<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0" xmlns:nsCV='http://unknown.abc/HW1/CV' xmlns:nsem='http://unknown.abc/HW1/employment' xmlns:nstr="http://www.example.org/NewXMLSchema" xmlns:nsco="http://www.example.org/NewXMLSchema" xmlns:nspr="http://unknown.abc/HW1/Profile">
    <xsl:output method="xml"/>
    <xsl:template match="/">
        <xsl:element name="nspr:profile">
            <xsl:element name="fullname">
                <xsl:element name="firstname">
                <xsl:value-of select="document('CV.xml')/nsCV:CV/fullname/firstname" />
                </xsl:element>
                <xsl:element name="lastname">
                <xsl:value-of select="document('CV.xml')/nsCV:CV/fullname/lastname" />
                </xsl:element>   
            </xsl:element>
            <xsl:element name="ID">
                <xsl:value-of select="document('CV.xml')/nsCV:CV/ID" />
            </xsl:element>
            <xsl:element name="selfdescription">
                <xsl:value-of select="document('CV.xml')/nsCV:CV/selfdescription" />
            </xsl:element>
            <xsl:element name="wantedplace">
                <xsl:value-of select="document('CV.xml')/nsCV:CV/wantedplace" />
            </xsl:element>
            <xsl:element name="wantedtype">
                <xsl:value-of select="document('CV.xml')/nsCV:CV/wantedtype" />
            </xsl:element>
            <xsl:variable name="cname" select="concat(document('CV.xml')/nsCV:CV/fullname/firstname,' ',document('CV.xml')/nsCV:CV/fullname/lastname)" />
            
            <xsl:element name="education">
                <xsl:for-each select="document('transcript.xml')/nstr:transcripts/nstr:transcript">
                    <xsl:if test="nstr:name = $cname"> 
                        <xsl:element name="university">
                            <xsl:value-of select="nstr:university" />
                        </xsl:element> 
                        <xsl:element name="degree">
                            <xsl:value-of select="nstr:degree" />
                        </xsl:element>
                        <xsl:element name="year">
                            <xsl:value-of select="nstr:year" />
                        </xsl:element>
                        <xsl:element name="totalcredit">
                            <xsl:value-of select="sum(nstr:courses/nstr:course/nstr:value)" />
                        </xsl:element>
                        
                        <xsl:element name="averageGPA">
                            <xsl:variable name="tmp">
                                <xsl:for-each select="nstr:courses/nstr:course">
                                    <xsl:element name="weightedscore">
                                        <xsl:value-of select="number(nstr:score * nstr:value)" />
                                    </xsl:element>
                                </xsl:for-each>
                             </xsl:variable>
                             
                            <xsl:value-of select="sum($tmp/weightedscore) div sum(nstr:courses/nstr:course/nstr:value)" />
                        </xsl:element>
                        
                    </xsl:if>
                </xsl:for-each>
            </xsl:element>
            
            <xsl:element name="working">
                <xsl:for-each select="document('employment.xml')/nsem:employment/record">
                    <xsl:if test="(fullname/firstname = document('CV.xml')/nsCV:CV/fullname/firstname) and (fullname/lastname = document('CV.xml')/nsCV:CV/fullname/lastname)">
                        <xsl:for-each select="experience">
                            <xsl:element name="record">
                            <xsl:element name="company">
                                <xsl:value-of select="companyname" />
                            </xsl:element>
                            <xsl:element name="from">
                                <xsl:element name="year">
                                    <xsl:value-of select="from/year" />
                                </xsl:element>  
                                <xsl:element name="month">
                                    <xsl:value-of select="from/month" />
                                </xsl:element>
                                <xsl:element name="day">
                                    <xsl:value-of select="from/day" />
                                </xsl:element>
                            </xsl:element>
                            <xsl:element name="to">
                                <xsl:element name="year">
                                    <xsl:value-of select="to/year" />
                                </xsl:element>  
                                <xsl:element name="month">
                                    <xsl:value-of select="to/month" />
                                </xsl:element>
                                <xsl:element name="day">
                                    <xsl:value-of select="to/day" />
                                </xsl:element>
                            </xsl:element>
                            <xsl:variable name="cname" select="companyname" />
                            <xsl:element name="headquator">
                                <xsl:value-of select="document('company_info.xml')/nsco:companyinfo/nsco:companies/nsco:company[@companyname=$cname]/nsco:headquator" />
                            </xsl:element>
                            <xsl:element name="companytype">
                               <xsl:value-of select="document('company_info.xml')/nsco:companyinfo/nsco:companies/nsco:company[@companyname=$cname]/nsco:type" />
                            </xsl:element>
                            <xsl:element name="employees">
                                <xsl:value-of select="document('company_info.xml')/nsco:companyinfo/nsco:companies/nsco:company[@companyname=$cname]/nsco:numberofemployees" />
                            </xsl:element>
                            </xsl:element>
                        </xsl:for-each>
                    </xsl:if>
                </xsl:for-each>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>
