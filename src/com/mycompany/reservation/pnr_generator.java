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
public class pnr_generator {
    
    public static String pnr()
    {
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyddMMhhss");  
             LocalDateTime now = LocalDateTime.now();  
             String i;  
        i = (String)(dtf.format(now));
            return i;
    }
}
