package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double numero = 0;
		
		try {
			num = Utils.readInt(sc);
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.err.println("El valor introducido no es de tipo int");
		}
		
		try {
			numero = Utils.readDouble(sc);
		}catch(InputMismatchException e) {
			System.err.println("El valor introducido no es de tipo int");
		}
		System.out.println("Primer número: " + num);
		System.out.println("Segundo número: " + numero);
		sc.close();
	}
}
