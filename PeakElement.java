
public class PeakElement {
    /*
     O(n) solution for finding Peak Element
     */
    public static int findPeakElement(int arr[]){
        int size = arr.length;
        for(int i =0; i < size - 1;){
            if(arr[i] > arr[i + 1]){
                return i;
            }
            i++;
        }
        return size - 1;
    }

    /**
     * O(logn) solution for finding peak element using binary Searc
     */
    public static findPeakElementBinarySearch(int arr[],int low,int high){
        if(loww == high)
            return 0;
        int middle = (low + high) /2;
        if(arr[middle] > arr[middle + 1])
            return findPeakElementBinarySearch(arr,low,mid);
        return findPeakElementBinarySearch(arr,mid + 1,high);
    }
}