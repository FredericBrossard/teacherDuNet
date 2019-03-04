import java.util.ArrayList;

public class TabArrayList {
	
	//cours https://www.youtube.com/watch?v=_aIpkJAqZXY&t=213s
	//cours https://www.youtube.com/watch?v=-fX3uHrKnHA	
	//cours https://www.youtube.com/watch?v=_t3ivpBu57E
	//cours https://www.youtube.com/watch?v=4xvceAWfgbM

	public static void main(String[] args) {
		ArrayList<Integer> tabInt = new ArrayList<>();
		//la méthode add ajoute dynamiquement un element à la fin du tableau
		tabInt.add(5);
		tabInt.add(6);
		tabInt.add(8);
		tabInt.add(123);
		//la méthode set permet de mettre à jour la valeur 5 à 128 en position 0
		tabInt.set(0, 128);
		//méthode get permet d'obtenir la valeur en position 0
		System.out.println(tabInt.get(2));
		//méthode clear supprime tout le tableau
		//tabInt.clear();
		//remove supprime du tableau
		tabInt.remove(2);
		if (tabInt.isEmpty()) {
			System.out.println("Tableau Vide");
		} else {
			System.out.println(tabInt.get(2));
		}
		
		ArrayList<String> tabCapitale = new ArrayList<>();
		tabCapitale.add("Paris");
		tabCapitale.add("Madrid");
		tabCapitale.add("Moscow");
		
		// boucle sur chaque élément item du tableau tabCapitale est affiché
		for (String item : tabCapitale) {
			System.out.println(item);
		}
		
	}

}
