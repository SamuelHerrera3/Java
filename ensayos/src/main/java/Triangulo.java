import java.util.Scanner;
public class Triangulo {
    int l1, l2, l3;
    
    public void leerAtributos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el primer lado: ");
        l1 = sc.nextInt();
        System.out.println("digite el segundo lado: ");
        l2 = sc.nextInt();
        System.out.println("digite el tercer lado: ");
        l3 = sc.nextInt();
        System.out.println("su triangulo es: lado 1 :" + l1 + ", lado 2: " + l2 + " y lado 3: " + l3);
    }
    
    public void ladoMayor(){
        if (l1 > l2 && l1 > l3){
            System.out.println("el lado mayor es: " + l1);
        }else if(l2 > l3){
            System.out.println("el lado mayor es: " + l2);
        }else{
            System.out.println("el lado mayor es: " + l3);
        }
    }
    
    public void equilatero(){
        if (l1 == l2 && l2 == l3){
                System.out.println("el triangulo es equilatero");   
            }
       else{
            System.out.println("el triangulo no es quilatero");
        }
    }

}

