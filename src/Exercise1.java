public class Exercise1 {
    public static boolean foundFirstInSecond(String str1 , String str2){
        for ( int i = 0; i < str2.length() ; ++i) {
            if (str2.charAt(i) == str1.charAt(0))
            {
                boolean result = true;
                for (int j = 0; j < str1.length(); ++j) {
                    if (str1.charAt(j) != str2.charAt((i + j))) {
                        result = false;
                    }
                }
                if (result == true) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(foundFirstInSecond("Not","i like eating apple"));
        System.out.println(foundFirstInSecond("Are","Are you in the moon ?"));
    }
}
