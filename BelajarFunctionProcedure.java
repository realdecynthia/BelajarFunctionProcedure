/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package belajarfunctionprocedure;

/**
 *
 * @author USER
 */
public class BelajarFunctionProcedure {
    public static void main(String[] args) {
        BelajarFunctionProcedure belajar = new BelajarFunctionProcedure();
        belajar.tambah(1,2);
        belajar.kurang(5,4);
        System.out.println(belajar.fungsiTambah(2,4));
    }
    
    private void tambah(int a, int b) { 
        int hasil;
        hasil = a + b;
    System.out.println(hasil);
    }

    private void kurang(int a, int b) { 
        int hasil;
        hasil = a - b;
    System.out.println(hasil);
    }
    
private int fungsiTambah(int a, int b) { 
        return a+b;
    }

}
    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
  

