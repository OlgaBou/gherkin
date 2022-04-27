package cucumberJava;

public class Casino {
	
	Client client; 
	
	public static String autorisationCient(Client client) {
		String reponse;

		if (client.age>=18 && client.gambler==false) {
			reponse = "of course, come in";
		} else {
			reponse = "no way, get out my face !";
		}
		return reponse;

	}
}
