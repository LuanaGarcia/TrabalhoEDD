package TabalhoEDD;

import java.time.LocalDate;
import java.util.Stack;

//Exercício 10 - Pilhas (Stack):

//No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha. Em seguida, implemente um algoritmo que remova e imprima o nome do último aluno na pilha.

public class Ex10 {

  public static void main(String[] args) {

    // Criação de uma Stack para armazenar objetos Aluno
    Stack<Aluno> pilhaAlunos = new Stack<>();

    // Adição de pelo menos dois alunos à pilha
    pilhaAlunos.push(new Aluno("João", LocalDate.of(1999, 5, 15), 1));
    pilhaAlunos.push(new Aluno("Maria", LocalDate.of(1996, 8, 23), 2));
    pilhaAlunos.push(new Aluno("Luana", LocalDate.of(1999, 8, 18), 3));

    // Remover e imprimir o nome do último aluno na pilha (o primeiro que foi
    // adicionado)
    // Para isso, é preciso remover temporaiamente os outros alunos
    Stack<Aluno> alunosTemp = new Stack<>();
    while (pilhaAlunos.size() > 1) {
      alunosTemp.push(pilhaAlunos.pop());
    }

    // Agora, pilhaAlunos contém apenas o primeiro aluno adicionado
    if (!pilhaAlunos.isEmpty()) {
      Aluno ultimoAluno = pilhaAlunos.pop(); // Este é, na verdade, o primeiro aluno que foi adicionado
      System.out.println("Último aluno removido: " + ultimoAluno.getNome());
    } else {
      System.out.println("A pilha está vazia.");
    }

    // Colocando os alunos de volta na pilha original na ordem correta
    while (!alunosTemp.isEmpty()) {
      pilhaAlunos.push(alunosTemp.pop());
    }

    // Imprimindo o restante da pilha
    System.out.println("\nAlunos restantes na fila: ");
    int size = pilhaAlunos.size();
    for (int i = 0; i < size; i++) {
      System.out.println(pilhaAlunos.pop());
    }

  }

}
