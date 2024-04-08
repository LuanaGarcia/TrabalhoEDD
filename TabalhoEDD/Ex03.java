package TabalhoEDD;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ex03 {

  public static void main(String[] args) {

    ArrayList<Aluno> alunos = new ArrayList<>();
    alunos.add(new Aluno("João", LocalDate.of(1995, 5, 15), 1));
    alunos.add(new Aluno("Maria", LocalDate.of(1995, 5, 15), 2));
    alunos.add(new Aluno("Pedro", LocalDate.of(1995, 5, 15), 3));


    // Exercício 3 - Listas dinâmicas:

    // Ainda no método main da classe criada no exercício anterior, remova os itens
    // da posição 0 e 1 e imprima novamente a lista, mostrando que agora só possui
    // um registro.

    System.out.println("Exerc. 3 excluindo registo 0 e 1");
    System.out.println("Alunos restantes: ");
    alunos.remove(1);
    alunos.remove(0);

    for (Aluno aluno : alunos) {
      System.out.println(aluno);
    }
  }
}
