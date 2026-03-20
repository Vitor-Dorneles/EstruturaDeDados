#include <iostream>
#include <cstdlib>
#include <vector> //para a lista

using namespace std;

#include "biblioteca.h"

int main(){
    vector<int> listaNumeros;
    int quantidadeNumeros;
    int faixaInicial, faixaFinal;
    vector<int> listaResultados;

    cout << "Digite quantos numeros quer gerar: ";
    cin >> quantidadeNumeros;

    popularListaAleatoria(listaNumeros, quantidadeNumeros, faixaInicial, faixaFinal);
    exibirLista(listaNumeros);

    copiarListaSemReplicados(listaNumeros,listaResultados);

    return 0;
}