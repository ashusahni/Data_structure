

public class Count_nums {
    public static void main(String[] args) {
        int n =3433343;

        int count_nums  =0;
        while (n>0){
        int rem = n % 10;
        if(rem ==3){
            count_nums++;
        }
        n = n/10;
        }
        System.out.println(count_nums);
    }
}
