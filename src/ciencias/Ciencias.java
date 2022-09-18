/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciencias;
import java.util.Scanner;
/**
 *
 * @author JESUS
 */
public class Ciencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAMAS DE PRUEBA: BLOQUE PRIMERO
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("PROGRAMAS DE CONVERSIÓN DE UNIDADES DE MEDIDAS");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1.- Programa de Conversión de Unidades de Longitud");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Introduce un número: ");
        int metro = teclado.nextInt();
        
        float micrometro = metro / 10000f;
        float milimetro = metro / 1000f;
        float centimetro = metro / 100f;
        float decimetro = metro / 10f;
        
        int decametro = metro * 10;
        int hectometro = metro * 100;
        long kilometro = metro * 1000;
        long megametro = metro * 1000000;
        long gigametro = metro * 1000000000;
        
         System.out.println("Micrómetros:  " + micrometro + " m");     
         System.out.println("Milímetros:   " + milimetro + " m");  
         System.out.println("Centímetros:  " + centimetro + " m");  
         System.out.println("Decímetros:   " + decimetro + " m");  
         System.out.println("Metros:       " + metro);
         System.out.println("Decámetros:   " + decametro + " m");
         System.out.println("Hectómetros:  " + hectometro + " m");
         System.out.println("Kilómetros:   " + kilometro + " m");
         System.out.println("Megámetros:   " + megametro + " m");
         System.out.println("Gigámetros:   " + gigametro + " m");
         System.out.println();
         
        System.out.println("----------------------------------------------------------------------");
        System.out.println("2.- Programa de Conversión de Unidades de Masa");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Introduce un número: ");
        int gramo = teclado.nextInt();
        
        float microgramo = gramo / 10000f;
        float miligramo = gramo / 1000f;
        float centigramo = gramo / 100f;
        float decigramo = gramo / 10f;
        
        int decagramo = gramo * 10;
        int hectogramo = gramo * 100;
        long kilogramo = gramo * 1000;
        long quintalMetrico = gramo * 100000;
        long megagramo = gramo * 1000000;
        
         System.out.println("Micrógramos:  " + microgramo + " g");     
         System.out.println("Milígramos:   " + miligramo + " g");  
         System.out.println("Centígramos:  " + centigramo + " g");  
         System.out.println("Decígramos:   " + decigramo + " g");  
         System.out.println("Gramos:       " + gramo);
         System.out.println("Decágramos:   " + decagramo + " g");
         System.out.println("Hectógramos:  " + hectogramo + " g");
         System.out.println("Kilógramos:   " + kilogramo + " g");
         System.out.println("Quintal Métrico:   " + quintalMetrico + " g");
         System.out.println("Megagramos o Toneladas Métricas:  " + megagramo + " g");
         System.out.println();
         
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("3.- Programa de Conversión de Unidades de Tiempo");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Introduce un número: ");
        int tiempo = teclado.nextInt();
        
        int milenios = tiempo * 1000;
        int siglos = tiempo *100;
        int decadas = tiempo * 10;      
        int quinquenios = tiempo * 5;       
        int años = tiempo * 12;
        int meses = tiempo * 4;
        int semanas = tiempo * 7;
        int dias = tiempo * 24;
        int horas = tiempo * 60;
        int minutos = tiempo * 60;
        int segundos = tiempo * 60;
        
        
         System.out.println("Milenios: " + milenios + " años");     
         System.out.println("Siglos:   " + siglos + " años");  
         System.out.println("Decadas:  " + decadas + " años");  
         System.out.println("Quinquenios: " + quinquenios + " años");  
         System.out.println("Años:     " + años+ " meses");
         System.out.println("Meses:    " + meses + " semanas");
         System.out.println("Semanas:  " + semanas + " días");
         System.out.println("Días      " + dias + " horas");
         System.out.println("Horas:    " + horas + " minutos");
         System.out.println("Minutos:  " + minutos + " segundos");
         System.out.println("Segundos: " + segundos + " decisegundos");
         System.out.println();
         
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("4.- Programa de Conversión de Unidades de Temperatura");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Introduce un número: ");
        int kelvin = teclado.nextInt();
        
        float microkelvin = kelvin / 1000000f;
        float milikelvin = kelvin  / 1000f;
        float centikelvin = kelvin / 100f;
        float decikelvin = kelvin / 10f;
        
        int decakelvin = kelvin * 10;
        int hectokelvin = kelvin * 100;
        long kilokelvin = kelvin * 1000;
        long megakelvin = kelvin * 1000000;
        
        
         System.out.println("Microkelvin:  " + microkelvin + " K");     
         System.out.println("Milikelvin:   " + milikelvin + " K");  
         System.out.println("Centikelvin:  " + centikelvin + " K");  
         System.out.println("Decikelvin:   " + decikelvin + " K");  
         System.out.println("Kelvin:       " + kelvin);
         System.out.println("Decakelvin:   " + decakelvin + " K");
         System.out.println("Hectokelvin:  " + hectokelvin + " K");
         System.out.println("Kilokelvin:   " + kilokelvin + " K");
         System.out.println("Megakelvin:   " + megakelvin + " K");
         System.out.println();
         
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("5.- Programa de Conversión de Unidades de Intensidad de Corriente Eléctrica ");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Introduce un número: ");
        int amperio = teclado.nextInt();
        
        float microamperio = amperio / 1000000f;
        float miliamperio = amperio/ 1000f;
        float centiamperio = amperio / 100f;
        float deciamperio = amperio / 10f;
        
        int decaamperio = amperio * 10;
        int hectoamperio = amperio * 100;
        long kiloamperio= amperio * 1000;
        long megaamperio= amperio * 1000000;
        
        
         System.out.println("Microamperio:  " + microamperio + " A");     
         System.out.println("Miliamperio:   " + miliamperio + " A");  
         System.out.println("Centiamperio:  " + centiamperio + " A");  
         System.out.println("Decaamperio    " + deciamperio + " A");  
         System.out.println("Amperio:       " + amperio);
         System.out.println("Decamperio:    " + decaamperio + " A");
         System.out.println("Hectoamperio:  " + hectoamperio + " A");
         System.out.println("Kiloamperio:   " + kiloamperio + " A");
         System.out.println("Megamperio:    " + megaamperio+ " A");
         System.out.println();
         
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("6.- Programa de Conversión de Unidades de Cantidad de Sustancia");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Introduce un número: ");
        int mol = teclado.nextInt();
        
        float micromol = mol / 1000000f;
        float milimol = mol / 1000f;        
        
         System.out.println("Micromolar:  " + micromol + " M");     
         System.out.println("Milimolar:   " + milimol + " M");  
         System.out.println();
         
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("7.- Programa de Conversión de Unidades de Intensidad Lumínica");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Introduce un número: ");
        int vatio = teclado.nextInt();
        
        float microvatio = vatio / 1000000f;
        float milivatio = vatio / 1000f;
        float centivatio = vatio / 100f;
        float decivatio = vatio / 10f;
        
        int decavatio = vatio * 10;
        int hectovatio = vatio * 100;
        long kilovatio = vatio * 1000;
        long megavatio = vatio * 1000000;
        
        
         System.out.println("Microvatio:  " + microvatio + " w");     
         System.out.println("Milivatio:   " + milivatio + " w");  
         System.out.println("Centivatio:  " + centivatio + " w");  
         System.out.println("Decivatio    " + decivatio + " w");  
         System.out.println("Vatio:       " + vatio);
         System.out.println("Decavatio:   " + decavatio + " w");
         System.out.println("Hectovatio:  " + hectovatio + " w");
         System.out.println("Kilovatio:   " + kilovatio + " w");
         System.out.println("Megavatio:   " + megavatio + " w");
         System.out.println();        
    }
    
}