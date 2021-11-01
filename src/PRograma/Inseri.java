package PRograma;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Inseri {
		
	public static void main(String[] args) {
		
		String [ ] lines = new String[ ] {"salve", "talvez", "deu certo" };
		
		String path = "C:\\Users\\felipe.silva\\frontFE\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
}
