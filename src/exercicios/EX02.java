
package exercicios;

import java.util.Scanner;


public class EX02 {
    public static void main(String[] args) {
        
        int a, b, c;
        float m ;
        String codigo ;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o codigo do aluno: ");
        codigo = scan.next();
        System.out.println("Digite a primeira nota: ");
        a = scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        b = scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        c = scan.nextInt();
        
        m = (a*4 + b*3 + c*3)/(4+3+3);
        
        if (m >=5){
            System.out.println("Aluno Aprovado!");
            
        } else{
            System.out.println("Aluno Reprovado");
        }
        System.out.println("O aluno de codigo: " + codigo + " " + "Com as notas: " + a + ", " + b + ", " + c + " " + "Obteve media" + " " + m );
    }
    
}
