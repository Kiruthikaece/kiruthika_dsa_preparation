package files;

import java.io.*;

public class ReadFromConsoleWriteFile {

	public static void main(String[] args) throws IOException {
		
		String writeFile="C:/Users/Windows/eclipse-workspace/java_practice/information2.txt";
		
		FileOutputStream  fos=new FileOutputStream(writeFile,true);
		
		
		
		int val=System.in.read();
		
		while(val!=-1) {
			fos.write(val);
			val=System.in.read();
		}
		
		
		
		System.out.println("Write file from console input");
		
	

	}

}
