package application;

import application.ItemManagement;
import application.OrderManagement;

public class ShippingStatus extends javax.swing.JFrame{
	
	    public ShippingStatus() {
	        initComponents();
	    }

	 
	    @SuppressWarnings("unchecked")
	   
	    private void initComponents() {

	        jPanel2 = new javax.swing.JPanel();
	        jPanel1 = new javax.swing.JPanel();
	        orderReadyButton = new javax.swing.JButton();
	        viewStockButton = new javax.swing.JButton();
	        exitButton = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	        setLocationByPlatform(true);

	        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
	        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
	        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        jPanel1.setForeground(new java.awt.Color(0, 102, 204));

	        orderReadyButton.setText("Orders in Ready Status");
	        orderReadyButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                orderManagementButtonActionPerformed(evt);
	            }
	        });


	        viewStockButton.setText("View Stockt");
	        viewStockButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                itemManagementButtonActionPerformed(evt);
	            }
	        });
	       

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//	                    .addComponent(labourManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
	                    .addComponent(viewStockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(orderReadyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                   
	                .addGap(10, 10, 10)))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addComponent(viewStockButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//	                .addComponent(labourManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(orderReadyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
	                
	        );

	        exitButton.setText("Exit");
	        exitButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                exitButtonActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(119, 119, 119)
	                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(67, Short.MAX_VALUE)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(61, 61, 61))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(33, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(47, 47, 47)
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(45, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(38, Short.MAX_VALUE))
	        );

	        pack();
	        setLocationRelativeTo(null);
	    }

	    private void itemManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {
	        ItemManagement im = new ItemManagement();
	        im.setVisible(true);
	        this.dispose();

	    }

	    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
	        System.exit(0);
	    }

	    private void orderManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {
	        OrderManagement om = new OrderManagement();
	        om.setVisible(true);
	        this.dispose();
	    }
	    
	    
	    public static void main(String args[]) {
	        
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	      
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new MainMenu().setVisible(true);
	            }
	        });
	    }

	    
	    private javax.swing.JButton exitButton;
	    private javax.swing.JButton viewStockButton;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JButton orderReadyButton;
	   
	    
	}



