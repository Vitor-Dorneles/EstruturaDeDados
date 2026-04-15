#// Data: 15/04/2026
class Dado:

    def __init__(self, valor,linha,coluna):
        self.valor = valor # self substitui this
        self.linha = linha
        self.coluna = coluna

    def __eq__(self, other):
        if isinstance (other,Dado):
            return self.linha == other.linha and self.coluna == other.coluna
        return False
    
    def __str__(self):
        return f"Valor={self.valor} na posição={self.coluna}"
    
    