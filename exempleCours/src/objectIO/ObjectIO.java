package objectIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {
	public static void main(String []args) {
		BufferedInputStream bis= null;
		BufferedOutputStream bos= null;
		ObjectInputStream ois= null;
		ObjectOutputStream oos= null;
		File fo=new File("fichierBis.txt");
		try {
			bis=new BufferedInputStream(new FileInputStream(fo));
			bos=new BufferedOutputStream(new FileOutputStream(fo));
			oos=new ObjectOutputStream(bos);
			oos.writeObject(new Game("echeck","strategie",102.4d,new Player("said",23)));
			oos.close();
			ois=new ObjectInputStream(bis);
			Game g=(Game) ois.readObject();
			System.out.println(g.getPlayer().getName());
		} catch (Exception e) {
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
