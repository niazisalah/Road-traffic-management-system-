/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srl.pkg;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Control extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Control
     */
    public Control() {
        initComponents();
        resizeImage();
    }
    
    public void resizeImage(){
        ImageIcon icon;
        
        icon = new ImageIcon(getClass().getResource("/image/Map2Edited.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel1.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	//ImageIcon icone = new ImageIcon("/image/Map2Edited.png");
    	
        jLabel1 = new javax.swing.JLabel();
        //jLabel1.setIcon(icone);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       // jLabel1.setText("jLabel1");
        jButton1.setForeground(Color.RED);
		jButton1.setBackground(Color.BLUE); 
		jButton2.setForeground(Color.RED);
        jButton1.setText("Départ");

        jButton2.setText("Arrivé");

        jTextField1.setText("");

        jTextField2.setText("");

        jButton3.setText("Validation");

        jButton4.setText("Inserer un trançon");

        jTextField3.setText("");

        jButton5.setText("Validation");
        
        jButton3.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(136, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }
    
    private void jButton3ActionPerformed(final java.awt.event.ActionEvent evt) {                                         
        // VALIDATION:
    	
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
	@Override
	public void actionPerformed(ActionEvent e) {
		Object  source=e.getSource();
		if  (source==jButton3)
		{
		    Vertex E1 = new Vertex("E1");
	 	    Vertex E2 = new Vertex("E2");
	 	    Vertex E3 = new Vertex("E3");
	 	    Vertex E4 = new Vertex("E4");
	 	    Vertex E5 = new Vertex("E5");
	 	    Vertex E6 = new Vertex("E6");
	 	    Vertex E7 = new Vertex("E7");
	 	    Vertex E8 = new Vertex("E8");
	 	    Vertex E9 = new Vertex("E9");
	 	    Vertex E10 = new Vertex("E10");
	 	    Vertex E11 = new Vertex("E11");

	 	    //Sommet Stop
	 	    Vertex S1 = new Vertex("S1");
	 	    Vertex S2 = new Vertex("S2");
	 	    Vertex S3 = new Vertex("S3");
	 	    Vertex S4 = new Vertex("S4");
	 	    Vertex S5 = new Vertex("S5");
	 	    Vertex S6 = new Vertex("S6");
	 	    Vertex S7 = new Vertex("S7");
	 	    Vertex S8 = new Vertex("S8");
	 	    Vertex S9 = new Vertex("S9");
	 	    Vertex S10 = new Vertex("S10");
	 	    Vertex S11 = new Vertex("S11");
	 	    Vertex S12 = new Vertex("S12");
	 	    Vertex S13 = new Vertex("S13");
	 	    Vertex S14 = new Vertex("S14");
	 	    Vertex S15 = new Vertex("S15");
	 	    Vertex S16 = new Vertex("S16");
	 	    Vertex S17 = new Vertex("S17");
	 	    Vertex S18 = new Vertex("S18");
	 	    Vertex S19 = new Vertex("S19");
	 	    Vertex S20 = new Vertex("S20");
	 	    Vertex S21 = new Vertex("S21");

	 	    //Entry Edge(Time,Start,End)
	 	    E1.addNeighbour(new Edge(4,E1,S1));
	 	    E2.addNeighbour(new Edge(4,E2,S2));
	 	    E3.addNeighbour(new Edge(4,E3,S3));
	 	    E4.addNeighbour(new Edge(4,E4,S4));
	 	    E5.addNeighbour(new Edge(4,E5,S5));
	 	    E6.addNeighbour(new Edge(4,E6,S21));
	 	    E7.addNeighbour(new Edge(4,E7,S21));
	 	    E8.addNeighbour(new Edge(4,E8,S20));
	 	    E9.addNeighbour(new Edge(4,E9,S18));
	 	    E10.addNeighbour(new Edge(4,E10,S17));
	 	    E11.addNeighbour(new Edge(4,E11,S1));
	 	    
	 	    //E1.getAdjacenciesList().get(1).setTime(100);
	 	    //S1
	 	    S1.addNeighbour(new Edge(4,S1,E1));
	 	    S1.addNeighbour(new Edge(4,S1,E11));
	 	    S1.addNeighbour(new Edge(4,S1,S2));
	 	    S1.addNeighbour(new Edge(4,S1,S12));
	 	    
	 	    //S2
	 	    S2.addNeighbour(new Edge(4,S2,E2));
	 	    S2.addNeighbour(new Edge(4,S2,S1));
	 	    S2.addNeighbour(new Edge(4,S2,S11));
	 	    S2.addNeighbour(new Edge(4,S2,S3));
	 	    
	 	    //S3
	 	    S3.addNeighbour(new Edge(4,S3,E3));
	 	    S3.addNeighbour(new Edge(4,S3,S2));
	 	    S3.addNeighbour(new Edge(4,S3,S4));

	 	    //S4
	 	    S4.addNeighbour(new Edge(4,S4,E4));
	 	    S4.addNeighbour(new Edge(4,S4,S5));
	 	    S4.addNeighbour(new Edge(4,S4,S3));
	 	    
	 	    //S5
	 	    S5.addNeighbour(new Edge(4,S5,E5));
	 	    S5.addNeighbour(new Edge(4,S5,S4));
	 	    S5.addNeighbour(new Edge(4,S5,S6));
	 	    
	 	    //S6
	 	    S6.addNeighbour(new Edge(4,S6,S7));
	 	    S6.addNeighbour(new Edge(4,S6,S5));
	 	    S6.addNeighbour(new Edge(4,S6,S10));
	 	    
	 	    //S7
	 	    S7.addNeighbour(new Edge(4,S7,S6));
	 	    S7.addNeighbour(new Edge(4,S7,S21));
	 	    S7.addNeighbour(new Edge(4,S7,S8));
	 	    
	 	    //S8
	 	    S8.addNeighbour(new Edge(4,S8,S7));
	 	    S8.addNeighbour(new Edge(4,S8,S9));
	 	    
	 	    //S9
	 	    S9.addNeighbour(new Edge(4,S9,S8));
	 	    S9.addNeighbour(new Edge(4,S9,S10));
	 	    S9.addNeighbour(new Edge(4,S9,S11));
	 	    
	 	    //S10
	 	    S10.addNeighbour(new Edge(4,S10,S6));
	 	    S10.addNeighbour(new Edge(4,S10,S9));
	 	    
	 	    //S11
	 	    S11.addNeighbour(new Edge(4,S11,S9));
	 	    S11.addNeighbour(new Edge(4,S11,S16));
	 	    S11.addNeighbour(new Edge(4,S11,S2));
	 	    S11.addNeighbour(new Edge(4,S11,S12));
	 	    
	 	    //S12
	 	    S12.addNeighbour(new Edge(4,S12,S11));
	 	    S12.addNeighbour(new Edge(4,S12,S15));
	 	    S12.addNeighbour(new Edge(4,S12,S13));
	 	    S12.addNeighbour(new Edge(4,S12,S1));
	 	    
	 	    //S13
	 	    S13.addNeighbour(new Edge(4,S13,S12));
	 	    S13.addNeighbour(new Edge(4,S13,S14));
	 	    
	 	    //S14
	 	    S14.addNeighbour(new Edge(4,S14,S13));
	 	    S14.addNeighbour(new Edge(4,S14,S15));
	 	    S14.addNeighbour(new Edge(4,S14,S17));
	 	    
	 	    //S15
	 	    S15.addNeighbour(new Edge(4,S15,S12));
	 	    S15.addNeighbour(new Edge(4,S15,S16));
	 	    S15.addNeighbour(new Edge(4,S15,S14));
	 	    
	 	    //S16
	 	    S16.addNeighbour(new Edge(4,S16,S11));
	 	    S16.addNeighbour(new Edge(4,S16,S15));
	 	    S16.addNeighbour(new Edge(4,S16,S19));
	 	    
	 	    //S17
	 	    S17.addNeighbour(new Edge(4,S17,E10));
	 	    S17.addNeighbour(new Edge(10,S17,S14));
	 	    S17.addNeighbour(new Edge(4,S17,S18));
	 	    
	 	    //S18
	 	    S18.addNeighbour(new Edge(4,S18,S17));
	 	    S18.addNeighbour(new Edge(4,S18,E9));
	 	    S18.addNeighbour(new Edge(4,S18,S19));
	 	    
	 	    //S19
	 	    S19.addNeighbour(new Edge(4,S19,S16));
	 	    S19.addNeighbour(new Edge(4,S19,S20));
	 	    S19.addNeighbour(new Edge(4,S19,S18));
	 	    
	 	    //S20
	 	    S20.addNeighbour(new Edge(4,S20,E8));
	 	    S20.addNeighbour(new Edge(4,S20,S19));
	 	    S20.addNeighbour(new Edge(4,S20,S21));
	 	    
	 	    //S21
	 	    S21.addNeighbour(new Edge(4,S21,E7));
	 	    S21.addNeighbour(new Edge(4,S21,S20));
	 	    S21.addNeighbour(new Edge(4,S21,S7));
	 	    S21.addNeighbour(new Edge(4,S21,E6));
	 	    
	 	    DijkstraShortestPath chemincours = new DijkstraShortestPath();
	    	
	    	//ON prend les valeurs saisi
	    	String dep = jTextField1.getText();
	    	String arri = jTextField2.getText();
	    	// ON FAIT LA CONVERSION
	    	
	    	Vertex END;
	    	Vertex START;
	    	switch(arri) {
	    	  	 case "E1":
	    		   END = E1;
	    		    break;
	    		  case "E2":
	    			  END = E1;
	    		    break;
	    		  case "E3":
	    			  END = E3;
	    		    break;
	    		  case "E4":
	    			  END = E4;
	    		    break;
	    		  case "E5":
	    			  END = E5;
	    		    break;
	    		  case "E6":
	    			  END = E6;
	    		    break;
	    		  case "E7":
	    			  END = E7;
	    		    break;
	    		  case "E8":
	    			  END = E8;
	    		    break;
	    		  case "E9":
	    			  END = E9;
	    		    break;  
	    		  case "E10":
	    			  END = E10;
	    		    break;
	    		  case "E11":
	    			  END = E11;
	    		    break;
	    		    
	    		  default:
	    			  END = E1;
	    		}
	    	
	    	// CONVERSION DES SORTIE ENTRE PAR LE USER
	    	
	    	switch(dep) {
		  	 case "S1":
		  		START = S1;
			    break;
			  case "S2":
				  START = S1;
			    break;
			  case "S3":
				  START = S3;
			    break;
			  case "S4":
				  START = S4;
			    break;
			  case "S5":
				  START = S5;
			    break;
			  case "S6":
				  START = S6;
			    break;
			  case "S7":
				  START = S7;
			    break;
			  case "S8":
				  START = S8;
			    break;
			  case "S9":
				  START = S9;
			    break;  
			  case "S10":
				  START = S10;
			    break;
			  case "S11":
				  START = S11;
			    break;
			  case "S12":
				  START = S12;
				    break;
			  case "S13":
				  START = S13;
				    break;
				  case "S14":
					  START = S14;
				    break;
				  case "S15":
					  START = S15;
				    break;
				  
				  case "S16":
					  START = S16;
				    break;
				  case "S17":
					  START = S17;
				    break;
				  case "S18":
					  START = S18;
				    break;
				  case "S19":
					  START = S19;
				    break;  
				  case "S20":
					  START = S20;
				    break;
				  case "S21":
					  START = S21;
				    break;
			  default:
				  START = S1;
			}
		
	    	
	    	chemincours.computeShortestPaths(START);
		    System.out.println(chemincours.getShortestPathTo(E3));
		    PathFollow pathfollow = new PathFollow(chemincours.getShortestPathTo(END));
		    
		    
		    //pathfollow.setDureetotal(10);
		
	}
		else {
		// boutton Congestion est Activé , on va congestionner un sommet
		
	}
		}
}
