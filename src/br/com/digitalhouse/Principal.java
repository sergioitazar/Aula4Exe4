package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {

        int [] numeros = new int[]{1,2,3,4,5};

        int soma = 0;
        for (int i=0; i < numeros.length; i++){
            soma = numeros[i] + soma;
        }
        System.out.println("Total da soma");
        System.out.println(soma);
    }
}
