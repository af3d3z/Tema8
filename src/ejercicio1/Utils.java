package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	public static double readDouble(Scanner sc) throws InputMismatchException{
		double numero;
		System.out.println("Introduce un número real:");
		numero = sc.nextDouble();
		sc.nextLine();
		return numero;
	}
	public static int readInt(Scanner sc) throws InputMismatchException {
		int numero;
		System.out.println("Introduce un número entero:");
		numero = sc.nextInt();
		sc.nextLine();
		return numero;
	}
}
