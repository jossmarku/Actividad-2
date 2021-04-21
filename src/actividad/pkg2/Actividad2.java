
package actividad.pkg2;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("PRIMERA ACTIVIDAD");
        /*  Crear un horario de usted de cualquier día de la semana, ej: 6 Despertar, 7 Clase LP1, 8 Clase LP1, 9 Clase Estructuras, 10 …, 21 Dormir, 
        leer un valor de 1  al 24 validar e imprimir la acción que realiza en su horario. */
        
        Scanner miConsola = new Scanner(System.in);
        
        System.out.println("Dime un valor entero del 1 al 24 para saber una acción de mi horario:");
        int valor = miConsola.nextInt();
        
        switch (valor) {
            case 23, 24, 1, 2, 3, 4, 5:
                System.out.println("Dormir");
                break;
            case 6:
                System.out.println("Despertar y desayunar");
                break;
            case 7:
                System.out.println("Tomar clase de Administraciónn General");
                break;
            case 8, 9:
                System.out.println("Tomar clase de Organización Computacional");
                break;
            case 10, 11:
                System.out.println("Tomar clase de Física");
                break;
            case 12, 13, 14:
                System.out.println("Hacer tareas");
                break;
            case 15:
                System.out.println("Almorzar");
                break;
            case 16:
                System.out.println("Bañarse");
                break;
            case 17, 18:
                System.out.println("Estudiar");
                break;
            case 19, 20, 21:
                System.out.println("Jugar videojuegos");
                break;
            case 22:
                System.out.println("Cenar");
                break;
            default:
                System.out.println("El valor no es válido");      
        }
        
        System.out.println("\n");
        
        
        System.out.println("SEGUNDA ACTIVIDAD");
        // Crear un metodo que determine si es el día es habil (lunes a viernes), y emitir un mensaje o en su caso emitir un mensaje que es fin de semana.
        
        System.out.println("Dime un día de la semana de acuerdo al siguiente criterio:\nLunes = 1\nMartes = 2\nMiércoles = 3\nJueves = 4\nViernes = 5\nSábado = 6\nDomingo = 7");
        int dia = miConsola.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes es un día hábil");
                break;
            case 2:
                System.out.println("Martes es un día hábil");
                break;
            case 3:
                System.out.println("Miércoles es un día hábil");
                break;
            case 4:
                System.out.println("Jueves es un día hábil");
                break;
            case 5:
                System.out.println("Viernes es un día hábil");
                break;
            case 6:
                System.out.println("Sábado es fin de semana");
                break;
            case 7:
                System.out.println("Domingo es fin de semana");
                break;
            default:
                System.out.println("El valor no es válido");
        }
        
        System.out.println("\n");
        
        System.out.println("TERCERA ACTIVIDAD");
        /* Crear un metodo que lea un valor entero del 1 al 12 valide el valor y  nos diga en que trimestre del año nos encontramos 
        (Primer trimestre, Segundo Trimestre, Tercer Trimeste, Cuarto Trimestre) */
        
        System.out.println("Dime un valor entero del 1 al 12:");
        valor = miConsola.nextInt();
        
        if (valor >= 1 && valor <= 3) {
            System.out.println("Nos encontramos en el primer trimestre");
        } else if (valor >= 4 && valor <= 6) {
            System.out.println("Nos encontramos en el segundo trimestre");
        } else if (valor >= 7 && valor <= 9) {
            System.out.println("Nos encontramos en el tercer trimestre");
        } else if (valor >= 10 && valor <= 12) {
            System.out.println("Nos encontramos en el cuarto trimestre");
        } else {
            System.out.println("El valor no es válido");
        }
        
        }
    }
    
