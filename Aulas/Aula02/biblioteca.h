#include <iostream>
#include <cstdlib>
#include <vector> //para a lista
#include <ctime>

using namespace std;

/**
 * @brief Método que popula uma lista com números inteiros aleatórios dentro de uma faixa
 * 
 * @param lista contém os números inteiros e aleatórios
 * @param quantidadeNumeros total de números a serem inseridos
 * @param faixaInicial  número inicial da faixa
 * @param faixaFinal  número final da faixa
 */

void popularListaAleatoria(vector<int> &lista, int quantidadeNumeros, int faixaInicial, int faixaFinal ){
    faixaInicial=1;
    faixaFinal=100;
    //símbolo & na frente da variavel lista. Isso acontece pq em C++ se houver alteracao na lista, é 
    //preciso utilizar o simbolo de endereçamento &

    srand(time(NULL));
    int numeroSorteado;
    for (int i = 0; i < quantidadeNumeros; i++){
        numeroSorteado = faixaInicial+ (rand() % faixaFinal);
        lista.push_back( numeroSorteado);
    }
    
    
}
/**
 * @brief Método para exibir uma lista
 * @param contém os elementos de números inteiros e números aleátorios
 * 
 */
void exibirLista(vector<int>lista){
    for (int i = 0; i<lista.size(); i++){
        cout << lista[i] << "\n";
    }
    cout << "---------------";
    cout << "\ntotal de elementos: " << lista.size() << "\n";
}
/**
 * @brief Método que copia os números da lista origem para lista destino, exceto os repetidos
 * 
 * @param listaOrigem contém os números originais da lista
 * @param listaDestino contém os números copiados da lista original sem ser repetidos
 */
void copiarListaSemReplicados(vector<int> listaOrigem,vector <int> &listaDestino){
    for (int i = 0; i < listaOrigem.size(); i++){
        // Verificar se o elemento já existe na listaDestino
        bool jaExiste = false;
        for (int j = 0; j < listaDestino.size(); j++){
            if (listaOrigem[i] == listaDestino[j]){
                jaExiste = true;
                break; // Sair do loop interno se encontrou
            }
        }
        // Se não existe, adicionar à lista destino
        if (!jaExiste){
            listaDestino.push_back(listaOrigem[i]);
        }
    }
}
        
// Outro método
//if (find(listaDestino.begin(), listaDestino.end(), listaOrigem[i]) == listaDestino.end()){
//            listaDestino.push_back(listaOrigem[i]);
//}
    


