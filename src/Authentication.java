import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Authentication extends javax.swing.JFrame {
    JFrame f;
    public Authentication() {
        super("Login");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPage = new javax.swing.JPanel();
        IDACC = new javax.swing.JTextField();
        PintxtLP = new javax.swing.JLabel();
        AccnumtxtLP = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        LogoLP = new javax.swing.JLabel();
        NewAccount = new javax.swing.JButton();
        PASSACC = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        LoginPage.setBackground(new java.awt.Color(255, 255, 255));
        LoginPage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 56, 95), 3, true));
        LoginPage.setAutoscrolls(true);

        IDACC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDACCActionPerformed(evt);
            }
        });

        PintxtLP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PintxtLP.setForeground(new java.awt.Color(153, 153, 0));
        PintxtLP.setText("PASSWORD");

        AccnumtxtLP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccnumtxtLP.setForeground(new java.awt.Color(204, 204, 0));
        AccnumtxtLP.setText("ID ACCOUNT");

        Login.setBackground(new java.awt.Color(204, 204, 255));
        Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 51, 204));
        Login.setText("LOGIN");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        LogoLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/logo.png"))); // NOI18N

        NewAccount.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        NewAccount.setText("New Account");
        NewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPageLayout = new javax.swing.GroupLayout(LoginPage);
        LoginPage.setLayout(LoginPageLayout);
        LoginPageLayout.setHorizontalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccnumtxtLP)
                    .addComponent(PintxtLP))
                .addGap(18, 18, 18)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(IDACC)
                    .addComponent(PASSACC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(LogoLP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginPageLayout.setVerticalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addComponent(LogoLP, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccnumtxtLP)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(IDACC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PintxtLP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PASSACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPage, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDACCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDACCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDACCActionPerformed
// create new account 
    private void NewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccountActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Account ob = new Account();
        ob.setVisible(true);
    }//GEN-LAST:event_NewAccountActionPerformed
// authenticate user details with database
    // Event Login
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String id = IDACC.getText().trim();
        String pass = PASSACC.getText().trim();
        try {
            if (dbconnect.CheckAcc(id, pass) == true) {
                dbconnect.WriteTMP(id, pass);
                setVisible(false);
                Loading ob = new Loading();
                ob.setUpLoading();
                ob.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(f, "You entered the wrong password ! (password must contain at least 6 characters, including uppercase letters, lower case\n"
                        + "letters, numeric characters and 1 special character)");
            }
        } catch (IOException ex) {
            Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccnumtxtLP;
    private javax.swing.JTextField IDACC;
    private javax.swing.JButton Login;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JLabel LogoLP;
    private javax.swing.JButton NewAccount;
    private javax.swing.JPasswordField PASSACC;
    private javax.swing.JLabel PintxtLP;
    // End of variables declaration//GEN-END:variables

}
