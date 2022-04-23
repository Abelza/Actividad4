import java.util.Scanner;

public class operacionesBasicas
{

	public static void main(String[] args) 
	{
		int n1;
		int n2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Bienvenido a Operaciones Basicas ");
		System.out.println("Introduce el primer numero");
		n1 = leer.nextInt();
		System.out.println("Introduce el segundo numero");
		System.out.println("");
		n2 = leer.nextInt();
		System.out.println("Muchas Gracias");
		System.out.println("Iniciando operaciones");
		
		suma = n1 + n2;
		resta = n1 -n2;
		multiplicacion = n1 * n2;
		division = n1 /n2;
		
		
		System.out.println("La suma de los dos numeros es " + suma);
		System.out.println("La resta de los dos numeros es " + resta);
		System.out.println("El producto de los dos numeros es " + multiplicacion);
		System.out.println("El cociente de los 2 numeros es " + division);
		
		System.out.println("Hasta OTRA");
	}

}

