from Glicemia import Glicemia

lista = []
obj = Glicemia(191, "11/03/2026", "09:00")
lista.append( obj )

lista.append(Glicemia(98, "11/03/2026", "11:00"))

for i in range(3):
    valor = int(input("Valor glicemia: "))
    data = input("Data [dd/mm/aaaa]: ")
    hora = input("Hora [hh:mm]: ")

    lista.append(Glicemia(valor, data, hora))
for item in lista:
    print(f"{item.valor} - {item.data} - {item.hora}")
