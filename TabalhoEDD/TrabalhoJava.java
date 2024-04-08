package TabalhoEDD;

//Exercício 2 - Listas dinâmicas:

//Crie uma classe nova chamada TrabalhoJava e crie o método main.
//Dentro do método main, defina um ArrayList e adicione 3 objetos distintos criados a partir da classe Aluno. (esses 3 objetos serão importantes para o restante do trabalho)
//Percorra a lista e imprima cada um dos objetos (lembrando do método toString() criado no exercício anterior).

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TrabalhoJava {

  public static void main(String[] args) {
    System.out.println("Exerc. 02 mostrando os 3 objetos");
    ArrayList<Aluno> alunos = new ArrayList<>();
    alunos.add(new Aluno("João", LocalDate.of(1995, 5, 15), 1));
    alunos.add(new Aluno("Maria", LocalDate.of(1995, 5, 15), 2));
    alunos.add(new Aluno("Pedro", LocalDate.of(1995, 5, 15), 3));

    System.out.println("Alunos cadastrados: ");
    for (Aluno aluno : alunos) {
      System.out.println(aluno);
    }
  }
}
