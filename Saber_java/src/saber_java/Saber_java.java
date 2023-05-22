
package saber_java;
import java.util.Scanner;
public class Saber_java {

    
    public static void main(String[] args){
        //Instanciando um objeto Scanner
        Scanner input = new Scanner(System.in);
        //Variáveis
        int a;
        double b;
        String c;
        int valor;
        boolean sera = Integer.toBoolean(valor);
        //Entrada de dados
        System.out.println("Informe o valor inteiro da variável:");
        a = input.nextInt();
        System.out.println("Informe o valor decimal da variável:"); 
        b = input.nextDouble();
        System.out.println("Informe o valor string da variável:");
        c = input.next();
         System.out.println("Informe o valor boolean da variável:");
        sera = input.nextBoolean();
        //Saída de dados
        System.out.println ("Olá, mundo!");
        System.out.println("A variável tipo int recebe "+a);
        System.out.println("A variável tipo double recebe "+b);
        System.out.println("A variável tipo string recebe "+c);
        System.out.println("A variável tipo boolean recebe "+sera);
        
    }
    
}
