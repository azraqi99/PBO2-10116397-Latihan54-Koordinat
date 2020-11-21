/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Koordinat
 */
package pbo210116397latihan54koordinat;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new  WarnaKoordinat(0,0,"");
        wk.setNamaWarna("Jingga");
        wk.setX(10);
        wk.setY(4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " 
                            + wk.getY());
        
    }
    
}
