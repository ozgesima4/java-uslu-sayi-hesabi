
package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
       int sayi, üs,total=1;
        Scanner input=new Scanner(System.in);
        
        System.out.println("ussu alinacak sayi: ");
        sayi=input.nextInt();
        System.out.println("ussu kac olsun: ");
        üs=input.nextInt();
        
        for(int i=1;i<=üs;i++){
            total*=sayi;
        }
        System.out.println("cevap:"+total);
    }
    
}
