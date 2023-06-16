package org.example;

public class TextosMenus {


    public void MenuInicial() {
        System.out.println("- * - * - INTENSIVÃO DE JAVA - * - * -");
        System.out.println("O que quer saber?");
        System.out.println("1- História e como o Java funciona");
        System.out.println("2- Tabela de tipos primitivos");
        System.out.println("3- Operadores aritméticos");
        System.out.println("4- Vetores: faça sua inscrição na nossa seita! É legal e divertido!");
        System.out.println("5- Sair");
    }

    public void MenuMatGeral() {
        System.out.println("- * - * - MATEMÁTICA - * - * -");
        System.out.println("1- Operações envolvendo um único número");
        System.out.println("2- Operações envolvendo mais números");
        System.out.println("3- Voltar ao menu inicial");
    }

    public void MenuMatUmNum() {
        System.out.println("- * - * - MATEMÁTICA OPERAÇÕES COM UM NÚMERO - * - * -");
        System.out.println("Informe a operação:");
        System.out.println("1- Resto da divisão por 2");
        System.out.println("2- Número elevado a 3");
        System.out.println("3- Raiz quadrada");
        System.out.println("4- Raiz cúbica");
        System.out.println("5- Valor Absoluto");
        System.out.println("6- Fibonacci");

    }

    public void MenuMatMaisNum() {
        System.out.println("- * - * - MATEMÁTICA OPERAÇÕES COM MAIS NÚMEROS - * - * -");
        System.out.println("Escolha uma operação:");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Pitágoras");
        System.out.println("6- Bhaskara");


    }


    public String Historia() {
        return "O prof Guanabara explica brevemente sobre a evolução dos computadores para mostrar a progressão de um sistema\n" +
                "no qual não havia linguagem de programação, tudo sendo feito através da manipulação dos plugs, isso nos antigos\n" +
                "computares ENIACs, para o então surgimento das linguagens de alto níveis quando os Pascal passaram a fazer parte\n" +
                "do dia-a-dia das pessoas, citando aqui o Pascal. O código-fonte, então, passou a ser transformado em código executável\n" +
                "pela máquina através de compiladores. \n" +
                "Ocorre que o Pascal só funcionava em uma plataforma, havendo a necessidade de uma linguagem multiplataforma, \n" +
                "surgindo, assim, o C. Posteriormente, o C evoluiu para C++, sendo o \"++\" para explicar que foi adicionada mais\n" +
                "funcionalidade a ele: a orientação ao objeto e, logo depois, o C#.\n" +
                "Em 1990, na empresa Sun, foi criada uma linguagem para substituir o C++: a Greentalk, cujo o objetivo era a intercomunicação \n" +
                "para fazer dispositivos diferentes se comunicarem, sendo rebatizada para oak e serviu para criar o starseven, um dispositivo para \n" +
                "controlar os dispositivos da casa. Ex: tv, luz. No entanto, não foi bem aceito e o projeto foi engavetado.\n" +
                "Já em 1994, foi desenvolvida a webrunne, cuja ideia era criar interatividade para web, inspirado no que o starseven fazia, \n" +
                "rebatizando para java (por causa do café que deixava e, cá entre nós, ainda deixa os programadores animados). \n" +
                "Insta salientar que a Netskip criou o Javascript e pôs esse nome devido ao hype do Java, mas o primeiro não é derivado do último.     \n" +
                "Sobre a interatividade que o Java proporciona, na época a Sun criou o java ring, consistindo num anel capaz de armazenar informações e conectar com um dispositivo.\n" +
                "Finalmente, o Guanabara fala sobre a utilidade do Java, inclusive no robô que foi enviado para Marte, uma vez que\n" +
                "ele se comunica com a Terra através da linguagem. Falou, também, sobre o Java ter código aberto e sobre a empresa Sun ter sido comprada pela Oracle.\n" +
                "Agora que temos uma noção da história do Java, podemos partir para o seu funcionamento. Se nós escrevemos “Olá mundo!” no \n" +
                "formato de código-fonte e já executamos no PC, a máquina, provavelmente, não vai entender e, consequentemente não vai ler e executar esse comando. \n" +
                "Para isso, precisa de um compilador, que traduz o código em linguagem que o computador entenda de modo que execute corretamente. \n" +
                "Na linguagem, C, se você compilava um código em um compilador no Linux, esse código só seria executável no Linux, já o \n" +
                "compilador java (javac), além de compilar, necessita de mais um software intermediário para ler o bytecode, a java virtual \n" +
                "machine (JVM). \n" +
                "Cada sistema operacional tem sua respectiva JVM, então, se compilamos um código em linux, este poderá ser lido em qualquer \n" +
                "sistema operacional, uma vez que a JVM do destinatário vai ler o código para torna-lo executável, de fato. Isso gerou até \n" +
                "um conceito: WORA, que traduzindo para o português fica: escreva uma vez, execute em qualquer lugar, fazendo uma referência \n" +
                "ao que foi dito acima sobre o código-fonte feito em java poder ser executado em qualquer plataforma.\n" +
                "Por conseguinte, existem dois tipos de pessoas que manipulam o java: o programador e usuários, que são separados pela plataforma.\n" +
                "Usuários usam JRE e programadores usam o JDk. JRE é ambiente de execução java e JDK é ambiente de desenvolvimento java. Usaremos o JDK.\n" +
                "O JRE é comporsto da JVM e bibliotecas, que são apis usados no programa que facilitam sua utilização. A primeira possui \n" +
                "loader, que carrega o bytecode na memória da máquina virtual, o verificador analisa se o código é executável, o interpretador transforma o bytecode em um código nativo da máquina em questão, o gerenciador trata como os códigos e variáveis são gerenciados na memória da jvm.\n";
    }

    public String TiposPrimitivos() {

        return "----------------------------------------------------------------------\n" +
                "| Família | Tipo Primitivo | Classe Invólucro | Tamanho    | Exemplo |\n" +
                "| Lógico  | boolean        | Boolean          | 1 bit      | True    |\n" +
                "| Literais| char           | Character        |1 byte      |“A”      |\n" +
                "|         |                | String           | 1 byte/cada|“Java”   |\n" +
                "| Inteiros| byte           | Byte             | 1 byte     |127      |\n" +
                "|         |short           | Short            | 2 bytes    |32767    |\n" +
                "|         |int             | Integer          | 4 bytes    |2147483  |\n" +
                "|         |long            |Long              |  8 bytes   |2 ^63    |\n" +
                "| Reais   |float           |Float             |4 bytes     |3.4e+38  |\n" +
                "|         |double          |Double            |8 bytes     |1.8e+308 |\n" +
                "----------------------------------------------------------------------";
    }
}
