// Data: 20/05/2026

# Árvore Binária
Diferenças de Árvore para as Listas
passando da casa do milhão de dados as árvores são muito mais eficientes em termos de processamento.

Usar árvore quando precisarmos fazer busca frequente em muitos números
o custo de inserir é maior que a lista

# Pesquisa Binária -> Árvore Binária
Binária é um nó raiz chamado pai com dois **filhos** no máximo
- Árvore de Pesquisa ou De Busca
  - De dois filhos e ordenada
- ABP ou ABB
Conceitos: 
 - Raiz: nó ou nodo de uma (sub)árvore
 - folha: nó ou nodo sem filhos
 - percursos baseados em **Recursão**: 
    * **RED = Pré-Fixado**
      * Usada para **localizar dados**
        Se o nó existe, visito a raiz(print)algo que a gente faz com a raiz, vai pra esquerda na árvore, a raiz existe? Se sim visitamos, ai empilhamos pra esquerda, se não existe voltamos para o raiz e vamos para a direita.
        Ai vai pra esquerda... ciclo
        Quem faz esse processo é a Recursão
    *   **Como o java usaria:** if(arvore.contains(60))


    * **ERD** **(Mais usado no Java) - In-Fixado**
      * Usado para **Exibição**
        Inicia indo pra esquerda, se existe raiz continua indo para a esquerda, ai quando não existir ele volta para a raiz e faz a operação(no caso print)
    *   **Como o java usaria:** for I in arvore:
    * 
        
    * **EDR**  **- Pós fixado**
      * Usado para deletar um árvore, apagar a árvore, destruição da árvore
        * vai para a esquerda para todos os nós, quando o nó não tiver nada a esquerda, vamos para a direita dele, se não tiver nada, vamos para sua raiz e realizamos a operação, (podendo ser deletar), ai voltamos para o nó de origem, vamos para sua direita por que apagamos a esquerda, fizemos o mesmo
        * **Como o Java Usa:** arvore.clear

semana que vem mais arvore