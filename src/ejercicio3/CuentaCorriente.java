package ejercicio3;

public class CuentaCorriente {
	private String dni;
	private String nombre;
	private double saldo;
	
	public CuentaCorriente(String dni, String nombre, double saldo) throws InvalidDNIException, InvalidNombreException, InvalidSaldoException {
		if(dni != null && !dni.equals("")) {
			this.dni = dni;
		}else {
			throw new InvalidDNIException();
		}
		
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}else {
			throw new InvalidNombreException();
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		}else {
			throw new InvalidSaldoException();
		}
	}
}
