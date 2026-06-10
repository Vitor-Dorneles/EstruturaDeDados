Pegar as cordenadas de um mapa de um arquivo csv
primeira coluna origem, segunda destino

precisamos fazer uma classe para:
    - ler o csv
    - adicionar os vertices localizados na lista de vertices (sem duplicação)



a,b
b,c
b,d 
d,a 
d,b 
d,c 
e,d 

vertices[a,b,c,d,e] esses são todos os destinos e origens
depois ordenamos com vertices.sort

//TRABALHO AQUI....
    //ler arquivo csv, chamado mapa.csv do tipo
        // a,b
        // b,c
        // b,d
        // d,a
        // d,b
        // d,c
        // e,d
    //extrair os vértices presentes no csv e adiciona-los na lista de vértices (lembrar de ordenar)