
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Scanner;
import javax.swing.JOptionPane;

class AuthenicationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Scanner scnr = new Scanner(System.in);  //scnr created for new inputs
        FileInputStream admin = null;   // flieinputs for each userrole
        FileInputStream zookeeper = null;
        FileInputStream veterinarian = null;

        
        final int NUM_ELEMENTS = 7;  // based on elements in credentials.txt array
        String[] storedUsername = new String[NUM_ELEMENTS];
        String[] role = new String[NUM_ELEMENTS];
        String[] hashPassword = new String[NUM_ELEMENTS];
        String username = "";
        String password = "";
        String hash = "";
        String userRole = "";

        int i = 0; //loop variable
        int j = 0; //loop variable
        int user = 0;
        boolean verified = false;

        // Username and Passwords based on arrays
        
        
        storedUsername[i] = "griffin.keyes";
        hashPassword[i] = "108de81c31bf9c622f76876b74e9285f";
        ++i;
                
        storedUsername[i] = "rosario.dawson";
        hashPassword[i] = "3e34baa4ee2ff767af8c120a496742b5";
        ++i;
        
        storedUsername[i] = "bernie.gorilla";
        hashPassword[i] = "a584efafa8f9ea7fe5cf18442f32b07b";
        ++i;
        
        storedUsername[i] = "donald.monkey";
        hashPassword[i] = "17b1b7d8a706696ed220bc414f729ad3";
        ++i;
        
        storedUsername[i] = "jerome.grizzlybear";
        hashPassword[i] = "3adea92111e6307f8f2aae4721e77900";
        ++i;
        
        storedUsername[i] = "bruce.grizzlybear";
        hashPassword[i] = "0d107d09f5bbe40cade3de5c71e9e9b7";
        ++i;
        
        storedUsername[i] = "quit";
        hashPassword[i] = "39249bdjshiigdskgopsdfkgposdfg";
        ++i;
           
        username = (String) JOptionPane.showInputDialog(null, "Enter username: ", "Authentication System", JOptionPane.PLAIN_MESSAGE);
       
        password = (String) JOptionPane.showInputDialog(null, "Enter password: ", "Authentication System", JOptionPane.PLAIN_MESSAGE);
        
        
            
        
       
        
   
        
        
        switch (password) {    // Switch statement for passwords
           
            case "alphabet soup":
                
                JOptionPane.showMessageDialog(null, "Hello, Zookeeper!" + "\n"
                        
                        + "As zookeeper, you have access to all of the animals' information and their daily monitoring logs. "
                        
                        + "This allows you to track their feeding habits, habitat conditions, and general welfare.", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                  break;
              
            case "M0nk3y business":
                
                JOptionPane.showMessageDialog(null, "Hello, Zookeeper!" + "\n"
                        
                        + "As zookeeper, you have access to all of the animals' information and their daily monitoring logs. "
                        
                        + "This allows you to track their feeding habits, habitat conditions, and general welfare.", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                break;
                         
                
            case "secret password":
                
                JOptionPane.showMessageDialog(null, "Hello, Veterinarian!" + "\n"
                        
                        + "As veterinarian, you have access to all of the animals' health records. "
                        
                        + "This allows you to view each animal's medical history and current treatments/illnesses (if any), and to maintain a vaccination log.", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                break;
               
            case "grizzly1234":
                
                JOptionPane.showMessageDialog(null, "Hello, Veterinarian!" + "\n"
                        
                        + "As veterinarian, you have access to all of the animals' health records. "
                        
                        + "This allows you to view each animal's medical history and current treatments/illnesses (if any), and to maintain a vaccination log.", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                break;

            case "animal doctor":
                
                JOptionPane.showMessageDialog(null,"Hello, System Admin!" + "\n"
                        
                        + "As administrator, you have access to the zoo's main computer system."
                        
                        + "This allows you to monitor users in the system and their roles.", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                break;
                
            case "letmein":
                
                 JOptionPane.showMessageDialog(null,"Hello, System Admin!" + "\n"
                        
                        + "As administrator, you have access to the zoo's main computer system."
                        
                        + "This allows you to monitor users in the system and their roles.", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                
            case "quit":
                
                   JOptionPane.showMessageDialog(null, "You have chosen to exit. Goodbye.", "Authentication System",
                                JOptionPane.WARNING_MESSAGE);
                       return; 
                   
            
                }
         
                if (userRole.contains(storedUsername[i])) {
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid user credentials. " + (3 - i) + " attempt(s) remaining.", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                    
                    username = (String) JOptionPane.showInputDialog(null, "Enter username: ", "Authentication System", JOptionPane.PLAIN_MESSAGE);
                }
                
            for (i = 0; i <= 3; ++i) {
                if (!hash.equals(hashPassword[user])) {
                verified = false;
                if (i <= 2) {
                    
                    
                    
                }
                
                if ((!verified) && (i == 3)) {
                    JOptionPane.showMessageDialog(null, "Could not verify credentials. Goodbye.", "Authentication System", JOptionPane.ERROR_MESSAGE);
                 break;
                 
                 
               
                }
                
               

                    for (j = 0; j < NUM_ELEMENTS; ++j) {
                        if (username.equals(storedUsername[j])) {
                            String original = password;     // Provided MD5 Hash Passcode
                            MessageDigest md = MessageDigest.getInstance("MD5");
                            md.update(original.getBytes());
                            byte[] digest = md.digest();
                            StringBuilder sb = new StringBuilder(); // I did change MD5 to a StringBuilder via the suggestion in NetBeans
                            for (byte b : digest) {
                                sb.append(String.format("%02x", b & 0xff));
                            }

                            user = j;
                            hash = sb.toString();
                        }
                    }
                    
                      
                
               
                
        

                
                
               

                }
                
        }
    }
}



    

















