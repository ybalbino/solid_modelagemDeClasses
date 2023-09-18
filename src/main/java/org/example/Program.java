package org.example;

public class Program {
    public static void main(String[] args) {
        Professor professor = new Professor("João", "123456789", 101, "Departamento de Matemática", 5000.0,
                "Doutorado", "Matemática", 50, 3);

        Coordenador coordenador = new Coordenador("Maria", "987654321", 202, "Departamento de Ciências da Computação", 8000.0);

        FuncionarioAdministrativo funcionarioAdmin = new FuncionarioAdministrativo("Carlos", "456789123", 303, "RH", 4000.0,
                "Recursos Humanos", "Pleno");

        Estagiario estagiario = new Estagiario("Ana", "789456123", 404, "Departamento de Matemática", professor, true);

        Turma turma1 = new Turma("Cálculo I", 30);
        professor.adicionarTurma();

        coordenador.adicionarProfessor(professor);

        System.out.println("Informações do Professor:");
        System.out.println("Nome: " + professor.getName());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println("Disciplina Ministrada: " + professor.getDisciplinaMinistrada());
        System.out.println("Quantidade de Turmas: " + professor.getQuantidadeTurmas());

        System.out.println("\nInformações do Coordenador:");
        System.out.println("Nome: " + coordenador.getName());
        System.out.println("Salário: " + coordenador.getSalario());
        System.out.println("Professores Supervisionados: " + coordenador.getProfessoresSupervisionados().size());

        System.out.println("\nInformações do Funcionário Administrativo:");
        System.out.println("Nome: " + funcionarioAdmin.getName());
        System.out.println("Salário: " + funcionarioAdmin.getSalario());
        System.out.println("Função Administrativa: " + funcionarioAdmin.getFuncaoAdm());

        System.out.println("\nInformações do Estagiário:");
        System.out.println("Nome: " + estagiario.getName());
        System.out.println("Salário: " + estagiario.getSalario());
        System.out.println("Professor Vinculado: " + estagiario.getProfessorVinculado().getName());
        System.out.println("Reembolso de Despesas: " + estagiario.isReembolsoDespesas());
    }

}
