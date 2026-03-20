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
    cout << "Digite um nome para apagar: ";
    getline (cin, nome); // le a frase toda, cin == teclado e guarda na variavel nome

    int apagou = apagarNome(nome, vetorNomes);

    if(apagou == 1){
        totalNomesInseridos --;
        cout << "Apagado.\n";
    } else {
        cout << "Nome não encontrado.\n";
    }

    return 0;
}