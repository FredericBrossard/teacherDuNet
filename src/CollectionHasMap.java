import java.util.HashMap;

public class CollectionHasMap {

	public static void main(String[] args) {
		// construire une liste de Pays et Capitale, puis afficher la capitale d'un pays.
		// https://www.youtube.com/watch?v=I9aBP0xm-lE
		
		HashMap<String, String> tabMap = new HashMap<>();
		
		tabMap.put("France", "Paris");
		tabMap.put("Espagne", "Madrid");
		tabMap.put("Italie","Rome");
		
		System.out.println("La Capitale de l'Espagne est : " + tabMap.get("Espagne"));
		
		HashMap<String, Integer> refNbHab = new HashMap<String, Integer>();
		refNbHab.put("Paris", 3000000);
		refNbHab.put("Madrid", 100000);
		refNbHab.put("Rome", 568970);
		
		System.out.println(refNbHab);
		
		refNbHab.put("Lisbonne", 135648);
		
		System.out.println(refNbHab);
		
		String phoneNumber= "052348572";
		String codeDepart = "972";
		phoneNumber = phoneAddIndcatif(phoneNumber, codeDepart);
		System.out.println("Le nouveau no est le : " + phoneNumber);
		
		String phoneNumber2= "052348572";
		String codeDepart2 = "975";
		phoneNumber = phoneAddIndcatif(phoneNumber2, codeDepart2);
		System.out.println("Le nouveau no est le : " + phoneNumber);
	}
		
	private static String phoneAddIndcatif(String phoneNumber, String codeDepart) {
		
		HashMap<String, String> tabPostalCdToPhoneNumber = new HashMap<>();
		
		uploadTablePostalCdAndIndicatif(tabPostalCdToPhoneNumber);
		
		System.out.println(tabPostalCdToPhoneNumber);
		
		System.out.println("L indicatif du departement : " + codeDepart  + " : " + tabPostalCdToPhoneNumber.get(codeDepart));
		
		String phoneNumberWithIndicatif;
		if ( null != tabPostalCdToPhoneNumber.get(codeDepart) ) {
			phoneNumberWithIndicatif = tabPostalCdToPhoneNumber.get(codeDepart) + phoneNumber;
		} else {
			phoneNumberWithIndicatif = phoneNumber;
		}
		
		
		System.out.println("Le No avec indicatif est le : " + phoneNumberWithIndicatif);
		
		return phoneNumberWithIndicatif;
	}

	private static void uploadTablePostalCdAndIndicatif(HashMap<String, String> tabPostalCdToPhoneNumber) {
		tabPostalCdToPhoneNumber.put("971","90");
		tabPostalCdToPhoneNumber.put("972","96");
		tabPostalCdToPhoneNumber.put("973","94");
		tabPostalCdToPhoneNumber.put("974","91");

	}

}
