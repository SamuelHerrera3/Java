import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el numero factorial");
        
        int num = sc.nextInt();
        int acum = 0;
        int acum2;
        int res;
        while(num != 0){
            res = num-1;
            acum = res * num;
            
            System.out.println();
            num--; 
        }
        System.out.println(num);
        System.out.println(acum);
    }
    
}
