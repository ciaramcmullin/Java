// Ciara McMullin
// Intro to Comp Sci
// 03 May 2017
// a program designed to read data from url and create new text file with replaced words

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class CloudToButt {
	public static void main(String[] args){
	
		try{
			URL cloud = new URL("http://cs.nyu.edu/courses/spring16/CSCI-UA.0101-008/assignments/text/cloud_article.txt");
			URLConnection conn = cloud.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("butt.txt"))));
			String inputLine;
			
			while((inputLine = br.readLine()) != null){
				System.out.println(inputLine);
				inputLine = inputLine.replaceAll("\\bcloud\\b", "butt");
				inputLine = inputLine.replaceAll("\\bCloud\\b", "Butt");
				System.out.println(inputLine);
				pw.write(inputLine);
				
			}
			
			
			pw.close();
			br.close();
			
			System.out.println("done");
		
		}
		catch (MalformedURLException ex){
			System.out.println("File not found" + ex);
		}
		catch(IOException iox){
			System.out.println(iox);
		}
	
		
	}
		
	

}
