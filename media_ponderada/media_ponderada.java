package media_ponderada;

import java.util.Scanner;

public class media_ponderada
{
	public static void main(String[] args) {
	    float nota1, nota2, media_ponderada;
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.print("Nota 1: ");
		nota1 = ler.nextFloat();
		
		System.out.print("Nota 2: ");
	    nota2 = ler.nextFloat();
	    
	    media_ponderada = (nota1*4 + nota2*6)/(4+6);
	    
	    System.out.println("Média ponderada é: "+media_ponderada);

		ler.close();
	    
	}
}
