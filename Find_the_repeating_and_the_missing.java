//https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/

import java.util.Hashtable;
public class MyClass {
    public static void main(String args[]) {
            int arr[]  = {4, 3, 6, 2, 1, 1};
            int len = arr.length;
        int sum = (len)*(len+1)/2;
        
        Hashtable<Integer,Integer> h = new Hashtable<Integer,Integer>();
        
        int duplicate = 0;
        int arraySum = 0;
        
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],i);
                arraySum+=arr[i];
            }
            else{
                duplicate = arr[i];
            }
            
        }
        
        System.out.println("Duplicate, "+duplicate+ "sum" +sum + " array sum " + arraySum +" missing: "+(sum-arraySum));
    }
}
