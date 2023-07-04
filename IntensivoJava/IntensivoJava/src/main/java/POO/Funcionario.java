package POO;

public class Funcionario {
    private String nome, cpf, rg, cargo;
    private double salario;
    private boolean trabalhando;

    public Funcionario() {}

    public Funcionario(String nome, String cpf, String rg, String cargo, double salario, boolean trabalhando) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.trabalhando = trabalhando;
        this.salario =salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean trabalhar(){
       this.setTrabalhando(true);
       return this.isTrabalhando();
    }

    public double receberSalario(double valorMensal, int qtdeFaltas){
    double descontoFaltas = 50;
    double valorFinal = valorMensal - (qtdeFaltas * descontoFaltas);
    this.setSalario(valorFinal);
    return this.getSalario();

    }


    public String detalhes() {
        return "Funcionario: " +
                "\nNome: " + nome +
                "\n CPF: " + cpf +
                "\n RG: " + rg +
                "\n Cargo: " + cargo +
                "\n Salario: " + salario +
                "\n Trabalhando: " + trabalhando;

    }
}
