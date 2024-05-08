package ejercicio2;

public class Main {

	public static void main(String[] args) throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		// HORA
		Hora hora = new Hora(-13, 25, 92);


		if (hora.setMinuto(59)) {
			System.out.println("Se han podido cambiar los minutos");			
		}else {
			System.out.println("No se han podido cambiar los minutos");			
		}

		if (hora.setMinuto(800)) {
			System.out.println("Se han podido cambiar los minutos");			
		}
		else {
			System.out.println("No se han podido cambiar los minutos");			
		}

		hora.inc();
		
		if (hora.setHora(15)) {
			System.out.println("Se ha podido cambiar la hora");
			
		}else {
			System.out.println("No se ha podido cambiar la hora");			
		}

		System.out.println(hora);

	}
}