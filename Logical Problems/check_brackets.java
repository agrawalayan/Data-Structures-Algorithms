import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
/*
class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}
*/
class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
		//System.out.println("Enter the String");
        String text = reader.readLine();
		check_brackets brackets = new check_brackets();
		brackets.bracket_check(text);
	}
	int bracket_check(String text){
        Stack<Character> stack = new Stack<Character>();
		int flag = 0;
		int pos =0;
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
				stack.push(next);
				flag =1;
				pos = position;
            }
			
			/*
            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
            }
			*/
			else if(next == ']') {
				flag =0;
                if(stack.isEmpty()){	
					System.out.println(position+1);
					return 0;
				}	
                if(stack.pop() != '['){	
					System.out.println(position+1);
					return 0;
				}
				if(!(stack.isEmpty()) && flag==0){	
				flag =1;
				pos = pos -1;
				//pos = position;
				}
					

            }else if(next == ')') {
				flag =0;
                if(stack.isEmpty()){	
					System.out.println(position+1);
					return 0;
				}
                if(stack.pop() != '('){	
					System.out.println(position+1);
					return 0;
				}
				if(!(stack.isEmpty()) && flag==0){	
				flag =1;
				pos = pos -1;
				//pos = position;
				}
            }else if(next == '}') {
				flag =0;
                if(stack.isEmpty()){	
					System.out.println(position+1);
					return 0;
				}
                if(stack.pop() != '{'){	
					System.out.println(position+1);
					return 0;
				}
				if(!(stack.isEmpty()) && flag==0){	
				flag =1;
				pos = pos -1;
				//pos = position;
				}
            }
			/*
			if(!(stack.isEmpty()) && flag==0){	
				flag =1;
				//pos = position;
			}		
			*/
        }
		if (flag ==1){
			System.out.println(pos+1);
			return 0;
		}
		System.out.println("Success");
		return 1;

        // Printing answer, write your code here
		//System.out.println(Arrays.toString(stack.toArray()));
    }
}
