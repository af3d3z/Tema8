package ejercicio3;

public class InvalidDNIException extends Exception {
	public String toString() {
		return this.getClass() + ": DNI inválido.";
	}
}
