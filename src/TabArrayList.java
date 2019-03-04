import java.util.ArrayList;

public class TabArrayList {
	
	//cours https://www.youtube.com/watch?v=_aIpkJAqZXY&t=213s
	//cours https://www.youtube.com/watch?v=-fX3uHrKnHA	
	//cours https://www.youtube.com/watch?v=_t3ivpBu57E
	//cours https://www.youtube.com/watch?v=4xvceAWfgbM

	public static void main(String[] args) {
		ArrayList<Integer> tabInt = new ArrayList<>();
		//la m�thode add ajoute dynamiquement un element � la fin du tableau
		tabInt.add(5);
		tabInt.add(6);
		tabInt.add(8);
		tabInt.add(123);
		//la m�thode set permet de mettre � jour la valeur 5 � 128 en position 0
		tabInt.set(0, 128);
		//m�thode get permet d'obtenir la valeur en position 0
		System.out.println(tabInt.get(2));
		//m�thode clear supprime tout le tableau
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
		
		// boucle sur chaque �l�ment item du tableau tabCapitale est affich�
		for (String item : tabCapitale) {
			System.out.println(item);
		}
		
	}

}
