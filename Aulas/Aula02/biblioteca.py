#// Data: 04/03/2026

import random

def popular_lista_aleatoria(lista, quantidade, faixa_inicial, faixa_final):
    """Método que popula uma lista com números inteiros e aleatórios dentro de uma faixa

    Args:
        lista_numeros (int): armazena números inteiros e aleátorios
        quantidade_numeros (int): total de números inteiros a serem inseridos
        faixa_inicial (int): número inicial da faixa
        faixa_final (int): número final da faixa
    """
    for i in range(quantidade):
        lista.append (random.randint(faixa_inicial, faixa_final))

def exibir_lista(lista):
    """Método para exibir a lista de números

    Args:
        lista (int): armazena números inteiros e aleátorios
    """
    for item in lista:
        print(item)

    print("------------------------")
    print("Total de elementos: ", len(lista))

def copiar_lista_sem_replicados(lista_origem, lista_destino):
    """Método que copia o conteúdo da lista origem para dentro da lista destino 
    retirando os duplicados

    Args:
        lista_origem (int): lista original contendo todos os numeros
        lista_destino (int): lista final contendo somente os números não replicados
        """
    for item in lista_origem:
        if item not in lista_destino:
            lista_destino.append(item)
