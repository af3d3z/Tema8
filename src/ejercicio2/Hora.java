package ejercicio2;

/**
 * Representa un periodo de tiempo formado por la hora y los minutos
 */
public class Hora {
	/**
	 * Hora
	 */
	protected int hora;
	/**
	 * Minutos
	 */
	protected int minuto;
	
	/**
	 * Segundos
	 */
	protected int segundos;

	/**
	 * Cosntructor con parametros
	 * 
	 * @param hora   Hora
	 * @param minuto Minuto
	 * @throws NegativeSecondException 
	 * @throws NegativeHourException 
	 * @throws NegativeMinuteException 
	 */
	public Hora(int hora, int minuto, int segundos) throws NegativeSecondException, NegativeHourException, NegativeMinuteException {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;			
		}else {
			throw new NegativeHourException();
		}

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;			
		}else {
			throw new NegativeMinuteException();
		}
		
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;			
		}else {
			throw new NegativeSecondException();
		}
	}

	/**
	 * Añade 1 a los minutos
	 */
	public void inc() {
		minuto++;

		if (minuto >= 60) {
			minuto = 0;
			hora++;
		}
	}

	/**
	 * Cambia la hora de la clase
	 * @param hora Hora nueva
	 * @return true si se pudo cambiar la hora, false en caso contrario
	 */
	public boolean setHora(int hora) throws NegativeHourException{
		boolean res = false;

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			res = true;
		}else {
			throw new NegativeHourException();
		}
		return res;

	}

	/**
	 * Cambia los minutos de la clase
	 * @param minuto minutos nuevos
	 * @return true si se pudo cambiar la hora, false en caso contrario
	 * @throws NegativeMinuteException 
	 */
	public boolean setMinuto(int minuto) throws NegativeMinuteException {
		boolean res = false;

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			res = true;
		}else {
			throw new NegativeMinuteException();
		}
		return res;
	}
	
	public boolean setSegundo(int segundo) throws NegativeSecondException {
		boolean res = false;
		
		if(segundo >= 0 && minuto <= 59) {
			this.segundos = segundo;
			res = true;
		}else {
			throw new NegativeSecondException();
		}
		
		return res;
	}

	@Override
	public String toString() {
		return this.hora + ":" + this.minuto + ":" + this.segundos;
	}

}