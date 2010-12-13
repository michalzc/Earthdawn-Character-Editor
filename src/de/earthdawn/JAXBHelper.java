package de.earthdawn;

import javax.xml.bind.JAXBElement;

import de.earthdawn.data.APPEARANCEType;
import de.earthdawn.data.ATTRIBUTEType;
import de.earthdawn.data.CARRYINGType;
import de.earthdawn.data.DEFENSEType;
import de.earthdawn.data.EDCHARACTER;
import de.earthdawn.data.HEALTHType;
import de.earthdawn.data.INITIATIVEType;
import de.earthdawn.data.KARMAType;
import de.earthdawn.data.MOVEMENTType;
import de.earthdawn.data.PROTECTIONType;
import de.earthdawn.data.TALENTType;

/**
 * Hilfsklasse zur einfacheren Verarbeitung des JAXB-Baumes
 *
 * @author egon_mueller
 */
public class JAXBHelper {

	public static final String DEFENSE = "DEFENSE";
	
	public static final String APPEARANCE = "APPEARANCE";
	
	public static final String CARRYING = "CARRYING";
	
	public static final String HEALTH = "HEALTH";
	
	public static final String RACEABILITES = "RACEABILITES";
	
	public static final String ATTRIBUTE = "ATTRIBUTE";

	public static final String INITIATIVE = "INITIATIVE";

	public static final String MOVEMENT = "MOVEMENT";

	public static APPEARANCEType getAppearance(EDCHARACTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (APPEARANCE.equals(element.getName().getLocalPart())) {
				return (APPEARANCEType) element.getValue();
			}
		}

		// Not found
		return null;
	}

	public static DEFENSEType getDefence(EDCHARACTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (DEFENSE.equals(element.getName().getLocalPart())) {
				return (DEFENSEType) element.getValue();
			}
		}

		// Not found
		return null;
	}

	public static CARRYINGType getCarrying(EDCHARACTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (CARRYING.equals(element.getName().getLocalPart())) {
				return (CARRYINGType) element.getValue();
			}
		}
		// Not found
		return null;
	}
	public static HEALTHType getHealth(EDCHARACTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (HEALTH.equals(element.getName().getLocalPart())) {
				return (HEALTHType) element.getValue();
			}
		}
		// Not found
		return null;
	}

	public static ATTRIBUTEType getAttribute(EDCHARACTER charakter, String id) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (ATTRIBUTE.equals(element.getName().getLocalPart())) {

				ATTRIBUTEType attribute = (ATTRIBUTEType) element.getValue();
				if (attribute.getName().value().equals(id)) {
					return attribute;
				}
			}
		}

		// Not found
		return null;
	}
	public static INITIATIVEType getInitiative(EDCHARACTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (INITIATIVE.equals(element.getName().getLocalPart())) {
				return (INITIATIVEType) element.getValue();
			}
		}
		// Not found
		return null;
	}
	public static MOVEMENTType getMovement(EDCHARACTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (MOVEMENT.equals(element.getName().getLocalPart())) {
				return (MOVEMENTType) element.getValue();
			}
		}
		// Not found
		return null;
	}

	public static TALENTType getKarmaritual(EDCHARACTER charakter) {
		// TODO Auto-generated method stub
		return null;
	}

	public static KARMAType getKarma(EDCHARACTER charakter) {
		// TODO Auto-generated method stub
		return null;
	}

	public static PROTECTIONType getProtection(EDCHARACTER charakter) {
		// TODO Auto-generated method stub
		return null;
	}
}
