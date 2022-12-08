package TsakApi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchJson {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//
//			FileReader fr = new FileReader("C:\\Users\\user018\\eclipse-workspace\\TASKAPI\\API.txt"); // Creation of		
//		// object

		File file = new File("C:\\Users\\user018\\eclipse-workspace\\TASKAPI\\API.txt");
		List<String> wordsOfList = new ArrayList<String>();
		String[] words = null;

		String input = null; // Input From user
		System.out.print("Please enter the words you want to Search | writ STOP to stop" + "\n");

		while (sc.hasNext()) {
			input = sc.nextLine(); // Input From user
			if (input.equalsIgnoreCase("STOP")) {
				break;
			}

			wordsOfList.add(input);
		}

		for (String set : wordsOfList) {

			FileReader fileReader = new FileReader(file);

			BufferedReader br = new BufferedReader(fileReader);
			String word;
			int count = 0;

			while ((word = br.readLine()) != null) {
				words = word.split(" ");

				for (String w : words) {
					if (w.contains(set)) {

						count++;

					}

				}
			}

			if (count > 1) {

				System.out.println(set + " " + "This word is Present for " + count + " Times in the File");
			} else if (count == 1) {

				System.out.println(set + " " + "This Word is Unique ");

			}

			else {
				System.out.println(set + " " + "This Word is not in the File");
			}

			fileReader.close();

		}

	}

}