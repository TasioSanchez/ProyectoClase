import java.util.Scanner;
public class Clase {
  public static void main(String[] args) {
      Scanner reader = new Scanner (System.in);
	   int [] numeros = new int[10];
	   for (int i = 0; i < 10; i++){
		  System.out.println ("Introduce un número: ");
 		  numeros[i] = reader.nextInt();
	   }
	   imprimeArray(numeros);
	   
	   int min = numeros[0];
	   int indexMix = 0;
	   for (int i=1; i<10; i++){
	     if (numeros[i] < min){
		   min = numeros[i];
		   indexMin = i; 
		 }
	   }
  }
  
       int aux = numeros[0];
       numeros[0] = min;
	   numeros[indexMin] = aux;
	   
	   imprimeArray(numeros);
  
  
  public static void imprimeArray(int enteros[]) {
	System.out.println ();
	for (int i = 0; i < enteros.length; i++) {
	  System.out.println ( enteros[i] + "  ");
	}
	System.out.println();
  }
}	