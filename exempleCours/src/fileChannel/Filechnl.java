package fileChannel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Filechnl {

	public static void main(String[] args) {
		FileInputStream fis= null;
		FileChannel fc=null;
		File f=new File("fichierBis.txt");
		try {
			fis=new FileInputStream(f);
			fc=fis.getChannel();
			int size=(int)fc.size();
			ByteBuffer bBuf=ByteBuffer.allocate(size);
			fc.read(bBuf);
			bBuf.flip();
			byte[] a=bBuf.array();
			for(byte b: a) 
				System.out.print((char)b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fc.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

}
