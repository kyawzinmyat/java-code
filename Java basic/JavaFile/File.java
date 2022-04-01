

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		File test = new File("text.txt");
		try {
			if (test.createNewFile()) {
				System.out.println("File is created successfully");
			}else {
				System.out.println("File is not created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		writeFile(test);
		readFile(test);
		
		
		
		
	}
	
	public static void readFile(File fileToRead){
		
			try{
					Scanner s = new Scanner(fileToRead);
					while(s.hasNext()){
							System.out.println(s.nextLine());
						}
				}catch(Exception e){
						e.printStackTrace();
					}
		}
	
	public static void writeFile(File file){
			try{
				PrintWriter p = new PrintWriter(file);
				p.println("This is best");
				p.print("Oh my lord");
				p.close();
			}catch(Exception e){
					e.printStackTrace();
				}
			
		}



}