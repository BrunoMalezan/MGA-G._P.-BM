package apk;

import java.util.List;

import trunk.Branch;
import object.Animal;

import javax.swing.*;

public class Console {
	
	private static int key;
	
    public static Branch branch;

    public static void main(String[] args) {
    	start();
    	interaction();

    }
    
    public static void start() {
    	Branch _branch = new Branch("É AQUÁTICO?");
    	branch = _branch;
    	branch.left = new Branch("GATO");
    	branch.right = new Branch("GOLFINHO");
    	
    }
    
    public static void interaction() {
        do {
        	key = JOptionPane.showConfirmDialog(null, "IMAGINE UM ANIMAL..." 
            		+ "", "MGA - G.P. GAME", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == 2 || key == -1) {
        		System.exit(0);
        		
        	}
            
            key = JOptionPane.showConfirmDialog(null, "O ANIMAL QUE VOCÊ IMAGINOU " 
            		+ branch.value, "MGA - G.P. GAME", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == -1) {
        		System.exit(0);
        		
        	}
        	
            switch (key) {
            case 0:
            	branch.verification(branch.right);
                break;
                    
            case 1:
            	branch.verification(branch.left);
                break;
                    
            }
            
        } while (key == 0 || key == 1);
        
    }

}