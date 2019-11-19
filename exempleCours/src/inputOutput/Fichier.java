package inputOutput;

import java.io.File;

public class Fichier {

	public static void main(String[] args) {
		File d =new File("/");
		int n=0;
		if(d.exists())
			for(File f : d.listFiles()) {
				System.out.printf("%d- %-15s \t",n+1, f.getName());
				n++;
				if((n%4)==0) System.out.println();
			}
		else System.out.println("Ce dossier n existe pas");
	}

}
