
/**
 *Bubble Sorting
 * @author johnjaymercines
 */
import java.util.Scanner;
public class bubbleSort {
    public static void main(String args[]){
        int size = 5;
        int[] number = new int[size];
        Scanner jscan = new Scanner(System.in);
        
        System.out.println( "INPUT 5 NUMBERS: " );
        //INPUT 10 NUMBERS
        for(int x = 0; x<=4; x++){ 
        System.out.print("num"+ (x+1) + ": ");
        number[x] = jscan.nextInt();
        }
        
        //BUBBLE SORT ASCENDING
        int tmp;
        for(int h=0; h<number[size-1]; h++){
            for( int i =0; i<5-1; i++){
                if(number[i] > number[i+1]){
                    tmp = number[i];
                    number[i] = number[i+1];
                    number[i+1] = tmp;
        
             }
        }
    }
        //OUTPUT
        System.out.println("\nASCENDING");
        for(int x=0;x<5;x++){
            System.out.print(number[x] +", ");
        }
              
        //BUBBLE SORT DESCENDING
        int tmp1;
        for(int j=0; j<number[size-1]; j++){
            for( int k =0; k<5-1; k++){
                if(number[k] < number[k+1]){
                    tmp1 = number[k];
                    number[k] = number[k+1];
                    number[k+1] = tmp1;
        
             }
        }
    }
        //OUTPUT
        System.out.println("\nDESCENDING");
        for(int x=0;x<5;x++){
            System.out.print(number[x] +", ");
    }
}
}
