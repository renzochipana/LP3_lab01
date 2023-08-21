package prueba1;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		int vida, rp;
		boolean fl= false;
		vida=0;
		Scanner sc= new Scanner(System.in);
		do {
			vida++; 
			System.out.println("vida" + vida + "\t¿cual es el numero secreto?");
			rp=sc.nextInt();
			if(rp == 1234)
				fl=true;
		}while(vida<3 && !fl);
		if (fl) {
		    System.out.println("¡Adivinaste!");
		    String premio = regalo.elegir(vida);
		    System.out.println("Premio: " + premio);
		} else {
		    System.out.println("¡Ups, perdiste!");
		}
		sc.close();
	}
}
