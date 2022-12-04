package TsakApi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchJson {
	public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	
	String[] words=null;  //Intialize the word Array
    FileReader fr = new FileReader("C:\\Users\\user018\\eclipse-workspace\\TASKAPI\\API.txt");  //Creation of File Reader object
    BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
    String s; 
    
    //while
    System.out.println("Enter Word");
    String input=sc.next(); // Input word to be searched
    
    
    
    List<String> WordsList = new ArrayList<>();
    
    
    
    //
    
    
    int count=0;  //Intialize the word to zero
    while((s=br.readLine())!=null)   //Reading Content from the file
    {
    	s=s.replaceAll("\\W", " ") ;
       words=s.split(" ");//Split the word using space
        for (String word : words) 
        {
               if (word.equals(input))   //Search for the given word
               {
                 count++;    //If Present increase the count by one
               }
        }
    }
    if(count!=0)  //Check for count not equal to zero
    {
       System.out.println("The given word is present for "+count+ " Times in the file");
    }
    else
    {
       System.out.println("The given word is not present in the file");
    }
    
       fr.close();
}
}
