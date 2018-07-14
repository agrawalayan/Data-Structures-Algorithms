class Mathematical_Operation{
	int[] digit_seperation(int string_length,int numeric_string_number){
		int seperated_digit[] = new int [string_length];
		for (int i = string_length -1;i>=0; i--){
			seperated_digit[i] = numeric_string_number%10;
			numeric_string_number = numeric_string_number/10;
		}
		return seperated_digit; 
	}
}