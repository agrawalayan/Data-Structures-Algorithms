import java.util.Scanner;

class ReverseOrder{
    public static void main(String args[]){
        int size_of_array;
        Scanner sc = new Scanner(System.in);
        size_of_array = sc.nextInt();
        int input_array[]= new int[size_of_array];
        for(int i =0; i < size_of_array; i++){
            input_array[i] = sc.nextInt();
        }
        
        for(int i =size_of_array - 1; i >= 0; i--){
            System.out.println(input_array[i]);
        }
    }
}