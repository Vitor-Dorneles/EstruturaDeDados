from dados_climaticos import Clima
lista = []

# um_clima = Clima("2020", "Janeiro", "Quente", "pouca")
# print("Exibindo dados de um mes...", obj_clima)
linha = "2020,Janeiro,Quente,muita"
dados_linha = linha.split(",")

obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3] )

if obj_clima not in lista:
    lista.append(obj_clima)
# print("Exibindo dados de um mes...", obj_clima)

linha = "2020,Janeiro,frio,pouca"
dados_linha = linha.split(",")

obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3] )

if obj_clima not in lista:
    lista.append(obj_clima)

for c in lista:
    print(c)
