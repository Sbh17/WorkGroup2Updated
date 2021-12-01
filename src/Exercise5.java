public class Exercise5 {
    public static int ascendingDescendingArray(int [] array){
        boolean flag = true;
        int index = 0;

        for (int i = 0; i < array.length-1; ++i){
            if(flag && array[i]<array[i+1]){
                index=i+1;
            } else if (array[i]>array[i+1]){
                flag = false;
            }
            else {
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int index = ascendingDescendingArray(new int[]{1,2,4,6,3,2,-2});

        if(index == -1 )
            System.out.println("The Array is not ascending - descending"+index);
        else
            System.out.println("The array is ascending - descending in index ="+index);
    }
}
