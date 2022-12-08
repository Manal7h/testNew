package TsakApi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class ReadWriteFile {
	
	
	static void MenueMain(){
		System.out.println("Please Choice one Option:");
		System.out.println("1- Read File:");
		System.out.println("2- Search word from File:");
		System.out.println("3- Exite:");
	}
	
	
	public static void main(String[] args) throws IOException {
		boolean isExit = true;
		while (isExit) {
			Scanner sc = new Scanner(System.in);
			
			MenueMain();
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				try {
					File myObj = new File("C:\\\\Users\\\\user018\\\\eclipse-workspace\\\\TASKAPI\\\\API.txt");
					Scanner myReader = new Scanner(myObj);
					while (myReader.hasNextLine()) {
						String data = myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();
				}
				catch (Exception e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				
				break;
				
				case 2:
					SearchJsonT SearchJsonTObj = new SearchJsonT();
					SearchJsonTObj.searchJs();
					
				break;
	
			case 3:
				 System.out.println("Done");
				 System.exit(0);
				break;
			}
			
		}
		isExit=false;
	}

}
