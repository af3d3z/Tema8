package ejercicio3;

public class InvalidSaldoException extends Exception{
	public String toString() {
		return this.getClass() + ": El saldo es inválido.";		
	}
}
