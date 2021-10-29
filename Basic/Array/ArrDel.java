package Java.Basic.Array;
public class ArrDel {
    public static void main(String[] args) {
        // int arr[] = {101,105,102,105,103,104,105,106,107,108,109,110,109};
        int arr[] = {1,2,3,5,4,5,6};
        int len = arr.length;
        int temp[] = new int [len]; 
        // int key = 5; 
        int i; //, j;

        /* 
        // Removes all occurences of an element
        for(i = 0, j = 0; i < len; i++){  
            if(arr[i] != key) {
                temp[j++] = arr[i];
            }
        }
        */

        /*
        // Removes first occurence of an element
        for(i = 0; i < len; i++){  
            if(arr[i] == key)
                break;
            else {
                temp[i] = arr[i];
            }
        }  
          
        for(j = i+1; j < len; j++){  
            temp[j-1] = arr[j];
        }
        */

        for(i = 0; i < len-1; i++) {
            System.out.println(temp[i]);
        }
        
    }
}