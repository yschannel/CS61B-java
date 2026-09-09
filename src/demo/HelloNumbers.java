package demo;

public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        while (x < 46) {
            System.out.print(x + " ");
            x = x + i;
            i = i + 1;
        }
    }
}
