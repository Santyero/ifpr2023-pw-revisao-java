package atividade_7;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Time[] times = new Time[3];
        times[0] = new Time("São Paulo", 38, 23, 8, 7, 66, 35);
        times[1] = new Time("Palmeiras", 38, 21, 11, 6, 70, 37);
        times[2] = new Time("Santos", 38, 21, 10, 7, 69, 37);
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if (times[i].CompareTo(times[j]) == 1) {
                    Time aux = times[i];
                    times[i] = times[j];
                    times[j] = aux;
                }
            }
        }
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + "º " + times[i].toString());
        }
    }
}
