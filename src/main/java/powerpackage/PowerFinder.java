package powerpackage;

public class PowerFinder {
    public static int calc(int num, int power) {
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans *= num;
        }
        return ans;
    }
}
