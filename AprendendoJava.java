import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TIPOS DE NÚMEROS E VARIÁVEIS NO JAVA

        // Números inteiros = 100, 1, 300, 300000, 999999999
        /* 
        byte -> 8 bits -> -128 a 127
        byte x = 100; 
        
        short -> 16 bits -> -32.768 a 32.767
        short varMinha = 30000;
        
        int -> 32 bits -> -2.147.483.648 a 2.147.483.647
        int numeroGrande = 2.000.000;
        
        long -> 64 bits -> -9.223.372.836.854.775.808 a 9.223.372.836.854.775.807
        long variavel = 9.000.000.000.000L; // Note o 'L' para long
        
        Números decimais
        float -> 32 bits -> precisão simples -> 39.900
        float f = 10.5f; // Note o 'f' para float

        double -> 64 bits -> precisão dupla -> 39.99999999999
        double d = 28.5;
        
        Strings -> representa palavras
        char -> letras
        char c = 'A';
        
        boolean -> true or false
        boolean bool = true;
        */

        // DECLARAÇÃO DE VARIÁVEIS
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000000L; // Note o 'L' para long
        float f = 10.5f; // Note o 'f' para float
        double d = 28.5;
        char c = 'A';
        String str = "José";
        boolean bool = true;

        // Condicional if-else
        if (b > 101) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // Coleção de inteiros
        int[] colecaoInteiros = {1, 2, 3, 4, 5};
        int[] meusNumeros = new int[4];
        
        // Loop para imprimir elementos do array colecaoInteiros
        for (int i = 0; i < 3; i++) {
            System.out.println(colecaoInteiros[i]);
        }

        // Adicionando valores ao ArrayList
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("José");
        nomes.add("Ana");
        nomes.add("Lucas");

        // Loop para imprimir elementos do ArrayList nomes
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // Conversão de tipos de dados
        double resultado = 0.0;
        int resultadoInt = (int) resultado; // Casting de double para int
        
        int meuInt = 10;
        double meuDouble = meuInt; // Conversão implícita de int para double
        
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString); // Conversão de String para int
        
        String minhaString = String.valueOf(meuInt2); // Conversão de int para String
    }
}
