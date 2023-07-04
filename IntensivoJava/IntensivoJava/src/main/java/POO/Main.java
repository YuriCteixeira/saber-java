package POO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario func1 = new Funcionario("Samia", "11111111111", "12122121112", "Analista de Recursos Humanos", 2500, true);
        Gerente g1 = new Gerente("Daniele", "22222222222", "11444411141", "Gerente", 3100, true, "Vendas");
        Funcionario func2 = new Funcionario("Saulo", "33333333333", "32232233233", "Consultor de Vendas", 2750.67, true);
        Gerente g2 = new Gerente("Walter", "77777777777", "7887887778", "Gerente", 3100, false, "Marketing");

        func1.receberSalario(2500, 0);
        func2.receberSalario(2750, 2);
        g1.receberSalario(3100, 3);
        g2.administrarBem();
        g2.receberSalario(3100, 0);
        System.out.println(func1.detalhes());
        System.out.println(func2.detalhes());
        System.out.println(g1.detalhes());
        System.out.println(g2.detalhes());


    }
}
