#include<cstdlib>
#include <iostream>
#include <string>


using namespace std;

#include "utilidades.h"

int main(){
    string vetorNomes[TAMANHO];
    inicializar(vetorNomes);
    int totalNomesInseridos = 0;


    totalNomesInseridos = inserir("Davi", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir("anana", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir("maria", vetorNomes, totalNomesInseridos);
    
    if(totalNomesInseridos>0){
        exibir(vetorNomes);
    } else {
        cout << "vetor vazio";
    }   

    string nome;
    cout << "Digite um nome: ";
    getline (cin, nome);


    /*int posicao;
    posicao = ondeEsta(nome, vetorNomes);
    
    if (posicao != -1){
        vetorNomes[posicao] = "#";
        totalNomesInseridos--;
    }

    */
    return 0;
}