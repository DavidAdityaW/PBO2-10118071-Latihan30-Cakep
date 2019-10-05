/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan30.cakep;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menentukan
 *                     programmer benar tidak ngerjain projectnya sendiri
 * 
 */
public class PBO210118071Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static final String RESET = "\u001b[0m";
    public static final String HITAM = "\u001b[30m";
    public static final String MERAH = "\u001b[31m";
    public static final String HIJAU = "\u001b[32m";
    public static final String KUNING = "\u001b[33m";
    public static final String BIRU = "\u001b[34m";
    public static final String UNGU = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String PUTIH = "\u001b[37m";
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println(MERAH + "Kamu " + HIJAU + "ngerjain sendiri " + KUNING + "latihan 17 sampe " + BIRU + "latihan 30 ini?" + RESET);
        System.out.print(BIRU + "Jawab " + MERAH + "(Yoi/Enggak) : " + RESET);
        String jawaban = input.next();
        
        jawaban = jawaban.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.println(MERAH + "\nCakep Bener. " + UNGU + "Good Job." + RESET);
        } else if (jawaban.equals("ENGGAK")) {
            System.out.println(MERAH + "\nTetep Cakep sih." + RESET);
            System.out.println(CYAN + "Sing penting paham konsep nya yee." + RESET);
            System.out.println(HITAM + "Keep the code works dude" + RESET);
        } else {
            System.out.println("\nHanya menerima input Yoi atau Enggak");
        }                
    }
    
}
