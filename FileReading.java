package javaProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FileReading extends BaseTestNG {
	@Test(priority = 1)
	public void readUsingBuffer() throws IOException {
		String str;
		File file = new File("./src/main/Resources/config.properties");
		BufferedReader br = new BufferedReader(new FileReader(file));

		while ((str = br.readLine()) != null)
			System.out.println(str);

		br.close();
	}
    @Test(priority=2)
	public void readUsingReader() throws IOException {
		int i;
		FileReader reader = new FileReader("./src/main/Resources/config.properties");
		while ((i = reader.read()) != -1)
			System.out.println((char) i);
		reader.close();
		System.out.println("");
	}
    @Test(priority=3)
    public void readUsingScanner() throws FileNotFoundException {
		File file = new File("./src/main/Resources/config.properties");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
		sc.close();

	}
    
    
	
	

}
