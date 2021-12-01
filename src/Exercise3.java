import java.util.Scanner;

public class Exercise3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a phone number:");
            String originalPhoneNumber = scanner.next();
            String phoneNumberAfterChanges = checkingARegularPhoneNumber(originalPhoneNumber);
            System.out.println(" " +phoneNumberAfterChanges);
        }

        public static String checkingARegularPhoneNumber(String originalPhoneNumber) {
            String nothing = " ";
            String correctNumber;
            String correctStart="05";

            if (originalPhoneNumber.length() == 12 &&
                    originalPhoneNumber.charAt(0)=='9'&& originalPhoneNumber.charAt(1)=='7' && originalPhoneNumber.charAt(2)=='2') {

                correctNumber = correctStart+originalPhoneNumber.charAt(3)+"-"+originalPhoneNumber.charAt(4)+originalPhoneNumber.charAt(5)+originalPhoneNumber.charAt(6)+originalPhoneNumber.charAt(7)+
                        originalPhoneNumber.charAt(8)+originalPhoneNumber.charAt(9)+originalPhoneNumber.charAt(10)+originalPhoneNumber.charAt(11);
            }
            else if (originalPhoneNumber.length()== 11 && originalPhoneNumber.charAt(0) == '0' && originalPhoneNumber.charAt(1) == '5' && originalPhoneNumber.charAt(3) == '-') {
                correctNumber=originalPhoneNumber;
            }else if (originalPhoneNumber.length()== 10 && originalPhoneNumber.charAt(0) == '0' && originalPhoneNumber.charAt(1) == '5' && originalPhoneNumber.charAt(3) != '-')
                correctNumber = correctStart+originalPhoneNumber.charAt(2)+"-"+originalPhoneNumber.charAt(3)+originalPhoneNumber.charAt(4)+originalPhoneNumber.charAt(5)+originalPhoneNumber.charAt(6)+originalPhoneNumber.charAt(7)+
                        originalPhoneNumber.charAt(8)+originalPhoneNumber.charAt(9);
            else correctNumber=nothing;
            return correctNumber;
        }

    }
