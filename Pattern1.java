// OUTPUT
// * * * * 
// * * * * 
// * * * * 
// * * * *


import java.util.Scanner;

public class Pattern1 {

    void square(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
       
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern1 obj = new Pattern1();
        obj.square(n);

    }
}