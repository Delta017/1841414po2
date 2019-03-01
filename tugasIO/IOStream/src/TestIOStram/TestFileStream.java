/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestIOStram;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author DELL
 */
public class TestFileStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*
        FileOutputStream output = new FileOutputStream("Test.txt");
        
        for (int i = 0; i < 10; i++)
        {
            output.write(i);
        }
        String nama = "Luthfi Imam Maulana";
        output.write(nama.getBytes());
        
        output.close();
*/
        buatFile();
        tambahData();
        readData();
        //notFound();
    }
    
    public static void buatFile()
    {
        try
        {
            FileOutputStream output = new FileOutputStream("Test.txt", true);
        
        for (int i = 0; i < 10; i++)
        {
            output.write(i);
        }
        String nama = "Luthfi Imam Maulana";
        output.write(nama.getBytes());
        
        output.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void tambahData()
    {
        try
        {
            FileOutputStream outputStream = new FileOutputStream("Test.txt", true);
            outputStream.write("Charles Darwin \t".getBytes());
            outputStream.write("Fisika \t".getBytes());
            outputStream.write("2.5 \n".getBytes());
            outputStream.write("Tesla \t".getBytes());
            outputStream.write("Fisika \t".getBytes());
            outputStream.write("3.9 \n".getBytes());
            outputStream.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void readData()
    {
        try
        {
            FileInputStream input = new FileInputStream("Test.txt");
            int nilai;
            while((nilai = input.read()) != -1)
            {
                System.out.println(nilai);
            }
            input.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void notFound()
    {
        try
        {
            FileInputStream input = new FileInputStream("tidakada.txt");
            
        }
        catch(IOException e)
        {
            System.out.println("Data tidak ditemukan");
            e.printStackTrace();
        }
    }
    
}
