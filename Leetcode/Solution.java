import java.util.Scanner;
class Solution{
	public static void main(String[] args){
		Solution twosum = new Solution();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int input_array[] = new int[n]; 
		for (int i =0; i < n; i ++){
			input_array[i] = input.nextInt();
		}
		int target = input.nextInt();
        twosum.twoSum(input_array, target);
		
	}
	
	int twoSum(int[] input_array, int target){
		
		for (int i = 0; i<input_array.length; i++){
			for (int j = i+1; j<input_array.length; j++){
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