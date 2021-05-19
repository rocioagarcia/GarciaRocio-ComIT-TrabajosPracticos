import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();

		int edad = rand.nextInt(65 - 16) + 16;
		int experiencia = rand.nextInt((edad - 16));
		int remuneracion = (rand.nextInt(70 - 15) + 15) * 1000;
		
//		 para probar ultimo caso facilmente:
//		 int edad = 33;
//		 int experiencia = 5;
//		 int remuneracion = 30000;
		
		System.out.println("*********Datos del aspirante*********");
		System.out.println("La edad es " + edad + " años.");
		System.out.println("La experiencia es de " + experiencia + " años.");
		System.out.println("La remuneración estimativa a percibir mensualmente es $" + remuneracion + ".");
		
		System.out.println("\n*********Realizando evaluacion de criterios*********");
		System.out.println("\n*********Resolucion de la evaluacion del postulante*********");
		
		//evaluacion 1er criterio: edad
		if (edad < 18 || edad > 35) {
			System.out.println("Ha sido rechazado para el puesto.");
			return;
		}

		// evaluacion 2do criterio: experiencia y edad
		if (experiencia < 3 && remuneracion > 50000) {
			System.out.println("Ha sido rechazado para el puesto.");
			return;
		} 

		// evaluacion 3er criterio: edad y experiencia
		if (edad > 32) {
			if (experiencia < 3) {
				System.out.println("Ha sido rechazado para el puesto.");
				return;
			}
			if (experiencia < 6 && experiencia >= 3) {
				System.out.println("Ha sido seleccionado de manera condicional.");
			} else {
				System.out.println("Ha sido seleccionado de forma definitiva.");
			}
		} else {
			System.out.println("Ha sido seleccionado de forma definitiva.");
		}
	}
}
