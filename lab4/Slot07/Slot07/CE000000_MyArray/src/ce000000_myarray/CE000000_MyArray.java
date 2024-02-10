/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_myarray;

import java.util.Scanner;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class CE000000_MyArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        //str[] = [add 3 8 2 5 9 1 6 7 4 | sort | max | min ]
        //str[0] = "add 3 8 2 5 9 1 6 7 4"
        String w[] = str[0].split(" ");
        //w[] = [add |3 |8 |2 |5 |9 |1 |6 |7 |4 ]
        int a[] = new int[w.length - 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(w[i + 1]);
        }
        //a[] = [3 |8 |2 |5 |9 |1 |6 |7 |4 ]
        MyArray m = new MyArray(a);       
        for (int i = 1; i < str.length; i++) {
            if(str[i].trim().equalsIgnoreCase("sort")){
                m.sort();
                System.out.println(m.printArray());
            }else if(str[i].trim().equalsIgnoreCase("max")){
                System.out.println(m.findMax());
            }else if(str[i].trim().equalsIgnoreCase("min")){
                System.out.println(m.findMin());
            }
        }
    }
    
}
