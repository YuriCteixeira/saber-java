
package saber_java;
import java.util.Scanner;
public class Saber_java {

    
    public static void main(String[] args){
        //Instanciando um objeto Scanner
        Scanner input = new Scanner(System.in);
        //Vari�veis
        int a;
        double b;
        String c;
        int valor;
        boolean sera = Integer.toBoolean(valor);
        //Entrada de dados
        System.out.println("Informe o valor inteiro da vari�vel:");
        a = input.nextInt();
        System.out.println("Informe o valor decimal da vari�vel:"); 
        b = input.nextDouble();
        System.out.println("Informe o valor string da vari�vel:");
        c = input.next();
         System.out.println("Informe o valor boolean da vari�vel:");
        sera = input.nextBoolean();
        //Sa�da de dados
        System.out.println ("Ol�, mundo!");
        System.out.println("A vari�vel tipo int recebe "+a);
        System.out.println("A vari�vel tipo double recebe "+b);
        System.out.println("A vari�vel tipo string recebe "+c);
        System.out.println("A vari�vel tipo boolean recebe "+sera);
        
    }
    
}
