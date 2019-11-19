package inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) {
		FileInputStream fis= null;
		FileOutputStream fos= null;
		File f=new File("fichier.txt");
		File fo=new File("fichierBis.txt");
		try {
			fis=new FileInputStream(f);
			fos=new FileOutputStream(fo);
			byte[] buf=new byte[20];
			int n;
			long t=System.currentTimeMillis();
			while((n=fis.read(buf))>=0) {
				
				for(int i=0;i<n; i++) {
					//System.out.print((char)buf[i]);
					fos.write(buf[i]);
				}
			}
			System.out.println();
			System.out.println("Time : "+(System.currentTimeMillis()-t));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
