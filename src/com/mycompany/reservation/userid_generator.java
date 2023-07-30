/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservation;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Udit
 */
public class userid_generator {
    
    public int gen()
    {
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyddhhss");  
             LocalDateTime now = LocalDateTime.now();  
             int i;  
        i = Integer.parseInt(dtf.format(now));
            return i;
    }
    
    
    
}
