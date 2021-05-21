import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int cantPatentes;
		int nroPatente;
		long valorModelo;
		long valorPatente;
		int numSuperior = 0;
		int total = 0;
		int i;

		System.out.println("Ingrese la cantidad de patentes que desea procesar");
		cantPatentes = scan.nextInt();

		for (i = 1; i <= cantPatentes; i++) {
			nroPatente = rand.nextInt(10000000);
			valorModelo = rand.nextInt(300000000);

			
			System.out.println(String.format("\nEl numero de patente es %s, y el valor del modelo del año correspondiente es $%s", nroPatente, valorModelo));
			
			
			if (nroPatente <= 1000000) {
				valorPatente = (valorModelo * 5) / 100;
			}
			if (nroPatente <= 2000000 && nroPatente > 1000000) {
				valorPatente = (valorModelo * 10) / 100;
			} else {
				valorPatente = (valorModelo * 15) / 100;
			}

			if (nroPatente >= 1300000) {
				numSuperior += 1;
			}
			System.out.println(String.format("El valor de patente a abonar es: $%s", valorPatente));
			total += valorPatente;
		}
		
		System.out.println(String.format("\nEl valor total de patentes recaudado por el Registro del Automotor es de $%s", total));
		System.out.println("La cantidad de autos cuyo numero de patente es superior a 1300000 es " + numSuperior
				+ ", lo que representa un %" + ((numSuperior * 100) / cantPatentes) + " del total");
	}
}
