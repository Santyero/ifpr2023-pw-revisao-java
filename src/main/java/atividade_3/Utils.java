// Implemente uma classe que deverá, quando executada, solicitar 03 valores separados por vírgula e apresentar esses valores em ordem crescente.
// A ordenação dos valores deverá ser feita em um método separado, sem utilizar qualquer mecanismo da linguagem de programação.
package com.atividade_3;

public class Utils {
    public static String sort(String str) {
        String[] strArray = str.split(",");
        String sorted = "";
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (Integer.parseInt(strArray[i].trim()) > Integer.parseInt(strArray[j].trim())) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
            sorted += strArray[i] + ",";
        }
        return sorted.substring(0, sorted.length() - 1);
    }
}
