package enum_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Accept a string  
		String path="C:\\Users\\anike\\eclipse-workspace\\Assignment\\src\\enum_IO\\input.txt";
		try {
			FileInputStream fin=new FileInputStream(path);
//			BufferedReader br=new BufferedReader(fw);
			FileOutputStream fp=new FileOutputStream("C:\\Users\\anike\\eclipse-workspace\\Assignment\\src\\enum_IO\\abc.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				fp.write((char)i);
				System.out.print((char)i+"");
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("File not find ");
		}
		
	}

}

