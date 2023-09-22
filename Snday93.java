import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Snday93 extends JFrame implements ActionListener{
	Container cp;
	JButton b1, b2;
	JPanel j1,j2,j3;
	JRadioButton k1,k2,k3,k4,k5,k6;
	ButtonGroup names;
	JLabel start;
	JTextArea textArea;

	public Snday93() {
		
		cp = getContentPane();
		setTitle("اليوم الوطني السعودي -نحلم ونحقق");
 		setSize(800,400);
 		setLocation(350, 150);
 		setVisible(true);
 		setLayout(new BorderLayout());
 		names = new ButtonGroup();
 		
 		k1=new JRadioButton ("د/ سارة أبو غزالة");
 		k1.setBorder(BorderFactory.createLineBorder(Color.BLACK,100));
 		k1.setFont(new Font("Calibri",Font.PLAIN,25));
        k2=new JRadioButton ("د/ حامد القحطاني");
        k2.setBorder(BorderFactory.createLineBorder(Color.BLACK,100));
        k2.setFont(new Font("Calibri",Font.PLAIN,25));
        k3=new JRadioButton ("د/ سمية عزوني");
        k3.setBorder(BorderFactory.createLineBorder(Color.BLACK,100));
        k3.setFont(new Font("Calibri",Font.PLAIN,25));
        k4=new JRadioButton ("أ/ مها ناصر");
        k4.setBorder(BorderFactory.createLineBorder(Color.BLACK,100));
        k4.setFont(new Font("Calibri",Font.PLAIN,25));
        k5=new JRadioButton ("م/ سعيد الوادعي");
        k5.setBorder(BorderFactory.createLineBorder(Color.BLACK,100));
        k5.setFont(new Font("Calibri",Font.PLAIN,25));
        k6=new JRadioButton ("الطالبة شيماء حمود");
        k6.setBorder(BorderFactory.createLineBorder(Color.BLACK,100));
        k6.setFont(new Font("Calibri",Font.PLAIN,25));
        
        names.add(k1);
        names.add(k2);
        names.add(k3);
        names.add(k4);
        names.add(k5);
        names.add(k6);
        
 		j1 = new JPanel(new FlowLayout());
 		start = new JLabel(" شخصيات سعودية ملهمة في مجال التقنية :      ");
 		start.setFont(new Font("Calibri",Font.PLAIN,25));
 		j1.add(start);
 		
 		j3 = new JPanel(new FlowLayout());
 	    j3.add(k1);
 	    j3.add(k2);
 	    j3.add(k3);
 	    j3.add(k4);
 	    j3.add(k5);
 	    j3.add(k6);
 	    
 	    b1 = new JButton("OPEN");
 	    b1.setPreferredSize(new Dimension(200,50));
 	    b1.addActionListener(this);
 	    
 	    b2 = new JButton("CLOSE");
	    b2.setPreferredSize(new Dimension(200,50));
	    b2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (e.getSource().equals(b2)) {
	    			dispose();
	    		} 
	    	  }
    		});
 	    
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	    j2 = new JPanel(new FlowLayout());
 	    j2.add(b1);
 	    j2.add(b2);
 	   
 		cp.add(j1, new BorderLayout().NORTH);
 		cp.add(j3, new BorderLayout().CENTER);
 		cp.add(j2, new BorderLayout().SOUTH);
 			
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			JFrame s1 = new JFrame();
	 		s1.setSize(800,400);
	 		s1.setLocation(350, 150);
	 		s1.setLayout(new GridLayout(3,1));
	 		
	 		if(k1.isSelected()) {
	 			s1.setTitle("د/ سارة أبو غزالة");
	 			s1.setVisible(true);
	 			b1 = new JButton("Click here");
	 			b1.setPreferredSize(new Dimension(200,50));
	 			b1.addActionListener(new ActionListener() {
	 	            @Override
	 	            public void actionPerformed(ActionEvent e) {
	 	                // Open the link in a browser
	 	                if (Desktop.isDesktopSupported()) {
	 	                    try {
	 	                        Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1tQYwLoftGpAVaxSucf8ujkMTFH-OTstL/view?usp=sharing"));
	 	                    } catch (Exception ex) {
	 	                        ex.printStackTrace();
	 	                    }
	 	                }
	 	            }
	 	        });
	 			  j1 = new JPanel(new FlowLayout());
	 			  j1.add(new JLabel());
	              j1.add(b1);
	              j1.add(new JLabel());
		 	      s1.add(j1);
	 
	 		}else if(k2.isSelected()) {
	 			s1.setTitle("د/ حامد القحطاني");
	 			s1.setVisible(true);
	 			b1 = new JButton("Click here");
	 			b1.setPreferredSize(new Dimension(200,50));
	 			b1.addActionListener(new ActionListener() {
	 	            @Override
	 	            public void actionPerformed(ActionEvent e) {
	 	                // Open the link in a browser
	 	                if (Desktop.isDesktopSupported()) {
	 	                    try {
	 	                        Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1b4WwO_MNJP7GBGgY93e5ghUCGs06ToLh/view?usp=sharing"));
	 	                    } catch (Exception ex) {
	 	                        ex.printStackTrace();
	 	                    }
	 	                }
	 	            }
	 	        });
	 			  j1 = new JPanel(new FlowLayout());
	 			  j1.add(new JLabel());
	              j1.add(b1);
	              j1.add(new JLabel());
		 	      s1.add(j1);
	 			

	 		}else if(k3.isSelected()) {
	 			s1.setTitle("د/ سمية عزوني");
	 			s1.setVisible(true);
	 			b1 = new JButton("Click here");
	 			b1.setPreferredSize(new Dimension(200,50));
	 			b1.addActionListener(new ActionListener() {
	 	            @Override
	 	            public void actionPerformed(ActionEvent e) {
	 	                // Open the link in a browser
	 	                if (Desktop.isDesktopSupported()) {
	 	                    try {
	 	                        Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1uYNPhcl814_HHgFhDOhNbwMvBfBkr354/view?usp=sharing"));
	 	                    } catch (Exception ex) {
	 	                        ex.printStackTrace();
	 	                    }
	 	                }
	 	            }
	 	        });
	 			  j1 = new JPanel(new FlowLayout());
	 			  j1.add(new JLabel());
	              j1.add(b1);
	              j1.add(new JLabel());
		 	      s1.add(j1);
		 	      
	 		}else if(k4.isSelected()) {
	 			s1.setTitle("أ/ مها ناصر");
	 			s1.setVisible(true);
	 			b1 = new JButton("Click here");
	 			b1.setPreferredSize(new Dimension(200,50));
	 			b1.addActionListener(new ActionListener() {
	 	            @Override
	 	            public void actionPerformed(ActionEvent e) {
	 	                // Open the link in a browser
	 	                if (Desktop.isDesktopSupported()) {
	 	                    try {
	 	                        Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1mqNQOeUCRmPQOQ934P6oXzQW1ZFZuUEH/view?usp=sharing"));
	 	                    } catch (Exception ex) {
	 	                        ex.printStackTrace();
	 	                    }
	 	                }
	 	            }
	 	        });
	 			  j1 = new JPanel(new FlowLayout());
	 			  j1.add(new JLabel());
	              j1.add(b1);
	              j1.add(new JLabel());
		 	      s1.add(j1);
		 	      
	 		}else if(k5.isSelected()) {
	 			s1.setTitle("م/ سعيد الوادعي");
	 			s1.setVisible(true);
	 			b1 = new JButton("Click here");
	 			b1.setPreferredSize(new Dimension(200,50));
	 			b1.addActionListener(new ActionListener() {
	 	            @Override
	 	            public void actionPerformed(ActionEvent e) {
	 	                // Open the link in a browser
	 	                if (Desktop.isDesktopSupported()) {
	 	                    try {
	 	                        Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/15ye5O5uabHKuB0OSgoU1z63Kha3dFrZP/view?usp=sharing"));
	 	                    } catch (Exception ex) {
	 	                        ex.printStackTrace();
	 	                    }
	 	                }
	 	            }
	 	        });
	 			  j1 = new JPanel(new FlowLayout());
	 			  j1.add(new JLabel());
	              j1.add(b1);
	              j1.add(new JLabel());
		 	      s1.add(j1);
		 	      
	 		}else if(k6.isSelected()) {
	 			s1.setTitle("الطالبة شيماء حمود");
	 			s1.setVisible(true);
	 			b1 = new JButton("Click here");
	 			b1.setPreferredSize(new Dimension(200,50));
	 			b1.addActionListener(new ActionListener() {
	 	            @Override
	 	            public void actionPerformed(ActionEvent e) {
	 	                // Open the link in a browser
	 	                if (Desktop.isDesktopSupported()) {
	 	                    try {
	 	                        Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1npomfT-zNf30eNP9YChAESUwVRs_v8O8/view?usp=sharing"));
	 	                    } catch (Exception ex) {
	 	                        ex.printStackTrace();
	 	                    }
	 	                }
	 	            }
	 	        });
	 			  j1 = new JPanel(new FlowLayout());
	 			  j1.add(new JLabel());
	              j1.add(b1);
	              j1.add(new JLabel());
		 	      s1.add(j1);
	 		}
	 		
	 		b1 = new JButton("Back");
	 		b1.setPreferredSize(new Dimension(200,50));
	 		b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	 if(e.getActionCommand().equals("Back")) {
                	        s1.setVisible(false);
                	       }
                    }
                });
	 		
	 		 j1 = new JPanel(new FlowLayout());
	 		 j1.add(new JLabel());
             j1.add(b1);
             j1.add(new JLabel());
             s1.add(new JLabel());
	 	     s1.add(j1);
		}		
	public static void main(String[]ars) {

		Snday93 f = new Snday93();
		f.setVisible(true);
	} 		  	
}	

