public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0]; 
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {
        String uniqueCharcaters = "";

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar != ' '){
                if(uniqueCharcaters.indexOf(currentChar) == -1){
                    uniqueCharcaters = uniqueCharcaters + currentChar;
                }
            }
            else{
                uniqueCharcaters = uniqueCharcaters + currentChar;
            }

        }

        return uniqueCharcaters;

        
    }
}
