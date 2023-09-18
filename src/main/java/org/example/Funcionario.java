package org.example;

public class Funcionario {
    private String name;
    private String cpf;
    private int numRegistro;
    private String orgaoLotacao;
    private double salario;
    private boolean reembolsoDespesas;

    public Funcionario(String name, String cpf, int numRegistro, String orgaoLotacao, double salario, boolean reembolsoDespesas) {
        this.name = name;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
        this.reembolsoDespesas = reembolsoDespesas;
    }

    public Funcionario() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isReembolsoDespesas() {
        return reembolsoDespesas;
    }

    public void setReembolsoDespesas(boolean reembolsoDespesas) {
        this.reembolsoDespesas = reembolsoDespesas;
    }

    public void aumentoSalario(){
        this.salario *= 1.10;
    }
}
