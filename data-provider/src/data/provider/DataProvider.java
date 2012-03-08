/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package data.provider;
import java.io.IOException;
import java.net.DatagramPacket; 
import java.net.DatagramSocket;
import java.net.InetAddress; 
import java.net.SocketException;
import java.awt.BorderLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author felipe
 */

public class Provider extends Jframe {

    private JTextField enterField; // mandar discografia
    private JTextArea displayArea; // exibir mensagem da discografia enviada
    private DatagramSocket socket; // socket (TCP/IP) para conectar ao Servidor
 
    public Provider (){
        
      super ("Provider");
        
        enterField = new JTextField ("Informe a discografia");
        enterField.addActionListener(
            new ActionListener ()
            {
                public void actionPerfomed (ActionEvent event){
                    {
                        try { // cria e envia o pacote  
                            //obtem a mensagem no campos de texto
                            String message = event.getActionCommand();
                            displayArea.append("\nEnviando discografia:" + message + "\n");
                            
                            byte data[] = message.getBytes(); // converte a mensagem em bytes
                            
                            //cria sendPacket
                            DatagramPacket sendPacket = new DatagramPacket (data,data.length, InetAddress.getLocalHost(), 5000);
                    }
        
    }
    }
    
} 

public class DataProvider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
