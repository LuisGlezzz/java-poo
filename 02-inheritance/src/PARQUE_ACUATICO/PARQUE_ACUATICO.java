

package PARQUE_ACUATICO;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class PARQUE_ACUATICO extends JFrame {

    public PARQUE_ACUATICO() {
        
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,200);
        setTitle("PARQUE ACUATICO");
        panel();
        
    }
    
    public void panel(){
        
        JPanel interfaz = new JPanel();
        
        interfaz.setBackground(Color.BLACK);
        interfaz.setLayout(null);
        this.getContentPane().add(interfaz);
        
        ImageIcon imagen= new ImageIcon("luis.jpg");
        JLabel etiqueta= new JLabel();
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
        
        etiqueta.setBounds(1, 1,400,400);
        interfaz.add(etiqueta);
       
    }
    
    
    
    static int costoB,costoLA,costoMA,costoBA,h,menu;
    
    
    static void leerdatos(){
        
       costoMA=200; 
       costoLA=200; 
       costoB=200;
       costoBA=100;
       h=Integer.parseInt(JOptionPane.showInputDialog("por cuentas horas desea rentar el vehiculo acuatico"));
       
}
    
    
    
public static void main(String [] args){
    
   PARQUE_ACUATICO v= new PARQUE_ACUATICO();
        
        v.setVisible(true); 
       
    
    
   
     
    menu=Integer.parseInt(JOptionPane.showInputDialog("QUE VEHICULO DESEA RENTAR\n1.BANANA\n2. MOTO ACUATICA\n3.LANCHA \n4.BICICLETA"));
     
    
    switch(menu){
        
        
        case 1:{
            
  BANANA B= new BANANA();
 leerdatos();
  B.setbanana(costoBA);
  B.sethoras(h);
  
  
  JOptionPane.showMessageDialog(null, new JTextArea("LAS HORAS RENTADAS FUERON: "+h+"\n"+"TOTAL A PAGAR: "+B.costobanana()+"\n"+"DEBE DEJAR EN DEPOSITO DE GARANTIA LA CANTIDAD DE:"
  +B.deposito()));
  break;
  
    }
  
  case 2:{
            
  MOTOACUATICA A= new MOTOACUATICA();
  leerdatos();
  A.setmotoacuatica(costoMA);
  A.sethoras(h);
  
  
  JOptionPane.showMessageDialog(null, new JTextArea("LAS HORAS RENTADAS FUERON: "+h+"\n"+"TOTAL A PAGAR: "+A.costoMOTOACUATICA()+"\n"+"DEBE DEJAR EN DEPOSITO DE GARANTIA LA CANTIDAD DE:"
  +A.deposito()));
  break;}
  
  case 3:{
            
  LANCHA L= new LANCHA();
  leerdatos();
  L.setlancha(costoLA);
  L.sethoras(h);
  
  
  JOptionPane.showMessageDialog(null, new JTextArea("LAS HORAS RENTADAS FUERON: "+h+"\n"+"TOTAL A PAGAR: "+L.costoLANCHA()+"\n"+"DEBE DEJAR EN DEPOSITO DE GARANTIA LA CANTIDAD DE:"
  +L.deposito()));
  break;}
  
  case 4:{
            
  BICICLETA V= new BICICLETA();
  leerdatos();
  V.setbicicleta(costoB);
  V.sethoras(h);
  
  
  JOptionPane.showMessageDialog(null, new JTextArea("LAS HORAS RENTADAS FUERON: "+h+"\n"+"TOTAL A PAGAR: "+V.costoBICICLETA()+"\n"+"DEBE DEJAR EN DEPOSITO DE GARANTIA LA CANTIDAD DE:"
  +V.deposito()));
  break; }
  
}
    
  


 
}}
