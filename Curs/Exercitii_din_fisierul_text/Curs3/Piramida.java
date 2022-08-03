package Exercitii_din_fisierul_text.Curs3;

import java.util.Scanner;

public class Piramida {
    int n;


public static void main(String[] args) {
    int rows = 4;


    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(" ");
        }
        for (int j = i; j <= rows; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}}






