#include<cstdlib>
#include <iostream>
#include <string>
#define TAMANHO 10

using namespace std;

void inicializar(string vetor[]){
    for (int i=0; i<TAMANHO; i++){
        vetor [i] = "#";
    }
}

int inserir(string nome, string vetor[], int total){
    if (total == TAMANHO){
        cout << "Vetor lotado\n";
    } else {
        for (int i = 0; i < TAMANHO; i++){
            if (vetor [i] == "#"){
                vetor [i] = nome;
                total++;
                break;
            }
        }
    }
    return total; 
}

void exibir (string vetor[]){
    for (int i = 0; i < TAMANHO; i++){
        if (vetor[i] != "#"){
            cout << vetor[i] << "\n";
        }
    }
}

int apagarNome(string nomeBusca, string vetorNomes[]){
    for (int i = 0; i < TAMANHO; i++){
        if (vetorNomes[i] == nomeBusca){
            vetorNomes[i] = "#"; 
            return 1; // sucesso
        }
    }
    return 0; // não encontrado
}
