package linear_search;

public class LinearSearch {
    public static void main(String[] args) {

    String name = "Ashu";
    char targets = 'h';
        System.out.println(search(name,targets));

        int[] nums = {34,2,35,6,353,412,36,5,2342,38};
        int target = 36;;
        int ans = linearSrch(nums, target);
        System.out.println(ans);
    }

    static  boolean search(String str, char targets){
        if(str.length()==0){
            return false;
        }

        for (int i=0; i<str.length(); i++){
            if(targets ==str.charAt(i)){
                return  true;
            }
        }
        return false;
    }

    static int linearSrch (int[] arr,int target) {
        if(arr.length==0){
            return -1;
        }
        //run a loop
        for (int index = 0; index<arr.length; index++){
            //check the index of element if target = 36
            int element = arr[index];
            if(element == target){
                return  element;
            }
        }
        return  -1;
    }
}
