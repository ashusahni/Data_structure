package ashu;

public class Max {
    public static void main(String[] args) {
        int[] arr = {3,4,45,22,43};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static  int max(int[] arr){
        int maxValue  = arr[0];
        for (int i =1; i<arr.length; i++){
        if(arr[i]>maxValue){
            maxValue =arr[i];
        }
        }
return  maxValue;
    }

    static  int min(int[] arr){
        int minValue  = arr[0];
        for (int i =1; i<arr.length; i++){
        if(arr[i]<minValue){
            minValue =arr[i];
        }
        }
return  minValue;
    }
}
