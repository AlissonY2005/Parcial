/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;
import java.math.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double disc;
		double k;
		double x;
		double x1;
		double x2;
		double z;
		System.out.println("Ingrese los valores de A, B, C");
		a = Double.parseDouble(bufEntrada.readLine());
		b = Double.parseDouble(bufEntrada.readLine());
		c = Double.parseDouble(bufEntrada.readLine());
		disc = Math.pow(b,2)-(4*a*c);
		if (disc==0) {
			x = -b/(2*a);
			System.out.println("Es u trinomio cuadrado perfecto y X="+x);
		} else {
			if (disc>0) {
				x1 = (-b-Math.sqrt(disc))/(2*a);
				x2 = (-b+Math.sqrt(disc))/(2*a);
				System.out.println("Tiene dos soluciones reales, X1="+x1+"y X2="+x2);
			} else {
				k = (-b)/(2*a);
				z = (Math.sqrt(Math.abs(disc)))/(2*a);
				System.out.println("Tiene dos soluciones complejas X1="+k+"+"+z+"i y X2="+k+"-"+z+"i");
			}
		}
	}


}

