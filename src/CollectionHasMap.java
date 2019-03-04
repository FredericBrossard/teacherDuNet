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
		
		

	}

}
