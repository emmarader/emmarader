package application;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import application.Login;


public class Main extends JFrame {

    
    public static void main(String[] args) {
        
        
        createRequiredFileIfDoesNotExist();
        
        Login im = new Login();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setVisible(true);
    }
    
    private static void createRequiredFileIfDoesNotExist() {
        String fileNames [];
        
        File rootDir = new File("storage");
        rootDir.mkdirs();
        
        fileNames = new String [] {"item.txt",
            "order.txt",
            "orderLine.txt"};
        
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if(!file.exists())
            {  
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
       
    }

}
