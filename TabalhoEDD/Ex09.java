package TabalhoEDD;

import java.time.LocalDate;
import java.util.Stack;

//Exercício 9 - Pilhas (Stack):

//No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha. Em seguida, implemente um algoritmo que remova e imprima o nome do primeiro aluno na pilha.
//obs: Lembrem-se que na fila o "primeiro" objeto não corresponde ao primeiro adicionado.

public class Ex09 {

  public static void main(String[] args) {
    // Criação de uma Stack para armazenar objetos Aluno
    Stack<Aluno> pilhaAlunos = new Stack<>();

    // Adição de pelo menos dois alunos à pilha
    pilhaAlunos.push(new Aluno("João", LocalDate.of(1999, 5, 15), 1));
    pilhaAlunos.push(new Aluno("Maria", LocalDate.of(1996, 8, 23), 2));
    pilhaAlunos.push(new Aluno("Luana", LocalDate.of(1999, 8, 18), 3));

    // Remoção e impressão do nome do "primeiro" aluno na pilha, ou seja, o último adicionado
    if (!pilhaAlunos.isEmpty()) {
      Aluno alunoRemovido = pilhaAlunos.pop(); // Remove e retorna o último elemento adicionado
      System.out.println("Aluno removido: " + alunoRemovido.getNome());
  } else {
      System.out.println("A pilha está vazia.");
  }

  //Imprimindo o restante da pilha
  System.out.println("\n Alunos restantes na fila: ");
  int size = pilhaAlunos.size();
    for(int i = 0; i < size; i++){
      System.out.println(pilhaAlunos.pop());
    }

  }

}
