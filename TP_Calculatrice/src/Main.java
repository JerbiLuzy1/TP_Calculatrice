
public class Main {

	public static void main(String[] args) {
		
		
		Calculatrice calcul1 = new Calculatrice(10,2);
		Calculatrice calcul2 = new Calculatrice(10,2);
		Calculatrice calcul3 = new Calculatrice(10,2);
		Calculatrice calcul4 = new Calculatrice(10,2);
		
		System.out.println(calcul1.ajouter());
		System.out.println(calcul1.soustraire());
		System.out.println(calcul1.multiplier());
		System.out.println(calcul1.diviser());

	}

}
