package main;

import main.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scs = new Scanner(System.in);
        System.out.println("Por favor, entre com dois numeros inteiros");
        System.out.println("Entre com o primeiro numero :");
        var numero1 = scs.nextInt();
        System.out.println("Entre com o segundo numero :");
        var numero2 = scs.nextInt();

        Contador.contador(numero1,numero2);
    }
}
