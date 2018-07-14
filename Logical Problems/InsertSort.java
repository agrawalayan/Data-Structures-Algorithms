import java.util.Scanner;
class InsertSort{

	

	

	int[] sort(int [] result){
		for(int j=1; j< result.length; j++){
			int key = result[j];
			int i= j-1;
			while (i>=0 && result[i]>key){
				result[i+1]= result[i];
				i=i-1;
			}
			result[i+1] = key;	
		
		}
		return result;
	}
	
	

	void display(int [] result){
		System.out.print("List is: ");
		for (int i=0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
	}


	public static void main (String args[]){
		FetchElements elements = new FetchElements(5);
		InsertSort sorting = new InsertSort();
		int[] result = elements.fetchElements();
		int[] sorted_result = sorting.sort(result);
		sorting.display(sorted_result);
		
	}	
}