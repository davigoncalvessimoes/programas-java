package pares_impares;

import java.util.Scanner;

public class pares_impares {
    public static void main(String[] args)
    {
        int i, numero, cont_pares=0, cont_impares=0; 
        Scanner ler = new Scanner(System.in);

        for(i = 0; i < 10; i++)
        {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();
            if(numero % 2 == 0)
            {
                cont_pares+=1;
            }
            else
            {
                cont_impares+=1;
            }
        } 

        System.out.println("Quantidade de números pares: "+cont_pares);

        System.out.println("Quantidade de números impares: "+cont_impares);

    }
}
