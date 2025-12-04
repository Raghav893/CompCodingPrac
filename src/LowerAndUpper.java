public class LowerAndUpper {
    public static void NoOfLowAndUp(String sentence){
        int up = 0;
        int low = 0 ;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                low++;

                // Step 3: Check if character is uppercase
            else if (ch >= 'A' && ch <= 'Z')
                up++;
        }
        System.out.println(low);
        System.out.println(up);
    }
    public static void main(String[] args) {

    }
}
