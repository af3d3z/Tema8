package ejercicio2;

public class NegativeHourException extends Exception {
	private String error = this.getClass() + ":El valor de las horas es negativo o inválido"; 
	
	public String toString() {
		return this.error;
	}
	public String getMessage() {
		return this.error; 
	}

}
