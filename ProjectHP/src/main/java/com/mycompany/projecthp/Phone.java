/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projecthp;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059)
 */
public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0; 
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
