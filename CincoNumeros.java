import java.util.Scanner;

class CincoNumeros {
  public static void main(String[] args) {
    Scanner lector= new Scanner (System.in);
	int numero2 = 0;
	int suma = 0;
    for (int i = 0 ; i < 5; i++) {
		System.out.println("Introduce un numero: ");
		numero2 = lector.nextInt();
		suma = suma + numero2;
	}
	 
	System.out.println ("La suma es:" + suma);
        System.out.println ("Borrar esto")
}
}