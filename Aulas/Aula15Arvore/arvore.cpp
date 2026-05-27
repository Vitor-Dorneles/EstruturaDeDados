#include <iostream>
#include <cstdlib>
using namespace std;
// Em C e C++, a execucao normalmente segue de cima para baixo.
// Aqui vamos usar isso para montar e percorrer uma arvore binaria.
typedef struct no {
    int valor;       // valor guardado no nó
    struct no *esq;  // ponteiro para o filho da esquerda
    struct no *dir;  // ponteiro para o filho da direita
} Arvore;

// Insere um valor na arvore binaria de busca e devolve a raiz atualizada.
Arvore *inserir(int valor, Arvore *raiz) {
    if (raiz) {
        // Se o valor for menor, ele vai para a esquerda.
        if (valor < raiz->valor) {
            raiz->esq = inserir(valor, raiz->esq);
        } else {
            // Se for maior ou igual, ele vai para a direita.
            raiz->dir = inserir(valor, raiz->dir);
        }

        // A raiz desta sub-arvore continua sendo a mesma.
        return raiz;
    } else {
        // Se a posicao esta vazia, criamos um novo no.
        Arvore *novo = (Arvore *)malloc(sizeof(Arvore));

        // Guardamos o valor recebido.
        novo->valor = valor;

        // Um novo no nasce sem filhos.
        novo->esq = NULL;
        novo->dir = NULL;

        // Retornamos o novo no para ligar na arvore.
        return novo;
    }
}

// Percurso pre-ordem: raiz, esquerda, direita.
void red(Arvore *raiz) {
    if (raiz) {
        // Primeiro mostramos o valor do no atual.
        cout << raiz->valor << endl;

        // Depois visitamos os filhos.
        red(raiz->esq);
        red(raiz->dir);
    }
}

// Percurso em ordem: esquerda, raiz, direita.
void erd(Arvore *raiz) {
    if (raiz) {
        erd(raiz->esq);
        cout << raiz->valor << endl; //operação
        erd(raiz->dir);
    }
}

// Percurso pos-ordem: esquerda, direita, raiz.
void edr(Arvore *raiz) {
    if (raiz) {
        edr(raiz->esq);
        edr(raiz->dir);
        cout << raiz->valor << endl;
    }
}

// Exibe a arvore "de lado", com indentacao por nivel.
void exibir(Arvore *raiz, int nivel) {
    if (raiz) {
        // Primeiro mostramos a direita para ela aparecer acima.
        exibir(raiz->dir, nivel + 1);

        // Cada espaco representa um nivel de profundidade.
        for (int i = 0; i < nivel; i++) {
            cout << " ";
        }

        // Mostramos o valor e o nivel do no.
        cout << raiz->valor << "(" << nivel << ")" << endl;

        // Depois mostramos a esquerda para ela aparecer abaixo.
        exibir(raiz->esq, nivel + 1);
    }
}

// Conta quantos nos existem na arvore.
int contarNos(Arvore *raiz) {
    if (raiz) {
        return 1 + contarNos(raiz->esq) + contarNos(raiz->dir);
    }

    // Se a arvore estiver vazia, a contagem e zero.
    return 0;
}

// Conta quantos valores pares existem na arvore.
int contarNosPares(Arvore *raiz) {
    if (raiz) {
        // Primeiro contamos os pares da esquerda e da direita.
        int total = contarNosPares(raiz->esq) + contarNosPares(raiz->dir);

        // Se o valor atual for par, somamos mais 1.
        if (raiz->valor % 2 == 0) {
            total++;
        }

        return total;
    }

    // caso esteja vazia retornamos 0 pois, uma subarvore vazia nao tem numeros pares.
    return 0;
}

int main() {
    // Comecamos com a arvore vazia.
    Arvore *raiz = NULL;

    // Inserimos alguns valores para montar a arvore.
    raiz = inserir(100, raiz);
    raiz = inserir(50, raiz);
    raiz = inserir(200, raiz);
    raiz = inserir(20, raiz);
    raiz = inserir(70, raiz);
    raiz = inserir(250, raiz);
    raiz = inserir(150, raiz);
    raiz = inserir(155, raiz);

    // Exemplos de percursos
    // red(raiz);
    // erd(raiz);
    // edr(raiz);

    // Outra forma de visualizar a estrutura da arvore.
    // exibir(raiz, 0);

    // Mostramos a quantidade total de elementos.
    cout << "Total de elementos: " << contarNos(raiz) << endl;

    // Mostramos quantos valores pares existem.
    cout << "Total de pares: " << contarNosPares(raiz) << endl;

    // Retorno 0 indica que o programa terminou com sucesso.
    return 0;
}