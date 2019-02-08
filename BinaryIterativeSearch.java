public class BinaryIterativeSearch implements Practice03Search{
    public String searchName(){
        return "Binary Iterative Search";
    }
    public int search(int [] arr, int target){
        return BinaryIterativeSearch(arr,target,0,arr.length-1);
    }

    public int BinaryIterativeSearch(int[]arr, int target, int start, int end){
        while (start < end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }

            else if(arr [mid] > target){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
