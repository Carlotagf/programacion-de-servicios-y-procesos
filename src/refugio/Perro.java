package refugio;


public class Perro extends Animal{
		
		String raza;
		
		public Perro(String nombre, int edad, String raza) {
	        super(nombre, edad);
	        this.raza = raza;
	    }
		
		public void ladrar() {
			System.out.println("guau guau");
		}
		
		public void mostrarDatos() {
	        super.mostrarDatos();
	        System.out.println("Raza: " + raza);
	    }
}
