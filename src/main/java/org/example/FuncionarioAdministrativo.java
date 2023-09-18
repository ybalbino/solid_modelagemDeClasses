package org.example;

public class FuncionarioAdministrativo extends Funcionario{
    private String funcaoAdm;
    private String Senioridade;

    public FuncionarioAdministrativo(String name, String cpf, int numRegistro, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(name, cpf, numRegistro, orgaoLotacao, salario, true);
        this.funcaoAdm = funcaoAdm;
        Senioridade = senioridade;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return Senioridade;
    }

    public void setSenioridade(String senioridade) {
        Senioridade = senioridade;
    }
}
