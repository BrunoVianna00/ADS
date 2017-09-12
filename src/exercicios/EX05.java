
package exercicios;

import java.util.Scanner;


public class EX05 {
    public static void main(String[] args) {
        float sal,nSal;
        sal = 0;
        nSal = 0;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o salario do funcionario: ");
        sal = scan.nextFloat();
        
        if(sal <= 350){
            nSal = (float) (sal + sal*0.5); 
        }else {
            nSal = (float) (sal + sal*0.3);
        }
        System.out.println("O salario antigo é: " + sal + " " + "O salario reajustado é: " + nSal);
    }
}
