// Clase: operacionesBasicas
// Fecha: 23/04/2022
// Autor: Abel Zapico Amat
// Descripcio: Clase en la que se realizaran las 4 operaciones Basicas sobre 2 numeros dados por el usuario
// 


import java.util.Scanner;

public class operacionesBasicas
{

	public static void main(String[] args) 
	{
		
	//Declaracion de Variables 
		int n1;
		int n2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		Scanner leer = new Scanner (System.in);
		
	//Solicitud de datos al usuario
		System.out.println("Bienvenido a Operaciones Basicas ");
		System.out.println("Introduce el primer numero");
		n1 = leer.nextInt();
		System.out.println("Introduce el segundo numero");
		System.out.println("");
		n2 = leer.nextInt();
		System.out.println("Muchas Gracias");
		System.out.println("Iniciando operaciones");
	
	//Operaciones 
		suma = n1 + n2;
		resta = n1 -n2;
		multiplicacion = n1 * n2;
		division = n1 /n2;
		
	//Resultados de las operaciones
		System.out.println("La suma de los dos numeros es " + suma);
		System.out.println("La resta de los dos numeros es " + resta);
		System.out.println("El producto de los dos numeros es " + multiplicacion);
		System.out.println("El cociente de los 2 numeros es " + division);
		
	//Despedida
		System.out.println("Hasta OTRA");
	}

}

