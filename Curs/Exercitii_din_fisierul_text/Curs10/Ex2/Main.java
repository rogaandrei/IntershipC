package Exercitii_din_fisierul_text.Curs10.Ex2;

import java.util.*;

import java.io.*;

public class Main {

    public static void main ( String[] args ) {

        try {

            InputStreamReader inputKeyboard = new InputStreamReader(System.in);

            BufferedReader buffKeyboard = new BufferedReader(inputKeyboard);

            LinkedList stringList = new LinkedList();

            LinkedList stringList2 = new LinkedList();

            System.out.print("Dati sirul de caractere:\n");

            String linie = "";

            boolean flag = false;

            while (!flag) {

                linie = buffKeyboard.readLine();

                if (linie.contains("STOP")) {

                    flag = true;

                    String[] tmp = linie.split("STOP");

                    linie = tmp[0];

                    if (!linie.equals("")) {

                        if (!stringList.contains(linie)) {

                            stringList2.add(linie);

                        }

                        stringList.add(linie);

                    }

                } else {

                    if (!stringList.contains(linie)) {

                        stringList2.add(linie);

                    }

                    stringList.add(linie);

                }

            }

            System.out.println("Lista 1: " + stringList.toString());

            System.out.println("Lista 2: " + stringList2.toString());

        } catch (IOException e) {

            System.out.println("Ati gresit!");

        }

    }
}

