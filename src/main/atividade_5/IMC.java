package com.atividade_5;

import com.atividade_5.enums.Imc;

public class IMC {
    public static Imc calcularIMC(String sexo, String peso, String altura) {
        double imc = Double.parseDouble(peso) / Math.pow(Double.parseDouble(altura), 2);
        if (sexo.equals("M")) {
            if (imc < 20.7) {
                return Imc.ABAIXO_DO_PESO;
            }
            if (imc >= 20.7 && imc < 26.4) {
                return Imc.PESO_IDEAL;
            } 
            if (imc >= 26.4 && imc < 27.8) {
                return Imc.MARGINALMENTE_ACIMA_DO_PESO;
            }
            if (imc >= 27.8 && imc < 31.1) {
                return Imc.ACIMA_DO_PESO_IDEAL;
            }
            
            return Imc.OBESO;
        } else {
            if (imc < 19.1) {
                return Imc.ABAIXO_DO_PESO;
            }
            if (imc >= 19.1 && imc < 25.8) {
                return Imc.PESO_IDEAL;
            }
            if (imc >= 25.8 && imc < 27.3) {
                return Imc.MARGINALMENTE_ACIMA_DO_PESO;
            }
            if (imc >= 27.3 && imc < 32.3) {
                return Imc.ACIMA_DO_PESO_IDEAL;
            }
        }
        return Imc.OBESO;
    }
}
