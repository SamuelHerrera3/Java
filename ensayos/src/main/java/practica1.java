import java.util.Scanner;
public class practica1{
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  cont = 1, n, x, m100 = 0, neg = 0;
        float acum, prom;
        acum = 0;
        System.out.println("ingrese cantidad de numeros a analizar");
        n = teclado.nextInt();
        while (cont<=n){
            System.out.println("ingrese el numero " + cont + ": ");
            x = teclado.nextInt();
            if (x>100){
                m100++;  
            }else{
                if(x<0){
                    neg++;
                }
            }
            acum += x;
            cont++;
        }        
        prom = acum/n;
        System.out.println(" ");
        System.out.println("la suma de los elementos es " + acum);
        System.out.println("cantidad de numeros mayores que 100: " + m100);
        System.out.println("el promedio de los numeros es: " + prom);
        System.out.println("la cantidad de numeros negativos es: " + neg);
    }
}
