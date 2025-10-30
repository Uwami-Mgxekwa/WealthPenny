package bankingsystem;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

public class BankingSystem {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
        String iconPath = "C:/Users/user/Desktop/JAVA/BankingSystem/src/bankingsystem/logo.png";
        
        // Check if file exists
        File iconFile = new File(iconPath);
        if (iconFile.exists()) {
            System.out.println("File exists: " + iconFile.getAbsolutePath());
        } else {
            System.err.println("File does not exist: " + iconFile.getAbsolutePath());
        }
        
        // Load and set the icon
        Image icon = new ImageIcon(iconPath).getImage();
        
        System.out.println("Icon loaded and set successfully.");
    } catch (Exception e) {
        System.err.println("Error loading icon: " + e.getMessage());

}
    }
    
}
