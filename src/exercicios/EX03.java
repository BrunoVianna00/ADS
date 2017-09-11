
package exercicios;

import java.util.Scanner;


public class EX03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a, b, c, d;
        int somaMenor;
        
        System.out.println("Digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scan.nextInt();
        System.out.println("Digite o terceiro nmuero: ");
        c = scan.nextInt();
        System.out.println("Digite o primeiro numero: ");
        d = scan.nextInt();
        
        if (a > b && a > c && a >d ){
            System.out.println("A soma dos tres menores valores é: " + (b + c + d) );
        } else if(b > a && b > c && b > d){
            System.out.println("A soma dos tres menores valores é: " + (a + c + d) );
        } else if(c > b && c > a && c > d){
            System.out.println("A soma dos tres menores valores é: " + (a + b + d) );
        } else if(d > b && d > c && d > a){
            System.out.println("A soma dos tres menores valores é: " + (a + b + c) );
        }
    }
}
