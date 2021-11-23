package gui;

import sortieren.BubbleSort;
import sortieren.InsertionSort;
import sortieren.SelectionSort;
import util.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUI extends JFrame {
    private JPanel pMain;
    private JTextArea taAusgabe;
    private JButton bBubble;
    private JPanel pButtons;
    private JPanel pOutput;
    private JPanel POut;
    private JButton bInsertion;
    private JButton bSelection;
    private JButton bBogo;
    private JButton bGenerate;
    private ArrayPanel pArray;
    private SortierAusgabe ausgabe;
    private int[] array;

    public SortierGUI() {
        array = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        ausgabe = new SortierAusgabe(taAusgabe);
        pArray = new ArrayPanel(array);
        POut.add(pArray);
        bBubble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread() {
                    public void run() {
                        BubbleSort bsort = new BubbleSort(array, ausgabe);
                        bsort.sortieren(pArray, ausgabe);
                    }
                }.start();
            }
        });

        bInsertion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread() {
                    public void run() {
                        InsertionSort Isort = new InsertionSort(array, ausgabe);
                        Isort.sortieren(pArray, ausgabe);
                    }
                }.start();
            }
        });

        bSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread() {
                    public void run() {
                        SelectionSort Ssort = new SelectionSort(array, ausgabe);
                        Ssort.sortieren(pArray, ausgabe);
                    }
                }.start();
            }
        });

        bGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ArrayGenerator Agenerate = new ArrayGenerator();
               int[] arr = Agenerate.randomNumbers(200, 1000);
                System.out.println(arr);
                System.out.println(arr);
            }
        });



        add(pMain);
        setSize(800, 600);
        setTitle("Mein Fenster 11G4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortierGUI();
    }
}
