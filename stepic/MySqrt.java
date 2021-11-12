package stepic;

public class MySqrt {

    public static void main(String[] args) {
        System.out.println(sqrt(3));
    }
    public static double sqrt(double x) {
        if (x < 0)
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        if(x == 1) return 1;

        double start = 0;
        double end =  x;
        double mid = (end + start) / 2;
        while (start <= end) {
            mid = (end + start) / 2;

            if(mid * mid > x) {
                end = mid - 1;
            }
            else if(mid * mid < x) {
                start = mid + 1;
            }
            else
                return mid;
        }
        return mid;
    }

}
