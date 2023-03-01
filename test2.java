public class test2 {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "Goodbye";
        
        Swap(x, y);

        System.out.println(x + " " + y);
    }
    public static void Swap(String a, String b) {
        String temp;
        temp = a;
        a = b;
        b = temp;
    }
}
