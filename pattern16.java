public class pattern16 {
    public static void main(String[] args) {
        int t1 = 0, t2 = 1;
        int nextTerm;
        for (int i = 0; i <= 5; ++i) {
            System.out.print(t1);
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
    }
}
