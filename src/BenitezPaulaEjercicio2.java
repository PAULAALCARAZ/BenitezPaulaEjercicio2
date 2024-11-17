import java.util.Scanner;

public class BenitezPaulaEjercicio2 {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);

        int tamanho;

        System.out.println("Hola! vamos a crear tu tablero personalizado"+ "\n Introduce el caracter que quieres usar como patron.");
        char patron = sc.next().charAt(0); //usamos char y charAt por que queremos usar solo el primer caracter.

        //pedimos al usuario el tamaño de la casilla

        do {
            System.out.println("ahora introduce el tamaño que quieres para la casilla (El valor debe estar entre 1 y 15): ");
            tamanho= sc.nextInt();
        }while (tamanho < 1 || tamanho > 15); //determinamos rango

        int borde= 8; //porque un tablero de ajedrez debe tener 8x8

        // aqui generamos el tablero con los bordes

        for (int fila=0; fila < borde; fila ++){
            //ahora imprimimos el borde de arriba de cada fila.
            for (int i=0; i< borde; i++){
                System.out.print("+");
                for (int j = 0; j < tamanho; j++){
                    System.out.print("-");
                }
            }
            System.out.println("+"); //cerramos el borde de la ultima casilla de la fila.

            //ahora imprimimos lo que hay en las casillas.
            for (int i = 0; i < tamanho; i++) {
                for (int columna = 0; columna < borde; columna++) {
                    System.out.print("|"); // Separador entre casillas

                    // Determinar si es una casilla "negra" o "blanca"
                    boolean negro = (fila + columna) % 2 == 0; // Alternancia de colores
                    for (int j = 0; j < tamanho; j++) {
                        System.out.print(negro ? patron : " ");

                    }
                }
                System.out.println("|"); // Cerrar la última casilla de la línea
            }

        }


        //aqui imprimimos la linea inferior del tablero
        for (int columna=0; columna < borde; columna++){
            System.out.print("+");
            for (int i=0; i < tamanho; i++){
                System.out.print("-");
            }
        }
        System.out.println("+");





    }


}