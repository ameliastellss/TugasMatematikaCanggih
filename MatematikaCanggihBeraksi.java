/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih hitung = new MatematikaCanggih(10, 3);

        int hasilTambah = hitung.tambah();
        System.out.println("Hasil penjumlahan: " + hasilTambah);

        int hasilKali = hitung.kali();
        System.out.println("Hasil perkalian: " + hasilKali);
        
        int hasilbagi = hitung.bagi();
        System.out.println("Hasil pembagian: " + hasilbagi);

        int hasilModulus = hitung.modulus();
        System.out.println("Hasil modulus: " + hasilModulus);
    }
}