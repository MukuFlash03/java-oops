package Java.Basic.Array;
public class ArrSearch {
    public static void main(String[] args) {
        int arr[] = {101,105,102,105,103,104,105,106,107,108,109,110,109};

        int freq[] = new int [arr.length];  
        int flag = -1; 
        // int key = 105; 
        
        for(int i = 0; i < arr.length; i++){  
            int ctr = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    ctr++;  
                    freq[j] = flag;  
                }  
            }  
            if(freq[i] != flag)  
                freq[i] = ctr;  
        }  
          
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != flag)  
                System.out.println(+ arr[i] + " : " + freq[i]);  
        } 
    }
}