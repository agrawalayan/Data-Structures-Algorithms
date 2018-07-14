import java.util.Scanner;
class TwoSum{
	public static void main(String[] args){
		TwoSum twosum = new TwoSum();
		twosum.two_sum();
		
	}
	
	int sum_array_list(){
		ArrayList <Integer> input_array = new ArrayList<Integer>;
		
	}
	
	int two_sum(){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int input_array[] = new int[n]; 
		for (int i =0; i < n; i ++){
			input_array[i] = input.nextInt();
		}
		int target = input.nextInt();
		for (int i = 0; i<n; i++){
			for (int j = i+1; j<n; j++){
				int sum = input_array[i] + input_array[j];
				if (sum == target){
					System.out.println(i + "," + j);
					return 0;
				}			
			}
		}
		return 0;
	}
}