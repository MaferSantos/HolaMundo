package holamundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class holamundo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto ="";
		try {
			BufferedReader in = new BufferedReader (new FileReader("C:\\Users\\fca\\Desktop\\Hola mundo.txt"));
			String linea = in.readLine();
			while(linea!=null)
			{
				texto=texto + linea + '\n';
				linea=in.readLine();
			}
			in.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println(texto);
	}

}
