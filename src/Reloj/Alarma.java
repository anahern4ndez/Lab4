
package Reloj;

/**
 *
 * @author Ana Lucia Hernandez. 17138
 * @since 13, Oct, 2017
 * @purpose modelar la informacion extra de una alarma
 * Alarma.java
 * 
 */

public class Alarma extends Timbre 
{
/**
 *
 * Metodo para imprimir "alarma 1"
 */
    public void m1() {
		System.out.println("alarma 1");
	}
/**
 *
 * Metodo para imprimir el "timbre 2" de la clase padre
 * @override al metodo de la clase padre
 */
	 
	public void m2() {
		super.m1();
	}
/**
 *
 * Metodo para imprimir el objeto
 */	 
	public String toString() {
		return super.toString() + "..." + super.toString();
	}
}
