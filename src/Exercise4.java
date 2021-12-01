import java.util.Arrays;

public class Exercise4 {
    // function return array without duplicates
    public static int[] removeDuplicates(int[] input){
        boolean[] isSame = new boolean[input.length];
        int sameNumbers = 0;

        for( int i = 0; i < input.length; ++i ){
            for( int j = i+1; j < input.length; ++j){
                if( input[j] == input[i] ){ //compare same
                    isSame[j] = true;
                    sameNumbers++;
                }
            }
        }
        //compact the array into the result.
        int[] result = new int[input.length-sameNumbers];
        int count = 0;
        for( int i = 0; i < input.length; i++ ){
            if( isSame[i] == true) {
                continue;
            }
            else{
                result[count] = input[i];
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // testing array
        int [] a =new int[]{ };
        int [] arr = new int[]{1,1,2,3,4,2,3,4,6,7,89,12};
        System.out.println("Array before remove the duplicates :"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array after remove the duplicates : "+Arrays.toString(removeDuplicates(a)));
        // Second array
        System.out.println("Array2 before removing the duplicates :"+Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Array2 after remove the duplicates : "+Arrays.toString(removeDuplicates(arr)));
    }
}
