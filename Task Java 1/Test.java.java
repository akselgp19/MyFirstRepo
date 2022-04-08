/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author AKSEL
 */
public class Test {

    public static void main(String[] args) {
        Biodata b= new Biodata();
        
        b.getFullName("M. Aksel Ghailan Putra");
        b.getPlaceBirth("Bogor");
        b.getDateBirth(19," Mei ",2003);
        b.getHobby("Sleep");
        b.getZodiac("Taurus");
        b.getFavFood("Rice");
        b.getDreams("Millionaire");
    }
}
