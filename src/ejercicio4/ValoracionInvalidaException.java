package ejercicio4;

public class ValoracionInvalidaException extends Exception {
	public String toString() {
		return this.getClass() + ": Valoración no válida.";
	}
}
