from matriz_especial import Matriz

# em python quando declaramos a matriz já é automaticamente inicializada

dimensao = 10
matriz = [[0 for _ in range(dimensao)]for _ in range(dimensao)]

# preenchendo manualmente alguns valores no estilo matriz[linha][coluna] = valor
matriz[2][4] = 1
matriz[0][0] = 1
matriz[9][9] = 1
matriz[3][1] = 1
matriz[4][4] = 1


Matriz.exibir_matriz(matriz, dimensao, dimensao)

lista_especial = []

Matriz.converter_matriz(matriz, dimensao, dimensao, lista_especial)