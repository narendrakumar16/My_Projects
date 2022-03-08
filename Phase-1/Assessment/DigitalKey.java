package com.assessment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DigitalKey {
	static class MainMenuOptions {

		public static void welcomeScreen() {

			System.out.println("Welcome to DigitalKey which is Developed by Narendrakumar\n");

			System.out.println("You can Retrieve all The FileNames, Search Files, Add Files, or Delete Files\n");
		}

		public static void displayMenu() {
			String menu = "\nSelect \n" + "1) To Retrieve all Files inside the Folder\n"
					+ "2) To Display Menu for The File Operations\n" + "3) To Exit a Program\n";
			System.out.println(menu);

		}

		public static void FileMenu() {
			String fileMenu = "\nSelect \n" + "1) To Add a File\n" + "2) To Delete a File\n"
					+ "3) To Search for a File\n" + "4) To Show Main Menu\n";

			System.out.println(fileMenu);
		}

	}

	public static void createFile(String folderName) {
		File file = new File(folderName);

		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public static void viewFiles(String path) {
		DigitalKey.createFile("Phase1Assessment");

		List<String> filesListNames = DigitalKey.allfiles(path, 0, new ArrayList<String>());

		System.out.println("Displaying all files in ascending order\n");

		filesListNames.stream().forEach(System.out::println);
	}

	private static List<String> allfiles(String path, int i, ArrayList<String> arrayList) {
		// TODO Auto-generated method stub
		File dir = new File(path);
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		if (files != null && files.length > 0) {
			for (File file : filesList) {
				arrayList.add(file.getName());
			}
		}

		return arrayList;

	}

	public static void createFile(String fileToAdd, Scanner sc) {
		DigitalKey.createFile("Phase1Assessment");
		Path pathToFile = Paths.get("./Phase1Assessment/" + fileToAdd);
		try {
			Files.createDirectories(pathToFile.getParent());
			Files.createFile(pathToFile);
			System.out.println(fileToAdd + " File was Created Successfully.");

		} catch (IOException e) {
			System.out.println("Failed to create file " + fileToAdd);
			System.out.println(e.getClass().getName());
		}
	}

	public static List<String> displayFile(String fileName, String path) {
		List<String> fileListNames = new ArrayList<>();
		DigitalKey.searchFile(path, fileName, fileListNames);

		if (fileListNames.isEmpty()) {
			System.out.println("\n We Couldn't Find any File with given FileName \"" + fileName + "\"\n");
		} else {
			System.out.println("\nFile Found  at below location(s):");

			List<String> files = IntStream.range(0, fileListNames.size())
					.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());

			files.forEach(System.out::println);
		}

		return fileListNames;
	}

	public static void searchFile(String path, String fileName, List<String> fileListNames) {
		File dir = new File(path);
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		if (files != null && files.length > 0) {
			for (File file : filesList) {

				if (file.getName().startsWith(fileName)) {
					fileListNames.add(file.getAbsolutePath());
				}

				if (file.isDirectory()) {
					searchFile(file.getAbsolutePath(), fileName, fileListNames);
				}
			}
		}
	}

	public static void deleteFile(String path) {

		File currFile = new File(path);
		File[] files = currFile.listFiles();

		if (files != null && files.length > 0) {
			for (File file : files) {

				String fileName = file.getName() + " at " + file.getParent();
				if (file.isDirectory()) {
					deleteFile(file.getAbsolutePath());
				}

				if (file.delete()) {
					System.out.println(fileName + "File was Deleted Successfully.");
				} else {
					System.out.println("Failed to Delete Your " + fileName + " File.");
				}
			}
		}

		String currFileName = currFile.getName() + " at " + currFile.getParent();
		if (currFile.delete()) {
			System.out.println(currFileName + "Is The Current FlieName As You Given ,it was Deleted Successfully");
		} else {
			System.out.println("Failed To Delete The Current FlieName As You Given " + currFileName);
		}
	}

	static class HandleOptions {
		public static void WelcomeScreen() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MainMenuOptions.displayMenu();
					int input = sc.nextInt();

					switch (input) {
					case 1:
						DigitalKey.viewFiles("Phase1Assessment");
						break;
					case 2:
						HandleOptions.FileMenu();
						break;
					case 3:
						System.out.println("Program Exited Successfully.");
						running = false;
						sc.close();
						System.exit(0);
						break;
					default:
						System.out.println("Please Select a Valid Option From The Above Menu.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					WelcomeScreen();
				}
			} while (running == true);
		}

		public static void FileMenu() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MainMenuOptions.FileMenu();
					DigitalKey.createFile("Phase1Assessment");

					int input = sc.nextInt();
					switch (input) {
					case 1:
						System.out.println("Enter The Name of the File to be Added");
						String fileToAdd = sc.next();

						DigitalKey.createFile(fileToAdd, sc);

						break;
					case 2:
						// File/Folder delete
						System.out.println("Enter The Name of the File to be Deleted");
						String fileToDelete = sc.next();

						DigitalKey.createFile("Phase1Assessment");
						List<String> filesToDelete = DigitalKey.displayFile(fileToDelete, "Phase1Assessment");

						String deletionPrompt = "\nSelect Index of a File to Delete?"
								+ "\nEnter 0, if you want to Delete.";
						System.out.println(deletionPrompt);

						int i = sc.nextInt();

						if (i != 0) {
							DigitalKey.deleteFile(filesToDelete.get(i - 1));
						} else {

							for (String path : filesToDelete) {
								DigitalKey.deleteFile(path);
							}
						}

						break;
					case 3:

						System.out.println(
								"Enter The Name of the File to be Searched From The\"Phase1Assessment\" Folder");
						String fileName = sc.next();

						DigitalKey.createFile("Phase1Assessment");
						DigitalKey.displayFile(fileName, "Phase1Assessment");

						break;
					case 4:

						return;

					default:
						System.out.println("Please Select a Valid Option From The Above Menu.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					FileMenu();
				}
			} while (running == true);
		}
	}

}
