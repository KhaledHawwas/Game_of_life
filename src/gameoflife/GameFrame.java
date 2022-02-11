package gameoflife;

public class GameFrame extends javax.swing.JFrame {

    private SettingDialog settingDialog = new SettingDialog();

    public GameFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pauseBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        refreshBTN = new javax.swing.JButton();
        settingBTN = new javax.swing.JButton();
        gamePanel = new gameoflife.GamePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game of Life");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        pauseBTN.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        pauseBTN.setText("pause");
        pauseBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBTNActionPerformed(evt);
            }
        });

        clearBTN.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        clearBTN.setText("clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        refreshBTN.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        refreshBTN.setText("refresh");
        refreshBTN.setToolTipText("");
        refreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBTNActionPerformed(evt);
            }
        });

        settingBTN.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        settingBTN.setText("setting");
        settingBTN.setToolTipText("");
        settingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBTNActionPerformed(evt);
            }
        });

        gamePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gamePanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pauseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pauseBTN)
                    .addComponent(clearBTN)
                    .addComponent(refreshBTN)
                    .addComponent(settingBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pauseBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBTNActionPerformed
        GameOfLife.run = !GameOfLife.run;
    }//GEN-LAST:event_pauseBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        GameOfLife.gameBoard.clear();
        refreshGamePanel();
    }//GEN-LAST:event_clearBTNActionPerformed

    private void refreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBTNActionPerformed
        GameOfLife.gameBoard.random(3);
        refreshGamePanel();
    }//GEN-LAST:event_refreshBTNActionPerformed

    private void settingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingBTNActionPerformed
        settingDialog.setVisible(true);
    }//GEN-LAST:event_settingBTNActionPerformed

    private void gamePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gamePanelMouseClicked
        gamePanel.click(evt.getX(), evt.getY());
        refreshGamePanel();
    }//GEN-LAST:event_gamePanelMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        gamePanelMouseClicked(evt);
    }//GEN-LAST:event_formMouseClicked
    public void refreshGamePanel() {
        this.repaint();
        pauseBTN.setText((GameOfLife.run ? "pause" : "run"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBTN;
    private gameoflife.GamePanel gamePanel;
    private javax.swing.JButton pauseBTN;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JButton settingBTN;
    // End of variables declaration//GEN-END:variables
}
