package Aulas.Aula14Arvore;

import java.util.TreeSet;

public class ArvoreEx {
    public static void main(String[] args) {
        TreeSet<String> arvore = new TreeSet<>();

        arvore.add("Banana");
        arvore.add("Maça");
        arvore.add("Laranja");
        arvore.add("Abacaxi");
        arvore.add("Uva");
        arvore.add("Manga");

        System.out.println("Elementos de arvore");

        for (String fruta : arvore) { //aplicando recursao ERD
            System.out.println(fruta);

        }
        if (arvore.contains("Caqui")) { //aplicando recursao RED
            System.out.println("A arvore contém Caqui.");
        } else {
            System.out.println("A arvore não contém Caqui");
        }

        arvore.clear(); // aplicando recurso
    }
    
}
