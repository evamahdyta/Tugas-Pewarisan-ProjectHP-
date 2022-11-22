/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projecthp;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059)
 */
import java.util.Scanner;

public class ProjectHP {

    public static void main(String[] args) {
       // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone iphone14 = new iPhone();
        Phone samsungzflip = new Samsung();
        Phone oppoa96 = new Oppo();
        

        // membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);
        PhoneUser dia = new PhoneUser(iphone14);
        PhoneUser dina = new PhoneUser(samsungzflip);
        PhoneUser dini = new PhoneUser(oppoa96);
        
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        int aksi; 
        int pilihan;

        do{
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("Pilihan Phone : ");
            System.out.println("[1] Xiaomi");
            System.out.println("[2] iPhone");
            System.out.println("[3] Samsung");
            System.out.println("[4] Oppo");
            System.out.println("[0] Keluar");
            System.out.println(" Silahkan Masukkan Pilihan Anda ");
            pilihan = input.nextInt();
            System.out.println("");
            switch (pilihan){
                case 1 : 
                    do{
                        System.out.println("");
                        System.out.println("Anda Memilih Xiaomi");
                        System.out.println("[1] Nyalakan Hp");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti Hp");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 : 
                                dian.turnOnThePhone();
                                break;
                            case 2 : 
                                dian.turnOffThePhone();
                                break;
                            case 3 : 
                                dian.makePhoneLouder();
                                break;
                            case 4 : 
                                dian.makePhoneSilent();
                                break; 
                            case 0 :
                                 System.exit(0);
                                 break;
                            default : 
                                System.out.println("");
                        }
                    }while(aksi != 5);
                    break;
                case 2 : 
                    do{
                        System.out.println("");
                        System.out.println("Anda Memilih iPhone");
                        System.out.println("[1] Nyalakan Hp");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti Hp");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 : 
                                dia.turnOnThePhone();
                                break;
                            case 2 : 
                                dia.turnOffThePhone();
                                break;
                            case 3 : 
                                dia.makePhoneLouder();
                                break;
                            case 4 : 
                                dia.makePhoneSilent();
                                break; 
                            case 0 :
                                 System.exit(0);
                                 break;
                            default : 
                                System.out.println("");
                        }
                    }while(aksi != 5);
                    break;
                case 3 : 
                    do{
                        System.out.println("");
                        System.out.println("Anda Memilih Samsung");
                        System.out.println("[1] Nyalakan Hp");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti Hp");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 : 
                                dina.turnOnThePhone();
                                break;
                            case 2 : 
                                dina.turnOffThePhone();
                                break;
                            case 3 : 
                                dina.makePhoneLouder();
                                break;
                            case 4 : 
                                dina.makePhoneSilent();
                                break; 
                            case 0 :
                                 System.exit(0);
                                 break;
                            default : 
                                System.out.println("");
                        }
                    }while(aksi != 5);
                    break;
                    case 4 : 
                    do{
                        System.out.println("");
                        System.out.println("Anda Memilih Oppo");
                        System.out.println("[1] Nyalakan Hp");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti Hp");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 : 
                                dini.turnOnThePhone();
                                break;
                            case 2 : 
                                dini.turnOffThePhone();
                                break;
                            case 3 : 
                                dini.makePhoneLouder();
                                break;
                            case 4 : 
                                dini.makePhoneSilent();
                                break; 
                            case 0 :
                                 System.exit(0);
                                 break;
                            default : 
                                System.out.println("");
                        }
                    }while(aksi != 5);
                    break;
                    
            } 
         }while(pilihan != 0);
     }
}
