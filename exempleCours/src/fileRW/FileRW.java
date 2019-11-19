package fileRW;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {
	public static void main(String[] args) {
		FileWriter fw= null;
		FileReader fr= null;
		File fo=new File("fichierBis.txt");
		try {
			fw=new FileWriter(fo);
			String str="Bonjour à Tous\nComment allez vous?";
			fw.write(str);
			fw.close();
			fr=new FileReader(fo);
			int c=0;
			while((c=fr.read())!=-1)System.out.print((char)c);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


}
