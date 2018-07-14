import java.util.Scanner;
class FetchElements{
	
	
	int element_length;
	
	
	FetchElements(int element_length){
		this.element_length = element_length;
		
	}
	int[] fetchElements(){
		int elements[] = new int[element_length];
		System.out.println("Enter 5 Elements to be sort in increasing order");
		Scanner input = new Scanner(System.in);
		for (int i=0; i<elements.length; i++){
			elements[i] = input.nextInt();
			//System.out.println(elements[i]);
		}
		return elements;
	}
	

}