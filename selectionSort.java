

/**
 *
 * @author johnjaymercines
 */

public class selectionSort {
    public static void main(String args[]){
         final int[] arr = { 54, 24, 13,72, 21, 9, 0, 67 }; // This is my array
         //Ascending
         System.out.println("ASCENDING");
    int min;
    for (int i = 0; i < arr.length; i++) {
        // Assume first element is min
        min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        if (min != i) {
            final int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        System.out.println(arr[i]);// I print the in ascending order
    }
      //DESCENDING
         System.out.println("DESCENDING");
    int min2;
    for (int i = 0; i < arr.length; i++) {
        // Assume first element is min
        min2 = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] > arr[min2]) {
                min2 = j;
            }
        }
        if (min2 != i) {
            final int temp = arr[i];
            arr[i] = arr[min2];
            arr[min2] = temp;
        }
        
        System.out.println(arr[i]);// I print the in ascending order
    }
    
    }
   
}
