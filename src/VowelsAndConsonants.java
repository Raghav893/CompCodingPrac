public class VowelsAndConsonants {
    public static void vowelsCounter( ){
        String str = "Hello";
        str.toLowerCase();
        int vowels = 0;
        int consonants =0;
        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o'|| ch == 'u'){
                vowels++;
            }
            else {
                consonants++;
            }
        }
    }

    public static void main(String[] args) {
        String word = "Hello";
        vowelsCounter();
    }
}
