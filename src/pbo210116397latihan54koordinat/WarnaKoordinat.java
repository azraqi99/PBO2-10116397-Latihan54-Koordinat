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
public class WarnaKoordinat extends Koordinat{
    
    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna){
     super (x, y);
    }
    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
}
