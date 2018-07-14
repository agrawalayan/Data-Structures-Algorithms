/* Author : Ayan Agrawal */

import java.io.*;

class Validation_Check{
	int numeric_string_validation(String numeric_string){
		try {
			if (numeric_string.matches("[0-9]+")){
				return 1;
			}	
			else{
				IOException e = new IOException();	
				throw e;
			}	
		} catch(Exception error){
			System.out.println("Please input Numbers from [0-9]");
			return 0;
		} 
				
	}
}	