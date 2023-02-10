package atividade_2;

public class Utils {
    public static String reverse(String str) {
        String[] strArray = str.split(",");
        String reversed = "";
        for (int i = strArray.length - 1; i >= 0; i--) {
            reversed += strArray[i] + ",";
        }
        return reversed.substring(0, reversed.length() - 1);
    }
}