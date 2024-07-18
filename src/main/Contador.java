package main;

import main.exceptions.ParametrosInvalidosException;

public class Contador {
    public static  void contador(int numero1, int numero2){

        try{
            if(numero1 > numero2){
                throw new ParametrosInvalidosException();
            }else{
                System.out.print("Numeros = (");
                for (int i = numero1; i <= numero2; i++) {
                    System.out.print(i);
                    if(i != numero2) System.out.print(", ");
                }
                System.out.print(")");
            }
        } catch (ParametrosInvalidosException p) {
            System.out.println("O primeiro numero deve ser menor que o segundo numero");
            System.out.println("Fim do programa");
        }
    }
}
