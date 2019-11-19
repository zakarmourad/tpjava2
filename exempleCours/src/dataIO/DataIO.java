package dataIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIO {
	public static void main(String[] args) {
		BufferedInputStream bis= null;
		BufferedOutputStream bos= null;
		DataInputStream dis= null;
		DataOutputStream dos= null;
		File fo=new File("fichierBis.txt");
		try {
			bos=new BufferedOutputStream(new FileOutputStream(fo));
			dos=new DataOutputStream(bos);
			dos.writeByte(65);
			dos.writeInt(65);
			dos.writeFloat(65.78f);
			dos.writeDouble(65.890d);
			bos.close();
			
			bis=new BufferedInputStream(new FileInputStream(fo));
			dis=new DataInputStream(bis);
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dis.close();
				
				bis.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


}
