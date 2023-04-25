import java.io.*;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			int data = 0;
			while ((data=fis.read()) != -1)
				System.out.println((char) data);
			System.out.println("No output!!!");
		}

	}
}