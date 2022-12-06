package TsakApi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchJson {
	public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);

    

    System.out.println("Enter number of words:");
    Integer num=sc.nextInt();
    String input; // Input num of word to be searched
    
    List<String> WordsList = new ArrayList<>();
    System.out.println("Enter number of words:" +num + "word :");
    
    for(int i=0 ; i<num; i++) {
    	String[] words=null;//Intialize the word Array		
    	FileReader fr = new FileReader("C:\\Users\\user018\\eclipse-workspace\\TASKAPI\\API.txt");  //Creation of File Reader object
    	BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
    	
    	
    	
    	int count=0;  //Intialize the word to zero
    	String s; 
    	input=sc.next();
    	
    	
    	String input = null;
    	Set<String> set = new LinkedHashSet<>();
    	String[] words;
    	List<String> WordsList = new ArrayList<>();
    	System.out.println("Enter name of .txt file to search from :");
    	String fileName= sc.next();
    	
    	System.out.println("Enter words:");
    	boolean w = true;
    	while(w) //Reading Content from the file{
    		
    		
    	}
    	
    }

    
   
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
