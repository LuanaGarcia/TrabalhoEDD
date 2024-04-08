package TabalhoEDD;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//Exercício 6 - Conjuntos (Set):

//Crie 2 objetos Set de alunos e coloque no primeiro set 2 alunos. No segundo set, coloque mais 2 alunos, porém, somente um deles pode ser igual a um objeto adicionado no primeiro set.
//Utilizando o conceito de união dos Set (union), adicione o segundo conjunto no primeiro e imprima o resultado. O resultado deverá conter apenas 3 objetos, visto que um deles é igual de propósito.

public class Ex06 {

  public static void main(String[] args) {

    // Criação do primeiro Set de alunos e adição de 2 alunos
    Set<Aluno> set1 = new HashSet<>();
    set1.add(new Aluno("João", LocalDate.of(1995, 5, 15), 1));
    set1.add(new Aluno("Maria", LocalDate.of(1996, 8, 23), 2));
  
      // Impressão do Set 1
      System.out.println("Alunos Set 1: ");
      for (Aluno aluno : set1) {
          System.out.println(aluno);
      }

     // Criação do segundo Set de alunos e adição de 2 alunos, sendo 1 igual a um do primeiro set
     Set<Aluno> set2 = new HashSet<>();
     set2.add(new Aluno("Pedro", LocalDate.of(1994, 2, 10), 3)); // Novo aluno
     set2.add(new Aluno("Maria Repetida", LocalDate.of(1995, 5, 15), 2)); // Igual ao aluno "Maria" do set1 pela matrícula
        
      // Impressão do Set 2
      System.out.println("\n Alunos Set 2: ");
      for (Aluno aluno : set2) {
          System.out.println(aluno);
      }

      // União dos conjuntos set1 e set2
          boolean set3 = set1.addAll(set2);

        // Impressão do resultado após a união
        System.out.println("\n Resultado após a união dos conjuntos:");
        for (Aluno aluno : set1) {
            System.out.println(aluno);
        }

  }

}
