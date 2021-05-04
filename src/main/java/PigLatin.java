public class PigLatin {
    public static String pigIt(String a) {



        String t ;
        String[] str = a.trim().split(" ");

        for (int i = 0;i<str.length;i++){
            if(str[i].contains("!"))
                continue;
            char x = str[i].charAt(0);
            t =str[i].trim().substring(1)+x+"ay";
            str[i]=t;
        }

        for (int i = 0;i<str.length;i++){

            if (i==0)
                a="";
            a+=str[i]+" ";
        }
        a=a.trim();

        return a;







    }




        public static String pigIt2(String str) {
            return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
        }
    }

