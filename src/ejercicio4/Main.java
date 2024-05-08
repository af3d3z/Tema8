package ejercicio4;

public class Main {
	public static void main(String[] args) {
		try {
			Articulo art = new Articulo("A research on today's modern society", "Tim Brown", -22);
		} catch (TitularInvalidoException | EscritorInvalidoException | ValoracionInvalidaException e) {
			System.err.println(e);
		}
	}
}
