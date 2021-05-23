import java.util.Random;

public class Main {

public static void main(String[] args) {
		final int CANT_ALUMNOS = 70;

		String[] alumnos = new String[CANT_ALUMNOS];
		int[] notas = new int[CANT_ALUMNOS];
		
		datosExamenFinal (alumnos, notas);
		
		int promedio = promedioNotas (notas);
		System.out.println(String.format("El promedio de las notas de los alumnos es %s", promedio));
		
		superarPromedio(promedio, alumnos, notas);
		
	}
	
	private static void datosExamenFinal (String[] alumnos, int[] notas) {
		Random rand = new Random();
		int i;
		
		for (i = 0 ; i < alumnos.length ; i++) {
			alumnos[i] = "Alumno/a " + (i + 1);
			notas[i] = rand.nextInt(10) + 1;
			
//			Para ver todos los apellidos y notas descomentar lo siguiente:
//			System.out.println(alumnos[i] + "\t" + notas[i]);
		}
	}
	
	private static int promedioNotas (int[] notas) {
		int totalNotas = 0;

		for (int i = 0 ; i < notas.length ; i++){
		totalNotas += notas[i];
		}

		return totalNotas / notas.length;
		
	}

	private static void superarPromedio (int promedio, String[] alumnos, int[] notas) {
		
		System.out.println("\nLos siguientes alumnos/as superaron la nota promedio:\nApellido \t Nota \n------------------------");
		for (int i = 0 ; i < alumnos.length ; i ++) {
			if (notas[i] > promedio) {
				System.out.println(String.format("%s \t %s", alumnos[i], notas[i]));
			}
		}
		
	}
}

