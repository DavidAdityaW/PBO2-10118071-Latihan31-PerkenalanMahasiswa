/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan31.perkenalanmahasiswa;

/**
*
* @author 
* NAMA              : David Aditya Winarto
* KELAS             : PBO2
* NIM               : 10118071
* Deskripsi Program : Program ini berisi program untuk menampilkan
*                     data mahasiswa dengan konsep pendekatan objek
* 
*/
public class PBO210118071Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instansiasi objek
        Mahasiswa objMhs = new Mahasiswa();
        objMhs.nim = "10110269";
        objMhs.nama = "Rizki Adam Kurniawan";
        
        objMhs.perkenalkanDiri(objMhs.nim,objMhs.nama);
        
        System.out.println();
        objMhs.nim = "10110270";
        objMhs.nama = "Indra Tiola";
        
        objMhs.perkenalkanDiri(objMhs.nim,objMhs.nama);
        
        System.out.println();
        objMhs.nim = "10110271";
        objMhs.nama = "Robi Tanzil Ganefi";
        
        objMhs.perkenalkanDiri(objMhs.nim,objMhs.nama);
        
        System.out.println();
        objMhs.nim = "10110269";
        objMhs.nama = "Muhammad Nur Awaludin";
        
        objMhs.perkenalkanDiri(objMhs.nim,objMhs.nama);
    }
    
}
