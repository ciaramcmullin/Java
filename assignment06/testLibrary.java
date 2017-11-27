// Ciara McMullin
// Intro to Comp Sci
// 03 April 2017
// main class used to test the Book class;creates book objects and stores them in an array

import java.util.*;

public class testLibrary {
	
	public static void main(String[] args) {
		
		// get number of book objects to create
		
		Scanner input = new Scanner (System.in);
		System.out.println("How many books would you like to enter: ");
		int numBooks = input.nextInt();
		
		
		// make array to store book objects
		
		Book [] libSystem = new Book[numBooks];
		
		// loop through library system and get book information from user
		
		for (int i = 0; i < libSystem.length; i++) {
			
			libSystem [i] = new Book();
			input.nextLine();
			System.out.println("Please enter the title:");
			String title = input.nextLine();
			libSystem [i].setTitle(title);
			
			System.out.println("Please enter the author:");
			String author = input.nextLine();
			libSystem [i].setAuthor(author);
			
			System.out.println("Please enter the year published: ");
			int year = input.nextInt();
			libSystem [i].setYearPublished(year);
			
			System.out.println("Please enter how many pages the book has: ");
			int pages = input.nextInt();
			libSystem [i].setPageCount(pages);
			
			System.out.println("Please enter the genre: ");
			String genre = input.next();
			libSystem[i].setGenre(genre);
			}
		
		// call method to print out book information for all book objects in library system
		
		bookSummary(libSystem);
		}
	
		// create method to print out book summary

		public static void bookSummary(Book[] books) {
			
			for (int j =0; j < books.length; j++){
				String title = books[j].getTitle();
				String author = books[j].getAuthor();
				int year = books[j].getYearPublished();
				int pages = books[j].getPageCount();
				String genre = books[j].getGenre();
				
				System.out.println(title + " written by " + author + " was published in " + year + ", has " + pages + " pages and"
						+ " is of the " + genre + " genre.");
			}
			
			System.out.println("There are " + Book.RunCount() + " books in the system");
		}
		
	}


	


