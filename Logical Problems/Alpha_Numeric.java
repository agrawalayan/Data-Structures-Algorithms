/* Author : Ayan Agrawal */

import java.util.Scanner;


class Alpha_Numeric{
	protected char lookup_table(int index){
		char Alpha_Numeric_Lookup[] = new char [26];
		
		/*(char)65 ----> 'A'*/
		for (int i=0; i<26; i++){
			Alpha_Numeric_Lookup[i] = (char)(65+i);
		}
		return Alpha_Numeric_Lookup[index];
	}
	
	String string_input(Validation_Check validation_check){
		String numeric_string = "";
		Scanner sc = new Scanner(System.in);
		numeric_string = sc.next();
		int check = validation_check.numeric_string_validation(numeric_string);
		if (check ==1){
			if (numeric_string.charAt(0)!='0'){
				return numeric_string;
			}
			else{
				System.out.println("The String should not start from 0");
				return "";
			}
		}
		else{
			return "";
		}	
	}
	int string_to_int_conversion(String numeric_string){
		int numeric_string_number =0;
		numeric_string_number = Integer.parseInt(numeric_string);
		return numeric_string_number;
	}
	
	int[] digit_seperation(int string_length,int numeric_string_number){
		int seperated_digit[] = new int [string_length];
		for (int i = string_length -1;i>=0; i--){
			seperated_digit[i] = numeric_string_number%10;
			numeric_string_number = numeric_string_number/10;
		}
		return seperated_digit; 
	}
	
	void number_of_word(int[] number,int string_length){
		int word_count = 0;
		int FLAG = 1;
		for (int i = 0;i < string_length;i++){
			if (number[i] != 0){
				continue;
			}
			else{
				FLAG = 0;
				break;
			} 	
		}
		if (FLAG == 1){
			word_count+=1;
			System.out.print("Word "+ word_count + ": ");	
			for (int i =0; i< string_length; i++){
				System.out.print(lookup_table(number[i]-1));
			}
		}
		
	
	}
	
	int countDecodingDP(int[] digits,int n){
	// A table to store results of subproblems
    int count[] = new int[n+1] ; 
    count[0] = 1;
    count[1] = 1;
 
    for (int i = 2; i <= n; i++)
    {
        count[i] = 0;
		System.out.println("Before If for i = " + i);
        System.out.println("count[" + i+ "] :" + count[i]);
        // If the last digit is not 0, then last digit must add to
        // the number of words
        if (digits[i-1] > 0){
			System.out.println("In first If for i = " + i);
            count[i] = count[i-1];
			System.out.println("count[" + i+ "] :" + count[i]);
		}
        // If second last digit is smaller than 2 and last digit is
        // smaller than 7, then last two digits form a valid character
        if (digits[i-2] < 2 || (digits[i-2] == 2 && digits[i-1] < 7) ){
			System.out.println("In second If for i = " + i);
            count[i] += count[i-2];
			System.out.println("count[" + i+ "] :" + count[i]);
		}	
    }
    return count[n];
}
	
	public static void main(String args[]){
		System.out.println("-----------------Implementing Alpha_Numeric------------------------");
		Alpha_Numeric alpha_numeric = new Alpha_Numeric();
		Validation_Check validation_check = new Validation_Check();
		System.out.println("Input a string of numbers");
		String numeric_string = alpha_numeric.string_input(validation_check);
		if (numeric_string != ""){		
			int numeric_string_number = alpha_numeric.string_to_int_conversion(numeric_string);
			int[] number = alpha_numeric.digit_seperation(numeric_string.length(),numeric_string_number);
			System.out.println(alpha_numeric.countDecodingDP(number,numeric_string.length()));
			//alpha_numeric.number_of_word(number,numeric_string.length());
		}	
	}
}	