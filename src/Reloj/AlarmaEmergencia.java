/**
 *
 * @author Ana Lucia Hernandez. 17138
 * @since 13, Oct, 2017
 * @purpose modelar la informacion extra de una alarma de emergencias
 * AlarmaEmergencia.java
 * 
 */

package Reloj;

public class AlarmaEmergencia extends Alarma 
{
/**
 *
 * Metodo para imprimir emergencia 1
 */
    
	public void m1() {
		System.out.println("emergencia 1");
	}
/**
 *
 * Metodo para imprimir emergencia 1
 */
	public void m2() {
		super.m1();
		super.m2();
	}
/**
 *
 * Metodo para imprimir una cadena String 
 * @return String con el texto deseado
 */	 
	public String toString() {
		return "emergencia " + super.toString();
	}
}
