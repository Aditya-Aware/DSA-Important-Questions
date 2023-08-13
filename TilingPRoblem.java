package ImpQuestions;

public class  TilingPRoblem {

    public static int Tilling(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;

        }
        //vertical
        int fn1 = Tilling(n - 1);
        //horizontal
        int fn2 = Tilling(n - 2);

        int totalways = fn1 +fn2;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(Tilling(2));
    }
}

