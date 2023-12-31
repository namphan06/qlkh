/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.PersonBLL;
import DTO.Person;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nguye
 */
public class QuanLyGiaoVien extends javax.swing.JPanel {

    private int DEFALUT_WIDTH;
    private PersonBLL personBUS = new PersonBLL();
    DefaultTableModel model;
    static ArrayList<Person> listLecturers = new PersonBLL().getListPerson();
    String formatTime = "yyyy-MM-dd     ";
    DateFormat fm = new SimpleDateFormat(formatTime);

    public QuanLyGiaoVien() throws Exception {
        this.setSize(1090, 750);

        initComponents();

    }

    public QuanLyGiaoVien(int width) throws Exception {
        DEFALUT_WIDTH = width;
        initComponents();
        this.setSize(this.DEFALUT_WIDTH - 200, 750);
        init();

    }

    private void init() throws Exception {
        ShowLecturers();
//        Show dialog
        add_Lecturers.pack();
        add_Lecturers.setLocationRelativeTo(null);
        edit_Lecturers.pack();
        edit_Lecturers.setLocationRelativeTo(null);
    }

    private void ShowLecturers() throws Exception {

        try {
            PersonBLL bus = new PersonBLL();
            if (PersonBLL.getListPersonLecturers() == null) {
                bus.loadDSPersonLecturers();
            }
            insertHeader();
            outModel(model, PersonBLL.getListPersonLecturers());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không Thể Load Database ", "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void insertHeader() {
        Vector header = new Vector();
        header.add("STT");
        header.add("Mã giáo viên");
        header.add("Họ");
        header.add("Tên");
        header.add("Ngày thuê");

        //if (model.getRowCount()==0)
        model = new DefaultTableModel(header, 0);

    }

    private void outModel(DefaultTableModel model, ArrayList<Person> personDTO) // Xuất ra Table từ ArrayList
    {
        Vector data;
        model.setRowCount(0);

        int i = 1;
        for (Person cs : personDTO) {
            data = new Vector();
            data.add(i);
            data.add(cs.getPersonID());
            data.add(cs.getFirstname());
            data.add(cs.getLastname());
            data.add(fm.format(cs.getHireDate()));

            model.addRow(data);
            i++;
        }
        tbl_giangvien.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_Lecturers = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        txPositionError2 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        lbAddNV5 = new javax.swing.JLabel();
        btnExitThemNV = new javax.swing.JButton();
        btnDel1 = new javax.swing.JButton();
        txtId_Lecturers = new javax.swing.JTextField();
        txtLastNameGV = new javax.swing.JTextField();
        txtFirstNameGV = new javax.swing.JTextField();
        txtHireDateGV = new com.toedter.calendar.JDateChooser();
        edit_Lecturers = new javax.swing.JDialog();
        jPanel24 = new javax.swing.JPanel();
        txPositionError3 = new javax.swing.JLabel();
        btnSaveEditLecturers = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        lbAddNV6 = new javax.swing.JLabel();
        btnExitThemNV1 = new javax.swing.JButton();
        txtEditId_Lecturers = new javax.swing.JTextField();
        txtEditLastNameGV = new javax.swing.JTextField();
        txtEditFirstNameGV = new javax.swing.JTextField();
        txtEditHireDateGV = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_giangvien = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        txFind_GV = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        btn_editLecturers = new javax.swing.JButton();
        btn_deleteLecturers = new javax.swing.JButton();
        btn_addLecturers = new javax.swing.JButton();

        add_Lecturers.setUndecorated(true);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        btnSave1.setText("Lưu");
        btnSave1.setMinimumSize(new java.awt.Dimension(60, 30));
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));

        lbAddNV5.setBackground(new java.awt.Color(0, 0, 0));
        lbAddNV5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbAddNV5.setForeground(new java.awt.Color(255, 255, 255));
        lbAddNV5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAddNV5.setText("Thêm Giảng viên");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAddNV5, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAddNV5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        btnExitThemNV.setText("Hủy");
        btnExitThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitThemNVActionPerformed(evt);
            }
        });

        btnDel1.setText("Xóa hết");
        btnDel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDel1ActionPerformed(evt);
            }
        });

        txtId_Lecturers.setEditable(false);
        txtId_Lecturers.setBackground(new java.awt.Color(255, 255, 255));
        txtId_Lecturers.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Giảng viên"));
        txtId_Lecturers.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtId_Lecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId_LecturersActionPerformed(evt);
            }
        });

        txtLastNameGV.setBorder(javax.swing.BorderFactory.createTitledBorder("Tên Giảng viên"));

        txtFirstNameGV.setBorder(javax.swing.BorderFactory.createTitledBorder("Họ Giảng viên"));

        txtHireDateGV.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày thuê"));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnDel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txPositionError2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExitThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(txtFirstNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                        .addComponent(txtLastNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtId_Lecturers)
                                    .addComponent(txtHireDateGV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtId_Lecturers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(txtHireDateGV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txPositionError2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExitThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout add_LecturersLayout = new javax.swing.GroupLayout(add_Lecturers.getContentPane());
        add_Lecturers.getContentPane().setLayout(add_LecturersLayout);
        add_LecturersLayout.setHorizontalGroup(
            add_LecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        add_LecturersLayout.setVerticalGroup(
            add_LecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        edit_Lecturers.setUndecorated(true);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        btnSaveEditLecturers.setText("Lưu");
        btnSaveEditLecturers.setMinimumSize(new java.awt.Dimension(60, 30));
        btnSaveEditLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditLecturersActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));

        lbAddNV6.setBackground(new java.awt.Color(0, 0, 0));
        lbAddNV6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbAddNV6.setForeground(new java.awt.Color(255, 255, 255));
        lbAddNV6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAddNV6.setText("Sửa Giảng viên");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAddNV6, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAddNV6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        btnExitThemNV1.setText("Hủy");
        btnExitThemNV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitThemNV1ActionPerformed(evt);
            }
        });

        txtEditId_Lecturers.setEditable(false);
        txtEditId_Lecturers.setBackground(new java.awt.Color(255, 255, 255));
        txtEditId_Lecturers.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Giảng viên"));
        txtEditId_Lecturers.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEditId_Lecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditId_LecturersActionPerformed(evt);
            }
        });

        txtEditLastNameGV.setBorder(javax.swing.BorderFactory.createTitledBorder("Tên Giảng viên"));

        txtEditFirstNameGV.setBorder(javax.swing.BorderFactory.createTitledBorder("Họ Giảng viên"));

        txtEditHireDateGV.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày thuê"));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnSaveEditLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txPositionError3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExitThemNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(txtEditFirstNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                        .addComponent(txtEditLastNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEditId_Lecturers)
                                    .addComponent(txtEditHireDateGV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEditId_Lecturers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditFirstNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditLastNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(txtEditHireDateGV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txPositionError3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSaveEditLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExitThemNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout edit_LecturersLayout = new javax.swing.GroupLayout(edit_Lecturers.getContentPane());
        edit_Lecturers.getContentPane().setLayout(edit_LecturersLayout);
        edit_LecturersLayout.setHorizontalGroup(
            edit_LecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        edit_LecturersLayout.setVerticalGroup(
            edit_LecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1023, 466));

        tbl_giangvien.setAutoCreateRowSorter(true);
        tbl_giangvien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(0, 0, 0)));
        tbl_giangvien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_giangvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_giangvien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_giangvien.setName(""); // NOI18N
        tbl_giangvien.setRowHeight(40);
        tbl_giangvien.setRowMargin(5);
        tbl_giangvien.setSelectionBackground(new java.awt.Color(255, 204, 51));
        jScrollPane1.setViewportView(tbl_giangvien);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jPanel20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        txFind_GV.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txFind_GV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txFind_GVKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txFind_GV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(txFind_GV, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("QUẢN LÝ GIẢNG VIÊN");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(442, 442, 442))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_editLecturers.setBackground(new java.awt.Color(0, 204, 0));
        btn_editLecturers.setForeground(new java.awt.Color(255, 255, 255));
        btn_editLecturers.setText("SỬA");
        btn_editLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editLecturersActionPerformed(evt);
            }
        });

        btn_deleteLecturers.setBackground(new java.awt.Color(255, 51, 51));
        btn_deleteLecturers.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteLecturers.setText("XÓA");
        btn_deleteLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteLecturersActionPerformed(evt);
            }
        });

        btn_addLecturers.setBackground(new java.awt.Color(51, 0, 204));
        btn_addLecturers.setForeground(new java.awt.Color(255, 255, 255));
        btn_addLecturers.setText("THÊM");
        btn_addLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addLecturersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_addLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btn_addLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_editLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_deleteLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:

        try {

            Person lecturerDTO = new Person();
            PersonBLL lePersonBUS = new PersonBLL();

            if (txtId_Lecturers.getText().length() != 0 && txtHireDateGV.getDate() != null && txtLastNameGV.getText().length() != 0
                    && txtFirstNameGV.getText().length() != 0)//xem thử đã nhập hay chưa(textflied)
            {
                lecturerDTO.setPersonID(Integer.valueOf(txtId_Lecturers.getText()));
                lecturerDTO.setFirstname(txtFirstNameGV.getText());
                lecturerDTO.setLastname(txtLastNameGV.getText());
                lecturerDTO.setHireDate(txtHireDateGV.getDate());
                lePersonBUS.addLectures(lecturerDTO);
                lePersonBUS.loadDSPersonLecturers();
                add_Lecturers.dispose();
                ShowLecturers();
                txtFirstNameGV.setText("");
                txtLastNameGV.setText("");
                txtHireDateGV.setDate(null);

            } else {
                JOptionPane.showMessageDialog(null, "vui lòng nhập đầy đủ thông tin");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnExitThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitThemNVActionPerformed
        // TODO add your handling code here:
        txtFirstNameGV.setText("");
        txtLastNameGV.setText("");
        txtHireDateGV.setDate(null);
        add_Lecturers.dispose();
    }//GEN-LAST:event_btnExitThemNVActionPerformed

    private void btnDel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDel1ActionPerformed
        // TODO add your handling code here:
        txtFirstNameGV.setText("");
        txtLastNameGV.setText("");
        txtHireDateGV.setDate(null);

    }//GEN-LAST:event_btnDel1ActionPerformed

    private void txtId_LecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId_LecturersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId_LecturersActionPerformed

    private void btn_addLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addLecturersActionPerformed
        // TODO add your handling code here:
        String idPerson;
        try {
            idPerson = String.valueOf(personBUS.getALLPerson().get(personBUS.getALLPerson().size() - 1).getPersonID() + 1);
            txtId_Lecturers.setText(idPerson);
            add_Lecturers.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(QuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_addLecturersActionPerformed

    private void btn_editLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editLecturersActionPerformed
        // TODO add your handling code here:
        int i = tbl_giangvien.getSelectedRow();
//           System.out.println((Date) tbl_giangvien.getValueAt(i, 4));
        if (i == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần sửa");
        } else {
            txtEditId_Lecturers.setText(String.valueOf(tbl_giangvien.getValueAt(i, 1)));
            txtEditFirstNameGV.setText(String.valueOf(tbl_giangvien.getValueAt(i, 2)));
            txtEditLastNameGV.setText(String.valueOf(tbl_giangvien.getValueAt(i, 3)));

            String date = (String) tbl_giangvien.getValueAt(i, 4);

            try {
                txtEditHireDateGV.setDate((Date) fm.parse(date));
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            edit_Lecturers.setVisible(true);

        }
    }//GEN-LAST:event_btn_editLecturersActionPerformed

    private void txtEditId_LecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditId_LecturersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditId_LecturersActionPerformed

    private void btnExitThemNV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitThemNV1ActionPerformed
        // TODO add your handling code here:
        edit_Lecturers.dispose();
    }//GEN-LAST:event_btnExitThemNV1ActionPerformed

    private void btnSaveEditLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditLecturersActionPerformed
        // TODO add your handling code here:
        try {

            Person lecturerDTO = new Person();
            PersonBLL lePersonBUS = new PersonBLL();

            if (txtEditId_Lecturers.getText().length() != 0 && txtEditHireDateGV.getDate() != null && txtEditLastNameGV.getText().length() != 0
                    && txtEditFirstNameGV.getText().length() != 0)//xem thử đã nhập hay chưa(textflied)
            {
                lecturerDTO.setPersonID(Integer.valueOf(txtEditId_Lecturers.getText()));
                lecturerDTO.setFirstname(txtEditFirstNameGV.getText());
                lecturerDTO.setLastname(txtEditLastNameGV.getText());
                lecturerDTO.setHireDate(txtEditHireDateGV.getDate());
                lePersonBUS.editLectures(lecturerDTO);
                lePersonBUS.loadDSPersonLecturers();
                JOptionPane.showMessageDialog(null, "Sửa giảng viên thành công !");
                edit_Lecturers.dispose();
                ShowLecturers();

            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveEditLecturersActionPerformed

    private void btn_deleteLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteLecturersActionPerformed
        // TODO add your handling code here:
        int i = tbl_giangvien.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần xóa");

        } else if (JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa giảng viên này? ", "Confirm",
                JOptionPane.YES_OPTION, JOptionPane.NO_OPTION) == JOptionPane.YES_OPTION) {
            int select = (int) tbl_giangvien.getModel().getValueAt(i, 1);

            Person lecturerDTO = new Person();
            PersonBLL lePersonBUS = new PersonBLL();
            lecturerDTO.setPersonID(select);
            try {
//                 modelnv.removeRow(i);
//                tblnv.setModel(modelnv);
//                listNV.remove(i);
                lePersonBUS.deleteLectures(lecturerDTO.getPersonID());
                showMessageDialog(null, "Xóa thành công");
                lePersonBUS.loadDSPersonLecturers();
                ShowLecturers();
            } catch (Exception e) {
                showMessageDialog(null, "Xóa thất bại");
            }

        }
    }//GEN-LAST:event_btn_deleteLecturersActionPerformed

    private void txFind_GVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txFind_GVKeyPressed
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tbl_giangvien.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txFind_GV.getText().trim()));
    }//GEN-LAST:event_txFind_GVKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog add_Lecturers;
    private javax.swing.JButton btnDel1;
    private javax.swing.JButton btnExitThemNV;
    private javax.swing.JButton btnExitThemNV1;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSaveEditLecturers;
    private javax.swing.JButton btn_addLecturers;
    private javax.swing.JButton btn_deleteLecturers;
    private javax.swing.JButton btn_editLecturers;
    private javax.swing.JDialog edit_Lecturers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddNV5;
    private javax.swing.JLabel lbAddNV6;
    private javax.swing.JTable tbl_giangvien;
    private javax.swing.JTextField txFind_GV;
    private javax.swing.JLabel txPositionError2;
    private javax.swing.JLabel txPositionError3;
    private javax.swing.JTextField txtEditFirstNameGV;
    private com.toedter.calendar.JDateChooser txtEditHireDateGV;
    private javax.swing.JTextField txtEditId_Lecturers;
    private javax.swing.JTextField txtEditLastNameGV;
    private javax.swing.JTextField txtFirstNameGV;
    private com.toedter.calendar.JDateChooser txtHireDateGV;
    private javax.swing.JTextField txtId_Lecturers;
    private javax.swing.JTextField txtLastNameGV;
    // End of variables declaration//GEN-END:variables
}
