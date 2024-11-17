import java.util.Scanner;

public class BenitezPaulaEjercicio2 {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);

        int tablero;
        int columna;
        int linea;
        int tamanho;



        System.out.println("Hola! vamos a crear tu tablero personalizado"+ "\n Introduce el caracter que quieres usar como patron.");
        char patron = sc.next().charAt(0); //usamos char y charAt por que queremos usar solo el primer caracter.

        //pedimos al usuario el tamaño de la casilla

        do {
            System.out.println("ahora introduce el tamaño que quieres para la casilla (1 <= size <= 15): ");
            tamanho= sc.nextInt();
        }while (tamanho < 1 || tamanho > 15);

        int borde= 8; //un tablero de ajedrez debe tener 8x8

        // aqui generamos el tablero con los bordes

        for (int tablero=0; tablero < borde; tablero ++){
            for (int columna=0; columna< borde; columna++){
                System.out.println("+");
                for (int i = 0; i < tamanho; i++){
                    System.out.println("-");
                }
            }

        }
        System.out.println("+");


        //ahora imprimimos lo que hay en las casillas.
        for (int linea=0; linea < tamanho; linea++){
            for (int columna=0; columna< borde; columna++){
                System.out.println("|");//separador
                boolean negro= (tablero +columna)%2 ==0;
                for (int i=0;i<tamanho; i++){
                    System.out.println(negro ? patron: "  ");
                }

            }
            System.out.println("|");
        }
        //aqui imprimimos la linea inferior del tablero
        for (int columna=0; columna < borde; columna++){
            System.out.println("+");
            for (int i=0; i < tamanho; i++){
                System.out.println("-");
            }
        }
        System.out.println("+");





    }


}