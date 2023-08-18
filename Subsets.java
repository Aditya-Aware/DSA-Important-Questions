package ImpQuestions;

public class Subsets {
    public static void FindSubSets(String str, String ans, int i){
        //base case
        if (i==str.length()){
            if (ans.length()==0){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //Yes Choice
        FindSubSets(str, ans+str.charAt(i), i+1);
        //No Choice
        FindSubSets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str= "abc";
        FindSubSets(str,"",0);
    }
}
