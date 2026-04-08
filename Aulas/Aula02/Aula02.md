// Data: 04/03/2026

# Algoritmos de gestão de memória

- guardar/armazenar e buscar/pesquisar da forma mais eficiente possível
  - operações clássicas
    * Inserir
    - c++ - push_back()
    - java - add()
    - C# - Add()
    - Python - append()
  
- remover pela posição ou pelo elemento
  - C++ - pop_back() ou erase()
  - java - remove()
  - C# - Remove()
  - Python - remove()

# Localizar

  * verifica tamanho da estrutura
    - C++ - size()
    - java - size()
    - C# - Count
    - Python - len()
  * se está vazia
    - se o tamanho for igual a zero
    - empty() ou isEmpty()
  
  * localizar, Serve para verificar se um dado já está presente
    - vetor = [5,9,7,2,5]
    - TAM = 5
    
    - C - localizar número em C
        numero = 5
        encontrado = false
        for (int i = 0; i <TAM; i++){
            if (numero == vetor[i]){
            encontrado = true;
            break;
            }
        }
        if (encontrado){
            printf("numero encontrado);
        } else {
            printf("Numero não encontrado");
        }

    - Python - Localizar número em Python
        vetor [5,9,7,2,5]
        numero = 5
        if numero **in** vetor:
            print("encontrado")
        else:
            print("Não encontrado")

    - Java - localizar numero em Java
        vetor [5,9,7,2,5]
        numero = 5
        if (vetor.contains(numero)) {
            System.out.println("Encontrado");
        } else {
            System.out.println("não Encontrado");
        }

# Vimos hoje

inicializar

inserir

exibir

apagar

- Adicionar
- ordenar
- contains