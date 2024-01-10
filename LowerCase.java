public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0]; 
        System.out.println(lowerCase(str));
    }
    public static String lowerCase(String s) {
        String lowerCase1 = "";
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z'){
                lowerCase1 = lowerCase1 + (char) (currentChar + ('a' - 'A'));
            }
            else {
                lowerCase1 = lowerCase1 + currentChar;
            }
        }

        return lowerCase1;
     
    }
}
