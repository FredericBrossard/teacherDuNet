
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CollectionMusic {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Exercice ici : https://www.youtube.com/watch?v=tQAotZQfQy4. lire un fichier de titre de chanson
			
		ArrayList<String> artistes = new ArrayList<String>();
		File fichier = new File("music.txt");
		
		try {
			//bufferedreader permet de lire ligne à ligne
			BufferedReader buffer = new BufferedReader(new FileReader(fichier));
			String ligne = null;
		
			while ((ligne = buffer.readLine()) != null) {
				String [] parties = ligne.split("/");
				System.out.println("le nom de l artiste est : " + parties[0] + " de titre de chanson : " + parties [1]);
				artistes.add(parties[0]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(artistes);
		System.out.println(artistes);
	
	
	}

}
