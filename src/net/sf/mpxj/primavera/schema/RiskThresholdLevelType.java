//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for RiskThresholdLevelType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RiskThresholdLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Color" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="#[A-Fa-f0-9]{6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CostRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Level" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProbabilityRange" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Range" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskThresholdName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskThresholdObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScheduleRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ThresholdType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Probability"/>
 *               &lt;enumeration value="Tolerance"/>
 *               &lt;enumeration value="Schedule"/>
 *               &lt;enumeration value="Cost"/>
 *               &lt;enumeration value="Relative Schedule"/>
 *               &lt;enumeration value="Relative Cost"/>
 *               &lt;enumeration value="User Defined"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToleranceRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RiskThresholdLevelType", propOrder =
{
   "code",
   "color",
   "costRange",
   "createDate",
   "createUser",
   "lastUpdateDate",
   "lastUpdateUser",
   "level",
   "name",
   "objectId",
   "probabilityRange",
   "range",
   "riskThresholdName",
   "riskThresholdObjectId",
   "scheduleRange",
   "thresholdType",
   "toleranceRange"
}) public class RiskThresholdLevelType
{

   @XmlElement(name = "Code") protected String code;
   @XmlElement(name = "Color", nillable = true) protected String color;
   @XmlElement(name = "CostRange", nillable = true) protected Double costRange;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "Level", nillable = true) protected Integer level;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProbabilityRange", nillable = true) protected Double probabilityRange;
   @XmlElement(name = "Range") protected String range;
   @XmlElement(name = "RiskThresholdName") protected String riskThresholdName;
   @XmlElement(name = "RiskThresholdObjectId") protected Integer riskThresholdObjectId;
   @XmlElement(name = "ScheduleRange", nillable = true) protected Double scheduleRange;
   @XmlElement(name = "ThresholdType") protected String thresholdType;
   @XmlElement(name = "ToleranceRange", nillable = true) protected Integer toleranceRange;

   /**
    * Gets the value of the code property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCode()
   {
      return code;
   }

   /**
    * Sets the value of the code property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCode(String value)
   {
      this.code = value;
   }

   /**
    * Gets the value of the color property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getColor()
   {
      return color;
   }

   /**
    * Sets the value of the color property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setColor(String value)
   {
      this.color = value;
   }

   /**
    * Gets the value of the costRange property.
    * 
    * @return
    *     possible object is
    *     {@link Double }
    *     
    */
   public Double getCostRange()
   {
      return costRange;
   }

   /**
    * Sets the value of the costRange property.
    * 
    * @param value
    *     allowed object is
    *     {@link Double }
    *     
    */
   public void setCostRange(Double value)
   {
      this.costRange = value;
   }

   /**
    * Gets the value of the createDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the level property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getLevel()
   {
      return level;
   }

   /**
    * Sets the value of the level property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setLevel(Integer value)
   {
      this.level = value;
   }

   /**
    * Gets the value of the name property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the objectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the probabilityRange property.
    * 
    * @return
    *     possible object is
    *     {@link Double }
    *     
    */
   public Double getProbabilityRange()
   {
      return probabilityRange;
   }

   /**
    * Sets the value of the probabilityRange property.
    * 
    * @param value
    *     allowed object is
    *     {@link Double }
    *     
    */
   public void setProbabilityRange(Double value)
   {
      this.probabilityRange = value;
   }

   /**
    * Gets the value of the range property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRange()
   {
      return range;
   }

   /**
    * Sets the value of the range property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRange(String value)
   {
      this.range = value;
   }

   /**
    * Gets the value of the riskThresholdName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRiskThresholdName()
   {
      return riskThresholdName;
   }

   /**
    * Sets the value of the riskThresholdName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRiskThresholdName(String value)
   {
      this.riskThresholdName = value;
   }

   /**
    * Gets the value of the riskThresholdObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRiskThresholdObjectId()
   {
      return riskThresholdObjectId;
   }

   /**
    * Sets the value of the riskThresholdObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRiskThresholdObjectId(Integer value)
   {
      this.riskThresholdObjectId = value;
   }

   /**
    * Gets the value of the scheduleRange property.
    * 
    * @return
    *     possible object is
    *     {@link Double }
    *     
    */
   public Double getScheduleRange()
   {
      return scheduleRange;
   }

   /**
    * Sets the value of the scheduleRange property.
    * 
    * @param value
    *     allowed object is
    *     {@link Double }
    *     
    */
   public void setScheduleRange(Double value)
   {
      this.scheduleRange = value;
   }

   /**
    * Gets the value of the thresholdType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getThresholdType()
   {
      return thresholdType;
   }

   /**
    * Sets the value of the thresholdType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setThresholdType(String value)
   {
      this.thresholdType = value;
   }

   /**
    * Gets the value of the toleranceRange property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getToleranceRange()
   {
      return toleranceRange;
   }

   /**
    * Sets the value of the toleranceRange property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setToleranceRange(Integer value)
   {
      this.toleranceRange = value;
   }

}
