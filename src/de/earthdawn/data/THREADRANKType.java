//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for THREADRANK_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="THREADRANK_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARMOR" type="{http://earthdawn.com/datatypes}ARMOR_type" minOccurs="0"/>
 *         &lt;element name="WEAPON" type="{http://earthdawn.com/datatypes}WEAPON_type" minOccurs="0"/>
 *         &lt;element name="WOUND" type="{http://earthdawn.com/datatypes}WOUND_type" minOccurs="0"/>
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSEABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OPTIONALTALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DISCIPLINETALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPELL" type="{http://earthdawn.com/datatypes}CIRCLENAME_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPELLABILITY" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="INITIATIVE" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RECOVERYTEST" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KARMASTEP" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ABILITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rank" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="keyknowledge" use="required" type="{http://earthdawn.com/datatypes}yesno_type" />
 *       &lt;attribute name="lpcost" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="effect" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THREADRANK_type", propOrder = {
    "armor",
    "weapon",
    "wound",
    "defense",
    "optionaltalent",
    "disciplinetalent",
    "spell",
    "spellability",
    "initiative",
    "recoverytest",
    "karmastep",
    "ability"
})
public class THREADRANKType {

    @XmlElement(name = "ARMOR")
    protected ARMORType armor;
    @XmlElement(name = "WEAPON")
    protected WEAPONType weapon;
    @XmlElement(name = "WOUND")
    protected WOUNDType wound;
    @XmlElement(name = "DEFENSE")
    protected List<DEFENSEABILITYType> defense;
    @XmlElement(name = "OPTIONALTALENT")
    protected List<TALENTABILITYType> optionaltalent;
    @XmlElement(name = "DISCIPLINETALENT")
    protected List<TALENTABILITYType> disciplinetalent;
    @XmlElement(name = "SPELL")
    protected List<CIRCLENAMEType> spell;
    @XmlElement(name = "SPELLABILITY")
    protected List<DISZIPINABILITYType> spellability;
    @XmlElement(name = "INITIATIVE")
    protected List<DISZIPINABILITYType> initiative;
    @XmlElement(name = "RECOVERYTEST")
    protected List<DISZIPINABILITYType> recoverytest;
    @XmlElement(name = "KARMASTEP")
    protected List<DISZIPINABILITYType> karmastep;
    @XmlElement(name = "ABILITY")
    protected List<String> ability;
    @XmlAttribute(required = true)
    protected int rank;
    @XmlAttribute(required = true)
    protected YesnoType keyknowledge;
    @XmlAttribute(required = true)
    protected int lpcost;
    @XmlAttribute(required = true)
    protected String effect;

    /**
     * Gets the value of the armor property.
     * 
     * @return
     *     possible object is
     *     {@link ARMORType }
     *     
     */
    public ARMORType getARMOR() {
        return armor;
    }

    /**
     * Sets the value of the armor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARMORType }
     *     
     */
    public void setARMOR(ARMORType value) {
        this.armor = value;
    }

    /**
     * Gets the value of the weapon property.
     * 
     * @return
     *     possible object is
     *     {@link WEAPONType }
     *     
     */
    public WEAPONType getWEAPON() {
        return weapon;
    }

    /**
     * Sets the value of the weapon property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEAPONType }
     *     
     */
    public void setWEAPON(WEAPONType value) {
        this.weapon = value;
    }

    /**
     * Gets the value of the wound property.
     * 
     * @return
     *     possible object is
     *     {@link WOUNDType }
     *     
     */
    public WOUNDType getWOUND() {
        return wound;
    }

    /**
     * Sets the value of the wound property.
     * 
     * @param value
     *     allowed object is
     *     {@link WOUNDType }
     *     
     */
    public void setWOUND(WOUNDType value) {
        this.wound = value;
    }

    /**
     * Gets the value of the defense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEFENSE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEFENSEABILITYType }
     * 
     * 
     */
    public List<DEFENSEABILITYType> getDEFENSE() {
        if (defense == null) {
            defense = new ArrayList<DEFENSEABILITYType>();
        }
        return this.defense;
    }

    /**
     * Gets the value of the optionaltalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionaltalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPTIONALTALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     * 
     * 
     */
    public List<TALENTABILITYType> getOPTIONALTALENT() {
        if (optionaltalent == null) {
            optionaltalent = new ArrayList<TALENTABILITYType>();
        }
        return this.optionaltalent;
    }

    /**
     * Gets the value of the disciplinetalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplinetalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCIPLINETALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     * 
     * 
     */
    public List<TALENTABILITYType> getDISCIPLINETALENT() {
        if (disciplinetalent == null) {
            disciplinetalent = new ArrayList<TALENTABILITYType>();
        }
        return this.disciplinetalent;
    }

    /**
     * Gets the value of the spell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIRCLENAMEType }
     * 
     * 
     */
    public List<CIRCLENAMEType> getSPELL() {
        if (spell == null) {
            spell = new ArrayList<CIRCLENAMEType>();
        }
        return this.spell;
    }

    /**
     * Gets the value of the spellability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spellability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELLABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getSPELLABILITY() {
        if (spellability == null) {
            spellability = new ArrayList<DISZIPINABILITYType>();
        }
        return this.spellability;
    }

    /**
     * Gets the value of the initiative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initiative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINITIATIVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getINITIATIVE() {
        if (initiative == null) {
            initiative = new ArrayList<DISZIPINABILITYType>();
        }
        return this.initiative;
    }

    /**
     * Gets the value of the recoverytest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverytest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECOVERYTEST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getRECOVERYTEST() {
        if (recoverytest == null) {
            recoverytest = new ArrayList<DISZIPINABILITYType>();
        }
        return this.recoverytest;
    }

    /**
     * Gets the value of the karmastep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the karmastep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKARMASTEP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getKARMASTEP() {
        if (karmastep == null) {
            karmastep = new ArrayList<DISZIPINABILITYType>();
        }
        return this.karmastep;
    }

    /**
     * Gets the value of the ability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getABILITY() {
        if (ability == null) {
            ability = new ArrayList<String>();
        }
        return this.ability;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the keyknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getKeyknowledge() {
        return keyknowledge;
    }

    /**
     * Sets the value of the keyknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setKeyknowledge(YesnoType value) {
        this.keyknowledge = value;
    }

    /**
     * Gets the value of the lpcost property.
     * 
     */
    public int getLpcost() {
        return lpcost;
    }

    /**
     * Sets the value of the lpcost property.
     * 
     */
    public void setLpcost(int value) {
        this.lpcost = value;
    }

    /**
     * Gets the value of the effect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffect() {
        return effect;
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffect(String value) {
        this.effect = value;
    }

}
