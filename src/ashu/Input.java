package ashu;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
 public static  void input (String[] args) {
Scanner in = new Scanner(System.in);
  String[] str = new String[5];

  for (int i = 0; i<str.length; i++){
      str[i] = in.next();
     }
     System.out.println(Arrays.toString(str));
//modify
     str[1] = "flame";
     System.out.println(Arrays.toString(str));

 }
    public static void main(String[] args) {
        input(args);
    }
}
