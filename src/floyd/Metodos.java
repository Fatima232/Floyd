/*
DESCRIPCION:
MODULO4
Programa de Floyd 
-Problema-de-los-caminos-mas-cortos-entre-todos-los-pares-
-Figura 6.14 y 6.38
VALIDACIONES:
-Validar cuando no hay llegada a un nodo
-Validar si no se han ingresado datos-
-Validar si se ingresan nodos negativos
FECHA:
18/05/20
EQUIPO:
FCA
 */
package floyd;
import java.util.Scanner;
public class Metodos {
    Scanner leer=new Scanner(System.in);
    
        int c[][] = new int [10][10];
        int a[][] = new int [10][10];
        int p[][] = new int [10][10];
        int n;
        
        void costosOriginales(){
            System.out.println("¿Cuantos nodos tiene el grafo?");
            n = leer.nextInt();
            System.out.println("Representacion del infinito\n" +
                    "--1000--");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Teclea el costo del nodo " + i + " al " + j);
                    c[i][j] = leer.nextInt();
                }               
            }
        }
        void copiarCostos() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = c[i][j];
                    p[i][j] = -1;
                }
            }
        }
        void diagonalCeros() {
            for (int i = 0; i < n; i++) {
                a[i][i] = 0;
            }
        }
        void Floyd() {
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (a[i][k] + a[k][j] < a[i][j]) {
                            a[i][j] = a[i][k] + a[k][j];
                            p[i][j] = k;
                        }
                    }
                }
            }
        }
        void mostrarc() {
            System.out.println(" ");
            System.out.println("Matriz C");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[j][i] + " ");
                }
                System.out.println(" ");
            }
        }
        void mostara() {
            System.out.println(" ");
            System.out.println("Matriz A");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j][i] + " ");
                }
                System.out.println(" ");
            }
        }
        void mostrarp() {
            System.out.println(" ");
            System.out.println("Matriz p");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(p[j][i] +" ");
                }
                System.out.println(" ");
            }
        }
        void camino(int o2, int d2) {
            
            int k;
            k = p[o2][d2];
            
            if (k != -1) {
                
                camino(o2, k);
                System.out.print(k);
                camino(k, d2);
            }
        }
}
