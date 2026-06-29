# Plano de Desenvolvimento: Desafio ED - Figurinhas da Copa 2026

Este documento apresenta a especificação arquitetural, a lista completa de dependências de implementação e o roteiro de desenvolvimento para o **Desafio de Estruturas de Dados (ED)**. O objetivo do sistema é gerenciar, persistir e parear figurinhas da Copa do Mundo de 2026 para troca entre dois usuários utilizando Árvores Binárias de Busca (BST) e arquivos CSV.

---

## 1. Arquitetura do Projeto e Estrutura de Arquivos

Para garantir um código limpo, modular e de fácil manutenção, o projeto será dividido nas seguintes classes individuais:

```
├── Figura.java               # Modelo de domínio (Dados da figurinha)
├── No.java                   # Nó encapsulador para a Árvore Binária
├── ArvoreBinaria.java        # Estrutura de Dados BST e métodos de busca/inserção
├── GerenciadorCSV.java       # Camada de Persistência (I/O de arquivos)
└── Main.java                 # Interface de Linha de Comando (CLI) e controle do fluxo
```

---

## 2. Modelagem do Domínio: Classe `Figura`

A classe `Figura` representa a entidade básica do sistema. Ela deve implementar a interface `Comparable` para permitir a ordenação natural dentro da Árvore Binária de Busca.

### Atributos Necessários
* `String nomeSelecao` (Chave primária de ordenação)
* `int numeroFigura` (Chave secundária de ordenação)
* `String descricao` (Nome do jogador, brasão ou bandeira)
* `int quantidade` (Controle de repetidas)
* `boolean rara` (Indicador de raridade)

### Dependências de Métodos (Contrato de Implementação)
- [ ] **Construtor Completo:** Inicializa todos os atributos ao instanciar uma nova figurinha.
- [ ] **Métodos Getters e Setters:** Para o encapsulamento seguro dos atributos privados.
- [ ] **Sobrescrita do `toString()`:** Formatação limpa para exibição em console. 
  * *Exemplo:* `[BRA] 10 - Neymar (Rara) | Qtd: 2`
- [ ] **Sobrescrita do `equals(Object obj)`:** Define que duas figurinhas são estritamente iguais se possuírem o mesmo `nomeSelecao` e `numeroFigura`.
- [ ] **Implementação do `compareTo(Figura outra)`:** Critério de ordenação da árvore.
  * *Lógica sugerida:* Comparar primeiramente o `nomeSelecao` alfabeticamente (`this.nomeSelecao.compareTo(outra.nomeSelecao)`). Se o resultado for `0` (mesma seleção), desempatar comparando os inteiros `numeroFigura`.

---

## 3. Estrutura de Dados: `No` e `ArvoreBinaria`

Como se trata de um desafio de Estrutura de Dados, **não é permitido o uso de coleções prontas do Java** (como `TreeSet` ou `ArrayList`). A árvore deve ser construída manualmente.

### Classe `No`
* **Atributos:**
  * `Figura info` (O objeto de dados)
  * `No esquerdo` (Ponteiro para a subárvore esquerda)
  * `No direito` (Ponteiro para a subárvore direita)
* **Construtor:** Recebe uma `Figura` e define os ponteiros esquerdo e direito como `null`.

### Classe `ArvoreBinaria`
* **Atributo:** `No raiz`
* **Métodos Obrigatórios:**
  - [ ] `public void inserir(Figura nova)`: Método público que chama o método recursivo privado de inserção. Utiliza o `compareTo` da figura para decidir se vai para a esquerda ou direita.
  - [ ] `public void exibirEmOrdem()`: Percorre a árvore em ordem (*In-Order Traversal*: Esquerda, Raiz, Direita) para listar as figurinhas de forma estritamente ordenada.
  - [ ] `public Figura buscar(String selecao, int numero)`: Percorre a árvore procurando uma figurinha específica. Retorna o objeto `Figura` se encontrado (útil para os Matches e incremento de quantidade) ou `null` se não existir.

---

## 4. Persistência de Dados: Classe `GerenciadorCSV`

Responsável por fazer a ponte entre a memória RAM (Árvores) e o armazenamento em disco (Arquivos `.csv`).

### Dependências de Bibliotecas Nativas (Java SE)
* `java.io.BufferedReader` / `java.io.FileReader` (Leitura eficiente)
* `java.io.BufferedWriter` / `java.io.FileWriter` (Escrita eficiente)
* `java.io.File` (Validação de existência dos arquivos)
* `java.io.IOException` (Tratamento de exceções obrigatório)

### Métodos Obrigatórios
- [ ] `public static void carregarArquivo(String caminho, ArvoreBinaria arvore)`
  * Abre o arquivo linha por linha, quebra a String usando `.split(",")`, converte os tipos primitivos (`Integer.parseInt`, `Boolean.parseBoolean`) e insere os objetos na árvore correspondente.
- [ ] `public static void salvarFigurinha(String caminho, Figura figura)`
  * Escreve uma nova linha no formato CSV. **Importante:** O `FileWriter` deve ser aberto em modo de adição (*append*): `new FileWriter(caminho, true)`.

---

## 5. Fluxo de Controle e Interface: Classe `Main`

A engrenagem principal que gerencia o menu interativo com o usuário.

### Inicialização Automática
Antes de renderizar o menu, a `Main` deve verificar se os arquivos locais existem. Se sim, deve carregá-los:
1. Instanciar `arvore_repetidas_pessoais` e `arvore_desejadas_pessoais`.
2. Chamar `GerenciadorCSV.carregarArquivo("figuras_repetidas_pessoais.csv", arvore_repetidas_pessoais)`.
3. Chamar `GerenciadorCSV.carregarArquivo("figuras_desejadas_pessoais.csv", arvore_desejadas_pessoais)`.

### Lógica do Menu (Switch-Case)
* **Opção 1 e 3 (Cadastro Pessoal):** Lê os dados pelo `Scanner`, cria a `Figura`, insere na respectiva árvore em memória e salva no arquivo CSV físico imediatamente.
* **Opção 2 e 4 (Listagem Pessoal):** Chama o método `.exibirEmOrdem()` da árvore correspondente.
* **Opção 5 (Carregar Repetidas OUTRO):**
  1. Solicita o caminho/nome do arquivo do terceiro (ex: `repetidas_joao.csv`).
  2. Lê o arquivo temporariamente. Para cada linha lida, exibe a figurinha na tela e faz uma busca em `arvore_desejadas_pessoais`.
  3. Se a busca retornar positivo, destaca na tela: **[MATCH DE TROCA ENCONTRADO]**.
* **Opção 6 (Carregar Desejadas OUTRO):**
  1. Solicita o arquivo de desejadas do outro (ex: `desejadas_joao.csv`).
  2. Para cada linha lida, exibe a figurinha e verifica se ela existe na sua `arvore_repetidas_pessoais`.
  3. Se existir, exibe: **[MATCH DE TROCA ENCONTRADO]**.
* **Opção 7:** Encerra o loop do programa com segurança.

---

## 6. Checklist de Cronograma Sugerido

Para entregar o trabalho na próxima terça-feira com folga e testes massivos feitos:

- [ ] **Quarta-feira (Hoje):** Criar a estrutura do projeto e codificar a classe `Figura.java` completa (com `Comparable`, `equals` e `toString`).
- [ ] **Quinta-feira:** Implementar as classes `No.java` e `ArvoreBinaria.java` (Inserção e Exibição em Ordem). Testar inserindo dados estáticos na `Main` para ver se ordenação funciona.
- [ ] **Sexta-feira:** Implementar o método de busca (`buscar`) na Árvore Binária e codificar a classe `GerenciadorCSV.java` (Leitura e Escrita básica).
- [ ] **Sábado:** Montar a estrutura de loop e `Scanner` na `Main.java`. Ligar a rotina de boot (carregar CSVs para as árvores no início).
- [ ] **Domingo:** Desenvolver as lógicas complexas de cruzamento de dados (Opções 5 e 6 - Matches de troca com arquivos externos).
- [ ] **Segunda-feira:** Dia de testes de estresse (Inserir dados inválidos, arquivos vazios, figurinhas duplicadas) e refatorar tratamentos de erro (`try-catch`).
- [ ] **Terça-feira:** Entrega do projeto.
