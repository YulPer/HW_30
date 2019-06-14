package core;

import java.io.*;

public class Input_Text_FR {
	public static void main(String [] args) throws IOException{ //String file = args[0];
		File file = new File ("/Users/g3/input.txt");
		BufferedReader br = new BufferedReader (new FileReader (file));
		while (br.ready()) {
			String full_name = br.readLine();
			System.out.println("Full name is: " + full_name);
		}
		br.close();
	}
}
