package ejercicio4;

public class EscritorInvalidoException extends Exception {
	public String toString() {
		return this.getClass() + ": Escritor inválido.";
	}
}
