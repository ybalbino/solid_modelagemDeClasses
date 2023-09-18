package org.example;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario{
    private List<Professor> professoresSupervisionados;
    private static final int maxProfessoresSupervisonados = 2;

    public Coordenador(String name, String cpf, int numRegistro, String orgaoLotacao, double salario) {
        super(name, cpf, numRegistro, orgaoLotacao, salario, true);
        this.professoresSupervisionados = new ArrayList<>();
    }

    public List<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adicionarProfessor(Professor professor){

    }

    public void aumentoSalario(Professor professor){
        if (professoresSupervisionados.size() < maxProfessoresSupervisonados){
            professoresSupervisionados.add(professor);
        }else {
            System.out.println("Limite de professor atingido.");
        }
    }
    @Override
    public void aumentoSalario(){
        this.setSalario(this.getSalario()*1.05);
    }
}
