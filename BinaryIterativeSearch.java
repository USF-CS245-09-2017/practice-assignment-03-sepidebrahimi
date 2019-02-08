// Sepid Ebrahimi, CS 245

public class BinaryIterativeSearch implements Practice03Search{
    public String searchName(){
        return "Binary Iterative Search"; // search name
    }
    public int search(int [] arr, int target){
        return BinaryIterativeSearch(arr,target,0,arr.length-1);
    }

    public int BinaryIterativeSearch(int[]arr, int target, int start, int end){
        while (start < end){
            int mid = (start + end)/2;
            if(arr[mid] == target){ // if the element in the array arr is equal to our targeted number
                return mid;
            }

            else if(arr [mid] > target){ // if target was smaller than the element in the array arr
                start = mid +1; // change start to mid + 1
            }
            else{ // if target was greater than the element in the array arr
                end = mid -1; //change end to mid - 1
            }
        }
        return -1; // return -1 if target was nt in the array
    }
}
