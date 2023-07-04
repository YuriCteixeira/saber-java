package POO;

public class Gerente extends Funcionario {
    private String setor;
    private boolean boaAdministracao;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, String rg, String cargo, double salario, boolean trabalhando, String setor) {
        super(nome, cpf, rg, cargo, salario, trabalhando);
        this.setor = setor;
        this.boaAdministracao = true;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isBoaAdministracao() {
        return boaAdministracao;
    }

    public void setBoaAdministracao(boolean boaAdministracao) {
        this.boaAdministracao = boaAdministracao;
    }

    @Override
    public boolean trabalhar() {
        this.setTrabalhando(true);
        return this.isTrabalhando();
    }
    public boolean administrarBem(){
        if (this.isTrabalhando() == true){
            this.setBoaAdministracao(true);
        }else{
            this.setBoaAdministracao(false);
        }
        return this.isBoaAdministracao();
    }


    @Override
    public double receberSalario(double valorMensal, int qtdeFaltas) {
        double descontoFaltas = 75;
        double valorFinal;
        if (this.isBoaAdministracao()) {
            valorFinal = valorMensal - (qtdeFaltas * descontoFaltas) + 1500;
            super.setSalario(valorFinal);
        } else {
            valorFinal = valorMensal - (qtdeFaltas * descontoFaltas);
            this.setSalario(valorFinal);
        }
        return this.getSalario();
    }
    @Override
    public String detalhes() {
        return "Gerente: " +
                "\nNome: " + super.getNome() +
                "\n CPF: " + super.getCpf() +
                "\n RG: " + super.getRg() +
                "\n Setor: " + this.getSetor() +
                "\n Salario: " + super.getSalario() +
                "\n Trabalhando: " + super.isTrabalhando() +
                "\n A administração do gerente é boa? " + this.isBoaAdministracao();

    }

}

