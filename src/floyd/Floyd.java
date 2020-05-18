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
public class Floyd {
    
    static Metodos m = new  Metodos();

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int opcion;
        boolean band=false;
        
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
                    band=true;
                break;
                case 2:
                    if(band==true){
                    m.copiarCostos();
                    }else{
                        System.out.println("Lo siento no se han ingresado costos");
                    }
                break;
                case 3:
                    if(band==true){
                    m.diagonalCeros();
                      }else{
                        System.out.println("Lo siento no se han ingresado costos");
                    }
                break;
                case 4:
                     if(band==true){
                    m.Floyd();
                     }else{
                        System.out.println("Lo siento no se han ingresado costos");
                    }
                break;
                case 5:
                 if(band==true){
                    m.mostrarc();
                     }else{
                        System.out.println("Lo siento no se han ingresado costos");
                    }
                break;
                case 6:
                    if(band==true){
                    m.mostara();
                    System.out.println("           ");
                    
                    int i,j;
                    System.out.println("¿Cual es el origen?");
                    i = leer.nextInt();
                    System.out.println("¿Cual es el destino?");
                    j = leer.nextInt();
                    
                    System.out.println("La ruta es = " + i + "-");
                    m.camino(i, j);//llamada al metodo que recupera el camino o ruta
                    System.out.println("-" +j);
                    //System.out.println("El costo es = " + m.a[i][j]);
                    if(m.a[i][j]==1000){
                   System.out.println("No hay ruta");
                    }else{
                         System.out.println("El costo es = " + m.a[i][j]);
                       
                    }
                      }else{
                        System.out.println("Lo siento no se han ingresado costos");
                    }
                break;
                case 7:
                     if(band==true){
                    m.mostrarp();
                      }else{
                        System.out.println("Lo siento no se han ingresado costos");
                    }
                break;
                case 8:
                    System.out.println("Saliendo...");
                break;
                default:
                  System.out.println("Lo siento la opcion "+opcion+" no existe");
            }
        }
        while(opcion != 8);
    }
}
