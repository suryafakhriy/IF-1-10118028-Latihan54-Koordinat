/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan54.koordinat;

/**
 *
 * @author User
 */
public class WarnaKoordinat extends Koordinat {

    public String namaWarna;
    
    public WarnaKoordinat(int x, int y , String namaWarna ) {
        super(x, y);
        System.out.println("Warna Koordinat : " + namaWarna);
        System.out.println("Koordinat Sumbu x : " + x + ", y : " + y);
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
}
