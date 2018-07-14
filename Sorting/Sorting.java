import java.util.Scanner;

class Sorting{

	private int n;
	private int input_array[];
	Sorting(int n){
		System.out.println("Implementing Search Algorithm");
		this.n = n;
		input_array = new int[n];
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the array");
		/* declaring n as size of the array for convention of finding the time complexity*/
		int n = sc.nextInt();
		
		Sorting sorting = new Sorting(n);
		sorting.inputArray();
		//sorting.printArray();
		//sorting.bubble_sort();
		//System.out.println("Array After Bubble Sort");
		
		//sorting.insertion_sort();
		//sorting.selection_sort();
		sorting.merge_sort();
		sorting.printArray();
	}
	void inputArray(){
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Input the elements of array");
		for (int i = 0; i < n; i++){
			input_array[i] = 1000 - i;
		}
	}
	
	void printArray(){
		System.out.print("The array is : ");
		for(int i = 0 ; i < n; i ++){
			System.out.print(input_array[i] + " ");
		}
		System.out.println("");
	}
	void bubble_sort(){
		for (int i =0; i < n ; i ++){
			for (int j = 0; j < n -1; j++){
				if (input_array[j+1] < input_array[j]){
					int temp_element = input_array[j];
					input_array[j] = input_array[j+1];
					input_array[j+1] = temp_element;
				}
			}
		}
	}
	
	void insertion_sort(){
		for (int i = 1; i< n ; i ++){
			int j = i-1;
			int temp_element = input_array[i];
			while((j >= 0) && (temp_element < input_array [j])){
				input_array[j+1] = input_array[j];
				j--;
			}
			input_array[j+1] = temp_element;
		}
	}
	
	void selection_sort(){
		for (int j = 0; j < n; j++){
			int index = j;
			int min_element = input_array[j];
			for (int i = j + 1; i < n; i++){
				if (min_element > input_array[i]){
					min_element = input_array[i];
					index = i;
				}
			}
			input_array[index] = input_array[j];
			input_array[j] = min_element;
		}	
	}
	
	void merge_sort(){
		divide_array(0, n-1);
		
		
	}
	void divide_array(int low, int high){
		if ( low == high){
			return;
		}
		else{	
			int mid = (high + low)/2;
			divide_array(low,mid);
			divide_array(mid+1, high);
			System.out.println(low + " " + mid + " " + high);
			merge(low, mid, high);
		}	
	}
	
	void merge(int low, int mid, int high){
	
		int left_temp_array[] = new int[mid - low +1];
		for (int i = 0; i< mid - low +1; i++){
			left_temp_array[i] = input_array[low + i];
			System.out.println(left_temp_array[i]);
		}
		
		int right_temp_array[] = new int[high - mid];
		for (int i = 0 ; i< high - mid; i++){
			right_temp_array[i] = input_array[i+mid+1];
			System.out.println(right_temp_array[i]);
		}
		
		int i =0, j =0;
		int k=low;
			while(i < (mid - low +1) && j <(high - mid)){
				if (left_temp_array[i] <= right_temp_array[j]){
					input_array[k] = left_temp_array[i];
					i++;
				}
				else{
					input_array[k] = right_temp_array[j];
					j++;
				}
				k++;
			}
			while(i < (mid - low +1)){
				input_array[k] = left_temp_array[i];
				i++;
				k++;
			}

			while(j <(high - mid)){
				input_array[k] = right_temp_array[j];
				j++;
				k++;
			}	
		
			printArray();
		
	
	}	
}
	