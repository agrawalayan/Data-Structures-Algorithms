import java.util.Scanner;
class LinearSearch{

	int search (int[] result){
		
		System.out.println("Enter the element to be searched");
		Scanner input = new Scanner(System.in);
		int element = input.nextInt();
		for (int i=0; i< result.length; i++){
			if (element == result[i]){
				System.out.println("Element Found");
				return 1;
			}
		}
		System.out.println("Not Found");
		return 0;
	}
	public static void main(String args[]){
		
		System.out.println("Linear Search");
		System.out.println("Enter the number of Elements in the List");
		Scanner input = new Scanner(System.in);
		int number_of_elements = input.nextInt();
		FetchElements elements = new FetchElements(number_of_elements);
		int [] result = elements.fetchElements();
		LinearSearch linearsearch = new LinearSearch();
		linearsearch.search(result);

	}
}