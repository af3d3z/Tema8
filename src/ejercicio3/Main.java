package ejercicio3;

public class Main {
	public static void main(String[] args) {
		try {
			CuentaCorriente cc = new CuentaCorriente("asdfasdfasdf", "asdfs", -2);
		} catch (InvalidDNIException | InvalidNombreException | InvalidSaldoException e) {
			System.err.println(e);
		}
	}
}
