/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import Escritura.EscrituraJson;
import API.GetDataAPI;
import GraficaASCII.Ascii;
import Transaccion.TransaccionGson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ElFel
 */
public class AplicacionCambioDeMoneda {
    public static void presionarEnter(Scanner scan){
        System.out.println("Presione Enter para continuar");
        scan.nextLine();
        pantallaVacia();
    }
    public static void pantallaVacia(){
        for(int i=0;i<100;i++){
            System.out.println("");
        }
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<TransaccionGson> transacciones= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Ascii arte= new Ascii();
        EscrituraJson escrituraJson= new EscrituraJson();
        GetDataAPI request= new GetDataAPI();
        boolean enMarcha=true;
        pantallaVacia();
        arte.monedaAscii();
        presionarEnter(scan);
        while(enMarcha){
            arte.menuAscii();
            int eleccion= Integer.valueOf(scan.nextLine());
            switch (eleccion){
                case 1:
                    pantallaVacia(); 
                    
                    arte.menuBanderas("base:     ");
                    String baseAndAmount=scan.nextLine();
                    pantallaVacia();
                    arte.menuBanderas("de cambio:");
                    String target=scan.nextLine();
                    try {
                      String[] valores=baseAndAmount.split(" ");
                      System.out.println(valores);
                      String base=valores[0];
                      double amount=Double.valueOf(valores[1]);
                      pantallaVacia();
                      arte.letreroTransaccion(request.findData(base, target, transacciones,amount));;
                      presionarEnter(scan);  
                    } catch ( IndexOutOfBoundsException e) {
                        pantallaVacia();
                        System.out.println("*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*");
                        System.out.println("*  No se coloco la busqueda en el formato correcto. *");
                        System.out.println("*  Recueda colocar el codigo seguido de la cantidad.*");
                        System.out.println("*  Ejemplo: CNY 10.34                               *");
                        System.out.println("*  Intenta otra vez.                                *");
                        System.out.println("*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*");
                        presionarEnter(scan);
                    }
                    
                    break;
                case 2:
                    pantallaVacia();
                    arte.menuBanderas("para ver  ");
                    String consulta= scan.nextLine();
                    arte.letreroTransaccion(request.findData(consulta, transacciones));;
                    presionarEnter(scan);
                    break;
                case 3:
                    pantallaVacia();
                    
                    arte.letreroTransaccion(escrituraJson.guardarConsultas(transacciones));
                    presionarEnter(scan);
                    break;
                case 4:
                    pantallaVacia();
                    arte.letreroTransaccion("Saliendo");
                    presionarEnter(scan);
                    enMarcha=false;
                    break;
                default:
                    System.out.println("Eleccion no reconocida, intenta nuevamente.");
            }
            pantallaVacia();
            System.out.println("Fin programa.");
        }
    }
}
