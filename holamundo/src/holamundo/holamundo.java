package holamundo;

import java.io.FileReader;
import java.io.IOException;

public class holamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto="";
		try {
			FileReader in = new FileReader("C:\\Users\\fca\\Desktop\\Hola Mundo.docx");
			int c = in.read();
			while(c !=-1) {
				texto = texto+(char)c;
				c=in.read();
			
			}
			in.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println(texto);
	}

}
