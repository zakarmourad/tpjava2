package bufferdIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdIO {
	public static void main(String[] args) {
		BufferedInputStream bis= null;
		BufferedOutputStream bos= null;
		File f=new File("fichier.txt");
		File fo=new File("fichierBis.txt");
		try {
			bis=new BufferedInputStream(new FileInputStream(f));
			bos=new BufferedOutputStream(new FileOutputStream(fo));
			byte[] buf=new byte[20];
			int n;
			long t=System.currentTimeMillis();
			while((n=bis.read(buf))>=0) {
				
				//for(int i=0;i<n; i++) {
					//System.out.print((char)buf[i]);
					bos.write(buf);
				//}
			}
			System.out.println();
			System.out.println("Time : "+(System.currentTimeMillis()-t));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
