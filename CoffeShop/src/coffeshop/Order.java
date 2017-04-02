/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeshop;

import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author Ghin
 */
public class Order extends javax.swing.JPanel {

    /**
     * Creates new form Order
     */
    public Order(int id, String fname, String lname, Date date, BigDecimal price, String promo_cd) {
        initComponents();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.price = price;
        this.promo_cd = promo_cd;
        lblID.setText(String.valueOf(id));
        lblName.setText(fname + " " + lname);
        lblDate.setText(date.toString());
        lblPrice.setText(String.valueOf(price));
    }

    public String getPromo_cd() {
        return promo_cd;
    }

    public void setPromo_cd(String promo_cd) {
        this.promo_cd = promo_cd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public JButton getBtnSelect() {
        return btnSelect;
    }

    public void setBtnSelect(JButton btnSelect) {
        this.btnSelect = btnSelect;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblID.setText("ID");

        lblName.setText("Name");

        lblDate.setText("Date");

        lblPrice.setText("Price");

        btnSelect.setText("Select");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSelect))
        );
    }// </editor-fold>//GEN-END:initComponents
    private int id;
    private String fname;
    private String lname;
    private Date date;
    private BigDecimal price;
    private String promo_cd;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    // End of variables declaration//GEN-END:variables
}
