import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VirtualKey {
	public static void listingFile() {
		File fileDir = new File("E:\\vk");
		// Creating the directory
		fileDir.mkdir();

		if (fileDir.isDirectory()) {
			List<String> listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");
			for (String s : listFile) {
				System.out.println(s);

			}
		}

//            just for practice writing in descending order.
//            System.out.println("---------------------------------------");
//            System.out.println("Sorting by filename in descending order");
//            Collections.sort(listFile,Collections.reverseOrder());
//            for(String s:listFile){
//                System.out.println(s);
//            }

		else {
			System.out.println(fileDir.getAbsolutePath() + " not a directory");
		}
		VirtualKey.mainMenu();

	}

	public static void createFile() {
//        Scanner sc = new Scanner(System. in ); //object of Scanner class
//        System.out.println("Enter the file name : ");
//        String name = sc.nextLine(); //variable name to store the file name
		File file = new File("E:\\vk");
		// Creating the directory
		file.mkdir();

		Scanner sc = new Scanner(System.in); // object of Scanner class
		System.out.println("Enter file name : ");
		String name = sc.nextLine(); // variable name to store the file name
		File file1 = new File("E:\\vk\\" + name);

		try {
			if (file1.createNewFile()) {
				System.out.println("File Created :)");
				VirtualKey.fileMenuOperations();
			} else {
				System.out.println("File exists :(");
				VirtualKey.fileMenuOperations();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void deleteMethod() {
		String filename;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Name of File to Delete: ");
		filename = scan.nextLine();

		File file = new File("E:\\vk\\" + filename);

		if (file.delete()) {
			System.out.println("File deleted");
			VirtualKey.fileMenuOperations();
		} else {
			System.out.println("Oops! File not found. ");
			VirtualKey.fileMenuOperations();
		}

	}

	public static void searchMethod() {
		System.out.println("Enter the file name to search");
		Scanner s1 = new Scanner(System.in);
		String folderName = s1.next();
		File file = new File("E:\\vk\\" + folderName);

		if (file.exists()) {
			System.out.println("Yes! File found!! :)" + "\n" + "This is the file location");
			System.out.println(file.getAbsolutePath());
			VirtualKey.fileMenuOperations();
		} else {
			System.out.println("Sorry ! File Not Found :(");
			VirtualKey.fileMenuOperations();
		}

//        try {
//            PrintWriter pw = new PrintWriter(file);
//            pw.println("saved");
//            pw.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }

	}

	public static void mainMenu() {
		System.out.println("Please select one the following");
		System.out.println("1 For current file names in ascending order ");
		System.out.println("2 For your Business Operation");
		System.out.println("3 To exit application");

	}

	public static void fileMenuOperations() {

		System.out.println("Please choose one from following options :");
		System.out.println("1. Create a file");
		System.out.println("2. Delete a File");
		System.out.println("3. Search for a File");
		System.out.println("4. Main menu");
		Scanner sc2 = new Scanner(System.in);
		try {

			int choice = sc2.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You had selected to create a file");
				createFile();

				break;
			case 2:
				System.out.println("You had selected to Delete a file");
				deleteMethod();
				break;
			case 3:
				System.out.println("You had Selected to search a file");
				searchMethod();
				break;
			case 4:
				System.out.println("Back to Main Menu");
				VirtualKey.mainMenu();
				break;
			}

		} catch (Exception e) {
			System.out.println("Oops! Please Enter valid number");
			VirtualKey.fileMenuOperations();
		}

	}

	public static void main(String[] args) {

		System.out.println("********");
		System.out.println("Welcome :) ");
		System.out.println("Virtual Key");
		System.out.println("Develop by Maneesh");
		System.out.println("********");

		Scanner sc = new Scanner(System.in);
		VirtualKey.mainMenu();
		while (true) {

			try {

				int option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("List of files in ascending");
					listingFile();
					break;
				case 2:
					VirtualKey.fileMenuOperations();
					break;

				case 3:
					System.out.println("Have a great day!! Thanks for using  ");
					System.out.println("Application closed");

					System.exit(option);
					break;
				default:
					System.out.println("Sorry! please enter the valid number");
					break;

				}
			} catch (Exception e) {
				System.out.println("Sorry!! Please Enter valid number");
				VirtualKey.main(args);
			}
		}
	}
}