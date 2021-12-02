import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex6_4_1SortStrings {
    public static void main(String[] args) throws IOException
    {
        String[] words = new String[144];
        
        Scanner scan = new Scanner(new File("poem.txt"));
        int index = 0;
        while(scan.hasNext()){
            words[index++] = scan.next().toUpperCase();
        }
        
        //Uncomment this once you have modified the Selection Sort method to 
        //work with strings
        
        //selectionSort(words);
        
        for(String word : words){
            System.out.println(word);
        }
    }
    
    //Modify this method so it sorts strings alphabetically from A-Z
    public static void selectionSort(int[] arr) {
		//Traverse indexes up to second to last element
		for(int index = 0; index < arr.length - 1; index++) {
			//Find the smallest value
			int minIndex = index;
			for(int i = index + 1; i < arr.length; i++) {
				if(arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			//Swap minIndex and index
			int temp = arr[index];
			arr[index] = arr[minIndex];
			arr[minIndex] = temp;			
		}
	}
}
