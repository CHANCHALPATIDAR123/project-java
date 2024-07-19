public class StrPalidron {
    public static void main(String[] args) {
        String str1 = "pooja";
        String str2 = "";
        int len = str1.length();
        for (int i = len - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("String is palidron");
        } else {
            System.out.println("string is no palidron");
        }
    }
}
