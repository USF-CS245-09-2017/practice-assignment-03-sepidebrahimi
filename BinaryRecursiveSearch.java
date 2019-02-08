// Sepid Ebrahimi, CS 245

public class BinaryRecursiveSearch implements Practice03Search {
    public String searchName(){
        return "Binary Recursive Search"; // search name
    }
    public int search(int [] arr, int target){
        return BinaryRecursiveSearch(arr,target,0,arr.length-1);
    }

    public int BinaryRecursiveSearch(int[]arr, int target, int start, int end){
        if(end<start){ // base case
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == target){ // if the element in the array arr is equal to our targeted number
            return mid;
        }
        else if( target < arr[mid]){ // if target was smaller than the element in the array arr
            return BinaryRecursiveSearch(arr, target, start, mid-1); // change end to mid-1
        }
        else{ // / if target was greater than the element in the array arr
            return BinaryRecursiveSearch(arr, target, mid+1, end); // change start to mid+!

        }
    }
}
