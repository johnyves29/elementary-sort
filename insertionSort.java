

/**
 *INSERTION SORT
 * @author jj22511
 */
import java.util.Scanner;
public class insertionSort {
    public static void main(String args[]){
            Scanner jscan = new Scanner(System.in);
            
            int size = 5;
            int[] array = new int[size];
            //
            System.out.print("Enter 5 Numbers\n");
            for(int i=0; i<5; i++){
                System.out.print("num"+(i+1)+": ");
                array[i] = jscan.nextInt();
            }
            //ASCENDING SORT
            
            for(int a=1; a<array.length; a++){
                int tmp = array[a];
                int b = a;
                while((b>0) && (array[b-1] > tmp)){
                    array[b]=array[b-1]; //swap
                    b--;
                }
                array[b]=tmp;  //swap
            }
            
            System.out.println("\nAscending");
            for(int x = 0; x<5; x++){
                System.out.print(array[x]+ ", ");
            }   
            
             //ASCENDING SORT
            
            for(int a=1; a<array.length; a++){
                int tmp = array[a];
                int b = a;
                while((b>0) && (array[b-1] < tmp)){
                    array[b]=array[b-1]; //swap
                    b--;
                }
                array[b]=tmp;  //swap
            }
            
            System.out.println("\nDescending");
            for(int x = 0; x<5; x++){
                System.out.print(array[x]+ ", ");
            }              
    }
}
