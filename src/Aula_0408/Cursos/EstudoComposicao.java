package Aula_0408.Cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thais", "57896423");
        Aluno aluno2 = new Aluno("Carlos", "57891543");
        Aluno aluno3 = new Aluno("Diego", "57479623");

        List<Aluno> alunos = new ArrayList<Aluno>(List.of(aluno1, aluno2, aluno3));
        Professor professor = new Professor("Almir", "7589632-1");

        Curso curso = new Curso("Java", 200.0F, professor, alunos);

        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso);
        System.out.println(curso.getAlunos().get(2).getNome()); // se eu tirasse o .getnome, apareceria o aluno e matricula.
    }
}
