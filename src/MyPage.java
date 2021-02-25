
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyPage extends javax.swing.JFrame {

    JFrame f;

    public MyPage() {
        super("Home");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePage = new javax.swing.JPanel();
        UnametxtTop = new javax.swing.JLabel();
        LogoHP = new javax.swing.JLabel();
        jtabbed = new javax.swing.JTabbedPane();
        ProfileTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idAccountP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        usernameP = new javax.swing.JTextField();
        PassP = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        deleteAccount = new javax.swing.JButton();
        DepositTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        soTienRut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        okRut = new javax.swing.JButton();
        huyRut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        soTienDangCo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        WithdrawTab = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Da_co_Dep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        add_money = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        OK_deposit = new javax.swing.JButton();
        cancel_deposit = new javax.swing.JButton();
        ViewbalTab = new javax.swing.JPanel();
        UsertxtVB = new javax.swing.JLabel();
        NametxtVB = new javax.swing.JLabel();
        UsernameVB = new javax.swing.JTextField();
        cancel_Send = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        OK_SEND = new javax.swing.JButton();
        moneyVB = new javax.swing.JTextField();
        AboutTab = new javax.swing.JPanel();
        Info1 = new javax.swing.JLabel();
        Authorstxt = new javax.swing.JLabel();
        Versiontxt = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomePage.setBackground(new java.awt.Color(255, 255, 255));

        UnametxtTop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UnametxtTop.setText("WELLCOME TO BANK");

        LogoHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/logo.png"))); // NOI18N

        jtabbed.setBackground(new java.awt.Color(204, 255, 204));
        jtabbed.setBorder(new javax.swing.border.MatteBorder(null));
        jtabbed.setForeground(new java.awt.Color(102, 0, 102));
        jtabbed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabbed.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtabbedAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtabbed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtabbedStateChanged(evt);
            }
        });
        jtabbed.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jtabbedComponentShown(evt);
            }
        });

        ProfileTab.setBackground(new java.awt.Color(255, 255, 255));
        ProfileTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID Account: ");

        idAccountP.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("User Name :");

        usernameP.setBackground(new java.awt.Color(204, 204, 255));

        PassP.setText("123456");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("PassWord :");

        deleteAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteAccount.setForeground(new java.awt.Color(204, 0, 0));
        deleteAccount.setText("DELETE ACCOUNT");
        deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfileTabLayout = new javax.swing.GroupLayout(ProfileTab);
        ProfileTab.setLayout(ProfileTabLayout);
        ProfileTabLayout.setHorizontalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileTabLayout.createSequentialGroup()
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileTabLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PassP, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(idAccountP)
                            .addComponent(usernameP)))
                    .addGroup(ProfileTabLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(deleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        ProfileTabLayout.setVerticalGroup(
            ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileTabLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idAccountP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(ProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(72, 72, 72)
                .addComponent(deleteAccount)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jtabbed.addTab("Profile", ProfileTab);

        DepositTab.setBackground(new java.awt.Color(255, 255, 255));
        DepositTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("the amount you want to withdraw: ");

        jLabel5.setText("VND");

        okRut.setBackground(new java.awt.Color(255, 204, 204));
        okRut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        okRut.setForeground(new java.awt.Color(0, 102, 51));
        okRut.setText("OK");
        okRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okRutActionPerformed(evt);
            }
        });

        huyRut.setForeground(new java.awt.Color(255, 102, 102));
        huyRut.setText("Cancel");
        huyRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyRutActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText(" the money:");

        jLabel13.setText("VND");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(soTienDangCo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(okRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(huyRut, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                            .addComponent(soTienRut, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(soTienDangCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soTienRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addComponent(okRut)
                .addGap(34, 34, 34)
                .addComponent(huyRut)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout DepositTabLayout = new javax.swing.GroupLayout(DepositTab);
        DepositTab.setLayout(DepositTabLayout);
        DepositTabLayout.setHorizontalGroup(
            DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositTabLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        DepositTabLayout.setVerticalGroup(
            DepositTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositTabLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jtabbed.addTab("Withdraw function", DepositTab);

        WithdrawTab.setBackground(new java.awt.Color(255, 255, 255));
        WithdrawTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("The Money:");

        jLabel8.setText("VND");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("the amount money want to deposit:");

        add_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_moneyActionPerformed(evt);
            }
        });

        jLabel10.setText("VND");

        OK_deposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OK_deposit.setForeground(new java.awt.Color(0, 0, 255));
        OK_deposit.setText("ok");
        OK_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_depositActionPerformed(evt);
            }
        });

        cancel_deposit.setText("Cancel");
        cancel_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_depositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WithdrawTabLayout = new javax.swing.GroupLayout(WithdrawTab);
        WithdrawTab.setLayout(WithdrawTabLayout);
        WithdrawTabLayout.setHorizontalGroup(
            WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawTabLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(WithdrawTabLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(Da_co_Dep)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8))
                    .addComponent(OK_deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel_deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(WithdrawTabLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add_money, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        WithdrawTabLayout.setVerticalGroup(
            WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Da_co_Dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(WithdrawTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(add_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(59, 59, 59)
                .addComponent(OK_deposit)
                .addGap(49, 49, 49)
                .addComponent(cancel_deposit)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jtabbed.addTab("Deposit function", WithdrawTab);

        ViewbalTab.setBackground(new java.awt.Color(255, 255, 255));
        ViewbalTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        UsertxtVB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsertxtVB.setText("ID User Receiver:");

        NametxtVB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NametxtVB.setText("the amount money want to Send:");

        cancel_Send.setText("Cancel");
        cancel_Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_SendActionPerformed(evt);
            }
        });

        jLabel12.setText("VND");

        OK_SEND.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OK_SEND.setForeground(new java.awt.Color(0, 51, 255));
        OK_SEND.setText("OK");
        OK_SEND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_SENDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewbalTabLayout = new javax.swing.GroupLayout(ViewbalTab);
        ViewbalTab.setLayout(ViewbalTabLayout);
        ViewbalTabLayout.setHorizontalGroup(
            ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewbalTabLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsertxtVB)
                    .addComponent(NametxtVB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UsernameVB, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(moneyVB))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(303, 303, 303))
            .addGroup(ViewbalTabLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancel_Send, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(OK_SEND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewbalTabLayout.setVerticalGroup(
            ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewbalTabLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsertxtVB)
                    .addComponent(UsernameVB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(ViewbalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NametxtVB)
                    .addComponent(jLabel12)
                    .addComponent(moneyVB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(OK_SEND)
                .addGap(31, 31, 31)
                .addComponent(cancel_Send)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jtabbed.addTab("Transfer money", ViewbalTab);

        AboutTab.setBackground(new java.awt.Color(255, 255, 255));
        AboutTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));

        Info1.setText("updating...");

        Authorstxt.setText("Wish you a good day !!!");

        Versiontxt.setText("bank v1.0");

        javax.swing.GroupLayout AboutTabLayout = new javax.swing.GroupLayout(AboutTab);
        AboutTab.setLayout(AboutTabLayout);
        AboutTabLayout.setHorizontalGroup(
            AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutTabLayout.createSequentialGroup()
                .addContainerGap(532, Short.MAX_VALUE)
                .addGroup(AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Authorstxt)
                    .addComponent(Info1))
                .addGap(326, 326, 326))
            .addGroup(AboutTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Versiontxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AboutTabLayout.setVerticalGroup(
            AboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutTabLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Info1)
                .addGap(30, 30, 30)
                .addComponent(Authorstxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Versiontxt)
                .addGap(40, 40, 40))
        );

        jtabbed.addTab("About", AboutTab);

        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(LogoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(UnametxtTop)))
                        .addGap(171, 171, 171))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(jtabbed)
                        .addContainerGap())))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(logout)
                        .addGap(18, 18, 18)
                        .addComponent(UnametxtTop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtabbed)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1019, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        //Even Exit
        setVisible(false);
        Authentication aut = new Authentication();
        aut.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jtabbedComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jtabbedComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jtabbedComponentShown

    private void jtabbedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtabbedStateChanged
        // TODO add your handling code here:
        System.out.println("Tab: " + jtabbed.getSelectedIndex());
        if (jtabbed.getSelectedIndex() == 0) {
            idAccountP.setEditable(false);
            usernameP.setEditable(false);
            PassP.setEditable(false);
            // view profi - delete acc
            String tmp;
            try {
                tmp = dbconnect.ReadTMP();
                String[] tmprow = tmp.split("!");
                String row = dbconnect.ReadAccBank(tmprow[0], tmprow[1]);
                String[] res = row.split("!");
                System.out.println(res[0]);
                System.out.println(res[2]);
                System.out.println(res[1]);
                idAccountP.setText(res[0]);
                usernameP.setText(res[2]);
                PassP.setText(res[1]);
            } catch (IOException ex) {
                Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jtabbed.getSelectedIndex() == 1) {
            // fuction rut tien
            String tmp;
            soTienDangCo.setEditable(false);
            try {
                tmp = dbconnect.ReadTMP();
                String[] tmprow = tmp.split("!");
                String row = dbconnect.ReadAccBank(tmprow[0], tmprow[1]);
                String[] res = row.split("!");
                double money = Double.parseDouble(res[3]);
                soTienDangCo.setText(money + "");
            } catch (IOException ex) {
                Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jtabbed.getSelectedIndex() == 2) {
            // nap tien
            Da_co_Dep.setEditable(false);
            String tmp;
            try {
                tmp = dbconnect.ReadTMP();
                String[] tmprow = tmp.split("!");
                String row = dbconnect.ReadAccBank(tmprow[0], tmprow[1]);
                String[] res = row.split("!");
                double money = Double.parseDouble(res[3]);
                Da_co_Dep.setText(money + "");
            } catch (IOException ex) {
                Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jtabbedStateChanged

    private void jtabbedAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtabbedAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtabbedAncestorAdded

    private void OK_SENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_SENDActionPerformed
        // TODO add your handling code here:
        // chuyen tien
        Double number = Double.parseDouble(moneyVB.getText());
        String tmp;
        try {
            tmp = dbconnect.ReadTMP();
            String[] tmprow = tmp.split("!");
            String row = dbconnect.ReadAccBank(tmprow[0], tmprow[1]);
            String[] resSend = row.split("!");
            String check = dbconnect.CheckAccOne(UsernameVB.getText().toString().trim());
            System.out.println(check);
            if (check != "fail") {
                String[] User_Nhan = check.split("!");
                int n = JOptionPane.showConfirmDialog(f, "transferred to ." + User_Nhan[2] + " - " + moneyVB.getText(), "Notification!", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    // update nguoi gui
                    Double res_money = Double.parseDouble(resSend[3]) - number;
                    dbconnect.updataDataBank(resSend[0], resSend[1], resSend[2], res_money + "");
                    Double res_money_2 = Double.parseDouble(User_Nhan[3]) + number;
                    dbconnect.updataDataBank(User_Nhan[0], User_Nhan[1], User_Nhan[2], res_money_2 + "");
                    moneyVB.setText("");
                    JOptionPane.showConfirmDialog(f, "SUCCESSFULLY..", "Notify!", JOptionPane.OK_OPTION);
                }
            } else {
                JOptionPane.showConfirmDialog(f, "Account does not exist..", "Error!", JOptionPane.OK_OPTION);
            }

        } catch (IOException ex) {
            Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OK_SENDActionPerformed

    private void cancel_SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_SendActionPerformed
        UsernameVB.setText("");
        moneyVB.setText("");
    }//GEN-LAST:event_cancel_SendActionPerformed

    private void OK_depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_depositActionPerformed
        // TODO add your handling code here:
        String tmp;
        try {
            tmp = dbconnect.ReadTMP();
            String[] tmprow = tmp.split("!");
            String row = dbconnect.ReadAccBank(tmprow[0], tmprow[1]);
            String[] res = row.split("!");
            double money = Double.parseDouble(res[3]);
            double moneyNap = Double.parseDouble(add_money.getText());
            if (moneyNap >= 1) {
                int n = JOptionPane.showConfirmDialog(f, "Are you sure you want to withdraw this money ?", "withdraw money ?", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    dbconnect.updataDataBank(res[0], res[1], res[2], money + moneyNap + "");
                    Da_co_Dep.setText(money + moneyNap + "");
                    JOptionPane.showConfirmDialog(f, "SUCCESSFULLY..", "Notification!", JOptionPane.OK_OPTION);

                }
            } else {
                int n = JOptionPane.showConfirmDialog(f, "deposit cannot be = 0 :(", "Notification ?", JOptionPane.OK_OPTION);

            }
        } catch (IOException ex) {
            Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OK_depositActionPerformed

    private void huyRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyRutActionPerformed
        // TODO add your handling code here:
        soTienRut.setText("");
    }//GEN-LAST:event_huyRutActionPerformed

    private void okRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okRutActionPerformed
        // TODO add your handling code here:
        String tmp;
        try {
            tmp = dbconnect.ReadTMP();
            String[] tmprow = tmp.split("!");
            String row = dbconnect.ReadAccBank(tmprow[0], tmprow[1]);
            String[] res = row.split("!");
            double money = Double.parseDouble(res[3]);
            double moneyRut = Double.parseDouble(soTienRut.getText());
            if (moneyRut <= money) {
                int n = JOptionPane.showConfirmDialog(f, "Are you sure you want to withdraw this money ?", "withdraw money ?", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    dbconnect.updataDataBank(res[0], res[1], res[2], money - moneyRut + "");
                    soTienDangCo.setText(money - moneyRut+"");
                }
            } else {
                int n = JOptionPane.showConfirmDialog(f, "Your balance is not sufficient to withdraw :(", "Notification ?", JOptionPane.OK_OPTION);

            }
        } catch (IOException ex) {
            Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_okRutActionPerformed

    private void deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountActionPerformed
        // TODO add your handling code here:
        // Even delete Acc
        String tmp;
        try {
            tmp = dbconnect.ReadTMP();
            String[] tmprow = tmp.split("!");
            int n = JOptionPane.showConfirmDialog(f, "You definitely want to delete the account?", "Delete Account ?", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                dbconnect.DeleteUser(tmprow[0], tmprow[1]);
                dbconnect.DeleteBack(tmprow[0], tmprow[1]);
                setVisible(false);
                Authentication aut = new Authentication();
                aut.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(MyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteAccountActionPerformed

    private void cancel_depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_depositActionPerformed
        // TODO add your handling code here:
         add_money.setText("");
    }//GEN-LAST:event_cancel_depositActionPerformed

    private void add_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_moneyActionPerformed

    //get accounts in database for transfer dropdownbox
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
            java.util.logging.Logger.getLogger(MyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutTab;
    private javax.swing.JLabel Authorstxt;
    private javax.swing.JTextField Da_co_Dep;
    private javax.swing.JPanel DepositTab;
    private javax.swing.JPanel HomePage;
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel LogoHP;
    private javax.swing.JLabel NametxtVB;
    private javax.swing.JButton OK_SEND;
    private javax.swing.JButton OK_deposit;
    private javax.swing.JPasswordField PassP;
    private javax.swing.JPanel ProfileTab;
    private javax.swing.JLabel UnametxtTop;
    private javax.swing.JTextField UsernameVB;
    private javax.swing.JLabel UsertxtVB;
    private javax.swing.JLabel Versiontxt;
    private javax.swing.JPanel ViewbalTab;
    private javax.swing.JPanel WithdrawTab;
    private javax.swing.JTextField add_money;
    private javax.swing.JButton cancel_Send;
    private javax.swing.JButton cancel_deposit;
    private javax.swing.JButton deleteAccount;
    private javax.swing.JButton huyRut;
    private javax.swing.JTextField idAccountP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jtabbed;
    private javax.swing.JButton logout;
    private javax.swing.JTextField moneyVB;
    private javax.swing.JButton okRut;
    private javax.swing.JTextField soTienDangCo;
    private javax.swing.JTextField soTienRut;
    private javax.swing.JTextField usernameP;
    // End of variables declaration//GEN-END:variables
}
