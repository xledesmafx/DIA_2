package com.roshka.bootcamp;

import java.util.Scanner;
import java.util.Stack;

public class BalanceadorParentesis {
    Stack pila = new Stack();

        for (int i = 0; i < cadena.length(); i++) {
            char primero = cadena.charAt(i);
            if (primero == '(' || primero == '{' || primero == '[') {
                pila.push(primero);
            } else if (primero == ')' || primero == '}' || primero == ']') {
                if (pila.isEmpty()){
                    return false;
                }
                char ultimo = (char) pila.pop();
                if (primero == '(' && ultimo == ')' || primero == '{' && ultimo == '}' || primero == '[' && ultimo == ']') {
                    return true;
                }
            }
        }
        return  pila.isEmpty();
}
