from Glicemia import Glicemia
from Funcoes import popular_lista_arquivo, exibir_lista, calcular_media, calcular_mediana
lista = []
nome_base = "/home/vitor/Projetos/EstruturaDeDados/Aulas/Aula03/dados.csv"

# ###
#  #ler do arquivo e popular a lista com dados splitados
# leitor = open(nome_base, "r", encoding="utf8")
# for linha in leitor:
#     vetor_linha = linha.split(",")
#     obj = Glicemia (int(vetor_linha[0]),vetor_linha[1], vetor_linha[2])

#     if obj not in lista:
#         lista.append( obj )




# leitor.close();

# for item in lista:
#     print(item.valor)

# print("Total de dados da base: ", len(lista))

popular_lista_arquivo(lista, nome_base)
exibir_lista(lista)

media = calcular_media(lista)
print("Média Glicêmica: ", media)

mediana = calcular_mediana(lista)
print("Mediana glicêmica: ", mediana)
