package TabalhoEDD;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

//Exercício 7 - Filas (LinkedList):
//No método main, crie uma LinkedList de objetos Aluno. Adicione pelo menos dois alunos à fila. Em seguida, implemente um algoritmo que remova e imprima o nome do primeiro aluno na fila.

public class Ex07 {

  public static void main(String[] args) {

    // Criação de uma LinkedList para uso como fila
    Queue<Aluno> filaAlunos = new LinkedList<>();

    // Adição de dois alunos à fila
    filaAlunos.add(new Aluno("João", LocalDate.of(1999, 5, 15), 1));
    filaAlunos.add(new Aluno("Maria", LocalDate.of(1996, 8, 23), 2));
    filaAlunos.add(new Aluno("Luana", LocalDate.of(1999, 8, 18), 3));
  

    // Remoção e impressão do nome do primeiro aluno na fila
    Aluno alunoRemovido = filaAlunos.poll(); // Remove e retorna o cabeçalho da fila, ou seja, o primeiro elemento
    if (alunoRemovido != null) {
        System.out.println("Aluno removido: " + alunoRemovido.getNome());
    } else {
        System.out.println("A fila está vazia.");
    }
    
    //Imprimindo o restante da fila
    System.out.println("Alunos restantes na fila: ");
    int size = filaAlunos.size();
      for(int i = 0; i < size; i++){
        System.out.println(filaAlunos.poll());
      }

  }

}
