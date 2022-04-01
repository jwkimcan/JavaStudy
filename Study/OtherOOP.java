import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));

		FileWriter f1 = new FileWriter("data.txt");

		f1.write("Hello");
		f1.write("java");
		f1.close();
		
		FileWriter f2 = new FileWriter("dat2.txt");

		f2.write("Hello");
		f2.write("java2");
		f2.close();

	}

}
