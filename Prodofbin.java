import java.util.*;

class Prodofbin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b1 = sc.next();
        String b2 = sc.next();

        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int product = n1 * n2;

        String result = Integer.toBinaryString(product);

        System.out.print("Product of two binary numbers: " + result);
    }
}