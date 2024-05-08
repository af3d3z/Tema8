package ejercicio4;

public class TitularInvalidoException extends Exception {
	public String toString() {
		return this.getClass() + ": Titular no válido.";
	}
}
