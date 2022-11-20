/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.appmenus;

/**
 *
 * @author Sammy
 */
import javax.swing.JFrame;
public class AppMenus {

    public static void main(String[] args) {
        Principal_Form principal = new Principal_Form();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
}
