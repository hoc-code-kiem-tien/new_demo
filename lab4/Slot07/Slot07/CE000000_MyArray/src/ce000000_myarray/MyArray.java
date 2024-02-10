/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_myarray;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class MyArray {
    private int[] arr;
    
    public MyArray(int[] iArr){
        arr = iArr;
    }
    public int[] getArr(){
        return arr;
    }
    public void setArr(int[] iArr){
        arr = iArr;
    }
    public void sort(){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public int findMax(){
        int max = arr[0];
        for (int x : arr) {
            if(x > max) max = x;
        }
        return max;
    }
    public int findMin(){
        int min = arr[0];
        for (int x : arr) {
            if(x < min) min = x;
        }
        return min;
    }
    public String printArray(){
        String res = "";
        for (int x : arr) {
            res += "," + x;
        }
        //res = ,3,8,2,5,9,1,6,7,4
        return res.substring(1);
    }
}
