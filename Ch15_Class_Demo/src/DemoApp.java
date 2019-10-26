import java.io.*;

import java.nio.file.*;
import java.time.LocalDateTime;

public class DemoApp {

	public static void main(String[] args) {

		String dirString = "/users/snyderja/bootcamp/fileio";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			try {
				Files.createDirectories(dirPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("File Creation Done");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("File name:     " + filePath.getFileName());
		System.out.println("Absolute path: " + filePath.toAbsolutePath());
		System.out.println("Is writeable?: " + Files.isWritable(filePath));

		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory: " + dirPath.toAbsolutePath());
			System.out.println("Files: ");
			try {
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
				for (Path p : dirStream) {
					if (Files.isRegularFile(p)) {
						System.out.println("   " + p.getFileName());
					}
				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		// Path productsPath = Paths.get("products.txt");
		File productsFile = filePath.toFile();

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)))) {

			// out.println("java\tMurach's Java Programming\t57.50");
			// out.print("This app was run on ");
			// LocalDateTime currentDateTime = LocalDateTime.now();
			// out.println(currentDateTime);

			Product p = new Product("java", "Murach's Java Programming", 57.50);
			Product p2 = new Product("C#", "Murach's C# Programming", 25.50);

			out.print(p.getCode() + "\t");
			out.print(p.getDescription() + "\t");
			out.println(p.getPrice());

			out.print(p2.getCode() + "\t");
			out.print(p2.getDescription() + "\t");
			out.print(p2.getPrice());

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader in = new BufferedReader(new FileReader(productsFile))) {

			String line = in.readLine();
			while (line != null) {
				String[] fields = line.split("\t");
				String code = fields[0];
				String description = fields[1];
				String price = fields[2];

				Product prd = new Product(code, description, Double.parseDouble(price));

				System.out.println(prd);
				line = in.readLine();

			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File input error");
			e.printStackTrace();
		}

	}

}
