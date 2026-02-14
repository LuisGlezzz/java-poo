
package CODIGO_EN_EQUIPO;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FestivalesMain extends JFrame{
    
    static int boleto,boletos;
    
    public FestivalesMain(){
        setSize(2300,2000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("FESTIVALES");

    }
    public void panelFESTIVALES(){
        
        JPanel interfaz = new JPanel();
        
        interfaz.setBackground(Color.BLACK);
        interfaz.setLayout(null);
        this.getContentPane().add(interfaz);
        
        ImageIcon imagen= new ImageIcon("vive1.jpg");
        JLabel etiqueta= new JLabel();
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1700, 850, Image.SCALE_DEFAULT)));
        
        etiqueta.setBounds(1,1 ,2000,850);
        interfaz.add(etiqueta);
    }
     public void panelVIVELATINO(){
        
        JPanel interfaz = new JPanel();
        
        interfaz.setBackground(Color.BLACK);
        interfaz.setLayout(null);
        this.getContentPane().add(interfaz);
        
        ImageIcon imagen= new ImageIcon("vive2.jpg");
        JLabel etiqueta= new JLabel();
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1700, 850, Image.SCALE_DEFAULT)));
        
        etiqueta.setBounds(1,1 ,2000,850);
        interfaz.add(etiqueta);
    }
     public void panelTECATE(){
         
          JPanel interfaz = new JPanel();
        
        interfaz.setBackground(Color.BLACK);
        interfaz.setLayout(null);
        this.getContentPane().add(interfaz);
        
        ImageIcon imagen= new ImageIcon("vive3.jpg");
        JLabel etiqueta= new JLabel();
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1700, 850, Image.SCALE_DEFAULT)));
        
        etiqueta.setBounds(1,1 ,2000,850);
        interfaz.add(etiqueta);
         
         
         
     }
    static void leerBoleto(){
        
        boleto=Integer.parseInt(JOptionPane.showInputDialog("¿QUE BOLETO DESEAS ADQUIRIR?\n1.Estandar\n2.Vip\n3.Premium"));
        boletos=Integer.parseInt(JOptionPane.showInputDialog("CUANTOS BOLETOS DESEA COMPRAR"));
        
    }

    public static void main(String[] args) {
        
        FestivalesMain F= new FestivalesMain(); 
        F.panelFESTIVALES();
        F.setVisible(true);
 
        int menu=Integer.parseInt(JOptionPane.showInputDialog("A QUE FESTIVAL DESEAS ASISTIR\n 1.VIVELATINO\n 2.TECATE PAL NORTE"));

        switch (menu) {
            case 1: 
                
        FestivalesMain V= new FestivalesMain();
        V.panelVIVELATINO();
        V.setVisible(true);
                
                
                leerBoleto();
                ViveLatino VL = new ViveLatino(boleto,boletos,"VIVE LATINO");
                JOptionPane.showMessageDialog(null, new JTextArea("FESTIVAL: "+VL.nombre+"\n"+ VL.BoletoFestival()+"\n"+"COSTO POR BOLETO ES DE: "+VL.costoEntrada()
                +"\n"+"TOTAL A PAGAR: "+VL.calcularTotal()));
                break;
            case 2:
                
                FestivalesMain TE= new FestivalesMain();
                TE.panelTECATE();
                TE.setVisible(true);
                
                leerBoleto();
                Tecate_Pal_Norte T= new Tecate_Pal_Norte(boleto, boletos,"TECATE PA'L NORTE");
                JOptionPane.showMessageDialog(null, new JTextArea("FESTIVAL: "+T.nombre+"\n"+ T.BoletoFestival()+"\n"+"COSTO POR BOLETO ES DE: "+T.costoEntrada()
                +"\n"+"TOTAL A PAGAR: "+T.calcularTotal()));
                break;
        }
        
    }
    
}
