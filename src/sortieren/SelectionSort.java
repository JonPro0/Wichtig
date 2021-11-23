package sortieren;

import gui.SortierAusgabe;
import util.Util;
import gui.*;

import java.util.Arrays;

public class SelectionSort {
    private int[] a;
    private SortierAusgabe ausgabe;

    public SelectionSort(int[] input){
        a = input;
        this.ausgabe = null;
    }

    public SelectionSort(int[] input, SortierAusgabe ausgabe) {
        a = input;
        this.ausgabe = ausgabe;
        ausgabe.println("SelectionSort gestartet");
    }

    public void sortieren(ArrayPanel parray, SortierAusgabe ausgabe) {
        if (ausgabe != null){
            ausgabe.println("Vorher: " + Arrays.toString(a));
        }
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            Util.swap(a, i, min);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            parray.setArray(a);
        }
        if (ausgabe != null){
            ausgabe.println("Nachher: " + Arrays.toString(a));
        }
    }
}
