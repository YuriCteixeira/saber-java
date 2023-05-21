
package saber_java;
import java.util.Scanner;
public class Saber_java {

    
    public static void main(String[] args){
        /*Entrada:
        Comandos para inserir dados. 
        Temos a classe Scanner, que, para funcionar, necessita importar. 
        */
        Scanner input = new Scanner(System.in);
        //Variáveis
        int a;
        System.out.println("Informe o valor inteiro da variável:");
        a = input.nextInt();
        System.out.println ("Olá, mundo!");
        System.out.println("A variável recebe "+a);
        
    }
    
}
