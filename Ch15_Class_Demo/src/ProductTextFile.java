import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ProductTextFile implements DAO<Product> {

	private List<Product> products = null;
	private Path productsPath = null;
	private File productsFile = null;
	private final String TAB = "\t";

	private final String PRODUCTS_URI = "/users/snyderja/bootcamp/fileio/products.txt";

	public ProductTextFile() {
		productsPath = Paths.get(PRODUCTS_URI);
		productsFile = productsPath.toFile();
		products = this.getAll();
	}

	@Override
	public Product get(String code) {
		for (Product p : products) {
			if (p.getCode().equals(code)) {
				return p;
			}
		}
		return null;
	}

	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)))) {

			for (Product p : products) {
				out.print(p.getCode() + TAB);
				out.print(p.getDescription() + TAB);
				out.println(p.getPrice());
			}

			return true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Product> getAll() {
		if (products != null) {
			return products;
		}

		products = new ArrayList<>();
		if (Files.exists(productsPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(productsFile))) {

				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(TAB);
					String code = fields[0];
					String description = fields[1];
					String price = fields[2];

					Product p = new Product(code, description, Double.parseDouble(price));

					products.add(p);

					line = in.readLine();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println(productsPath.toAbsolutePath() + "dosent exist.");
			return products;
		}

		return products;
	}

	@Override
	public boolean add(Product p) {
		products.add(p);
		return this.saveAll();
	}

	@Override
	public boolean update(Product newProduct) {
		Product oldProduct = this.get(newProduct.getCode());
		int i = products.indexOf(oldProduct);
		products.remove(i);

		products.add(i, newProduct);
		return this.saveAll();
	}

	@Override
	public boolean delete(Product p) {
		products.remove(p);
		return this.saveAll();
	}

}
