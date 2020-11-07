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
import java.util.Random;
public class GenerateRandom {
    int ANGKA_MAKSIMAL = 100;
    Random rand = new Random();
    
    int hasilRandom(){
        return rand.nextInt(ANGKA_MAKSIMAL) + 1;
    }
}
