package randombuttonposition;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import java.net.URI;
import javax.swing.JOptionPane;


public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelText = new javax.swing.JLabel();
        jButtonYes = new javax.swing.JButton();
        jButtonNo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UR GAY?");
        setPreferredSize(new java.awt.Dimension(670, 440));
        setResizable(false);

        jLabelText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelText.setText("UR GAY?");
        jLabelText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonYes.setText("YES");
        jButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYesActionPerformed(evt);
            }
        });

        jButtonNo.setText("NO");
        jButtonNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButtonYes)
                        .addGap(73, 73, 73)
                        .addComponent(jButtonNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelText)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonYes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButtonNoMouseEntered(java.awt.event.MouseEvent evt) {                                       
        // X and Y Position
        int X = 640;
        int Y = 440;
        
        // Create random button position
        Random randomBtnPosition = new Random();   
        
        // Button doesn't get out gui;
        int randomX = randomBtnPosition.nextInt(X - jButtonNo.getWidth());
        int randomY = randomBtnPosition.nextInt(Y - jButtonNo.getHeight());
        
        // Set location button
        jButtonNo.setLocation(randomX, randomY);
    }                                      

    private void jButtonYesActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Open browser
        try{
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=1gUCu2e_JiM"));
            System.exit(0); // Finish program
        }catch(URISyntaxException | IOException e){
            JOptionPane.showMessageDialog(null, "Error: couldn't open url","Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                          

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonNo;
    private javax.swing.JButton jButtonYes;
    private javax.swing.JLabel jLabelText;
    // End of variables declaration                   
}
