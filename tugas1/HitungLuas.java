/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class HitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cariLuasPersegiPanjang();
    }
    
    public static void cariLuasPersegiPanjang(){
        int pan;
        int leb;
        int luas;
       Scanner input = new Scanner(System.in);
       System.out.print("Masukan panjang : ");
       pan = input.nextInt();
       System.out.println("");
       System.out.print("Masukan Lebar : ");
       leb = input.nextInt();
       System.out.println("");
       luas = pan * leb;
       System.out.print("Luas : "+luas);
    }
    
}
