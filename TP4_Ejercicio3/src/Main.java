import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcion;
		
		System.out.println("¿El área de qué figura desea averiguar? (Ingrese solamente el número de la opción)");
		System.out.println("1 - Circulo");
		System.out.println("2 - Cuadrado");
		System.out.println("3 - Rectangulo");
		System.out.println("4 - Triangulo");
		System.out.println("5 - Trapecio");
		opcion = scan.nextInt();
		
		switch (opcion) {
		case 1: 
			System.out.println("El área del circulo es " + areaCirculo(scan));
			break;
		case 2:
			System.out.println("El área del cuadrado es " + areaCuadrado(scan));
			break;
		case 3:
			System.out.println("El área del rectangulo es " + areaRectangulo(scan));
			break;
		case 4:
			System.out.println("El área del triangulo es " + areaTriangulo(scan));
			break;
		case 5:
			System.out.println("El área del trapecio es " + areaTrapecio(scan) );
			break;
		default: 
			System.out.println("La opcion ingresada no es correcta");
			break;
		}
	}

	private static double areaCirculo(Scanner scan) {
		double radio;
		double area;
		final double PI = Math.PI;
		
		System.out.println("Introduzca el valor del radio");
		radio = scan.nextDouble();
		
		area = Math.round(PI * Math.pow(radio,2));
		
		return area;
	}
	
	private static double areaCuadrado(Scanner scan) {
		double lado;
		double area;
		
		System.out.println("Introduzca el valor de los lados");
		lado = scan.nextDouble();
		
		area = Math.pow(lado, 2);
		
		return area;
	}
	
	private static double areaRectangulo(Scanner scan) {
		double altura;
		double base;
		double area;
		
		System.out.println("Introduzca el valor de la base");
		base = scan.nextDouble();
		
		System.out.println("Introduzca el valor de la altura");
		altura = scan.nextDouble();
		
		area = base * altura;
		
		return area;
	}
	
	private static double areaTriangulo(Scanner scan) {
		double area;
		
		area = areaRectangulo(scan) / 2;
		
		return area;
	}
	
	private static double areaTrapecio(Scanner scan) {
		double altura;
		double baseSuperior;
		double baseInferior;
		double area;
		
		System.out.println("Introduzca el valor de la base superior");
		baseSuperior = scan.nextDouble();
		
		System.out.println("Introduzca el valor de la base inferior");
		baseInferior = scan.nextDouble();
		
		System.out.println("Introduzca el valor de la altura del rectangulo");
		altura = scan.nextDouble();
		
		area = ((baseSuperior * baseInferior) * altura) / 2;
		
		return area;
	}
}
