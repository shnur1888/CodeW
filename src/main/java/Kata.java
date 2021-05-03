import java.util.Arrays;



public class Kata {

    public static double findUniq(double[] arr) {
        double x = arr[0];
        double ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (x != arr[i]) {

                if (i > 1) {
                    ans= arr[i];
                    break;
                          }
                if (x != arr[i + 1]) {
                    ans= x;
                    break;
                                     }
                else {
                    ans= arr[i];
                    break;
                     }
                            }


                                             }
        return ans;

                                                }

    public static double findUniq2(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }

    public static String createPhoneNumber(int[] numbers) {
        String phone= Arrays.toString(numbers).replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        return  phone ="("+phone.substring(0,3)+") "+phone.substring(3,6)+"-"+phone.substring(6);


    }

    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }

}








