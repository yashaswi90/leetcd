package sa;

import java.util.Arrays;

public class SortNumberKeepingSymbolsInPlace {
    public void sortNumber(int[] arr) {

    }

    public static void main(String[] args) {
        char[] ch = new char[]{'2', '1', '#', '@', '5', '4', '$'};
       /* for(int i =0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(Character.isDigit(ch[i]) && Character.isDigit(ch[j])){
                    if(Integer.valueOf(ch[i])>Integer.valueOf(ch[j])){
                        int temp = Integer.valueOf(ch[i]);
                        ch[i]=ch[j];
                        ch[j]= (char) temp;
                    }
                }
            }
        }
*/

        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i]) && Character.isDigit(ch[i+1])){
                if(Integer.valueOf(ch[i])>Integer.valueOf(ch[i+1])){
                    int temp = Integer.valueOf(ch[i]);
                    ch[i]=ch[i+1];
                    ch[i+1]= (char) temp;
                    i=-1;
                }

            }

        }


            for(char c : ch){
                System.out.println(c);
            }



    }
}
