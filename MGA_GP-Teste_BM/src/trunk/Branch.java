package trunk;

import javax.swing.*;

import object.Animal;

public class Branch {
    public Branch left;
    public Branch right;
    public String value;
    public int key;

    public Branch(String value) {
        this.value = value;
        
    }

    public void verification(Branch animal) { 
         key = JOptionPane.showConfirmDialog(null, "O ANIMAL QUE VOCÊ IMAGINOU = " 
        		 + animal.value, "MGA - G.P. GAME", JOptionPane.YES_NO_OPTION, 
        		 JOptionPane.QUESTION_MESSAGE);
        if (key == 0) {
            if (animal.right == null) {
                JOptionPane.showMessageDialog(null, "OPA! ACERTEI!");
                
            } else {
                verification(animal.right);
                
            }
            
        } else if (key == -1){
        	System.exit(0);
        	
        }

        if (key == 1) {
            if (animal.left == null)
            	modelTO(animal);
            
            else {
            	
            	verification(animal.left);
                
            }
            
        }
        
    }

    public void modelTO(Branch animal) {
        String _save = JOptionPane.showInputDialog(null, "QUAL ANIMAL VOCÊ IMAGINOU?", 
        		"MGA - G.P. GAME", 3);
        if(_save == null) {
        	System.exit(0);
        }
        String _feature = (JOptionPane.showInputDialog(null, "UM(A) " + _save + " ?___?___?, MAS UM(A) " 
        			+ animal.value + " NÃO.", "MGA - G.P. GAME", 3));
        if(_feature == null) {
        	System.exit(0);
        }
        String _change = animal.value;
        Animal animalobj = new Animal(_save, _feature);
        int confirmation = JOptionPane.showConfirmDialog(null, animalobj.getType() + " = " + animalobj.getFeature() 
        + "", "MGA - G.P. GAME", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(confirmation) {
        case 0:
            animal.value = _feature;
            animal.right = new Branch(_save);
            animal.left = new Branch(_change);
        	break;
        case 1:
        	modelTO(animal);
        	break;
        case -1:
        	System.exit(0);
        	break;
        
        }

    }
    
}