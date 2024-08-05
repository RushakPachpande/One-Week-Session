
package library;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
	String[] books = new String[10]; /* Max Capacity of Array = 10 */
	int index = 0; /* For determining the current capacity of the Array */
	int choice;
	Scanner sc = new Scanner(System.in);

	public void display() {
		do {
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Search Book");
			System.out.println("4. List all Books");
			System.out.println("5. Sort Books");
			System.out.println("6. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addBook();
				break;

			case 2:
				removeBook();
				break;

			case 3:
				sc.nextLine();
				System.out.print("Enter Title : ");
				String title = sc.nextLine();
				int result = searchBook(title);
				System.out.println("Book Found at index : " + result);
				break;

			case 4:
				listBooks();
				break;

			case 5:
				sortBooks();
				break;

			case 6:
				System.out.println("Exiting...");
				break;
			}
		} while (choice != 6);
	}

	// Method to search for a book title and return its index if found
	public int searchBook(String title) {
		for (int i = 0; i < index; i++) {
			if (books[i].equals(title)) {
				return i;
			}
		}
		return -1;
	}

	public void addBook() {
		sc.nextLine();
		System.out.print("Enter Title : ");
		String title = sc.nextLine();
		if (searchBook(title) == -1) {
			books[index] = title;
			index++;
			System.out.println(title + " added.");
		} else {
			System.out.println("Book already exists.");
		}
	}

	// Method to remove a specific book title from the array
	public void removeBook() {
		sc.nextLine();
		System.out.print("Enter Title : ");
		String title = sc.nextLine();
		int temp = searchBook(title);
		if (index != -1) {
			for (int i = temp; i < index - 1; i++) { // index-1 bcoz after adding book, index gets +1 but it has no value in it
				books[i] = books[i + 1];
			}
			books[index - 1] = null;
			index--;
			System.out.println(title + "\" removed.");
		} else {
			System.out.println(title + "\" not found in the list.");
		}
	}

	public void listBooks() {
		if (index == 0) {
			System.out.println("No books in the library.");
		} else {
			System.out.println("-----------------------");
			System.out.println("Books in the library:");
			for (int i = 0; i < index; i++) {
				System.out.println((i + 1) + ". " + books[i]);
			}
			System.out.println("-----------------------");
		}
	}

	public void sortBooks() {
//		Arrays.sort(books);
		Arrays.sort(books, 0, index);
		System.out.println("Books sorted alphabetically.");
	}

	public static void main(String[] args) {
		Library library = new Library();
		library.display();
		System.out.println("Thankyou");
	}
}
