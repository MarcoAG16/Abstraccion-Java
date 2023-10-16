package Animal;

public class Perro extends Animal {//Herencia de la clase superior Animal
	
	
		//"Polimorfear" o sobreescribir el metodo heredado
		@Override//Con la anotacion Override, ledecimos a Java que el metodo hacerSonido sera sobreescrito
		public void hacerSonido() {
			System.out.println("El perrito ladra y hace guau");
			
		}//metodo hacerSonido heredado de Animal
		
		
		
		public static void main (String []args) {
			//Aqui 	NO hay polimorfismo, ya que instancio un animal generico, y utilizo su metodo hacerSonido
			Animal Generico = new Animal (); //Genera un animal generico (abstracto)			
			
			Generico.hacerSonido();//antes de la ejecucion 
			
			//Generar la instancia de mi perrito
			
			//SI hay polimorfismo, porque es el equivaente a decir "instancio un animal que es un perrito"
			//Referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
			Animal Chilaquil = new Perro();
			
			Chilaquil.hacerSonido();
			
			
		}//metodo main
	

}//cierre clase perro
