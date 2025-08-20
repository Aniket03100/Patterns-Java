// OUTPUT
// * * * * *
// * * * *
// * * *
// * *
// *
import java.util.Scanner;

public class Pattern5 {
    static void invertedRightAngledTri(int n){

        for(int i=1 ; i<=n ; i++){
            for(int j=n ; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        invertedRightAngledTri(n);

    }
}
