/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MovieController;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author giria
 */
public class Admin extends javax.swing.JFrame {

    CardLayout cardLayout;

    private MovieController movieController;
    private javax.swing.table.DefaultTableModel dashboardModel;
    private javax.swing.table.DefaultTableModel mainModel;
    private javax.swing.table.DefaultTableModel historyModel;

    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Admin.class.getName());

    public Admin() {
        initComponents();
        cardLayout = (CardLayout) parentPanel.getLayout();

        movieController = new MovieController();

        dashboardModel = (javax.swing.table.DefaultTableModel) dashboardTable.getModel();
        mainModel = (javax.swing.table.DefaultTableModel) mainTable.getModel();
        historyModel = (javax.swing.table.DefaultTableModel) historyTable.getModel();
        
        loadDashboardData();
        loadMainTableData();
        loadHistoryData();

        cardLayout.show(parentPanel, "Home");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dashboardTable = new javax.swing.JTable();
        Logo7 = new javax.swing.JLabel();
        crudPanel = new javax.swing.JPanel();
        movieIDlabel = new javax.swing.JLabel();
        movieNameLabel = new javax.swing.JLabel();
        movieIDfield = new javax.swing.JTextField();
        movieNameField = new javax.swing.JTextField();
        directorLabel = new javax.swing.JLabel();
        directorField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        genreCombobox = new javax.swing.JComboBox<>();
        ratingLabel = new javax.swing.JLabel();
        ratingCombobox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        searchSortPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        historyPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        deleteHistoryButton = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        Logo2 = new javax.swing.JLabel();
        Logo4 = new javax.swing.JLabel();
        Logo5 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Manage = new javax.swing.JButton();
        SearchSort = new javax.swing.JButton();
        History = new javax.swing.JButton();
        sidePanelBG = new javax.swing.JLabel();
        Logo6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setBackground(new java.awt.Color(102, 102, 102));
        parentPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 204, 0));
        homePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        welcomeLabel.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        welcomeLabel.setText("Welcome to the dashboard, Admin");

        dashboardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Movie ID", "Movie Name", "Director", "Year", "Genre", "Raitng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(dashboardTable);

        Logo7.setBackground(new java.awt.Color(51, 51, 255));
        Logo7.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        Logo7.setText("Here are your available movies at the system.");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addGap(221, 221, 221))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(Logo7, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(Logo7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        parentPanel.add(homePanel, "Home");

        crudPanel.setBackground(new java.awt.Color(255, 204, 0));
        crudPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        movieIDlabel.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        movieIDlabel.setText("Movie ID");

        movieNameLabel.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        movieNameLabel.setText("Movie Name");

        movieIDfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieIDfieldActionPerformed(evt);
            }
        });

        movieNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieNameFieldActionPerformed(evt);
            }
        });

        directorLabel.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        directorLabel.setText("Director");

        directorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorFieldActionPerformed(evt);
            }
        });

        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });

        yearLabel.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        yearLabel.setText("Year");

        genreLabel.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        genreLabel.setText("Genre");

        genreCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Horror", "Comedy", "Drama" }));
        genreCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreComboboxActionPerformed(evt);
            }
        });

        ratingLabel.setFont(new java.awt.Font("STXinwei", 0, 14)); // NOI18N
        ratingLabel.setText("Rating");

        ratingCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        ratingCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingComboboxActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(102, 255, 102));
        addButton.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(51, 255, 255));
        updateButton.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Movie ID", "Movie Name", "Director", "Year", "Genre", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainTable);

        javax.swing.GroupLayout crudPanelLayout = new javax.swing.GroupLayout(crudPanel);
        crudPanel.setLayout(crudPanelLayout);
        crudPanelLayout.setHorizontalGroup(
            crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudPanelLayout.createSequentialGroup()
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crudPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(directorLabel)
                            .addComponent(movieIDlabel)
                            .addComponent(genreLabel))
                        .addGap(18, 18, 18)
                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieIDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(directorField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(crudPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genreCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(crudPanelLayout.createSequentialGroup()
                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yearLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(crudPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ratingLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ratingCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPanelLayout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        crudPanelLayout.setVerticalGroup(
            crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieIDlabel)
                    .addComponent(movieIDfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieNameLabel)
                    .addComponent(movieNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directorLabel)
                    .addComponent(directorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel)
                    .addComponent(genreCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingLabel)
                    .addComponent(ratingCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        parentPanel.add(crudPanel, "crud");

        searchSortPanel.setBackground(new java.awt.Color(255, 204, 0));
        searchSortPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        jLabel2.setText("Search");

        javax.swing.GroupLayout searchSortPanelLayout = new javax.swing.GroupLayout(searchSortPanel);
        searchSortPanel.setLayout(searchSortPanelLayout);
        searchSortPanelLayout.setHorizontalGroup(
            searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSortPanelLayout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel2)
                .addContainerGap(445, Short.MAX_VALUE))
        );
        searchSortPanelLayout.setVerticalGroup(
            searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSortPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        parentPanel.add(searchSortPanel, "search");

        historyPanel.setBackground(new java.awt.Color(255, 204, 0));
        historyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        jLabel10.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel10.setText("History Table");

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Movie ID", "Movie Name", "Director", "Year", "Genre", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historyTable);

        deleteHistoryButton.setBackground(new java.awt.Color(255, 153, 0));
        deleteHistoryButton.setFont(new java.awt.Font("STXinwei", 1, 14)); // NOI18N
        deleteHistoryButton.setText("Delete History");
        deleteHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addGroup(historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historyPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(historyPanelLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel10)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historyPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteHistoryButton)
                .addGap(51, 51, 51))
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(deleteHistoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        parentPanel.add(historyPanel, "History");

        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo2.setBackground(new java.awt.Color(51, 51, 255));
        Logo2.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        Logo2.setText("Movie Collection");
        sidePanel.add(Logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 40));

        Logo4.setBackground(new java.awt.Color(51, 51, 255));
        Logo4.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        Logo4.setText("MANAGEMENT");
        sidePanel.add(Logo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 40));

        Logo5.setBackground(new java.awt.Color(51, 51, 255));
        Logo5.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        Logo5.setText("SYSTEM");
        sidePanel.add(Logo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 40));

        Home.setBackground(java.awt.Color.yellow);
        Home.setFont(new java.awt.Font("STZhongsong", 1, 18)); // NOI18N
        Home.setText("Home");
        Home.setBorder(null);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        sidePanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 50));

        Manage.setFont(new java.awt.Font("STZhongsong", 1, 18)); // NOI18N
        Manage.setText("Manage");
        Manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageActionPerformed(evt);
            }
        });
        sidePanel.add(Manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 50));

        SearchSort.setFont(new java.awt.Font("STZhongsong", 1, 16)); // NOI18N
        SearchSort.setText("Search/Sort");
        SearchSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSortActionPerformed(evt);
            }
        });
        sidePanel.add(SearchSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, 50));

        History.setFont(new java.awt.Font("STZhongsong", 1, 18)); // NOI18N
        History.setText("History");
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });
        sidePanel.add(History, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 140, 50));

        sidePanelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/side panel.png"))); // NOI18N
        sidePanel.add(sidePanelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        Logo6.setBackground(new java.awt.Color(51, 51, 255));
        Logo6.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        Logo6.setText("MANAGEMENT");
        sidePanel.add(Logo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageActionPerformed
        cardLayout.show(parentPanel, "crud");
        Home.setBackground(Color.white);
        Manage.setBackground(Color.yellow);
        SearchSort.setBackground(Color.white);
        History.setBackground(Color.white);
    }//GEN-LAST:event_ManageActionPerformed

    private void SearchSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSortActionPerformed
        cardLayout.show(parentPanel, "search");
        Home.setBackground(Color.white);
        Manage.setBackground(Color.white);
        SearchSort.setBackground(Color.yellow);
        History.setBackground(Color.white);
    }//GEN-LAST:event_SearchSortActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        cardLayout.show(parentPanel, "Home");
        Home.setBackground(Color.yellow);
        Manage.setBackground(Color.white);
        SearchSort.setBackground(Color.white);
        History.setBackground(Color.white);
    }//GEN-LAST:event_HomeActionPerformed

    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
        cardLayout.show(parentPanel, "History");
        Home.setBackground(Color.white);
        Manage.setBackground(Color.white);
        SearchSort.setBackground(Color.white);
        History.setBackground(Color.yellow);
    }//GEN-LAST:event_HistoryActionPerformed

    private void movieIDfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieIDfieldActionPerformed
      
    }//GEN-LAST:event_movieIDfieldActionPerformed

    private void movieNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieNameFieldActionPerformed

    private void directorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void genreComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreComboboxActionPerformed

    private void ratingComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingComboboxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String idText = movieIDfield.getText().trim();
        String title = movieNameField.getText().trim();
        String director = directorField.getText().trim();
        String yearText = yearField.getText().trim();
        String genre = (String) genreCombobox.getSelectedItem();
        String ratingText = (String) ratingCombobox.getSelectedItem();
        
        if (idText.isEmpty() || title.isEmpty() || director.isEmpty() || yearText.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Please fill all fields!","Empty Fields",JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idText);
            int year = Integer.parseInt(yearText);
            int rating = Integer.parseInt(ratingText);
            boolean success = movieController.addMovie(id,title, director, year, genre, rating, this);

            if (success) {
                loadMainTableData();
                loadDashboardData();
                clearFields();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"ID and Year must be a valid number!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String idText = movieIDfield.getText().trim();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Movie ID to update!", "No ID", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idText);
            
            String title = movieNameField.getText().trim();
            String director = directorField.getText().trim();
            String yearText = yearField.getText().trim();
            String genre = (String) genreCombobox.getSelectedItem();
            String ratingText = (String) ratingCombobox.getSelectedItem();

            int year = 0;
            if (!yearText.isEmpty()) {
                year = Integer.parseInt(yearText);
            }
            
            int rating = Integer.parseInt(ratingText);

            boolean success = movieController.updateMovie(id, title, director, year, genre, rating, this);

            if (success) {
                loadMainTableData();
                loadDashboardData();
                clearFields();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID and Year must be valid numbers!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String idText = movieIDfield.getText().trim();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Movie ID to delete!", "No ID", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idText);

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete Movie ID: " + id + "?\n\nThis will move it to History.", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                boolean success = movieController.deleteMovie(id, this);

                if (success) {
                    loadMainTableData();
                    loadDashboardData();
                    loadHistoryData();                
                    clearFields();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Movie ID must be a valid number!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void deleteHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHistoryButtonActionPerformed
        
    }//GEN-LAST:event_deleteHistoryButtonActionPerformed

    private void loadDashboardData() {
        dashboardModel.setRowCount(0);
        
        java.util.ArrayList<Model.Movie> movies = movieController.getDashboardMovies();
        
        for (Model.Movie movie : movies) {
            dashboardModel.addRow(new Object[]{ movie.getId(), movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getGenre(), movie.getRating()});
        }
    }

    private void loadMainTableData() {
        mainModel.setRowCount(0);

        java.util.ArrayList<Model.Movie> movies = movieController.getAllMovies();

        for (Model.Movie movie : movies) {
            mainModel.addRow(new Object[]{ movie.getId(), movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getGenre(), movie.getRating()});
        }
    }

    private void loadHistoryData() {
        historyModel.setRowCount(0);
        
        java.util.ArrayList<Model.Movie> history = movieController.getHistory();

        for (Model.Movie movie : history) {
            historyModel.addRow(new Object[]{ movie.getId(), movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getGenre(), movie.getRating()});
        }
    }

    private void clearFields() {
        movieIDfield.setText("");
        movieNameField.setText("");
        directorField.setText("");
        yearField.setText("");
        genreCombobox.setSelectedIndex(0);
        ratingCombobox.setSelectedIndex(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Admin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton History;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel Logo4;
    private javax.swing.JLabel Logo5;
    private javax.swing.JLabel Logo6;
    private javax.swing.JLabel Logo7;
    private javax.swing.JButton Manage;
    private javax.swing.JButton SearchSort;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel crudPanel;
    private javax.swing.JTable dashboardTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteHistoryButton;
    private javax.swing.JTextField directorField;
    private javax.swing.JLabel directorLabel;
    private javax.swing.JComboBox<String> genreCombobox;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JTable historyTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable mainTable;
    private javax.swing.JTextField movieIDfield;
    private javax.swing.JLabel movieIDlabel;
    private javax.swing.JTextField movieNameField;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JComboBox<String> ratingCombobox;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JPanel searchSortPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel sidePanelBG;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JTextField yearField;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
