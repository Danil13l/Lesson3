
public class Main {
    public static void main(String[] args) {

        double[] ty = {2.2, 4.3, -3.6, 7.1, -1.4, -6.2, 12.4, 32.54, -9.21, -10.54, 15.6, -17.43, -13.3, 19.3, 21.3};

        int count = 0;
        double sum = 0;

        boolean bool = false;
        for (int i = 0; i < ty.length; i++) {
            if (ty[i] < 0) {
                bool = true;
            }
            if (ty[i] > 0 && bool) {
                count ++;
                sum = sum + ty[i];
            }
        }
        System.out.println(sum/count);
    }
}