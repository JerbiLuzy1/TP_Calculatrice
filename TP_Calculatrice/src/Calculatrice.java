
public class Calculatrice {

	
	private static long premiereValeur;
	private static long deuxiemeValeur;

	
	
	 public Calculatrice  (long premiereValeur , long deuxiemeValeur){
		 
		 this.premiereValeur = premiereValeur ;
		 this.deuxiemeValeur = deuxiemeValeur ;
		  
	 }
	 	
	public static String ajouter (  ) {
		
	    long resultat = premiereValeur + deuxiemeValeur ;
		
		return "le résultat de l'opéaration est :"+resultat; 
				
	}
	
	public static String soustraire ( ) {
		
		long resultat = premiereValeur - deuxiemeValeur ;
		
		return "le résultat de l'opéaration est :"+resultat; 
		
		
	}

	public static String multiplier () {
	
		long resultat = premiereValeur * deuxiemeValeur ;
		
		return "le résultat de l'opéaration est :"+resultat; 
		
}

	public static String diviser () {
	
		long resultat = premiereValeur / deuxiemeValeur ;
		
		return "le résultat de l'opéaration est :"+resultat; 
		
}
	
	
}
