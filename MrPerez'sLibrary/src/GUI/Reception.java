package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Reception extends JFrame
{     
	public ImageIcon foto;
	public JLabel lbfoto, subTitle;
	public JButton  bSignUp,bGo;
      
  
   public Reception()
   {
	   
	   
	   JPanel pm = new JPanel();
	   pm.setBounds(0, 0, 900, 600);
	   pm.setLayout(null);
	   this.add(pm);
	   
	   subTitle = new JLabel("The Mr. Perez's Library");
	   subTitle.setBounds(200, 200, 500,100);
	   subTitle.setBackground(Color.BLACK);
	   subTitle.setForeground(Color.WHITE);
	   subTitle.setFont(new Font ("Arial Black",Font.BOLD,35));
	   pm.add(subTitle);
	   
	   JPanel pb = new JPanel();
	   pb.setBounds(0, 190, 900, 120);
	   pb.setBackground(Color.black);
	   pb.setLayout(null);
	   pm.add(pb);
	   
	   bSignUp = new JButton("Sign UP");
	   bSignUp.setBounds(240, 360, 200, 50);
	   bSignUp.setForeground(Color.BLACK);
	   bSignUp.setFont(new Font("Arial",Font.BOLD,20));
	   bSignUp.setBackground(Color.GREEN);
	   bSignUp.setActionCommand("signup");
	   pm.add(bSignUp);
	   
	   bGo = new JButton("Go to books");
	   bGo.setBounds(440, 360, 200, 50);
	   bGo.setForeground(Color.WHITE);
	   bGo.setFont(new Font("Arial",Font.BOLD,20));
	   bGo.setBackground(Color.BLACK);
	   bGo.setActionCommand("go");
	   pm.add(bGo);
	   
	   foto = new ImageIcon(getClass().getResource("fondo.jpeg"));
	   lbfoto = new JLabel(foto);
	   lbfoto.setBounds(0, 0, 900, 600); 
	   lbfoto.setLayout(null);
	   pm.add(lbfoto);
	   

	  
	   
	   this.setSize(900,600);
	   this.setVisible(true);
	   this.setLayout(null);
	   this.setLocationRelativeTo(null);
	   this.setBackground(Color.CYAN);
       this.setTitle("Perez's LIBRARY");   
       this.setResizable(true);
	   this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
   }
   
   public void listenButtons(ActionListener pALh)
   {
       bGo.addActionListener(pALh);
       bSignUp.addActionListener(pALh);
       
   } 
   
   
   
   
}
