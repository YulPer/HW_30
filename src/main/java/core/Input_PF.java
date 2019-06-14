package core;

import java.io.*;
import java.util.*;

public class Input_PF {
	public static void main(String [] args) throws IOException{ //String file = args[0];
		String file =  "/Users/g3/input.properties";
		Properties p = new Properties ();
		p.load(new FileInputStream(file));
		
		String first_name = p.getProperty("f_name");
		String last_name = p.getProperty("l_name");
		System.out.println("Full name is: " + first_name + " " + last_name);
	
		p.clear();
	}
}
