import java.io.*;

public class FileIOStream{

	public static void main(String[] args) throws IOException{
		
		FileInputStream inFile = new FileInputStream("Text.txt");
		FileOutputStream outFile = new FileOutputStream("Text2.txt");

		int sum;

		while(inFile.available()>0){
			sum = inFile.read();
			outFile.write(sum);
		}

		inFile.close();
		outFile.close();
	}
}