package collegemangementsystem;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CollegeMangementSystem {
    private static CollegeMangementSystem instance;
    
    // Private constructor to prevent instantiation from outside the class
    private CollegeMangementSystem() {
        // Initialization code, if any
    }
    
    // Static method to get the singleton instance
    public static CollegeMangementSystem getInstance() {
        if (instance == null) {
            instance = new CollegeMangementSystem();
        }
        return instance;
    }

    public void start() {
        System.out.println("JDBC Start ");
        System.out.println("Program is running on GUI...");
        HomePage hp = new HomePage();
        hp.setVisible(true);
    }

    public static void main(String[] args) {
        CollegeMangementSystem cms = CollegeMangementSystem.getInstance();
        cms.start();
    }
}
