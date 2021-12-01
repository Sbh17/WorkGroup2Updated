import java.util.Arrays;

public class Exercise6 {
    public static int[] intersectionOfTwoArrays(int [] A ,int [] B) {
        int [] temp= new int[A.length];
        int i = 0 , j = 0;

        while (i< A.length && j < B.length){
            if(A[i] == B[j] ){
                temp[i] = A[i];
                i = i + 1;
                j = j + 1;
            }else if(A[i] < B[j])
                ++i;
            else
                ++j;
        }
        return temp;
    }

    public static boolean arraysIntersection(int [] a , int [] b){
        boolean flag = true ;
        int [] temp = intersectionOfTwoArrays(a ,b);
        for (int i= 0 ; i< temp.length; i++){
            if(temp[i] == 0)
                flag = false;
            else
                flag = true;
        }
        if(flag == false)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {

        System.out.println(arraysIntersection(new int[]{3,4,5,7,8},new int[]{2,1,9,21,12}));
        System.out.println(arraysIntersection(new int[]{2,3,1,4,5,7,8},new int[]{2,1,3,8,9,21,12}));
        System.out.println(arraysIntersection(new int[]{0,2,3,4,6,8},new int[]{12,22,15,25,30,31}));
    }

}
