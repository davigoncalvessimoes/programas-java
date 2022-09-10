// Declaração do diretório hierarquicamente superior
package calculadora;

// Importação do Scanner para capturar dados digitados
import java.util.Scanner; 

// Declaração da classe calculadora
public class calculadora
{
    // Declaração da função da classe calculadora
    public static void main(String[] args)
    {
        // Preparação da variável para captura de dados
        Scanner ler = new Scanner(System.in);
        // Declaração das variáveis do tipo inteiro
        int a, b;

        // Escrita na tela
        System.out.print("Digite o primeiro número: ");
        // Captura do teclado para armazenar na variável
        a = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        b = ler.nextInt();

        // Fechamento da variável tipo Scanner
        ler.close();
        
        // Escrita dos resultados na tela
        System.out.println("Adição: "+(a+b));
        System.out.println("Subtração: "+(a-b));
        System.out.println("Multiplicação: "+(a*b));
        System.out.println("Divisão: "+(a/b));

    }

}