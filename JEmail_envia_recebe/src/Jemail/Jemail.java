package Jemail;

 
  
import com.sun.mail.pop3.POP3SSLStore;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.FileReader;  
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;  
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;  
import javax.swing.JOptionPane;  
import org.apache.commons.mail.EmailAttachment;  
import org.apache.commons.mail.EmailException;  
import org.apache.commons.mail.MultiPartEmail;  


public class Jemail extends javax.swing.JFrame {

 Boolean i=false;
 String pathAnexo, nomeAnexo ;  
 int numero=0;
    public Jemail() {
     
        
        
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        destinatario = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        remetente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        servidor = new javax.swing.JTextField();
        assunto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        btanexo = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lerEmails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTextArea();
        decomplemento = new javax.swing.JButton();
        complemento = new javax.swing.JButton();
        auxilio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        destinatario.setText("email-do-destinatario");
        destinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinatarioActionPerformed(evt);
            }
        });

        status.setText("   ");

        senha.setText("123456");
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");

        jLabel4.setText("Destinatario");

        jLabel5.setText("Seu Servidor");

        remetente.setText("meu-email@gmail.com");
        remetente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remetenteActionPerformed(evt);
            }
        });

        jLabel6.setText("Assunto");

        jLabel7.setText("Mensagem");

        assunto.setText("assunto");

        jLabel3.setText("Seu email");

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        btanexo.setText("Anexo");
        btanexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanexoActionPerformed(evt);
            }
        });

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(assunto, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(remetente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(destinatario, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(senha)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btanexo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btanexo)
                        .addComponent(enviar)
                        .addComponent(status))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(remetente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(49, 49, 49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(assunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Enviar @", jPanel1);

        jLabel8.setText(" Mensagem");

        lerEmails.setText("Ler Emails");
        lerEmails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerEmailsActionPerformed(evt);
            }
        });

        display.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(display);

        display2.setColumns(20);
        display2.setRows(5);
        jScrollPane3.setViewportView(display2);

        decomplemento.setText("<");
        decomplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decomplementoActionPerformed(evt);
            }
        });

        complemento.setText(">");
        complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(auxilio, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decomplemento)
                .addGap(2, 2, 2)
                .addComponent(complemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lerEmails)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lerEmails)
                    .addComponent(decomplemento)
                    .addComponent(complemento)
                    .addComponent(auxilio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Emails não lidos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    //JOptionPane.showMessageDialog(null, "abriu a janela");
    try{lerInfo();
    servidor.setToolTipText("O seu servidor de email Gmail, Hotmail ...");
    }
    catch(Exception e){}    
        
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    try{
    gravarInfo();}
    catch(Exception e){}
    }//GEN-LAST:event_formWindowClosing

    private void complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoActionPerformed
        numero++;
        try{
            lerEmail(numero);
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_complementoActionPerformed

    private void decomplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decomplementoActionPerformed
        numero--;
        try{
            lerEmail(numero);
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_decomplementoActionPerformed

    private void lerEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerEmailsActionPerformed
     try{
     lerEmail(0);
     }
     catch(Exception e){
     JOptionPane.showMessageDialog(null, "Erro ao tentar ler email");
     }
     
    }//GEN-LAST:event_lerEmailsActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

        try{
           if(i){enviarEmailComAnexo();} 
           else{enviaEmail();} 
           
          }  
            
          
        catch(Exception e){
            status.setText("Erro");
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void btanexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanexoActionPerformed

        i=true;
        JFileChooser arquivo = new JFileChooser();
        arquivo.showOpenDialog(null);
        pathAnexo = arquivo.getSelectedFile().getAbsolutePath();
        nomeAnexo=arquivo.getName();
    }//GEN-LAST:event_btanexoActionPerformed

    private void destinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinatarioActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void remetenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remetenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remetenteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jemail().setVisible(true);
            }
        });
    }

    
 

          
void enviarEmailComAnexo(){

                        Properties props = new Properties();        
                        if (servidor.getText().equals("live")) {        
                            /** Parâmetros de conexão com servidor Hotmail */        
                            props.put("mail.transport.protocol", "smtp");        
                            props.put("mail.smtp.host", "smtp.live.com");        
                            props.put("mail.smtp.socketFactory.port", "587");        
                            props.put("mail.smtp.socketFactory.fallback", "false");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("gmail")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtp.gmail.com");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("Bol")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtps.bol.com.br");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("Ibest")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtp.ibest.com.br");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("Ig")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtp.ig.com.br");        
                            props.put("mail.smtp.port", "587");        
                        } 
    
   Session session = Session.getDefaultInstance(props,
                        new javax.mail.Authenticator() {
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication(remetente.getText(), senha.getText());
                             }
                        }); 
    
   try {          
                  
                                Message message = new MimeMessage(session);          
                                message.setFrom(new InternetAddress(remetente.getText()));          
                                message.setRecipients(Message.RecipientType.TO,          
                                InternetAddress.parse(destinatario.getText()));          
                                message.setSubject(assunto.getText());          
                                message.setText(texto.getText());        
                                      
                                     
                               MimeBodyPart mbp2 = new MimeBodyPart();      
                               FileDataSource fds = new FileDataSource(pathAnexo);            
                               mbp2.setDataHandler(new DataHandler(fds));            
                               mbp2.setFileName(fds.getName());           
                      
                               Multipart mp = new MimeMultipart();            
                               mp.addBodyPart(mbp2);            
                                
                               message.setContent(mp);  
                  
                                Transport.send(message);          
                  
                                JOptionPane.showMessageDialog(null,          
                                        "Email com anexo Enviado");          
                  
                            } catch (MessagingException e1) {          
                                throw new RuntimeException(e1);          
                            }  
    
    

}     

 void enviaEmail() throws EmailException{
    Properties props = new Properties();        
                        if (servidor.getText().equals("live")) {        
                            /** Parâmetros de conexão com servidor Hotmail */        
                            props.put("mail.transport.protocol", "smtp");        
                            props.put("mail.smtp.host", "smtp.live.com");        
                            props.put("mail.smtp.socketFactory.port", "587");        
                            props.put("mail.smtp.socketFactory.fallback", "false");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("gmail")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtp.gmail.com");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("bol")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtps.bol.com.br");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("ibest")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtp.ibest.com.br");        
                            props.put("mail.smtp.port", "587");        
                        } else if (servidor.getText().equals("ig")) {        
                            props.put("mail.smtp.auth", "true");        
                            props.put("mail.smtp.starttls.enable", "true");        
                            props.put("mail.smtp.host", "smtp.ig.com.br");        
                            props.put("mail.smtp.port", "587");        
                        } 
    
   Session session = Session.getDefaultInstance(props,
                        new javax.mail.Authenticator() {
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication(remetente.getText(), senha.getText());
                             }
                        }); 
    
   try {          
                  
                                Message message = new MimeMessage(session);          
                                message.setFrom(new InternetAddress(remetente.getText()));          
                                message.setRecipients(Message.RecipientType.TO,          
                                InternetAddress.parse(destinatario.getText()));          
                                message.setSubject(assunto.getText());          
                                message.setText(texto.getText());        
                                      
                          
                                Transport.send(message);          
                  
                                JOptionPane.showMessageDialog(null,          
                                        "Email Enviado");          
                  
                            } catch (MessagingException e1) {          
                                throw new RuntimeException(e1);          
                            }  
   
   }
    

 
 void lerInfo() throws IOException {
    BufferedReader buffRead = new BufferedReader(new FileReader("config.0x3"));
    String linha = "";
     
    linha = buffRead.readLine();
    remetente.setText(linha);
    linha = buffRead.readLine();
    destinatario.setText(linha);
    linha = buffRead.readLine();
    servidor.setText(linha);
   
    
    buffRead.close(); 
       
       
}
 void gravarInfo() throws IOException {
     BufferedWriter buffWrite = new BufferedWriter(new FileWriter("config.txt"));
     String linha = ""; 
     linha =remetente.getText();
     buffWrite.append(linha + "\n");
     linha =destinatario.getText();
     buffWrite.append(linha + "\n");
     linha =servidor.getText();
     buffWrite.append(linha + "\n");
     buffWrite.close(); 
 }

 
 
 void lerEmail(int i) throws NoSuchProviderException, MessagingException, IOException {
  Store store = conectaEmail("ssl","995","pop.gmail.com","meuemail@gmail.com","123456");
  Folder folder = store.getFolder("INBOX");
   
  if (!folder.exists()) {
  display.setText("pasta não existe");     
  }
  
  folder.open(Folder.READ_WRITE);
  int f =folder.getUnreadMessageCount();
  Message[] msg = folder.getMessages();
  auxilio.setText(" "+f+ " Não lidas");
  String from = InternetAddress.toString(msg[i].getFrom());
  if (from != null) {
  display2.setText("De: " + from);
  }

  String to = InternetAddress.toString(
  msg[i].getRecipients(Message.RecipientType.TO));
  if (to != null) {
  display2.append("\nPara: " + to);
  }

  String subject = msg[i].getSubject();
  if (subject != null) {
  display2.append("\nAssunto: " + subject);
  }
  Date sent = msg[i].getSentDate();
  if (sent != null) {
  display2.append("\nData: " + sent);
  }
 //_____________________parte da mensagem_______________________________________
  

  Multipart multipart = (Multipart) msg[i].getContent();
  BodyPart bodyPart = multipart.getBodyPart(i);
  String disposition = bodyPart.getDisposition();  
 
  
  display.setText((String) bodyPart.getContent());
  texto.append((String)bodyPart.getContent());
  
  
  
  

  
 
  
  
   
   
  
  folder.close(true);
  store.close();  
  
  
  
  
  
}

 Store conectaEmail(String protocolo, String porta, String host, String usuario, String senha) throws NoSuchProviderException, MessagingException   
{  
        Properties prop = new Properties();  
        prop.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  
        prop.setProperty("mail.pop3.socketFactory.fallback", "false");  
        prop.setProperty("mail.pop3.port", porta);  
        prop.setProperty("mail.pop3.socketFactory.port", porta);  
        prop.setProperty("mail.pop3.host", host);  
        prop.setProperty("mail.store.protocol", protocolo);  
          
        Session session = Session.getInstance(prop, null);  
        int portaaux = Integer.parseInt(porta);  
        URLName urlName = new URLName(protocolo, host, portaaux, "", usuario, senha);  
        Store store = new POP3SSLStore(session, urlName);  
        store.connect();
         
        return store;
          
      
}  
 
 
 
 
 
 
 
 
 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assunto;
    private javax.swing.JLabel auxilio;
    private javax.swing.JButton btanexo;
    private javax.swing.JButton complemento;
    private javax.swing.JButton decomplemento;
    private javax.swing.JTextField destinatario;
    private javax.swing.JTextPane display;
    private javax.swing.JTextArea display2;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton lerEmails;
    private javax.swing.JTextField remetente;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField servidor;
    private javax.swing.JLabel status;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables

   
}




