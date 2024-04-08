package TabalhoEDD;

//Exercício 1 - Classes Java:

//Defina uma classe chamada Aluno com os seguintes atributos:

//Um atributo do tipo String para o nome do aluno.
//Um atributo do tipo LocalDate para a data de nascimento do aluno.
//Um atributo do tipo Integer para a matrícula do aluno.

//Implemente o método toString() para essa classe.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

  private String nome;
  private LocalDate dataNascimento;
  private Integer matricula;

  public Aluno(String nome, LocalDate dataNascimento, Integer matricula){

    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.matricula = matricula;

  }

      // Método getter para o nome
      public String getNome() {
        return nome;
      }

  @Override
  public String toString() {
    //Formatando data para padrão barsileiro
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      return "Aluno{" +
             "Nome: " + nome + 
             ", Data de nascimento: " + dataNascimento.format(formatter) +
             ", Matricula: " + matricula +
             '}';
  }

  // Exercício 4 - Comparação de objetos:
// Implemente o método "equals" da classe Aluno. Esse método deverá considerar apenas a propriedade "matricula".
// Na nossa regra de negócio hipotética desse trabalho, os objetos de Aluno serão considerados iguais quando possuírem a mesma matrícula, independente do restante dos valores.

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass() )return false;
    Aluno aluno = (Aluno) o;
    return matricula != null ? matricula.equals(aluno.matricula) : aluno.matricula == null;
  }

@Override
  public int hashCode() {
    return matricula != null ? matricula.hashCode() : 0;
  }
  
}
