package com.roshka.bootcamp;

import java.util.Scanner;
import java.util.Stack;

public class BalanceadorParentesis {
    public static Boolean isBalanced(final String cadena) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length();i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '{' || caracter == '[' || caracter == '(') {
                pila.push(caracter);
            } else if (caracter == '}' || caracter == ']' || caracter == ')') {
                if (pila.isEmpty()) {
                    return false;
                }
                char ultimo = pila.pop();
                if (caracter == '}' && ultimo != '{' || caracter == ']' && ultimo != '[' || caracter == ')' && ultimo != '(') {
                    return false;
                }
            }
        }
        return  pila.isEmpty();
    }
}