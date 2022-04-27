package cucumberJava;

import java.util.List;

public class Calcul {
	
	int sum;
	public static int calculatrice(List<Integer> listeValeurs) {	
	int sum = 0;
    for(int i = 0; i < listeValeurs.size(); i++)
    {
        sum += listeValeurs.get(i);
    } return sum;
	}
}
