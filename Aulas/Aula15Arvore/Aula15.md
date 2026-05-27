// Data: 27/05/2026
# Arvore
    - ED Abstrata: com crud completo
      - foco na busca
      - tipos
        - genérica: um nodo pai e n nodos filhos
        - binária: um nodo pai e no máximo 2 nodos filhos
            - árvore binária de pesquisa ou de busca - ORDENADAS

      - conceitos
        - raiz - no ou nodo de principal de uma árvore ou de subárvores
        - folhas - no ou nodo sem filhos (REGIÃO DE INSERÇÃO)
        - nível - a posição hierárquica de um no ou nodo. Começa em 0
        - percurso(path) ou caminho
          - RED - pré-fixado ou pré-ordem
              - contar, localizar
          - ERD - in-fixado ou em ordem
              - exclusivamente para impressão (mostrar em ordem)
          - EDR - pós-fixado ou pós-ordem
            - algo para o retorno da recursão
            - deleção (delete)

### Teoria
A arvore é uma máquina de BUSCA
pois fazemos a busca por nivel
dessa forma nivel 1(terá dois nodos)
nivel 2 (terá 4 nodos)
fazemos assim --> 2} numero binario dos nodos ^ a 3} numero do nivel == 8 nodos no nivel 3


## O que faremos
o add - inserir
contar nós e folhas
localizar - contains, indexOFF




## Desafios

1) método que conte os números pares

2) método que conte os nodos folhas

3) método que retorne true (1) se valor esta na árvore... ou retorne false (0) se valor não está na árvore
   
int contido(int valor, Arvore *raiz)
 
4) método que conte os nodos NÃO folhas 



