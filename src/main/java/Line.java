public class Line {
    public static String WhoIsNext(String[] names, int n)
    {
        int cans = 0;
        int IterationNum = 0;
        while (cans < n){
            for (int i = 0; i < names.length; i++) {
                cans += (int)Math.pow(2, IterationNum);
                if (cans >= n) {
                    return names[i];
                }
            }
            IterationNum++;
        }
        return "";

    }


    public static String WhoIsNext2(String[] names, int n){
        while ( n > names.length){
            n = (n - (names.length - 1)) / 2;
        }
        return names[n-1];
    }



}