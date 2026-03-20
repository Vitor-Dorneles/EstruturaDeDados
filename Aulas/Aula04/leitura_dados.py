#// Data: 18/03/2026
from dados_climaticos import Clima

lista = []
nome_base = "dadosClimaticos.csv"


try: 
    # abrindo modo leitura
    leitor = open(nome_base, "r", encoding="utf-8")

    #passando pelo arquivo linha a linha e tratando os objetos da lista
    for linha in leitor:
        dados_linha = linha.split(",")
        obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])
        if obj_clima not in lista:
            lista.append(obj_clima)
    #exibindo a lista
    for item in lista:
        print(item, end="")

    #fechando o arquivo
    leitor.close()
    # tratamento de exceções
except Exception as e:   #Caso de algum erro, fizemos o tratamento antes, para não "Assustar o usuário"
    print("Ocorreu algum erro... ", e)


#Descobrir o ano que mais choveu e o ano mais quente
