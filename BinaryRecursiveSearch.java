public class BinaryRecursiveSearch implements Practice03Search {
    public String searchName(){
        return "Binary Recursive Search";
    }
    public int search(int [] arr, int target){
        return BinaryRecursiveSearch(arr,target,0,arr.length-1);
    }

    public int BinaryRecursiveSearch(int[]arr, int target, int start, int end){
        if(end<start){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if( target < arr[mid]){
            return BinaryRecursiveSearch(arr, target, start, mid-1);
        }
        else{
            return BinaryRecursiveSearch(arr, target, start+1, mid);

        }
    }
}
