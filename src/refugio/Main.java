package refugio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Animal> refugio = new ArrayList<>();
		int opcion = -1;
		Scanner scanner = new Scanner(System.in);
		
		
		
		while (opcion != 0) {
            System.out.println("Menú:");
            System.out.println("1. Añadir animal");
            System.out.println("2. Mostrar datos de todos los animales");
            System.out.println("0. Salir");
            System.out.print("Elegir opción: ");
           
            
            if (opcion == 1) {
    			System.out.print("Añadir animal: ");
    			String tipo = scanner.nextLine();
                System.out.print("Añadir nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Añadir edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine();
                
                if (tipo.equalsIgnoreCase("perro")) {
                    System.out.print("Añadir raza: ");
                    String raza = scanner.nextLine();
                    refugio.add(new Perro(nombre, edad, raza));
                } else if (tipo.equalsIgnoreCase("gato")) {
                    System.out.print("Añadir longitud de bigotes (mm): ");
                    int longitudBigotes = scanner.nextInt();
                    refugio.add(new Gato(nombre, edad, longitudBigotes));
                }
				}else if (opcion == 2) {
	                System.out.println("Datos de todos los animales:");
	                for (Animal animal : refugio) {
	                    animal.mostrarDatos();
	                }
    		
				} else if (opcion == 0) {
	                System.out.println("Salir");
				}
            
		}
		
		 scanner.close();
		
	}

	
	

}

