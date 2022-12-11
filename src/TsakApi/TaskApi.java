package TsakApi;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TaskApi {

	static void MenueTask() {
		System.out.println("Please Choice one Option:");
		System.out.println("1- Consume API and Write File:");
		System.out.println("2- Search word from File:");
		System.out.println("3- Search word from PDF:");
		System.out.println("4- Exite:");
	}

	public static void main(String[] args) throws IOException {

		boolean isExit = true;
		while (isExit) {
			MenueTask();
			Scanner sc = new Scanner(System.in);

			int select = sc.nextInt();

			switch (select) {
			case 1:
				try {
					HttpClient client = HttpClient.newHttpClient();
					HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://catfact.ninja/fact"))
							.build();
					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					System.out.println("My Json is : " + response.body());
					String writeToFile = response.body();
					FileWriter file = new FileWriter("TaskAPI.txt");
					file.write(writeToFile.toString());
					file.close();

				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("JSON file created !!");
				System.out.println("                    ");
				System.out.println("                    ");
				break;
				
			case 2:

				SearchJsonT SearchJsonTObj = new SearchJsonT();
				SearchJsonTObj.searchJs();
			        
			        
			     
				break;
				
				
			case 3:
				ReadPDF SearchPDF = new ReadPDF();
				SearchPDF.readUsingPdfBox();
				
				break;

			case 4:
				System.out.println("Done");
				System.exit(0);
				break;

			}

		}
		isExit = false;

	}
}
