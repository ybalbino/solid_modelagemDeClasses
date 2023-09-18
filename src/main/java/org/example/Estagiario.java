package org.example;

public class Estagiario extends Funcionario{
    private Professor professorVinculado;

    public Estagiario(String name, String cpf, int numRegistro, String orgaoLotacao, Professor professorVinculado, boolean reembolsoDespesas) {
        //Estagiario não tem salario;
        super(name, cpf, numRegistro, orgaoLotacao, 0, reembolsoDespesas);
        this.professorVinculado = professorVinculado;
    }

    public Professor getProfessorVinculado() {
        return professorVinculado;
    }

    public void setProfessorVinculado(Professor professorVinculado) {
        this.professorVinculado = professorVinculado;
    }
    @Override
    public void aumentoSalario(){
        System.out.println("Estagiarios não recebem aumento de salario.");
    }
}
