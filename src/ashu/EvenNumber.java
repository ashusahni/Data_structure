package ashu;

import com.sun.source.tree.BreakTree;

public class EvenNumber   {
    public static void main(String[] args) {
        int num = 12344354;
    }

    static  boolean evendigit (int num){
        int numofdigit = digits(num);
        return  numofdigit % 2==0;
    }

    static int digits (int num){
        int count = 0;
        while (num >0){
            count ++;
            num = num/10;
        }
    return  digits(num);
    }

}
