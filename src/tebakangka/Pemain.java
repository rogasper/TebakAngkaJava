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
public class Pemain {
    int nilai = 100;
    int coba = 0;
    int nilaiBonus = 50;
    
    void berkurang(){
        nilai = nilai - 2;
    }
    
    void bonus(){
        nilai = nilai + nilaiBonus;
    }
}
