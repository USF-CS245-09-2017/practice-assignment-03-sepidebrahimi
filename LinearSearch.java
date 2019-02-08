// Sepid Ebrahimi, CS 245

public class LinearSearch implements Practice03Search {
    public String searchName(){
        return "Linear Search"; // search name
    }
    public int search(int [] arr, int target){ // linear search algorithm
        for( int i = 0; i< arr.length; i++){
            if(arr[i] == target){ // if the element in the array arr is equal to our target number
                return  i;
            }
        }
        return -1; // return -1 if the target was not in the array
    }
}
