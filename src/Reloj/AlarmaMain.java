/**
 *
 * @author Ana Lucia Hernandez. 17138
 * @since 13, Oct, 2017
 * @purpose clase main
 * AlarmaMain.java
 * 
 */
package Reloj;

public class AlarmaMain {
	public static void main(String[] args) {
		AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
		alarmaIncendio.m1();                  // emergencia 1
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
		System.out.println(alarmaIncendio);   // emergencia Ringâ€¦Ringâ€¦Ringâ€¦Ring
	}
}
