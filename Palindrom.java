public class Palindrom
{
    public static boolean isPalindrom(String text) {
        if (text == null)
            return false;
        
        for(int i = 0; i < text.length() / 2; i++) {
            if(text.toLowerCase().charAt(i) != text.toLowerCase().charAt(text.length() - i - 1))
                return false;
        }
        return true;
    }
    
    public static boolean isPalindromRecursive(String text, int index) {
        if(index == text.length() / 2)
            return true;
        
        if(text.toLowerCase().charAt(index) == text.toLowerCase()
        
        .charAt(text.length() - index - 1))
            return isPalindromRecursive(text, ++index);
        return false;
    }
}
