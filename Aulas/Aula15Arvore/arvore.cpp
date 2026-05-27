#include <iostream>
#include <cstdlib>
using namespace std;
//c e c++ são lineares, não olham para baixo
typedef struct no{
    int valor;
    struct no *esq; //ponteiros * 
    struct no *dir;
}Arvore;

Arvore *inserir(int valor, Arvore *raiz) { //retorna um ponteiro de arvore
if(raiz) {
    if(valor < raiz-> valor) {
        raiz->esq = inserir(valor, raiz->esq);
    } else {
        raiz->dir = inserir(valor, raiz->dir);
    }
    return raiz;
} else{
    //como a raiz não existe nesse caso, nós criamos o nó
    //alocar memoria
    Arvore *novo = (Arvore *)malloc(sizeof(Arvore));
    //depositar valores
    novo->valor = valor; //valor da raiz
    novo->esq = NULL; //raiz sem filhos
    novo->dir = NULL;
    //retornar o elemento criado
    return novo;
    }
}
void red(Arvore *raiz)
{
    if (raiz)
    {
        cout << raiz->valor << endl;
        red(raiz->esq);
        red(raiz->dir);
    }
}

void erd(Arvore *raiz) {
    if (raiz) {
        erd(raiz->esq);
        cout << raiz->valor << endl;
    }
}

void edr(Arvore *raiz) {
    if (raiz) {
        edr(raiz->esq);
        edr(raiz->dir);
        cout << raiz->valor << endl;
    }
}

void exibir(Arvore *raiz, int nivel){
    if (raiz){
        //tudo para a direita
        exibir(raiz->dir, nivel + 1);

        //exibir o nodo dentro de seu nível
        for (int i = 0; i < nivel; i++) {
            cout << " ";
        }
        cout << raiz->valor << "(" << nivel << ")" << endl;

        //tudo para a esquerda
        exibir(raiz->esq, nivel + 1);
    } 
}

int contarNos(Arvore *raiz) {
    if(raiz) {
        return 1 + contarNos(raiz->esq) + contarNos(raiz->dir);
    }
    return 0;
}

int main() {
    Arvore *raiz = NULL;

    raiz = inserir(100, raiz);
    raiz = inserir(50, raiz);
    raiz = inserir(200, raiz);
    raiz = inserir(20, raiz);
    raiz = inserir(70, raiz);
    raiz = inserir(250, raiz);
    raiz = inserir(150, raiz);

    // red(raiz);
    // erd(raiz); exibição
    edr(raiz);

    //alternativa de exibição
    exibir(raiz, 0); //exibir a arvore a partir do 0
    cout << "Total de elementos: " << contarNos(raiz) << endl;

    return 1;
}