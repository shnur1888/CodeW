public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        boolean isTrue = false;
        int x=0,y=0;
        for (int i = 0 ; i<walk.length;i++){
            switch (walk[i]){
                case 'n':y++;
                break;
                case 's':y--;
                break;
                case 'e':x++;
                break;
                case 'w':x--;
                break;
            }


        }


if (x==0&&y==0&&walk.length==10)
    isTrue=true;
        return isTrue;
    }

    public static boolean isValid2(char[] walk) {
        String s = new String(walk);
        return s.chars().filter(p->p=='n').count()==s.chars().filter(p->p=='s').count()&&
                s.chars().filter(p->p=='e').count()==s.chars().filter(p->p=='w').count()&&s.chars().count()==10;
    }
}
