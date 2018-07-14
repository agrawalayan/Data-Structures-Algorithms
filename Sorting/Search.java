import java.util.Scanner;

class Search{

	private int n;
	private int input_array[];
	Search(int n){
		System.out.println("Implementing Search Algorithm");
		this.n = n;
		input_array = new int[n];
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the array");
		/* declaring n as size of the array for convention of finding the time complexity*/
		int n = sc.nextInt();
		
		Search search = new Search(n);
		search.inputArray();
		//search.printArray();
		System.out.println("Enter the integer to find");
		
		int  find_num = sc.nextInt();
		search.linear_search(find_num);
		search.binary_search(find_num);
	}
	void inputArray(){
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Input the elements of array");
		for (int i = 0; i < n; i++){
			input_array[i] = i+1;
		}
	}
	
	void printArray(){
		System.out.print("The array is : ");
		for(int i = 0 ; i < n; i ++){
			System.out.print(input_array[i] + " ");
		}
		System.out.println("");
	}
	void linear_search(int find_num){
		for(int i = 0 ; i < n; i ++){
			if (input_array[i] == find_num){
				System.out.println(find_num + " found at index " + i);
				break;
			}
			else{
				if (i == n-1){
					System.out.println("Not found in the input array");
				}
			}
		}
	}
	
	void binary_search(int find_num){
		int low = 0;
		int high = n-1;
		while(low <= high){
			int mid_num = (high + low)/2;
			if (input_array[mid_num] == find_num){
				System.out.println(find_num + " found at index " + mid_num);
				break;
			}
			else{
				if (input_array[mid_num] > find_num){
					high = mid_num -1;
				}
				else{
					low = mid_num + 1;
				}
			}
		}
		if (low > high){
			System.out.println("Not found in the input array");
		}
	}
}