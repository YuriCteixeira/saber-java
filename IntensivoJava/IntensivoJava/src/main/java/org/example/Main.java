package org.example;

import java.util.Scanner;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int opcao, opcao1, opcaoMat1, opcaoMat2 = 0, qtde;
        double num, num1 = 0, num2 = 0, x1 = 0, x2 = 0;
        boolean start = true;
        Scanner input = new Scanner(System.in);

        MatematicaUm mat1 = new MatematicaUm();
        Matematica2 mat2 = new Matematica2();
        TextosMenus texto = new TextosMenus();

        do {
            texto.MenuInicial();
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(texto.Historia());
                    break;
                case 2:
                    System.out.println(texto.TiposPrimitivos());
                    break;
                case 3:
                    texto.MenuMatGeral();
                    opcao1 = input.nextInt();
                    switch (opcao1) {
                        case 1:
                            System.out.println("Informe um número:");
                            num = input.nextDouble();
                            texto.MenuMatUmNum();
                            opcaoMat1 = input.nextInt();
                            switch (opcaoMat1) {
                                case 1:
                                    System.out.println("O resto da divisão de " + num + "por 2 é " + mat1.RestoDois(num));
                                    break;
                                case 2:
                                    System.out.println(num + " elevado a 3 é " + mat1.NumElevado3(num));
                                    break;
                                case 3:
                                    System.out.println("Raíz quadrada de " + num + " é " + mat1.RaizQ(num));
                                    break;
                                case 4:
                                    System.out.println("Raíz cúbica de " + num + " é " + mat1.RaizCub(num));
                                    break;
                                case 5:
                                    System.out.println("O valor absoluto de " + num + " é " + mat1.ValAbsoluto(num));
                                    break;
                                case 6:
                                    System.out.println("12 primeiros números de Fibonacci:");
                                    for (int i = 0; i <= 12; i++) {
                                        System.out.println(mat1.Fibonacci(i));
                                    }
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    continue;
                            }

                        case 2:
                            if (opcaoMat2 != 6) {
                                System.out.println("Informe o primeiro número:");
                                num1 = input.nextDouble();
                                System.out.println("Informe o segundo número:");
                                num2 = input.nextDouble();
                            }
                            texto.MenuMatMaisNum();
                            opcaoMat2 = input.nextInt();
                            switch (opcaoMat2) {
                                case 1:
                                    System.out.println(num1 + num2 + " é = " + mat2.adicao(num1, num2));
                                    break;
                                case 2:
                                    System.out.println(num1 - num2 + " é = " + mat2.Subtracao(num1, num2));
                                    break;
                                case 3:
                                    System.out.println(num1 * num2 + " é = " + mat2.Multiplicacao(num1, num2));
                                    break;
                                case 4:
                                    System.out.println(num1 / num2 + " é = " + mat2.Divisao(num1, num2));
                                    break;
                                case 5:
                                    System.out.println("O valor da hipotenusa é " + mat2.Pitagoras(num1, num2));
                                    break;
                                case 6:
                                    int a, b, c;
                                    double delta;
                                    System.out.println("Informe o valor de a:");
                                    a = input.nextInt();
                                    System.out.println("Informe o valor de b:");
                                    b = input.nextInt();
                                    System.out.println("Informe o valor de c:");
                                    c = input.nextInt();
                                    delta = Math.pow(b, 2) - 4 * a * c;
                                    if (delta < 0) {
                                        System.out.println("Não tem raízes reais para numeros negativos. Refaca a operacao");
                                    } else if (delta == 0) {
                                        x1 = (-b + Math.sqrt(delta)) / 2 * a;
                                        System.out.println("Quando o delta e zero, os dois resultados são iguais, então só trouxemos o valor de x1, que é " + x1);
                                    } else {
                                        x1 = (-b + Math.sqrt(delta)) / 2 * a;
                                        x2 = (-b - Math.sqrt(delta)) / 2 * a;
                                    }
                                    System.out.println("O Valor de x1 é " + x1 + " e o de x2 é " + x2);
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    continue;
                            }

                    }
                case 4:

                    System.out.println("Bem-vindo aos inimigos do fim");
                    System.out.println("Quantas pessoas deseja cadastrar?");
                    qtde = input.nextInt();
                    String[] pessoas = new String[qtde];
                    for (int i = 0; i < qtde; i++) {
                        System.out.println("Informe seu nome: ");
                        pessoas[i] = input.next();
                        System.out.println(pessoas[i]);
                        System.out.println("Cadastrado com sucesso");
                    }

                    break;
                case 5:
                    start = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    continue;
            }
        } while (start == true);


    }
}