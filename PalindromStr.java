package ImpQuestions;

public class PalindromStr {

    public static boolean IsPalindrom(String str){
        for (int i=0; i<str.length()/2;i++){
            int n=str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {

                //is a Palindrom
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String a = "india";
        String b= "koook";
        System.out.println(IsPalindrom(a));
        System.out.println(IsPalindrom(b));

    }
}
