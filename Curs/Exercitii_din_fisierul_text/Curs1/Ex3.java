package Exercitii_din_fisierul_text.Curs1;

import java.util.Scanner;

public class Ex3 {
   static int n;
   static int sum=0;

    public static void main(String[] args) {
        System.out.println("Introduceti un numar:");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
    if(n%2!=0){
       for(int i=1;i<n;i=i+2){
           System.out.println("numarul afisat este:"+i);        }
   }
    if(n%2==0){
        for(int i=0;i<n;i=i+2){
             sum = sum + i;
            System.out.println("Suma nr pare este egala cu " +sum);
        }

    }
    }
}




