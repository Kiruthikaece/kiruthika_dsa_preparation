package files;

import java.io.*;


public class ReadAndWriteFile {

	public static void main(String[] args) throws IOException{
		
		
		File f=new File("C:/Users/Windows/eclipse-workspace/java_practice/information2.txt");
		if(f.createNewFile())
			System.out.println("create new file");
		else
			System.out.println("Already there");
		
		
		String readFile="C:/Users/Windows/eclipse-workspace/java_practice/src/main/java/files/information1";
		String writeFile="C:/Users/Windows/eclipse-workspace/java_practice/information2.txt";
		
		FileReader reader=new FileReader(readFile);
		FileWriter writer=new FileWriter(writeFile);
		int value;
		while((value=reader.read())!=-1) 
			writer.write(value);
		
		
		reader.close();
		writer.close();
		
		System.out.println("write succesfully");
		
		System.out.println(f.getAbsolutePath()+" absolutePath");
		System.out.println(f.getCanonicalPath() +" CanonicalPath");
		System.out.println(f.getName() +" name");
		System.out.println(f.lastModified());
		System.out.println(f.renameTo(f) +"rename");
		
		double bytes=f.length();
		System.out.println(bytes+"bytes");
		
		
		  System.gc(); // Force garbage collection to release file locks

	        // Adding a small delay before attempting deletion
	        try {
	            Thread.sleep(100); // Sleep for 100ms
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        if(f.delete())
	            System.out.println("File deleted successfully");
	        else
	            System.out.println("File deletion failed");
		
		
		
		
		
	}

}
