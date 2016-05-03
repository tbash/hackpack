public class Lcm {
    Gcd g = new Gcd();

    int index(int[] arr) {
        int val = 1;
        for (int i=0; i<arr.length; i++) {
            val = (val*arr[i])/g.index(val, arr[i]);
        }

        return val; //b == 0 ? a : index(b, a%b);
    }
}
