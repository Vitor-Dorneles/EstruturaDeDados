// Data: 08/04/2026
# Estruturas de Dados

- **Físicas:** as próprias variáveis — fortemente dependentes da linguagem de programação
- **Abstratas:** os algoritmos de gestão de memória  
 ## **COLEÇÕES**
  - **Lista:** conjunto de dados ordenados (não obrigatoriamente)  
    - todas as operações: inserir, remover, buscar, atualizar (Create, Retrieve, Update, Delete - CRUD)
    - armazenamento, busca e relatórios
  - **Pilha:** dados organizados pelo topo — LIFO: Last In, First Out  
    - foca em duas operações: inserir no topo e o remover do topo
  - **Fila**: dados organizados pela chegada - FIFO: First in, First Out
    - há dois ponteiros: inicio/cabeca para remover e fim/cauda para inserir
    - foco na prioridade de chegada

    No processo de herança:
    LISTA -> PILHA -> FILA

    LISTA: contains, size, add, remove, isEmpty
    STACK(PILHA): peek, push, pop
    QUEUE(fila): offers, poll

* **BOA** **PRÁTICA**:
* criar suas ferramentas, por exemplo as de validações, em classes separadas do main
* no java estando no mesmo diretorio não precisamos de import
* é assim então que podemos reaproveitar códigos feitos, por exemplo reaproveitar uma validação de cpf.
 
* uma classe por arquivo
* System.exit(1) // serve para interromper o sistema, o 1 é para mostrar que está tudo certo, o 0 seria uma saida com erro. 

# Coleções de Objetos
Na classe, há os métodos que devem ser sobreescritos:
- toString()
- equals()

# Matrizes Especiais
Servem majoritariamente para computação gráfica
Compressão de imagens, onde pegamos só as células uteis, que não são nulos.
matrizes encontramos em vídeos, imagens e o mais importante grafos

em java:
**Saber** **Urgente**: 
 - Todo objeto é um ponteiro para a origem
 - Todo Objeto de classe que pode ser uma matriz ou um vetor, 
 - quando passado como parâmetro/argumento é passado sua referencia(Endereço) 