public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        str.toLowerCase();
        int left = 0;
        int right = str.length() -1 ;
        boolean pall = true;
        while (left<right){
            if (str.charAt(left) == str.charAt(right)){
                pall = false;
                break;
            }
            left ++ ;
            right --;
        }
    }
}
