/*
DESCRIPCION:
programa de Floyd
FECHA:
18/05/2020
 */
package floyd;
import java.util.Scanner;
public class Floyd {
    
    static Metodos m = new  Metodos();

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("_____F L O Y D_____\n" +
                    "Opcion 1:Capturar costos originales\n" +
                    "Opcion 2:Copiar costos\n" +
                    "Opcion 3:Diagonal ceros\n" +
                    "Opcion 4:Aplicar Floyd\n" +
                    "Opcion 5:Mostrar costos originales\n" +
                    "Opcion 6:Mostrar costos mas bajos\n" +
                    "Opcion 7:Mostrar matriz P con los puntos intermedios\n" +
                    "Opcion 8:Salida\n");
            System.out.println("--Teclea una opcion--");
            opcion = leer.nextInt();
            
            switch(opcion) {
                case 1:
                    m.costosOriginales();
                break;
                case 2:
                    m.copiarCostos();
                break;
                case 3:
                    m.diagonalCeros();
                break;
                case 4:
                    m.Floyd();
                break;
                case 5:
                    m.mostrarc();
                break;
                case 6:
                    m.mostara();
                    System.out.println("           ");
                    
                    int i,j;
                    System.out.println("¿Cual es el origen?");
                    i = leer.nextInt();
                    System.out.println("¿Cual es el destino?");
                    j = leer.nextInt();
                    
                    System.out.println("La ruta es= " + i + "-");
                    m.camino(i, j);
                    System.out.println("-" +j);
                    System.out.println("El costo es= " + m.a[i][j]);
                break;
                case 7:
                    m.mostrarp();
                break;
                default:
            }
        }
        while(opcion != 8);
    }
}
