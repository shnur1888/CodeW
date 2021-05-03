import java.math.BigDecimal;

public class NumberFun {
    public static long findNextSquare(long sq) {



       double koren = Math.sqrt((double) sq );

       if (BigDecimal.valueOf(koren).scale()<=1) {
           koren++;
           koren=Math.pow(koren,2);
          sq = (long) koren ;
       }
else { sq=-1;}
    return sq;
    }
    public  static long findNextSquare2(long sq) {
        return Math.sqrt(sq) % 1 != 0 ? -1 : (long)Math.pow(Math.sqrt(sq)+1,2);
    }


}