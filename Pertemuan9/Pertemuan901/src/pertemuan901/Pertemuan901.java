package pertemuan901;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rambu Intan 
 * TGL 17 Mei 2025
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        dbKoneksi dbk = new dbKoneksi();
        
        Statement st = dbk.koneksi().createStatement();
        
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
        
           System.out.println("Nama: "+rs.getString("NAMA"));
           System.out.println("Nim: "+rs.getString("NIM"));
           System.out.println("Jurusan: "+rs.getString("JURUSAN"));
           System.out.println("Alamnat: "+rs.getString("ALAMAT"));
    }
        
    }
}

  
    

