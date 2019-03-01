/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasIOBukuTelp;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        menu();
    }
    public static void menu() throws IOException
    {
        System.out.println("Aplikasi Buku Alamat STMIK AMIK Bandung\n Oleh Luthfi Imam Maulana 1841414\n==========================\nSilahkan pilih : \n1. Buat File\n2. Tambah Data\n3. Lihat Data\n0. Keluar\n");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch(select)
        {
            case 1:
                CreateFile();
                break;
            case 2:
                WriteToFile();
                break;
            case 3:
                ReadFile();
                break;
            case 0:
                Exit();
                break;
            default:
                menu();
                break;
        }
    }
    public static void CreateFile()  throws IOException
    {
        File file = new File("BukuAlamat.dat");
        file.createNewFile();
        FileWriter writer = new FileWriter(file,true);
        writer.write("Nama \tAlamat\n");
        writer.flush();
        writer.close();
        System.out.println("Membuat File Sukses\n");
        menu();
    }
    public static void WriteToFile()  throws IOException
    {
        File file = new File("BukuAlamat.dat");
        FileWriter writer = new FileWriter(file,true);
        Scanner input = new Scanner(System.in);
        System.out.println("\nSilahkan Masukkan Data Nama :");
        String nama = input.nextLine();
        System.out.println("\nSilahkan Masukkan Data Alamat :");
        String Alamat = input.nextLine();
        writer.write(nama+" \t"+Alamat+"\n");
        writer.flush();
        writer.close();
        System.out.println("Menambah Data Sukses");
        menu();
    }
    public static void ReadFile()  throws IOException
    {
        File file = new File("BukuAlamat.dat");
        FileReader reader = new FileReader(file);
        char [] a = new char[50];
        reader.read(a);
        
        for(char c : a)
        {
            System.out.print(c);
        }
        reader.close();
        menu();
    }
    public static void Exit()
    {
        System.out.println("\nMenutup Aplikasi...");
        System.exit(0);
    }
    
}
