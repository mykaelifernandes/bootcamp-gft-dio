public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Testando operadores relacionais com categorias de dados primitivos

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Beltrano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;

        byte y1 = 1;
        byte y2 = 2;

        short h1 = 1;

        System.out.println(" i1 == i2 " + (i1 == i2)); //igualdade
        System.out.println(" i1 != i2 " + (i1 != i2)); //diferente de
        System.out.println(" i1 > i2 " + (i1 > i2)); //maior que
        System.out.println(" i1 <= i2 " + (i1 <= i2)); //menor ou igual

        System.out.println(" f1 == f2 " + (f1 == f2)); // igualdade
        System.out.println(" f1 != f2 " + (f1 == f2)); // diferente de
        System.out.println(" f1 >= f2 " + (f1 == f2)); // maior ou igual
        System.out.println(" f1 < f2 " + (f1 == f2)); // menor que

        System.out.println(" c1 == c2 " + (c1 == c2)); // igualdade
        System.out.println(" c1 == c2 " + (c1 == c2)); // diferente de
        System.out.println(" c1 > c2 " + (c1 == c2)); // maior
        System.out.println(" c1 <= c2 " + (c1 == c2)); // menor ou igual

        // OBS.: Tomar cuidado com operadores de igualdade e diferente de, em objetos.
        System.out.println(" s1 == s2 " + (s1 == s2)); // igualdade
        System.out.println(" s1 == s3 " + (s1 == s2)); // igualdade
        System.out.println(" s1 != s2 " + (s1 == s2)); // diferente de

        /* "STRINGS" e ""BOLLEANS" NÃO PODEM SER COMPARADAS EM TAMANHO DE GRANDEZA COMO O INT, FLOAT E CHAR (char é um código que representa uma letra).
         EXEMPLO:
        System.out.println(" s1 >= s2 "); // maior ou igual
        System.out.println(" b1 < b2 "); // menor
        */

        System.out.println(" b1 == b2 " + (b1 == b2)); // igualdade
        System.out.println(" b1 != b2 " + (b1 != b2)); // diferente de

      /* NEM TODOS OPERADORES FUNCIONAM COM QUAISQUER TIPOS DE DADOS
        EXEMPLO:
        System.out.println(" s1 != c2 "); // string e char
        System.out.println(" s3 != i1 "); // string e inteiro
       */

        // PORÉM HÁ CATEGORIAS DADOS DIFERENTES QUE FUNCIONAM POIS HÁ UMA SEMELHANÇA ENTRE ELES
        // EXEMPLO:

        System.out.println(" d1 > h1 " + (d1 > h1)); // diferentes, mas são numéricos
        System.out.println(" i2 == f1 " + (i2 == f1));
        System.out.println(" l1 == i2 " + (l1 == i2));
        System.out.println(" l2 >= i1 " + (l2 >= i1));
        System.out.println(" y1 != h1 " + (y1 != h1));

    }
}
