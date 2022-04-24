package com.srl.pkg;
//https://stackoverflow.com/questions/32392095/how-to-rotate-a-rectangle-after-reaching-specified-position/32397121#32397121
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

//import glassExample.GridBagLayout;
//import glassExample.JButton;
//import glassExample.JPanel;

public class PathFollow implements ActionListener{
	int dureetotal;
	JFrame frame ;
	JButton exit;
	BufferedImage bi = null;

    public int getDureetotal() {
		return dureetotal;
	}
	public void setDureetotal(int dureetotal) {
		this.dureetotal = dureetotal;
	}
	
	public PathFollow(List<Vertex> list) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {   
            	//jFrame
            	Mainpanel mypannel=new Mainpanel();
            	Mainpanel cnrl=new Mainpanel();
            	TestPane op = new TestPane(list);
            	mypannel.setPreferredSize(new Dimension(740, 580));
            	exit=new JButton("EXIT");
            	
            	exit.setPreferredSize(new Dimension(200,60));
            	exit.addActionListener(new ActionListener() {
            		  public void actionPerformed(ActionEvent e) {
            				frame.dispose();
            	  }});
            	mypannel.add(op);
            	cnrl.add(exit);
            	mypannel.add(cnrl);
            	
            	frame= new JFrame("GPS");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(1300, 580));
                frame.setLayout(new BorderLayout());
                
                
                
               
                
                frame.add(mypannel,BorderLayout.LINE_START);
                frame.add(cnrl);
                //frame.add(new TestPane(list));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    public class Mainpanel extends JPanel{
    	
    	
    	
    }
    public class TestPane extends JPanel {
        private Shape pathShape;
        private List<TronconObject> points;
        private Shape car;
        private double Temps=10000;
        private double angle;
        private Point2D pos;
        private int index;

        private Long startTime;

        public TestPane(List<Vertex> list) {
        	//Liste avec les sommet visit�
        	List<Sommet> listeShow = new ArrayList<Sommet>();
        	//Liste de tous les sommets avec coordonn�e
        	ListeSommet listeSommet = new ListeSommet();
        	
        	//Renplissage de la liste des somm� � visit�
        	for(int i=0;i<list.size();i++) {
        		for(int y =0;y<listeSommet.getListeSommet().size();y++) {
        			if(list.get(i).getName()==listeSommet.getListeSommet().get(y).getName()){
        				listeShow.add(listeSommet.getListeSommet().get(y));
        			}
        		}
        	}

        	//Path in console
			for(int i=0;i<listeShow.size();i++) {
				System.out.print(listeShow.get(i).getName()+"|");
				System.out.print(listeShow.get(i).getCoorX()+"|");
				System.out.println(listeShow.get(i).getCoorY()+"|");
			}
			//Voiture
            car = new Rectangle(0, 0, 10, 10);
            
            //Debut de la ligne du chemin
            Path2D path = new Path2D.Double();
            
            //Liste de TronconObject (Vitesse, Point2D)
            points = new ArrayList<>();
            
            //Debut de la ligne verte
            path.moveTo(listeShow.get(0).getCoorX(), listeShow.get(0).getCoorY());

            for(int y=0;y<listeShow.size()-1;y++) {

            	//Tracer la ligne du chemin
        		path.lineTo(listeShow.get(y+1).getCoorX(), listeShow.get(y+1).getCoorY());
        		
        		//Calculation de la distance
            	double Distance =Math.sqrt(
            				Math.pow(listeShow.get(y+1).getCoorX()-listeShow.get(y).getCoorX(), 2)+
            				Math.pow(listeShow.get(y+1).getCoorY()-listeShow.get(y).getCoorY(), 2));
            	
            	//Ecriture de tout les coordonn�es entre les sommet selon la direction
            	for(int i=0;i<Distance;i++) {
                	if(listeShow.get(y).getCoorX()==listeShow.get(y+1).getCoorX() 
                			&& listeShow.get(y).getCoorY()<listeShow.get(y+1).getCoorY()) {//Down
                		points.add(new TronconObject(new Point2D.Double(listeShow.get(y).getCoorX(),listeShow.get(y).getCoorY()+i),5000));
                	}else if(listeShow.get(y).getCoorX()==listeShow.get(y+1).getCoorX() 
                			&& listeShow.get(y).getCoorY()>listeShow.get(y+1).getCoorY()) {//Up
                		points.add(new TronconObject(new Point2D.Double(listeShow.get(y).getCoorX(),listeShow.get(y).getCoorY()-i),5000));
                	}else if(listeShow.get(y).getCoorY()==listeShow.get(y+1).getCoorY() 
                			&& listeShow.get(y).getCoorX()<listeShow.get(y+1).getCoorX()) {//Right
                		points.add(new TronconObject(new Point2D.Double(listeShow.get(y).getCoorX()+i,listeShow.get(y).getCoorY()),5000));
                	}else if(listeShow.get(y).getCoorY()==listeShow.get(y+1).getCoorY() 
                			&& listeShow.get(y).getCoorX()>listeShow.get(y+1).getCoorX()) {//Left
                		points.add(new TronconObject(new Point2D.Double(listeShow.get(y).getCoorX()-i,listeShow.get(y).getCoorY()),5000));
                	}
                }
            }
            //Chemin vert
            pathShape = path;
            
            //Timer qui permet d'utiliser une valeur de temps et de faire bougé la voiture
            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (startTime == null) {
                        startTime = System.currentTimeMillis();
                    }
                    long playTime = System.currentTimeMillis() - startTime;
                    double progress = playTime / Temps;
                    if (progress >= 1.0) {
                        progress = 1d;
                        ((Timer) e.getSource()).stop();
                    }

                    int index = Math.min(Math.max(0, (int) (points.size() * progress)), points.size() - 1);

                    pos = points.get(index).getPoint2D();
                    if (index < points.size() - 1) {
                        angle = angleTo(pos, points.get(index + 1).getPoint2D());
                    }
                    //Repositionne la voiture selon les coordonn�
                    repaint();
                }
            });
            
            //Commenc� Timer
            timer.start();
        }
        
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(723, 549);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            
            //Background Image
            BufferedImage bi = null;
            try {
            	//https://www.edrawsoft.com/template-street-map.html
            	bi = ImageIO.read(this.getClass().getResource("/image/Map2Edited.png"));
            }catch(Exception e){}
            g.drawImage(bi,0,0,this);
            //BackGround Image end;
            
            //Afficher la ligne avec la couleur verte
            g2d.setColor(Color.GREEN);
            g2d.draw(pathShape);
            //LAPREMIERE LIGNE _______________
            g.setColor(Color.GREEN);
            // PANNEAU E7 S21
            g.fillOval(120,40, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU E8 S20
            g.fillOval(310,40, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU E9 S18
            g.fillOval(540, 40, 15, 15);
            
            
            // LA DEUXIEME LIGNE_______________
            g.setColor(Color.GREEN);
            // PANNEAU E6 S22
            g.fillOval(40, 90, 15, 15);
            
            
            g.setColor(Color.GREEN);
            // PANNEAU  S22 S20
            g.fillOval(230, 90, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU S20 S19
            g.fillOval(370, 90, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU  S19 S18
            g.fillOval(470, 90, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU  S18 S17
            g.fillOval(590, 90, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S17 E10
            g.fillOval(680, 90, 15, 15);
            
            // TROISIEME LIGNE _______________
            g.setColor(Color.GREEN);
            // PANNEAU   S21 S7
            g.fillOval(120,130, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S7 S8
            g.fillOval(190,170, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S7 S6
            g.fillOval(120,200, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S19 S16
            g.fillOval(395,170, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S17 S14
            
            
            g.fillOval(645,170, 15, 15);
            // QUATRIEME LIGNE _______________
            
            g.setColor(Color.GREEN);
            // PANNEAU   S6 S10
            g.fillOval(120,300, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S8 S9
            g.fillOval(280,300, 15, 15);
            
            
            g.setColor(Color.GREEN);
            // PANNEAU   S16 S11
            g.fillOval(396,300, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S15 S12
            g.fillOval(530,300, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S14 S13
            g.fillOval(648,300, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S16 S15
            g.fillOval(463,248, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S15 S14
            g.fillOval(590,248, 15, 15);
            
            
            g.setColor(Color.GREEN);
            // PANNEAU   E5 S5
            g.fillOval(28,248, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S5 S6
            g.fillOval(90,248, 15, 15);
            
            //CINQUIEME LIGNE _______________
            
            g.setColor(Color.GREEN);
            // PANNEAU   S5 S4
            g.fillOval(52,350, 15, 15);
            
            
            g.setColor(Color.GREEN);
            // PANNEAU   S10 S9
            g.fillOval(190,388, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU    S9 S11
            g.fillOval(330,388, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU    S11 S12
            g.fillOval(463,388, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU    S12 S13
            g.fillOval(590,388, 15, 15);
            
            
            // SIXIEME LIGNE _______________
            g.setColor(Color.GREEN);
            // PANNEAU    S11 S2
            g.fillOval(396,430, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU    S12 S1
            g.fillOval(530,430, 15, 15);
            
            //SEPTIEME LIGNE _______________
            g.setColor(Color.GREEN);
            // PANNEAU E4 S4  
            g.fillOval(28,465, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU S4 S3    
            g.fillOval(90,465, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU S3 S2   
            g.fillOval(280,465, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU  S2 S1  
            g.fillOval(463,465, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S1 E11 
            g.fillOval(590,465, 15, 15);
            
          //DERNIERE LIGNE _______________
            
            g.setColor(Color.GREEN);
            // PANNEAU   S3 E3 
            g.fillOval(152,500, 15, 15);
            
            g.setColor(Color.GREEN);
            // PANNEAU   S2 E2 
            g.fillOval(400,500, 15, 15);
            
            
            g.setColor(Color.GREEN);
            // PANNEAU   S1 E1 
            g.fillOval(530,500, 15, 15);
            
            
            AffineTransform at = new AffineTransform();

            if (pos != null) {
                Rectangle bounds = car.getBounds();
                //Rotation de la voiture
                at.rotate(angle, (bounds.width / 2), (bounds.width / 2));

                //Draw la voiture
                Path2D player = new Path2D.Double(car, at);
                g2d.translate(pos.getX() - (bounds.width / 2), pos.getY() - (bounds.height / 2));
                g2d.draw(player);

                //Car red
                g2d.setColor(Color.BLUE);
                g2d.fill(player);
            }
            g2d.dispose();
        }

        //l'angle de la voiture
        protected double angleTo(Point2D from, Point2D to) {
            double angle = Math.atan2(to.getY() - from.getY(), to.getX() - from.getX());
            return angle;
        }

    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Object  source=e.getSource();
		if  (source==exit) {
		 frame.dispose();
		}
	}

}
