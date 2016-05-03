public class Gcd {
    int index(int a, int b) {
        return b == 0 ? a : index(b, a%b);
    }
}
