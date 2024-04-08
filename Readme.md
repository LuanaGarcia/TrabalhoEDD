# Trabalho de Estrutura de Dados e Linguagem de Programação


Antes de partirmos para os exercícios, algumas informações são importantes:

A entrega precisa ser NECESSARIAMENTE no formato zip/rar para que seja possível eu corrigir.
Para esse trabalho, não vou poder considerar prints.
 Arquivos txt com os códigos serão aceitos, desde que sinalizados os respectivos exercícios no código. 
A entrega é uma só, mande todos os códigos de uma só vez.

## Exercício 1 - Classes Java:

Defina uma classe chamada Aluno com os seguintes atributos:

    Um atributo do tipo String para o nome do aluno.
    Um atributo do tipo LocalDate para a data de nascimento do aluno.
    Um atributo do tipo Integer para a matrícula do aluno.

Implemente o método toString() para essa classe.

## Exercício 2 - Listas dinâmicas:

Crie uma classe nova chamada TrabalhoJava e crie o método main.
Dentro do método main, defina um ArrayList e adicione 3 objetos distintos criados a partir da classe Aluno. (esses 3 objetos serão importantes para o restante do trabalho)
Percorra a lista e imprima cada um dos objetos (lembrando do método toString() criado no exercício anterior).

## Exercício 3 - Listas dinâmicas:

Ainda no método main da classe criada no exercício anterior, remova os itens da posição 0 e 1 e imprima novamente a lista, mostrando que agora só possui um registro.

## Exercício 4 - Comparação de objetos:

Implemente o método "equals" da classe Aluno. Esse método deverá considerar apenas a propriedade "matricula".
Na nossa regra de negócio hipotética desse trabalho, os objetos de Aluno serão considerados iguais quando possuírem a mesma matrícula, independente do restante dos valores.

## Exercício 5 - Conjuntos (Set):

No método main, crie um Set (HashSet) de Alunos e crie mais um objeto de Aluno e defina nesse objeto novo um valor de matrícula já utilizado em algum outro objeto.
Tente adicionar os 4 objetos de Aluno dentro do HashSet e percorra (utilizando um for) o Set mostrando todos os objetos.
obs: se tudo correr bem, só teremos 3 objetos impressos do HashSet, uma vez que o método equals entenderá os 2 objetos de mesma matrícula como iguais.

## Exercício 6 - Conjuntos (Set):

Crie 2 objetos Set de alunos e coloque no primeiro set 2 alunos. No segundo set, coloque mais 2 alunos, porém, somente um deles pode ser igual a um objeto adicionado no primeiro set.
Utilizando o conceito de união dos Set (union), adicione o segundo conjunto no primeiro e imprima o resultado. O resultado deverá conter apenas 3 objetos, visto que um deles é igual de propósito.

## Exercício 7 - Filas (LinkedList):

No método main, crie uma LinkedList de objetos Aluno. Adicione pelo menos dois alunos à fila. Em seguida, implemente um algoritmo que remova e imprima o nome do primeiro aluno na fila.

## Exercício 8 - Filas (LinkedList):

No método main, crie uma LinkedList de objetos Aluno. Adicione pelo menos dois alunos à fila. Em seguida, implemente um algoritmo que remova e imprima o nome do último aluno na fila.

## Exercício 9 - Pilhas (Stack):

No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha. Em seguida, implemente um algoritmo que remova e imprima o nome do primeiro aluno na pilha.
obs: Lembrem-se que na fila o "primeiro" objeto não corresponde ao primeiro adicionado.

## Exercício 10 - Pilhas (Stack):

No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha. Em seguida, implemente um algoritmo que remova e imprima o nome do último aluno na pilha.