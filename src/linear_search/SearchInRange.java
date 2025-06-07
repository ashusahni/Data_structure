package linear_search;

public class SearchInRange  {
    public static void main(String[] args) {
        int[] arr = {34,3,235,32,65,65,312,54};
        int target = 65;
        System.out.println(linearSearch(arr,target,2,6));
    }

    static  int linearSearch(int[] arr, int target,int start, int end){
        if(arr.length==0){
            return  -1;
        }
        for(int index=start; index<=end; index++){
            int element = arr[index];
                    if(element==target){
                        return  index;
                    }
        }
        return -1;
    }


}
