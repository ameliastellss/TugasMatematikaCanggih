/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

class MatematikaCanggih {
    private int Bilangan1;
    private int Bilangan2;

    
    public MatematikaCanggih(int Bilangan1, int Bilangan2) {
        this.Bilangan1 = Bilangan1;
        this.Bilangan2 = Bilangan2;
    }

    
    public int tambah() {
        return Bilangan1 + Bilangan2;
    }

    
    public int kali() {
        return Bilangan1 * Bilangan2;
    }

    public int bagi() {
        return Bilangan1 / Bilangan2;
    }
   
    public int modulus() {
        return Bilangan1 % Bilangan2;
    }
}
