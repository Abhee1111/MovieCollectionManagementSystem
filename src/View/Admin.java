/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MovieController;
import Model.Movie;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author giria
 */
public class Admin extends javax.swing.JFrame {

    CardLayout cardLayout;

    private MovieController movieController;
    private DefaultTableModel dashboardModel;
    private DefaultTableModel mainModel;
    private DefaultTableModel historyModel;
    private DefaultTableModel searchSortModel;

    public Admin() {
        initComponents();
        cardLayout = (CardLayout) parentPanel.getLayout();

        movieController = new MovieController();

        dashboardModel = (DefaultTableModel) dashboardMovieTable.getModel();
        mainModel = (DefaultTableModel) mainTable.getModel();
        historyModel = (DefaultTableModel) historyTable.getModel();
        searchSortModel = (DefaultTableModel) searchSortTable.getModel();

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
        Logo8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dashboardMovieTable = new javax.swing.JTable();
        Logo9 = new javax.swing.JLabel();
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
        undoButton = new javax.swing.JButton();
        searchSortPanel = new javax.swing.JPanel();
        searchSortTitle = new javax.swing.JLabel();
        searchSortText = new javax.swing.JTextField();
        searchByName = new javax.swing.JButton();
        searchByGenre = new javax.swing.JButton();
        sortByYear = new javax.swing.JButton();
        sortByRating = new javax.swing.JButton();
        sortByName = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        searchSortTable = new javax.swing.JTable();
        historyPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        deleteHistoryButton = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        MClogo = new javax.swing.JLabel();
        manageLogo = new javax.swing.JLabel();
        systemLogo = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Manage = new javax.swing.JButton();
        SearchSort = new javax.swing.JButton();
        History = new javax.swing.JButton();
        sidePanelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setBackground(new java.awt.Color(102, 102, 102));
        parentPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 204, 0));
        homePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        Logo8.setBackground(new java.awt.Color(51, 51, 255));
        Logo8.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        Logo8.setText("Here are all the available movies at the system.");

        dashboardMovieTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(dashboardMovieTable);
        if (dashboardMovieTable.getColumnModel().getColumnCount() > 0) {
            dashboardMovieTable.getColumnModel().getColumn(5).setHeaderValue("Raitng");
        }

        Logo9.setBackground(new java.awt.Color(51, 51, 255));
        Logo9.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        Logo9.setText("Welcome to the dashboard, Admin");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logo8, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(Logo9)
                        .addGap(232, 232, 232))))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Logo9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Logo8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

        undoButton.setBackground(new java.awt.Color(153, 0, 255));
        undoButton.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        undoButton.setText("Undo");
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crudPanelLayout = new javax.swing.GroupLayout(crudPanel);
        crudPanel.setLayout(crudPanelLayout);
        crudPanelLayout.setHorizontalGroup(
            crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPanelLayout.createSequentialGroup()
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crudPanelLayout.createSequentialGroup()
                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crudPanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(crudPanelLayout.createSequentialGroup()
                                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(directorLabel)
                                            .addComponent(movieIDlabel)
                                            .addComponent(genreLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(movieIDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(directorField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(crudPanelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(crudPanelLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(genreCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPanelLayout.createSequentialGroup()
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(undoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(crudPanelLayout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
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
                    .addComponent(deleteButton)
                    .addComponent(undoButton))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        parentPanel.add(crudPanel, "crud");

        searchSortPanel.setBackground(new java.awt.Color(255, 204, 0));
        searchSortPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        searchSortTitle.setFont(new java.awt.Font("STXinwei", 1, 30)); // NOI18N
        searchSortTitle.setText("Search & Sort your movies");

        searchSortText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSortTextActionPerformed(evt);
            }
        });

        searchByName.setText("Search By Movie Name");
        searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameActionPerformed(evt);
            }
        });

        searchByGenre.setText("Search By Genre");
        searchByGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByGenreActionPerformed(evt);
            }
        });

        sortByYear.setText("Year");
        sortByYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByYearActionPerformed(evt);
            }
        });

        sortByRating.setText("Rating");
        sortByRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByRatingActionPerformed(evt);
            }
        });

        sortByName.setText("Movie Name");
        sortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setText("Search Movie by it's:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setText("Sort Movie by it's:");

        searchSortTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(searchSortTable);
        if (searchSortTable.getColumnModel().getColumnCount() > 0) {
            searchSortTable.getColumnModel().getColumn(5).setHeaderValue("Raitng");
        }

        javax.swing.GroupLayout searchSortPanelLayout = new javax.swing.GroupLayout(searchSortPanel);
        searchSortPanel.setLayout(searchSortPanelLayout);
        searchSortPanelLayout.setHorizontalGroup(
            searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSortPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(sortByName)
                .addGap(18, 18, 18)
                .addComponent(sortByYear)
                .addGap(18, 18, 18)
                .addComponent(sortByRating)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(searchSortText, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchByName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchByGenre)
                .addContainerGap())
            .addGroup(searchSortPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchSortPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchSortTitle)
                .addGap(259, 259, 259))
            .addGroup(searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchSortPanelLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        searchSortPanelLayout.setVerticalGroup(
            searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSortPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(searchSortTitle)
                .addGap(40, 40, 40)
                .addGroup(searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchSortText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortByYear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortByRating, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortByName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(417, 417, 417))
            .addGroup(searchSortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchSortPanelLayout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        parentPanel.add(searchSortPanel, "search");

        historyPanel.setBackground(new java.awt.Color(255, 204, 0));
        historyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        jLabel10.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jLabel10.setText("Delete History Table");

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
        deleteHistoryButton.setText("Clear history");
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

        MClogo.setBackground(new java.awt.Color(51, 51, 255));
        MClogo.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        MClogo.setText("Movie Collection");
        sidePanel.add(MClogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 40));

        manageLogo.setBackground(new java.awt.Color(51, 51, 255));
        manageLogo.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        manageLogo.setText("MANAGEMENT");
        sidePanel.add(manageLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 40));

        systemLogo.setBackground(new java.awt.Color(51, 51, 255));
        systemLogo.setFont(new java.awt.Font("STXinwei", 1, 20)); // NOI18N
        systemLogo.setText("SYSTEM");
        sidePanel.add(systemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 40));

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

        loadSearchSortTable(movieController.getAllMovies());
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

        // Validate all fields are filled
        if (idText.isEmpty() || title.isEmpty() || director.isEmpty() || yearText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill all required fields!\n"
                    + "Movie ID, Title, Director, and Year are required.",
                    "Empty Fields",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idText);
            int year = Integer.parseInt(yearText);
            int rating = Integer.parseInt(ratingText);

            boolean success = movieController.addMovie(id, title, director, year, genre, rating, this);

            if (success) {
                loadMainTableData();
                loadDashboardData();
                clearFields();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "ID and Year must be valid numbers!\n"
                    + "ID: Integer (e.g., 101)\n"
                    + "Year: Integer between 1900-2025",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String idText = movieIDfield.getText().trim();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter Movie ID to update!\n"
                    + "Only Movie ID is required. Other fields can be left empty to keep current values.",
                    "No ID",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idText);

            String title = movieNameField.getText().trim();
            String director = directorField.getText().trim();
            String yearText = yearField.getText().trim();
            String genre = (String) genreCombobox.getSelectedItem();
            String ratingText = (String) ratingCombobox.getSelectedItem();

            boolean success = movieController.updateMovie(id, title, director,
                    yearText.isEmpty() ? 0 : Integer.parseInt(yearText),
                    genre, ratingText, this);

            if (success) {
                loadMainTableData();
                loadDashboardData();
                clearFields();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "ID and Year must be valid numbers!\n"
                    + "If updating Year, it must be between 1900-2025",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String idText = movieIDfield.getText().trim();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter Movie ID to delete!\n"
                    + "Enter the Movie ID of the movie you want to delete.",
                    "No ID",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idText);

            boolean success = movieController.deleteMovie(id, this);

            if (success) {
                loadMainTableData();
                loadDashboardData();
                loadHistoryData();
                clearFields();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Movie ID must be a valid number!",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void deleteHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHistoryButtonActionPerformed
        movieController.clearHistory(this);
        loadHistoryData();
    }//GEN-LAST:event_deleteHistoryButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        boolean success = movieController.undoDelete(this);

        if (success) {
            loadMainTableData();
            loadDashboardData();
            loadHistoryData();
        }
    }//GEN-LAST:event_undoButtonActionPerformed

    private void searchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameActionPerformed
        String searchText = searchSortText.getText().trim();

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a movie name to search!",
                    "Empty Search",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Use Binary Search for exact match
        Movie movie = movieController.binarySearchByTitle(searchText);

        if (movie != null) {
            ArrayList<Movie> result = new ArrayList<>();
            result.add(movie);
            loadSearchSortTable(result);

            JOptionPane.showMessageDialog(this,
                    "Movie found!\n\n"
                    + "Title: " + movie.getTitle() + "\n"
                    + "Director: " + movie.getDirector() + "\n"
                    + "Year: " + movie.getYear(),
                    "Search Result",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            loadSearchSortTable(new ArrayList<>());
            JOptionPane.showMessageDialog(this,
                    "Movie not found!\n\n"
                    + "No movie with title: " + searchText + "\n"
                    + "Note: Binary search requires exact title match.",
                    "Not Found",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_searchByNameActionPerformed

    private void searchByGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByGenreActionPerformed
        String searchText = searchSortText.getText().trim();

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a genre to search!\n"
                    + "Examples: Action, Drama, Comedy, Horror",
                    "Empty Search",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Use Linear Search for partial matches
        ArrayList<Movie> results = movieController.searchByGenre(searchText);

        if (!results.isEmpty()) {
            loadSearchSortTable(results);

            JOptionPane.showMessageDialog(this,
                    "Found " + results.size() + " movie(s) in genre: " + searchText,
                    "Search Results",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            loadSearchSortTable(new ArrayList<>());
            JOptionPane.showMessageDialog(this,
                    "No movies found in genre: " + searchText + "\n"
                    + "Note: Search is case-insensitive and supports partial matches.",
                    "No Results",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_searchByGenreActionPerformed

    private void sortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameActionPerformed
        ArrayList<Movie> allMovies = movieController.getAllMovies();

        if (allMovies.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No movies to sort!",
                    "Empty List",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Use Insertion Sort for alphabetical order
        ArrayList<Movie> sortedMovies = movieController.insertionSortByTitle(allMovies);
        loadSearchSortTable(sortedMovies);

        JOptionPane.showMessageDialog(this,
                "Sorted " + sortedMovies.size() + " movies alphabetically by name (A-Z).\n"
                + "Algorithm used: Insertion Sort",
                "Sort Complete",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sortByNameActionPerformed

    private void sortByYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByYearActionPerformed
        ArrayList<Movie> allMovies = movieController.getAllMovies();

        if (allMovies.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No movies to sort!",
                    "Empty List",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Use Selection Sort for year (ascending)
        ArrayList<Movie> sortedMovies = movieController.selectionSortByYear(allMovies);
        loadSearchSortTable(sortedMovies);

        JOptionPane.showMessageDialog(this,
                "Sorted " + sortedMovies.size() + " movies by year (oldest to newest).\n"
                + "Algorithm used: Selection Sort",
                "Sort Complete",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sortByYearActionPerformed

    private void sortByRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByRatingActionPerformed
        ArrayList<Movie> allMovies = movieController.getAllMovies();

        if (allMovies.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No movies to sort!",
                    "Empty List",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Use Merge Sort for rating (descending)
        ArrayList<Movie> sortedMovies = movieController.mergeSortByRating(allMovies);
        loadSearchSortTable(sortedMovies);

        JOptionPane.showMessageDialog(this,
                "Sorted " + sortedMovies.size() + " movies by rating (highest to lowest).\n"
                + "Algorithm used: Merge Sort",
                "Sort Complete",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sortByRatingActionPerformed

    private void searchSortTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSortTextActionPerformed
        searchByNameActionPerformed(evt);
    }//GEN-LAST:event_searchSortTextActionPerformed

    // ============ TABLE LOADING METHODS ============
    private void loadDashboardData() {
        dashboardModel.setRowCount(0);

        // Get dashboard movies from controller (LinkedList - last 5 movies)
        java.util.LinkedList<Model.Movie> movies = movieController.getDashboardMovies();

        for (Model.Movie movie : movies) {
            dashboardModel.addRow(new Object[]{
                movie.getId(),
                movie.getTitle(),
                movie.getDirector(),
                movie.getYear(),
                movie.getGenre(),
                movie.getRating()
            });
        }
    }

    private void loadMainTableData() {
        mainModel.setRowCount(0);

        // Get all movies from controller (ArrayList)
        java.util.ArrayList<Model.Movie> movies = movieController.getAllMovies();

        for (Model.Movie movie : movies) {
            mainModel.addRow(new Object[]{
                movie.getId(),
                movie.getTitle(),
                movie.getDirector(),
                movie.getYear(),
                movie.getGenre(),
                movie.getRating()
            });
        }
    }

    private void loadHistoryData() {
        historyModel.setRowCount(0);

        // Get history from controller (Queue)
        java.util.ArrayList<Model.Movie> history = movieController.getHistory();

        for (Model.Movie movie : history) {
            historyModel.addRow(new Object[]{
                movie.getId(),
                movie.getTitle(),
                movie.getDirector(),
                movie.getYear(),
                movie.getGenre(),
                movie.getRating()
            });
        }
    }

    private void loadSearchSortTable(ArrayList<Movie> movies) {
        searchSortModel.setRowCount(0);

        if (movies == null || movies.isEmpty()) {
            return;
        }

        for (Movie movie : movies) {
            searchSortModel.addRow(new Object[]{
                movie.getId(),
                movie.getTitle(),
                movie.getDirector(),
                movie.getYear(),
                movie.getGenre(),
                movie.getRating()
            });
        }
    }

    private void clearFields() {
        movieIDfield.setText("");
        movieNameField.setText("");
        directorField.setText("");
        yearField.setText("");
        genreCombobox.setSelectedIndex(0);
        ratingCombobox.setSelectedIndex(4); // Default to 5
    }

    private void loadMovieDetailsIntoFields(int movieId) {
        Movie movie = movieController.getMovieById(movieId);
        if (movie != null) {
            movieIDfield.setText(String.valueOf(movie.getId()));
            movieNameField.setText(movie.getTitle());
            directorField.setText(movie.getDirector());
            yearField.setText(String.valueOf(movie.getYear()));

            // Set genre combobox
            for (int i = 0; i < genreCombobox.getItemCount(); i++) {
                if (genreCombobox.getItemAt(i).equals(movie.getGenre())) {
                    genreCombobox.setSelectedIndex(i);
                    break;
                }
            }

            // Set rating combobox (rating is 1-5, combobox index is 0-4)
            ratingCombobox.setSelectedIndex(movie.getRating() - 1);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Admin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton History;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Logo8;
    private javax.swing.JLabel Logo9;
    private javax.swing.JLabel MClogo;
    private javax.swing.JButton Manage;
    private javax.swing.JButton SearchSort;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel crudPanel;
    private javax.swing.JTable dashboardMovieTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteHistoryButton;
    private javax.swing.JTextField directorField;
    private javax.swing.JLabel directorLabel;
    private javax.swing.JComboBox<String> genreCombobox;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JTable historyTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable mainTable;
    private javax.swing.JLabel manageLogo;
    private javax.swing.JTextField movieIDfield;
    private javax.swing.JLabel movieIDlabel;
    private javax.swing.JTextField movieNameField;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JComboBox<String> ratingCombobox;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JButton searchByGenre;
    private javax.swing.JButton searchByName;
    private javax.swing.JPanel searchSortPanel;
    private javax.swing.JTable searchSortTable;
    private javax.swing.JTextField searchSortText;
    private javax.swing.JLabel searchSortTitle;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel sidePanelBG;
    private javax.swing.JButton sortByName;
    private javax.swing.JButton sortByRating;
    private javax.swing.JButton sortByYear;
    private javax.swing.JLabel systemLogo;
    private javax.swing.JButton undoButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField yearField;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
