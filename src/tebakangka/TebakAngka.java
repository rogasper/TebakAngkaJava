/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

/**
 *
 * @author Rogasper
 */
import java.util.Scanner;

public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mulai;
        int angka, tebakan_pemain;
        GenerateRandom genRan = new GenerateRandom();
        Pemain pemain1 = new Pemain();

        do {
            tebakan_pemain = 0;
            angka = genRan.hasilRandom();
            
            System.out.println("Hai.. Kompi punya permainan nih coba kalian tebak angka antara 1-100. silakan tebak");
            
            while (tebakan_pemain != angka) {
                if(pemain1.nilai == 0){
                    pemain1.nilai = 0;
                    for(int i = 0; i < 2; i++){
                        System.out.println();
                    }
                    System.out.println("====== Game Over ======");
                    break;
                }
                
                pemain1.coba += 1;
                System.out.print("Tebakan Anda: ");
                tebakan_pemain = input.nextInt();
                
                if (tebakan_pemain > angka) {
                    pemain1.berkurang();
                    System.out.println("Hehehe... Bilangan tebakan anda terlalu besar.");
                } else if (tebakan_pemain < angka) { 
                    pemain1.berkurang();
                    System.out.println("Hehehe... Bilangan tebakan anda terlalu Kecil.");
                } else {
                    System.out.println("Yeee... Bilangan tebakan anda BENAR :D.");
                    System.out.println();
                    System.out.println();
                    System.out.println("Anda sudah mencoba "+ pemain1.coba+" kali");
                    if(pemain1.coba <= 5){
                        pemain1.bonus();
                        System.out.println("Mendapatkan bonus " + pemain1.nilaiBonus + ",karena menebak tidak lebih dari 5 kali");
                    }
                    System.out.println("Total Score: " + pemain1.nilai);
                    System.out.println();
                }
            }

            System.out.print("Coba lagi? (tekan y jika iya) ");
            mulai = input.next();
            pemain1.coba = 0;
            System.out.println();
            System.out.println();
        } while (mulai.equals("y"));
    }
    
}
