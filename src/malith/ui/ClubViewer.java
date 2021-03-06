package malith.ui;

import chamin.dao.ClubDAO;
import chamin.data.Club;
import chamin.gui.AddClub;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import common.DbConnector;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malith - malith.13@cse.mrt.ac.lk
 */
public class ClubViewer extends javax.swing.JFrame {

    DbConnector dbConnector;
    ClubDAO clubDAO;
    List<String> clubIdLst;
    int accessPriviledge;
    boolean updateMode;

    /**
     * Creates new form ContactsBook
     */
    public ClubViewer(int accessPriviledge) {

        initComponents();
        this.accessPriviledge = accessPriviledge;
        this.updateMode = false;
        this.setLocationRelativeTo(null);

        try {
            // create the central DAO
            dbConnector = new DbConnector();
            // make a DAO for Club class by sending in the DB Connection from dbConnector
            clubDAO = new ClubDAO(dbConnector.getMyConn());
            
            btnSearch.doClick();
            refreshQuicViewPanelDefault();

        } catch (IOException | SQLException ex) {
            JOptionPane.showMessageDialog(ClubViewer.this, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (accessPriviledge > 2) {

            btnDeleteContact.setEnabled(false);
            btnNewContact.setEnabled(false);
            btnUpdateContact.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNewContact = new javax.swing.JButton();
        btnUpdateContact = new javax.swing.JButton();
        btnDeleteContact = new javax.swing.JButton();
        comboPara = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuickPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Central Eye");

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Club ID", "Club Name", "Teacher In Charge's NIC", "President's Admission No"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Search by");

        btnNewContact.setText("Add New Club");
        btnNewContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewContactActionPerformed(evt);
            }
        });

        btnUpdateContact.setText("Update Club");
        btnUpdateContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateContactActionPerformed(evt);
            }
        });

        btnDeleteContact.setText("Delete Club");
        btnDeleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewContact, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateContact, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteContact)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewContact)
                    .addComponent(btnUpdateContact)
                    .addComponent(btnDeleteContact))
                .addContainerGap())
        );

        comboPara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Club Name", "Club Id" }));

        txtQuickPane.setEditable(false);
        txtQuickPane.setContentType("text/html"); // NOI18N
        txtQuickPane.setToolTipText("");
        jScrollPane2.setViewportView(txtQuickPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(comboPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {
            // Get keyWord to search from the text field
            String keyWord = txtSearch.getText();

            // get what to search from combo box
            String searchPara = comboPara.getSelectedItem().toString();

            List<Club> club = null;

            // Call DAO and get clubs relevent to the "searchpara"
            if (keyWord != null && keyWord.trim().length() > 0) {

                club = clubDAO.searchClub(keyWord, searchPara);
            } else {
                System.out.println("field is empty, getting all");
                // If field is empty, then get all employees
                club = clubDAO.getAllClub();
            }
            // when there is no search results to show, clear the table
            if (club.isEmpty()) {
                String[] columnNames = {"Club ID", "Club Name", "Teacher InCharge", "President"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                table.setModel(model);
                
                 // new update*****************************************************************************************************by Malith
            String temp = "<html><font  size=\"4\" color=\"red\"><center>No records!</center></font>";
            if (keyWord != null & !"".equals(keyWord)) {
                temp = "<html><font  size=\"4\" color=\"red\"><center>No records for \"" + keyWord + "\" under \"" + searchPara + "\"</center></font>";
            }
            txtQuickPane.setText(temp);
            
                return;
            }
            // create the model and update the "table"
            ClubTableModel model = new ClubTableModel(club);
            table.setModel(model);
            
             refreshQuicViewPanelDefault();

        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(ClubViewer.this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewContactActionPerformed
        new AddClub(this, rootPaneCheckingEnabled).setVisible(true);
        refreshGUI();
    }//GEN-LAST:event_btnNewContactActionPerformed

    private void btnUpdateContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateContactActionPerformed
        // get the selected row
        int row = table.getSelectedRow();

        //make sure a row is selected
        if (row < 0) {
            JOptionPane.showMessageDialog(ClubViewer.this, "You must select a club first!", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // get the selected current Club
        Club tempClub = (Club) table.getValueAt(row, ClubTableModel.OBJECT_COL);

        //get the add club form, fill it with the current club, then update
        AddClub addClub = new AddClub(this, true);
        
        addClub.populateGUI(tempClub);
        addClub.setUpdateMode(true);
        addClub.setPreviousClubName(tempClub.getClubName());
        addClub.setVisible(true);
        
        
    }//GEN-LAST:event_btnUpdateContactActionPerformed

    private void btnDeleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteContactActionPerformed
        int row = table.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(rootPane, "You must select a club", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int response = JOptionPane.showConfirmDialog(rootPane, "This will delete this Contact!!!", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response != JOptionPane.YES_OPTION) {
            return;
        }
        Club tempClub = (Club) table.getValueAt(row, ClubTableModel.OBJECT_COL);
        try {
            clubDAO.deleteClub(tempClub.getClubId());
        } catch (SQLException ex) {
            Logger.getLogger(ClubViewer.class.getName()).log(Level.SEVERE, null, ex);
        }
        //refreshGUI();
        JOptionPane.showMessageDialog(ClubViewer.this, "Club deleted successfully", "Club deleted", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDeleteContactActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        refreshQuicViewPanel();

    }//GEN-LAST:event_tableMousePressed


    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        if (accessPriviledge == 3) {
            if (updateMode == true) {
                int row = table.getSelectedRow();

                //make sure a row is selected
                if (row < 0) {
                    JOptionPane.showMessageDialog(ClubViewer.this, "You must select a club first!", "Selection Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // get the selected current Club

                Club tempClub = (Club) table.getValueAt(row, ClubTableModel.OBJECT_COL);
                if (clubIdLst.contains(tempClub.getClubId())) {
                    btnUpdateContact.setEnabled(true);
                } else {
                    btnUpdateContact.setEnabled(false);
                }

            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
       refreshQuicViewPanel();
    }//GEN-LAST:event_tableKeyReleased

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
         
    }//GEN-LAST:event_tableKeyPressed

    /**
     * method will refresh the GUI showing the latest update on the table
     *
     */
    public void refreshGUI() {
        try {
            // get all club theough the DAO to a tempory List
            List<Club> clubList = clubDAO.getAllClub();

            // create the model and update the "table"
            ClubTableModel model = new ClubTableModel(clubList);
            table.setModel(model);
            
             refreshQuicViewPanelDefault();

        } catch (Exception exc) {
            JOptionPane.showMessageDialog(ClubViewer.this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // new update*****************************************************************************************************by Malith
    public void refreshQuicViewPanel() {
        // get the selected row
        int row = table.getSelectedRow();
        // get the current Club
        Club tempClub = null;
        tempClub = (Club) table.getValueAt(row, ClubTableModel.OBJECT_COL);
        // get values
        txtQuickPane.setText(tempClub.getSummary());

    }
    // new update*****************************************************************************************************by Malith
    public void refreshQuicViewPanelDefault() {
        // get the selected row
        int row = 0;
        // get the current Club
        Club tempClub = null;
        try {
            tempClub = (Club) table.getValueAt(row, ClubTableModel.OBJECT_COL);
            // get values
            txtQuickPane.setText(tempClub.getSummary());
        } catch (Exception e) {
            txtQuickPane.setText("<html><font  size=\"4\" color=\"red\"><center>No  records!</center></font>");
        }

    }

    public List<String> getClubIdLst() {
        return clubIdLst;
    }

    public void setClubIdLst(List<String> clubIdLst) {
        this.clubIdLst = clubIdLst;
    }

    public void setUpdateMode(boolean updateMode) {
        this.updateMode = updateMode;
    }
    
    public void setAddBtnDisable(){btnNewContact.setEnabled(false);}
    public void setDeleteBtnDisable(){btnDeleteContact.setEnabled(false);}
    public void setUpdateBtnDisable(){btnUpdateContact.setEnabled(false);}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClubViewer(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteContact;
    private javax.swing.JButton btnNewContact;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateContact;
    private javax.swing.JComboBox comboPara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JEditorPane txtQuickPane;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
