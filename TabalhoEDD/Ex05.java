package TabalhoEDD;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex05 {

  public static void main(String[] args) {
    
    ArrayList<Aluno> alunos = new ArrayList<>();
    alunos.add(new Aluno("João", LocalDate.of(1995, 5, 15), 1));
    alunos.add(new Aluno("Maria", LocalDate.of(1995, 5, 15), 2));
    alunos.add(new Aluno("Pedro", LocalDate.of(1995, 5, 15), 3));
    alunos.add(new Aluno("Pedro", LocalDate.of(1995, 5, 15), 3));
    
    System.out.println("Alunos antes de remover o que foi Duplicata");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
// Exercício 5 - Conjuntos (Set):

// No método main, crie um Set (HashSet) de Alunos e crie mais um objeto de Aluno e defina nesse objeto novo um valor de matrícula já utilizado em algum outro objeto.
// Tente adicionar os 4 objetos de Aluno dentro do HashSet e percorra (utilizando um for) o Set mostrando todos os objetos.
// obs: se tudo correr bem, só teremos 3 objetos impressos do HashSet, uma vez que o método equals entenderá os 2 objetos de mesma matrícula como iguais.
        
        // Criação do HashSet para remover duplicatas baseado na matrícula
        Set<Aluno> conjuntoAlunos = new HashSet<>(alunos);

        System.out.println("\nAlunos após adicionar ao HashSet (duplicatas removidas):");
        for (Aluno aluno : conjuntoAlunos) {
            System.out.println(aluno);
        }
  }

}
