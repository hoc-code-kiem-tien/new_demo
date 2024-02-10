/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce000000_pheptoan;

import java.util.Scanner;

/**
 *
 * @author Vo Hoang Tu - CE000000
 */
public class CE000000_PhepToan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        String w[] = str[0].split(" ");
        int a = Integer.parseInt(w[0]);
        int b = Integer.parseInt(w[1]);
        PhepToan p = new PhepToan(a, b);
        for (int i = 1; i < str.length; i++) {
            if(str[i].trim().equalsIgnoreCase("add")){
                p.add();
                System.out.println(p.getInfo());
            }else if(str[i].trim().equalsIgnoreCase("sub")){
                p.sub();
                System.out.println(p.getInfo());
            }else if(str[i].trim().equalsIgnoreCase("mul")){
                p.mul();
                System.out.println(p.getInfo());
            }else if(str[i].trim().equalsIgnoreCase("div")){
                p.div();
                System.out.println(p.getInfo());
            }
        }
    }
    
}
