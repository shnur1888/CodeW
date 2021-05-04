import java.util.ArrayList;

public class DeadFish {
    public static int[] parse(String data) {
        int i = 0;
        int x = 0 ;
        ArrayList<Integer> arrayList = new ArrayList<>();


        for (char letter : data.toCharArray()){
            switch (letter){
                case 'i': x++;break;
                case 's': x = (int) Math.pow(x,2) ;  break;
                case 'd': x--;break;
                case 'o': arrayList.add(i,x);i++;break;
            }

        }

      /*  int[] result =new int[arrayList.size()];
        for (int d =0 ;d<arrayList.size();d++  )
            result[d]=arrayList.get(d);*/


        return arrayList.stream().mapToInt(d->d ).toArray();



    }
}
