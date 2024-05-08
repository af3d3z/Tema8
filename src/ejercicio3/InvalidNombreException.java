package ejercicio3;

public class InvalidNombreException extends Exception {
	public String toString() {
		return this.getClass() + ": Nombre inválido";
	}
}
