package br.com.poo.rh;

/**
 * Funcionario
 */
public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public String toString() {
        return this.getClass().getName() + "@" +
            Integer.toHexString(this.hashCode()) + " - " +
            this.nome + ";" +
            this.cpf + ";R$" +
            this.salario;
    }

    public int compareTo(Funcionario outro) {
        return this.nome.compareTo(outro.getNome());
        
        //return Double.compare(this.salario, outro.getSalario());

        //return Double.valueOf(this.salario).compareTo(outro.getSalario());
        
        /*        
        if (this.salario < outro.getSalario()) {
            return -1;
        }
        if (this.salario > outro.getSalario()) {
            return 1;
        }
        return 0;
        */
    }
}
