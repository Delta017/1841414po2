/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestIOStram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class TestFileWriter {

    final static String namaFile = "NamaFileWriter.txt";
    final static String namamhs = "Luthfi Imam";
    final static String jurusan = "Sistem Informatika";
    final static String ipk = "3.29";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tulisFile();
        
    }
    public static void tulisFile()
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile));
            writer.write(namamhs);
            writer.write(jurusan);
            writer.write(""+ipk+"\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
