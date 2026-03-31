// Data: 25/03/2026
- Índice serve para ordenação
- Chave primária serve para garantir duplicação

 - pesquisar, entender e anotar no github a diferença entre vector, list, arraylist e linkedlist. quando usar uma ou outra
 - proxima aula, apresentar o trabalho e explicar
 - Estruturas e Processo em Python para a proxima aula

## Lista.java
- lista de inteiros
- lista.add(45);
- lista.add(42);
- ...

apenas um índice - número inteiros
// Pecursos em lista
// forma classica percorrendo via indice
for(int i = 0; i < lista.size(); i++){
  - bom para exibir e localizar
  - usar quando trabalhar com índice
    sout(lista.get(i)); // percorrer via índice
    // para fazer um remove o tamanho da lista mudará
}
//percorrer via objeto
// também não serve para alterar a lista
// irá se perder
for( Integer p : lista){
    if(lista.contains(p)){
        lista.remove(p);
    }
    sout(p);
}

//percorrer por um iterador/iterar é repetir
// iterador sabe percorrer a lista
// bom para alterações de tamanho na lista em tempo de execução, adicionar/ remover
Iterator<Integer> it = lista.iterator();
while (it.hashNext()) {
    int num = it.next()
    sout(num);
}



* Primeira parte da aula
  -  revisão dos códigos e conteúdos anteriormente vistos
* Segunda parte da aula 
  - Modelos para percorrer uma lista