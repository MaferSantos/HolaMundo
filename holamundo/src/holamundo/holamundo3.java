package holamundo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class holamundo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("quijote2.txt"));
			String cadena = "En lugar de la mancha";
			for(int i=0; i<cadena.length(); i++) {
				out.write(cadena.charAt(i));
				
			}
			cadena = "de cuyo nombre no quiero acordarme";
			out.newLine();
			out.write(cadena);
			out.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
