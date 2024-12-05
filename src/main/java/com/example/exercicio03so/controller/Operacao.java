package com.example.exercicio03so.controller;

public class Operacao {
    public String comparar(int valor1, int valor2){
        if(valor1 > valor2){
            return "O 1º Valor: "+valor1+ " é maior que o 2º Valor: "+ valor2;
        }else if(valor2 > valor1){
            return "O 2º Valor: "+valor2+ " é maior que o 1º Valor: "+ valor1;
        }else{
            return "Os valores são iguais.";
        }
    }
    public int somaImpar(int valor1, int valor2){
        if(valor1 > valor2){
            int i = valor2;
            int soma = 0;
            while(i < valor1){
                if(i % 2 != 0){
                    soma += i;
                }
                i++;
            }
            return soma;
        }
        if(valor2 > valor1){
            int i = valor1;
            int soma = 0;
            while(i < valor2){
                if(i % 2 != 0){
                    soma += i;
                }
                i++;
            }
            return soma;
        }else{
            return 0;
        }
    }
}
