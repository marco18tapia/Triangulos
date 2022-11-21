
package triangulo;
import java.util.Scanner;

public class Triangulo {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int N1,N2,N3;
        
        Scanner E = new Scanner(System.in); 
   
        System.out.println("Ingresar numeros superiores a 0 \n no se aceptan negativos ni iguales a 0");
        System.out.println("**************");
        System.out.println("Ingrese el 1er numero");
        N1 = E.nextInt();
        System.out.println("Ingrese el 2do numero");
        N2 = E.nextInt();
        System.out.println("Ingrese el 3er numero");
        N3 = E.nextInt();
        System.out.println("**************");
        int CalN=0;
       
        do{
            
        System.out.println("Ingresa la opcion que deseas mediante numero para determinar el triangulo que deseas obtener ");
        System.out.println("1: Equilatero");
        System.out.println("2: Isosceles");
        System.out.println("3: Escaleno");
        int NG = E.nextInt();
        
         
        switch (NG){
            case 1:  
                if (N1==N2 && N2==N3 && N3==N1 ) {
                    System.out.println("Es un triangulo Equilatero");
                    System.out.println("Deseas volver a intertar 1: Si 0: No");
                    CalN = E.nextInt();
}
                else{System.out.println("El calculo es incorrecto  deseas volver a calcular 1: Si 0: No");
                     CalN = E.nextInt();}
               
            break;
            case 2:
                if(N1==N2){ System.out.println("Es un triangulo Isoceles"); System.out.println("Deseas volver a intertar 1: Si 0: No");
                    CalN = E.nextInt();}
                else if(N2==N3){System.out.println("Es un triangulo Isoceles");System.out.println("Deseas volver a intertar 1: Si 0: No");
                    CalN = E.nextInt();}
                else if(N3==N1){System.out.println("Es un triangulo Isoceles");System.out.println("Deseas volver a intertar 1: Si 0: No");
                    CalN = E.nextInt();}
                else{System.out.println("El calculo es incorrecto  deseas volver a calcular 1: Si 0: No");
                       CalN = E.nextInt();}
            break;  
            case 3:  
                if (N1!=N2 && N2!=N3 && N3!=N1 ) {
                System.out.println("Es un triangulo Escaleno");
                System.out.println("Deseas volver a intertar 1: Si 0: No");
                    CalN = E.nextInt();}
            break;    
            
            default:
                System.out.println("El calculo es incorrecto  deseas volver a calcular 1: Si 0: No");
                       CalN = E.nextInt();
        };
        CalN += 1;
        }while( CalN!=1 );   
    } ///END MAIN 
}
