package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignUp extends JFrame
{ 
	//Attributes
	public JLabel lbname, lbedicion, lbpremium, lbauthor,lbcollection,lbnumbercollection,lbchekcollection,lbfoto, lbTitle;
	public JTextField txfname, txfedicion, txfpremium, txfauthor, txfcollection,txfnumbercollection;
	public JButton bup, check;
	public ImageIcon foto;
	public JPanel panel;
	
	
	// This is the constructor
	
  public SignUp()
  {
	 panel = new JPanel();
	 panel.setBounds(100,100,300, 500);
	 panel.setBackground(Color.black);
	 panel.setLayout(null);
	 this.add(panel);
	 
	 lbTitle = new JLabel("New Book");
	 lbTitle.setBounds(100, 10,250,30);
	 lbTitle.setForeground(Color.WHITE);
	 lbTitle.setFont(new Font ("Arial Black",Font.BOLD,35));
	 panel.add(lbTitle);
	 
	 lbname = new JLabel("Name");                          txfname = new JTextField("The Invisble Man");
	 lbname.setBounds(60,40+30,80,30);                        txfname.setBounds(160, 70, 150, 30);
	 lbname.setForeground(Color.WHITE);                    panel.add(txfname);
	 panel.add(lbname);
	  
	 lbauthor = new JLabel("Author");                      txfauthor = new JTextField("H.G. Wells");
	 lbauthor.setBounds(60,120,80,30);                      txfauthor.setBounds(160, 120, 150, 30);
	 lbauthor.setForeground(Color.WHITE);                  panel.add(txfauthor);
	 panel.add(lbauthor);
	  
	 lbedicion = new JLabel("Edicion");                    txfedicion = new JTextField("2019");
	 lbedicion.setBounds(60,170,80,30);                    txfedicion.setBounds(160, 170, 150, 30);
	 lbedicion.setForeground(Color.WHITE);                 panel.add(txfedicion);
	 panel.add(lbedicion);
	 
	 lbpremium = new JLabel("Luxury Brand");               txfpremium = new JTextField();
	 lbpremium.setBounds(60,220,80,30);                    txfpremium.setBounds(160, 220, 150, 30);
	 lbpremium.setForeground(Color.WHITE);                 panel.add(txfpremium);
	 panel.add(lbpremium);
	 
	 lbchekcollection = new JLabel("Collection");          check = new JButton();
	 lbchekcollection.setBounds(150,270,80,30);             check.setBounds(210, 280, 10, 10);
	 lbchekcollection.setForeground(Color.WHITE);          check.setActionCommand("check");
	 panel.add(lbchekcollection);                          check.setBackground(Color.RED);
	                                                       panel.add(check);
	 
	 lbcollection = new JLabel("Collection's Name");       txfcollection = new JTextField();
	 lbcollection.setBounds(50,310,120,30);                txfcollection.setBounds(200, 310, 150, 30);
	 lbcollection.setForeground(Color.WHITE);              txfcollection.setVisible(false);
	 lbcollection.setVisible(false);                       panel.add(txfcollection); 
	 panel.add(lbcollection);
	 
	 
	 lbnumbercollection = new JLabel("Collection's Number"); txfnumbercollection = new JTextField();
	 lbnumbercollection.setBounds(50,370,120,30);             txfnumbercollection.setBounds(200, 370, 150, 30);
	 lbnumbercollection.setForeground(Color.WHITE);          txfnumbercollection.setVisible(false);
	 lbnumbercollection.setVisible(false);                   panel.add(txfnumbercollection);
	 panel.add(lbnumbercollection);
	 
	 bup = new JButton("Sign Up");
	 bup.setBounds(150, 430, 100, 40);
	 bup.setBackground(Color.GREEN);
	 bup.setForeground(Color.BLACK);
	 bup.setActionCommand("up");
	 panel.add(bup);
	 
	 foto = new ImageIcon(getClass().getResource("fondo2.jpg"));
	 lbfoto = new JLabel(foto);
	 lbfoto.setBounds(0, 0, 400, 500); 
	 
	 panel.add(lbfoto);
	
	 this.setSize(400, 500);
	 this.setUndecorated(true);
	 this.setVisible(true);
	 this.setLocationRelativeTo(null);
	 this.setLayout(null);
	 
	 
  }
  
  
  // To Get text from JTextFiel
  
  public String getName()
  {
	  return txfname.getText();
  }
  public String getAuthor()
  {
	  return txfauthor.getText();
  }
  public String getEdicion()
  {
	  return txfedicion.getText();
  }
  public String getPremium()
  {
	  return txfpremium.getText();
  }
  public boolean getBrand()
  {
	  
	  if(txfpremium.getText().contains("1")==true)
      {
	      return true;
      }
      else
      {
    	 return false;
      }
	  
  }
  public String getnameCollection()
  {
	  
	  return txfcollection.getText();
  }
  public int getNumberCollection()
  {
	  return Integer.parseInt(txfnumbercollection.getText());
  }
  
  public void active()
  {
	  lbcollection.setVisible(true);        txfcollection.setVisible(true);
	  lbnumbercollection.setVisible(true);  txfnumbercollection.setVisible(true);
	  check.setBackground(Color.green);
	  check.setEnabled(false);
  }
  
  public void listenButtons(ActionListener pALh)
  {
      bup.addActionListener(pALh);
      check.addActionListener(pALh);
      
  } 
    
  
}

