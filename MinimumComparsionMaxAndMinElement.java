
public class MinimumComparsionMaxAndMinElement {
    // /Class Pair is used to return two values from getMinMax() */
    static class Pair { 
  
        int min; 
        int max; 
    }

    //Simple Linear Search to get Max and  Minimum Element 
    //Time Complexity: O(n)
    //OVerall Number of Comparsion is 2n 
    static Pair getMinMax(int arr[], int n) { 
        Pair minmax = new  Pair(); 
        int i; 
  
        /*If there is only one element then return it as min and max both*/
        if (n == 1) { 
            minmax.max = arr[0]; 
            minmax.min = arr[0]; 
            return minmax; 
        } 
  
        /* If there are more than one elements, then initialize min  
    and max*/
        if (arr[0] > arr[1]) { 
            minmax.max = arr[0]; 
            minmax.min = arr[1]; 
        } else { 
            minmax.max = arr[1]; 
            minmax.min = arr[0]; 
        } 
  
        for (i = 2; i < n; i++) { 
            if (arr[i] > minmax.max) { 
                minmax.max = arr[i]; 
            } else if (arr[i] < minmax.min) { 
                minmax.min = arr[i]; 
            } 
        } 
  
        return minmax; 
    } 
    
    //Divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array.
    //Time Complexity: O(n)
    //Total number of comparisons: let number of comparisons be T(n). T(n) can be written as follows:
    /*  
        T(n) = T(floor(n/2)) + T(ceil(n/2)) + 2  
        T(2) = 1
        T(1) = 0
         T(n) = 2T(n/2) + 2 
          T(n)  = 3n/2 -2 
    */
    static Pair getMinMax(int arr[], int low, int high) { 
        Pair minmax = new Pair(); 
        Pair mml = new Pair(); 
        Pair mmr = new Pair(); 
        int mid; 
  
        /* If there is only on element */
        if (low == high) { 
            minmax.max = arr[low]; 
            minmax.min = arr[low]; 
            return minmax; 
        } 
  
        /* If there are two elements */
        if (high == low + 1) { 
            if (arr[low] > arr[high]) { 
                minmax.max = arr[low]; 
                minmax.min = arr[high]; 
            } else { 
                minmax.max = arr[high]; 
                minmax.min = arr[low]; 
            } 
            return minmax; 
        } 
  
        /* If there are more than 2 elements */
        mid = (low + high) / 2; 
        mml = getMinMax(arr, low, mid); 
        mmr = getMinMax(arr, mid + 1, high); 
  
        /* compare minimums of two parts*/
        if (mml.min < mmr.min) { 
            minmax.min = mml.min; 
        } else { 
            minmax.min = mmr.min; 
        } 
  
        /* compare maximums of two parts*/
        if (mml.max > mmr.max) { 
            minmax.max = mml.max; 
        } else { 
            minmax.max = mmr.max; 
        } 
  
        return minmax; 
    } 

/*
If n is odd then initialize min and max as first element.
If n is even then initialize min and max as minimum and maximum of the first two elements respectively.
For rest of the elements, pick them in pairs and compare their
maximum and minimum with max and min respectively.

If n is odd:    3*(n-1)/2  
       If n is even:   1 Initial comparison for initializing min and max, 
                           and 3(n-2)/2 comparisons for rest of the elements  
                      =  1 + 3*(n-2)/2 = 3n/2 -2
*/
    static Pair getMinMax3(int arr[], int n) { 
        Pair minmax = new Pair(); 
        int i; 
        /* If array has even number of elements then   
    initialize the first two elements as minimum and   
    maximum */
        if (n % 2 == 0) { 
            if (arr[0] > arr[1]) { 
                minmax.max = arr[0]; 
                minmax.min = arr[1]; 
            } else { 
                minmax.min = arr[0]; 
                minmax.max = arr[1]; 
            } 
            i = 2; 
            /* set the startung index for loop */
        } /* If array has odd number of elements then   
    initialize the first element as minimum and   
    maximum */ else { 
            minmax.min = arr[0]; 
            minmax.max = arr[0]; 
            i = 1; 
            /* set the startung index for loop */
        } 
  
        /* In the while loop, pick elements in pair and   
     compare the pair with max and min so far */
        while (i < n - 1) { 
            if (arr[i] > arr[i + 1]) { 
                if (arr[i] > minmax.max) { 
                    minmax.max = arr[i]; 
                } 
                if (arr[i + 1] < minmax.min) { 
                    minmax.min = arr[i + 1]; 
                } 
            } else { 
                if (arr[i + 1] > minmax.max) { 
                    minmax.max = arr[i + 1]; 
                } 
                if (arr[i] < minmax.min) { 
                    minmax.min = arr[i]; 
                } 
            } 
            i += 2; 
            /* Increment the index by 2 as two   
               elements are processed in loop */
        } 
  
        return minmax; 
    } 
}