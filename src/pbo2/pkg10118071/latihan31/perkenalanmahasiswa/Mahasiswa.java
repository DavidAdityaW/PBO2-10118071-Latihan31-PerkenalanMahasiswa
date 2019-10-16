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
public class Mahasiswa {
    
    //syarat class = nama class, attribut dan method
    
    //attribut
    public String nim;
    public String nama;
    
    //method
    public void perkenalkanDiri(String nim, String nama){
        System.out.println("Hallo everyone \nMy NIM is " + nim + "\nMy Name is " + nama);
    }
    
}
