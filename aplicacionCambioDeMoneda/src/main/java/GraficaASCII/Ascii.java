/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraficaASCII;

/**
 *
 * @author ElFel
 */
public class Ascii {
    public void monedaAscii(){
        System.out.println("      @@@@@@@@@@@@@       ");
        System.out.println("    @@@............@@@    ");
        System.out.println("  @@@..************..@@@  ");
        System.out.println(" @@@..  /$$$$$$    .. @@@  ");
        System.out.println("@@@..  /$$__  $$   ..  @@@  ");
        System.out.println("@@@.. | $$  \\ $$|  ..  @@@  ");
        System.out.println("@@@.. | $$$$$$$$|  ..  @@@      Bienvenidos a la aplicacion de Conversion de Monedas ");
        System.out.println("@@@.. | $$__  $$|  ..  @@@  ");
        System.out.println("@@@.. | $$  | $$|  ..  @@@  ");
        System.out.println(" @@@.. |__/  |__/  .. @@@  ");
        System.out.println("  @@@..************..@@@  ");
        System.out.println("    @@@............@@@    ");
        System.out.println("       @@@@@@@@@@@@       ");
    }
   public void menuAscii(){
        System.out.println("    $$           $$" );  
        System.out.println("    $$$          $$");
        System.out.println("    $$$$        $$$       $$$$$$        $$$$$$$      $$      $$ ");
        System.out.println("    $$  $$ $$ $$ $$       $$    $$      $$    $$     $$      $$ ");
        System.out.println("    $$    $$$|   $$       $$$$$$$$      $$    $$     $$      $$ ");
        System.out.println("    $$     $     $$       $$            $$    $$     $$      $$ ");
        System.out.println("    $$           $$        $$$$$$$      $$     $$      $$$$$$  ");
        System.out.println("*-------------------------------------------------------------*");
        System.out.println("| Selecciona una opcion.                                      |");
        System.out.println("| Usa tu teclado para escribir y despues Enter para elegirla. |");
        System.out.println("| 1.-Convertir valor de una moneda a otra.                    |");
        System.out.println("| 2.-Consultar valor de moneda con respecto al dolar.         |");
        System.out.println("| 3.-Guardar consultas en JSON.                               |");
        System.out.println("| 4.-Salir del programa.                                      |");
        System.out.println("|                                                             |");
        System.out.println("*-------------------------------------------------------------*");
   }
   public void menuBanderas(String tipo){
        System.out.println("*------------------------------------------------------------------*");
        System.out.println("|                                                                  |");
        if(tipo.equalsIgnoreCase("base:     ")){
            System.out.println("|Escribe el codigo de 3 letras y el monto separados por un espacio.|");
            System.out.println("|Ejemplo: USD 10                                                   |");
        }else{
        System.out.println("| Escribe el codigo de 3 letras.                                   |");
        System.out.println("|Ejemplo: CNY                                                      |");
        }
        System.out.println("| Selecciona la moneda "+tipo+"                                  |");
        System.out.println("|  __________   __________   __________   __________   __________  |");
        System.out.println("| |* )       | |****xxxxxx| |:::,-`::: | |   ...    | |   ...    | |");
        System.out.println("| |          | |****xxxxxx| |< (--.) > | |  :   :   | |   (*)    | |");
        System.out.println("| |          | |xxxxxxxxxx| |:::.-,::: | |  `...'   | |::::::::::| |");
        System.out.println("| |__________| |__________| |__________| |__________| |__________| |");
        System.out.println("|  Yuan        Dolares       Real          Euros       Rupia       |");
        System.out.println("|  Chino       Americanos    Brasileño                 India       |");
        System.out.println("|  (CNY)       (USD)         (BRL)         (EUR)       (INR)       |");
        System.out.println("|  __________   __________   __________   __________   __________  |");
        System.out.println("| |  |    |  | |::_,^._:: | |*|        | |   ,-.    | |   * |;;; | |");
        System.out.println("| |  | MX |  | |::\\___/::|  |--------  | |  (:::)   | |  ...+\"\"\" | |");
        System.out.println("| |  |    |  | |::__|__:: | |########  | |   `-'    | |  :::| *  | |");
        System.out.println("| |__________| |__________| |__________| |__________| |__________| |");
        System.out.println("|  Pesos        Dolares      Peso         Yenes       Balboas      |");
        System.out.println("|  Mexicanos    Canadienses  Chileno                               |");
        System.out.println("|  (MXN)       (CAD)         (CLP)         (JPY)       (PAB)       |");
        System.out.println("*------------------------------------------------------------------|");
   }
   public void letreroTransaccion(String tipo){
        System.out.println("*_____________________________________________________________*");
        System.out.println("|Operacion                                                    |");
        System.out.println("*_____________________________________________________________*");
        System.out.println("|"+tipo+".                                                    |");
        System.out.println("|                                                             |");
        System.out.println("*-------------------------------------------------------------*");
   }
}
