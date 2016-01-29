/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados;

import java.awt.Component;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Vector;
import javax.swing.JFileChooser;

/**
 *
 * @author Maickel
 */
public class Higienizacao extends javax.swing.JFrame {

    /**
     * Creates new form Higienizacao
     */
  //  try {
  String url = "jdbc:derby://localhost:1527/Higiene";
  private static String username = "root";
    private static String password = "";
    Connection con;
    String sql;
    
    DefaultTableModel model;
    
    //Login
    String NomeFuncionarioLogin;
    int idFuncionarioLogin;
    String Funcionario;
    String Equipamento;
    String Compartimento;
    String Produto;
    int idEquipamento;
    int idCompartimentos;
    
    
    //Variavel para buscar o nome do equipamento selecionado
    String BuscarNome = "";
    int idPesquisaSuperficie = 0;
    int idPesquisaProduto = 0;
    int idpesquisaCompartimento= 0;
    int idPesquisaFuncionario= 0;
    int idPesquisaEquipamento = 0;
    int idFuncionario =0;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    //
    int IDEquipamento = 0;
    int IDProduto = 0;
    int IDCompartimento = 0;
    int IDSuperficie = 0;
    int IDPH = 0;
    int IDFT = 0;
    int idcompartimento = 0; 
    
    JFileChooser jfc = new JFileChooser(".");
    public File input = null;
    private String nomeFile = "";
   // private String out = "F:\\Documentos\\IPG\\Projeto\\Ficheiros";
    private String out = "C:\\Nova pasta";
 
    public Higienizacao() {
       
        
        initComponents();
        LerFuncionario(jComboBoxLogin);
        
       // for (Component cp : jMenuBar1.getComponents() )
        //{
        //    cp.setEnabled(false);
        //}
           jPanelPrincipal.setVisible(true);
           jPanelRegistar.setVisible(false);
           jPanelConsultar.setVisible(false);
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogJanelaInicial = new javax.swing.JDialog();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelConsultar = new javax.swing.JPanel();
        jButtonCnPlanoHigienizacao = new javax.swing.JButton();
        jButtonCnFichasTecnicasProdutos = new javax.swing.JButton();
        jButtonCnTemperaturasEquipamentos = new javax.swing.JButton();
        jButtonCnHorasTrabalho = new javax.swing.JButton();
        jButtonCnRegistoLimpezas = new javax.swing.JButton();
        jButtonRegistarEquipamento = new javax.swing.JButton();
        jButtonCnProduto = new javax.swing.JButton();
        jButtonCnProduto1 = new javax.swing.JButton();
        jButtonCnSuperficies = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jPanelRegistar = new javax.swing.JPanel();
        jButtonReHorasTrabalho = new javax.swing.JButton();
        jButtonReLimpezas = new javax.swing.JButton();
        jButtonReTemperaturas = new javax.swing.JButton();
        jPanelAdministrador = new javax.swing.JPanel();
        jButtonRegistarFuncionario = new javax.swing.JButton();
        jButtonConsultarHorasTrbalhoAdmin = new javax.swing.JButton();
        jButtonAtualizarFuncionario = new javax.swing.JButton();
        jButtonCnFichasTecnicasProdutos1 = new javax.swing.JButton();
        jButtonRePlanoHigienizacao = new javax.swing.JButton();
        jButtonReEquipamento1 = new javax.swing.JButton();
        jButtonReSuperficie = new javax.swing.JButton();
        jButtonReEquipamento = new javax.swing.JButton();
        jButtonReProdutos = new javax.swing.JButton();
        jLabelLoginNome = new javax.swing.JLabel();
        jButtonLogOut2 = new javax.swing.JButton();
        jDialogRegistarEquipamento = new javax.swing.JDialog();
        jPanelRegistarEquipamento = new javax.swing.JPanel();
        jLabelNomeEquipamento = new javax.swing.JLabel();
        jTextFieldRegistarEquipamento = new javax.swing.JTextField();
        jLabelDescricaoEquipemento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRegistarDescricao = new javax.swing.JTextArea();
        jButtonVoltarRegistarEquipamento = new javax.swing.JButton();
        jButtonGuardarRegistarEquipamento = new javax.swing.JButton();
        jButtonAlterarEquipamento = new javax.swing.JButton();
        jDialogConsultarEquipamento = new javax.swing.JDialog();
        jPanelConsultarEquipamento = new javax.swing.JPanel();
        jButtonVoltarConsultarEquipamento = new javax.swing.JButton();
        jScrollPaneConsultarEquipamento = new javax.swing.JScrollPane();
        jTableConsultarEquipamento = new javax.swing.JTable();
        jButtonEditarConsultarEquipamento = new javax.swing.JButton();
        jButtonNovoEquipamentoConsultarEquipamento = new javax.swing.JButton();
        jTextFieldPesquisarConsultarEquipamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDialogRegistarTemperaturaEquipamento = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxEquipamento = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricaoAnomalias = new javax.swing.JTextArea();
        jButtonGuardarRegistarTemperatura = new javax.swing.JButton();
        jButtonVoltarRegistarTemperatura = new javax.swing.JButton();
        jLabelNomeRegistarTemperatura = new javax.swing.JLabel();
        jLabelTemperatura = new javax.swing.JLabel();
        jTextFieldRegistarTemperatura = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("*##,##ºC");
            jTextFieldRegistarTemperatura = new javax.swing.JFormattedTextField(cpf);
        }catch (Exception e){}
        jDialogConsultarTemperaturaEquipamento = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsultarTemperaturaEquipamento = new javax.swing.JTable();
        jButtonVoltarConsultarTemperatura = new javax.swing.JButton();
        jComboBoxConsultarTemperaturaEquipamento = new javax.swing.JComboBox();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooserTemperaturaFim1 = new com.toedter.calendar.JDateChooser();
        jDateChooserTemperaturaIni1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jButtonPesquisarporTemperaturaData1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDialogRegistarHorasTrabalho = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRegistarHorasTrabalho = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("#h:##min");
            jTextFieldRegistarHorasTrabalho = new javax.swing.JFormattedTextField(cpf);
        }catch (Exception e){}
        jButtonGuardarHorasTrabalho = new javax.swing.JButton();
        jButtonVoltaraHorasTrabalho = new javax.swing.JButton();
        jLabelHorasUtilizador = new javax.swing.JLabel();
        jDialogConsultarHorasTrabalho = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableConsultarHorasTrabalho = new javax.swing.JTable();
        jLabelConsultarHorasTrabalhoFuncionário = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooserHorasFim = new com.toedter.calendar.JDateChooser();
        jDateChooserHorasIni = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jButtonPesquisarporData = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButtonVoltarHT = new javax.swing.JButton();
        jDialogConsultarHorasADMIN = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableConsultarHorasAdmin = new javax.swing.JTable();
        jComboBoxConsultarHoras = new javax.swing.JComboBox();
        jButtonVoltarConsultarHorasAdmin = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jDateChooserConsultarHorasAdminIni = new com.toedter.calendar.JDateChooser();
        jDateChooserConsultarHorasAdminFim = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonConsultarHorasAdmin = new javax.swing.JButton();
        jButtonConsultarTodasHoras = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableRgistarSuperficiesLimpas = new javax.swing.JTable();
        jButtonGuardarRegistarSuperficiesLimpas = new javax.swing.JButton();
        jButtonVoltarRegistarSuperficiesLimpas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jDialogRegistarProduto = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRegistarProduto = new javax.swing.JTextField();
        jButtonGuardarRegistarProduto = new javax.swing.JButton();
        jButtonVoltarRegistarProduto = new javax.swing.JButton();
        buttonAtualizarProduto = new javax.swing.JButton();
        jDialogPlanodeLimpeza = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonVoltarPlanoLimpeza = new javax.swing.JButton();
        jDialogRegistoLimpeza = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabelLimpezaFuncionario = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jComboBoxResgistarlimpezaSuperficie = new javax.swing.JComboBox();
        jComboBoxResgistarlimpezaProduto = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserReshitsoLimpeza = new com.toedter.calendar.JDateChooser();
        jComboBoxResgistarlimpezaCompartimento = new javax.swing.JComboBox();
        jButtonResgitarLimpezaGuardar = new javax.swing.JButton();
        jButtonRegistarLimpezaVoltar = new javax.swing.JButton();
        jDialogConsultarProdutos = new javax.swing.JDialog();
        jPanelConsultarProduto = new javax.swing.JPanel();
        jButtonVoltarConsultarProduto = new javax.swing.JButton();
        jScrollPaneConsultarEquipamento1 = new javax.swing.JScrollPane();
        jTableConsultarProdutos = new javax.swing.JTable();
        jButtonEditarConsultarProduto = new javax.swing.JButton();
        jButtonNovoProdutoConsultar = new javax.swing.JButton();
        jTextFieldPesquisarConsultaProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jDialogRegistarFuncionario = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelMorada = new javax.swing.JLabel();
        jLabelCódigoPostal = new javax.swing.JLabel();
        jLabelContacto = new javax.swing.JLabel();
        jLabelLocalidade = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelNIF = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldMorada = new javax.swing.JTextField();
        jTextFieldCodigoP = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("####-###");
            jTextFieldCodigoP = new javax.swing.JFormattedTextField(cpf);
        }catch (Exception e){}
        jTextFieldLocalidade = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldConacto = new javax.swing.JTextField();
        jTextFieldNIF = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("#########");
            jTextFieldNIF = new javax.swing.JFormattedTextField(cpf);
        }catch (Exception e){}
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonGuardaRegistoFuncionario = new javax.swing.JButton();
        jButtonVoltarResgistoFuncionario = new javax.swing.JButton();
        jDateChooserRegistarFuncionário = new com.toedter.calendar.JDateChooser();
        buttonAtualizarFuncionario = new javax.swing.JButton();
        jDialogConsultarLimpeza = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableConsultarLimpeza = new javax.swing.JTable();
        jButtonVoltarConsultarLimpeza = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jDateChooserConsultarLimpezaIni = new com.toedter.calendar.JDateChooser();
        jDateChooserConsultarLimpezaFim = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonConsultarLimpeza = new javax.swing.JButton();
        jButtonConsultarTodasLaiampeza = new javax.swing.JButton();
        jDialogAtualizarUtilizador = new javax.swing.JDialog();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableAtualizarUtilizador = new javax.swing.JTable();
        jButtonEditarConsultarUtilizador = new javax.swing.JButton();
        jButtonVoltarConsultarUtilizador = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDialogRegistarCompartimento = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldRegistarCompartimento = new javax.swing.JTextField();
        jButtonGuardarRegistarCompartimento = new javax.swing.JButton();
        jButtonVoltarRegistarCompartimento = new javax.swing.JButton();
        buttonAtualizarCompartimento = new javax.swing.JButton();
        jDialogConsultarCompartimentos = new javax.swing.JDialog();
        jPanelConsultarProduto1 = new javax.swing.JPanel();
        jButtonVoltarConsultarCompartimento = new javax.swing.JButton();
        jScrollPaneConsultarEquipamento2 = new javax.swing.JScrollPane();
        jTableConsultarCompartimento = new javax.swing.JTable();
        jButtonEditarConsultarCompartimento = new javax.swing.JButton();
        jButtonNovoCompartimentoConsultar = new javax.swing.JButton();
        jTextFieldPesquisarConsultaCompartimento = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jDialogRegistarSuperficies = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxCompartimento = new javax.swing.JComboBox();
        jButtonGuardarRegistarSuperficie = new javax.swing.JButton();
        jButtonVoltarRegistarSuperficie = new javax.swing.JButton();
        jLabelNomeRegistarTemperatura1 = new javax.swing.JLabel();
        jLabelTemperatura1 = new javax.swing.JLabel();
        jTextFieldRegistarSuperficie = new javax.swing.JTextField();
        buttonAtualizarSuperficie = new javax.swing.JButton();
        jDialogConsultarSuperfícies = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableConsultarSuperficie = new javax.swing.JTable();
        jButtonVoltarConsultarSuperficie = new javax.swing.JButton();
        jComboBoxConsultarSuperficie = new javax.swing.JComboBox();
        jButtonEditarConsultarSuperficie = new javax.swing.JButton();
        jButtonNovoSuperficie = new javax.swing.JButton();
        jDialogRegistrarSeleEquipamentos = new javax.swing.JDialog();
        jButtonRegistarEquipamentoTemperatura = new javax.swing.JButton();
        jButtonRegistarEquipamentoLimpeza = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButtonVoltarSeleEquipamentos = new javax.swing.JButton();
        jDialogRegistarEquipamentosLimpeza = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxCompartimentoEquipamento = new javax.swing.JComboBox();
        jButtonGuardarRegistarEquipamentoLimpeza = new javax.swing.JButton();
        jButtonVoltarRegistarEquipamentoLimpeza = new javax.swing.JButton();
        jLabelNomeRegistarTemperatura2 = new javax.swing.JLabel();
        jLabelTemperatura2 = new javax.swing.JLabel();
        jTextFieldRegistarEquipamentoLimpeza = new javax.swing.JTextField();
        buttonAtualizarEquipamentoLimpeza = new javax.swing.JButton();
        jDialogRegistarEquipamentoAmbos = new javax.swing.JDialog();
        jPanel24 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxCompartimentoEquipamentoAmbos = new javax.swing.JComboBox();
        jButtonGuardarRegistarEquipamentoLimpezaAmbos = new javax.swing.JButton();
        jButtonVoltarRegistarEquipamentoLimpeza1 = new javax.swing.JButton();
        jLabelNomeRegistarTemperatura3 = new javax.swing.JLabel();
        jLabelTemperatura3 = new javax.swing.JLabel();
        jTextFieldRegistarEquipamentoLimpezaAmbos = new javax.swing.JTextField();
        buttonAtualizarEquipamentoLimpeza1 = new javax.swing.JButton();
        jDialogRegistarPH = new javax.swing.JDialog();
        jButtonSelecionarPH = new javax.swing.JButton();
        jTextFieldNomePH = new javax.swing.JTextField();
        jComboBoxCompartimentosPH = new javax.swing.JComboBox();
        jButtonGuardarPH = new javax.swing.JButton();
        jButtonRegistarPH = new javax.swing.JButton();
        jButtonAtualizarPH = new javax.swing.JButton();
        jButtonEDTPH = new javax.swing.JButton();
        jDialogConsultarPH = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableConsultarPH = new javax.swing.JTable();
        jButtonVoltarConsultarPH = new javax.swing.JButton();
        jButtonEditarConsultarPH = new javax.swing.JButton();
        jDialogConsultarPH2 = new javax.swing.JDialog();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableConsultarPH1 = new javax.swing.JTable();
        jButtonVoltarConsultarPH1 = new javax.swing.JButton();
        jDialogRegistarFT = new javax.swing.JDialog();
        jButtonSelecionarFT = new javax.swing.JButton();
        jTextFieldNomeFT = new javax.swing.JTextField();
        jComboBoxProdutoFT = new javax.swing.JComboBox();
        jButtonGuardarFT = new javax.swing.JButton();
        jButtonRegistarFT = new javax.swing.JButton();
        jButtonAtualizarFT = new javax.swing.JButton();
        jButtonEDTFT = new javax.swing.JButton();
        jDialogConsultarFT = new javax.swing.JDialog();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTableConsultarFT = new javax.swing.JTable();
        jButtonVoltarConsultarFT = new javax.swing.JButton();
        jDialogConsultarEditarFT = new javax.swing.JDialog();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTableConsultarEditarFT = new javax.swing.JTable();
        jButtonVoltarConsultarEditarFT = new javax.swing.JButton();
        jButtonEditarConsultarEditarFT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNomeLogin = new javax.swing.JLabel();
        jLabelPasswordLogin = new javax.swing.JLabel();
        jComboBoxLogin = new javax.swing.JComboBox();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogIn = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();

        jDialogJanelaInicial.setTitle("Janela Inicial");
        jDialogJanelaInicial.setMinimumSize(null);
        jDialogJanelaInicial.setSize(new java.awt.Dimension(700, 600));

        jPanelPrincipal.setMinimumSize(new java.awt.Dimension(764, 415));

        jPanelConsultar.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar"));
        jPanelConsultar.setPreferredSize(new java.awt.Dimension(202, 404));

        jButtonCnPlanoHigienizacao.setText("Plano de Higienização");
        jButtonCnPlanoHigienizacao.setActionCommand("Plano de Higinização");
        jButtonCnPlanoHigienizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnPlanoHigienizacaoActionPerformed(evt);
            }
        });

        jButtonCnFichasTecnicasProdutos.setText("Fichas Técnicas Produtos");
        jButtonCnFichasTecnicasProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnFichasTecnicasProdutosActionPerformed(evt);
            }
        });

        jButtonCnTemperaturasEquipamentos.setText("Temperaturas Equipamentos");
        jButtonCnTemperaturasEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnTemperaturasEquipamentosActionPerformed(evt);
            }
        });

        jButtonCnHorasTrabalho.setText("Horas Trabalho");
        jButtonCnHorasTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnHorasTrabalhoActionPerformed(evt);
            }
        });

        jButtonCnRegistoLimpezas.setText("Registo Limpezas");
        jButtonCnRegistoLimpezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnRegistoLimpezasActionPerformed(evt);
            }
        });

        jButtonRegistarEquipamento.setText("Equipamento");
        jButtonRegistarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarEquipamentoActionPerformed(evt);
            }
        });

        jButtonCnProduto.setText("Produtos");
        jButtonCnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnProdutoActionPerformed(evt);
            }
        });

        jButtonCnProduto1.setText("Compartimentos");
        jButtonCnProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnProduto1ActionPerformed(evt);
            }
        });

        jButtonCnSuperficies.setText("Superfícies");
        jButtonCnSuperficies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnSuperficiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultarLayout = new javax.swing.GroupLayout(jPanelConsultar);
        jPanelConsultar.setLayout(jPanelConsultarLayout);
        jPanelConsultarLayout.setHorizontalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCnPlanoHigienizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCnProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCnSuperficies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCnHorasTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCnRegistoLimpezas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegistarEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCnFichasTecnicasProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCnTemperaturasEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelConsultarLayout.setVerticalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCnPlanoHigienizacao)
                .addGap(18, 18, 18)
                .addComponent(jButtonCnHorasTrabalho)
                .addGap(18, 18, 18)
                .addComponent(jButtonCnRegistoLimpezas)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistarEquipamento)
                .addGap(18, 18, 18)
                .addComponent(jButtonCnProduto)
                .addGap(18, 18, 18)
                .addComponent(jButtonCnFichasTecnicasProdutos)
                .addGap(18, 18, 18)
                .addComponent(jButtonCnTemperaturasEquipamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCnProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCnSuperficies)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        jButtonRegistar.setText("Registar");
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jPanelRegistar.setBorder(javax.swing.BorderFactory.createTitledBorder("Registar"));
        jPanelRegistar.setPreferredSize(new java.awt.Dimension(169, 232));

        jButtonReHorasTrabalho.setText("Horas Trabalho");
        jButtonReHorasTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReHorasTrabalhoActionPerformed(evt);
            }
        });

        jButtonReLimpezas.setText("Higienização");
        jButtonReLimpezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReLimpezasActionPerformed(evt);
            }
        });

        jButtonReTemperaturas.setText("Temperaturas");
        jButtonReTemperaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReTemperaturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistarLayout = new javax.swing.GroupLayout(jPanelRegistar);
        jPanelRegistar.setLayout(jPanelRegistarLayout);
        jPanelRegistarLayout.setHorizontalGroup(
            jPanelRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonReTemperaturas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReLimpezas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReHorasTrabalho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelRegistarLayout.setVerticalGroup(
            jPanelRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistarLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jButtonReHorasTrabalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReLimpezas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReTemperaturas)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanelAdministrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Responsável de Qualidade"));

        jButtonRegistarFuncionario.setText("Registar Funcionário");
        jButtonRegistarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarFuncionarioActionPerformed(evt);
            }
        });

        jButtonConsultarHorasTrbalhoAdmin.setText("Horas Admin");
        jButtonConsultarHorasTrbalhoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarHorasTrbalhoAdminActionPerformed(evt);
            }
        });

        jButtonAtualizarFuncionario.setText("Atualizar Utilizador");
        jButtonAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarFuncionarioActionPerformed(evt);
            }
        });

        jButtonCnFichasTecnicasProdutos1.setText("Fichas Técnicas Produtos");
        jButtonCnFichasTecnicasProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnFichasTecnicasProdutos1ActionPerformed(evt);
            }
        });

        jButtonRePlanoHigienizacao.setText("Plano de Higiene");
        jButtonRePlanoHigienizacao.setActionCommand("jButtonEquipamento");
        jButtonRePlanoHigienizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRePlanoHigienizacaoActionPerformed(evt);
            }
        });

        jButtonReEquipamento1.setText("Compartimento");
        jButtonReEquipamento1.setActionCommand("jButtonEquipamento");
        jButtonReEquipamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReEquipamento1ActionPerformed(evt);
            }
        });

        jButtonReSuperficie.setText("Superfície");
        jButtonReSuperficie.setActionCommand("jButtonEquipamento");
        jButtonReSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReSuperficieActionPerformed(evt);
            }
        });

        jButtonReEquipamento.setText("Equipamento");
        jButtonReEquipamento.setActionCommand("jButtonEquipamento");
        jButtonReEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReEquipamentoActionPerformed(evt);
            }
        });

        jButtonReProdutos.setText("Produtos Limpeza");
        jButtonReProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdministradorLayout = new javax.swing.GroupLayout(jPanelAdministrador);
        jPanelAdministrador.setLayout(jPanelAdministradorLayout);
        jPanelAdministradorLayout.setHorizontalGroup(
            jPanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdministradorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegistarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAdministradorLayout.createSequentialGroup()
                        .addGroup(jPanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonReProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReEquipamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReSuperficie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReEquipamento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRePlanoHigienizacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCnFichasTecnicasProdutos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAtualizarFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConsultarHorasTrbalhoAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAdministradorLayout.setVerticalGroup(
            jPanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistarFuncionario)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultarHorasTrbalhoAdmin)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtualizarFuncionario)
                .addGap(18, 18, 18)
                .addComponent(jButtonCnFichasTecnicasProdutos1)
                .addGap(18, 18, 18)
                .addComponent(jButtonRePlanoHigienizacao)
                .addGap(18, 18, 18)
                .addComponent(jButtonReEquipamento1)
                .addGap(18, 18, 18)
                .addComponent(jButtonReSuperficie)
                .addGap(18, 18, 18)
                .addComponent(jButtonReEquipamento)
                .addGap(18, 18, 18)
                .addComponent(jButtonReProdutos)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonRegistar)
                                .addGap(35, 35, 35)
                                .addComponent(jButtonConsultar))
                            .addComponent(jPanelRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 244, Short.MAX_VALUE))
                    .addComponent(jPanelConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelRegistar.getAccessibleContext().setAccessibleName("");

        jLabelLoginNome.setText("jLabel1");

        jButtonLogOut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout2.png"))); // NOI18N
        jButtonLogOut2.setText("Log Out");
        jButtonLogOut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOut2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogJanelaInicialLayout = new javax.swing.GroupLayout(jDialogJanelaInicial.getContentPane());
        jDialogJanelaInicial.getContentPane().setLayout(jDialogJanelaInicialLayout);
        jDialogJanelaInicialLayout.setHorizontalGroup(
            jDialogJanelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogJanelaInicialLayout.createSequentialGroup()
                .addGroup(jDialogJanelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogJanelaInicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogJanelaInicialLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jButtonLogOut2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogJanelaInicialLayout.setVerticalGroup(
            jDialogJanelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogJanelaInicialLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jDialogJanelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogOut2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jDialogRegistarEquipamento.setTitle("Registar Equipamento");
        jDialogRegistarEquipamento.setMinimumSize(new java.awt.Dimension(546, 300));

        jPanelRegistarEquipamento.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanelRegistarEquipamento.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabelNomeEquipamento.setText("Nome:");

        jTextFieldRegistarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRegistarEquipamentoActionPerformed(evt);
            }
        });

        jLabelDescricaoEquipemento.setText("Descrição:");

        jTextAreaRegistarDescricao.setColumns(20);
        jTextAreaRegistarDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRegistarDescricao);

        jButtonVoltarRegistarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarRegistarEquipamento.setText("Voltar");
        jButtonVoltarRegistarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarEquipamentoActionPerformed(evt);
            }
        });

        jButtonGuardarRegistarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarRegistarEquipamento.setText("Guardar");
        jButtonGuardarRegistarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistarEquipamentoActionPerformed(evt);
            }
        });

        jButtonAlterarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        jButtonAlterarEquipamento.setText("Atualizar");
        jButtonAlterarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarEquipamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistarEquipamentoLayout = new javax.swing.GroupLayout(jPanelRegistarEquipamento);
        jPanelRegistarEquipamento.setLayout(jPanelRegistarEquipamentoLayout);
        jPanelRegistarEquipamentoLayout.setHorizontalGroup(
            jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistarEquipamentoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDescricaoEquipemento)
                    .addComponent(jLabelNomeEquipamento))
                .addGap(31, 31, 31)
                .addGroup(jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistarEquipamentoLayout.createSequentialGroup()
                        .addComponent(jButtonAlterarEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardarRegistarEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltarRegistarEquipamento))
                    .addGroup(jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldRegistarEquipamento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRegistarEquipamentoLayout.setVerticalGroup(
            jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistarEquipamentoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeEquipamento)
                    .addComponent(jTextFieldRegistarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricaoEquipemento)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarRegistarEquipamento)
                    .addComponent(jButtonVoltarRegistarEquipamento)
                    .addComponent(jButtonAlterarEquipamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelNomeEquipamento.getAccessibleContext().setAccessibleName("Nome");

        javax.swing.GroupLayout jDialogRegistarEquipamentoLayout = new javax.swing.GroupLayout(jDialogRegistarEquipamento.getContentPane());
        jDialogRegistarEquipamento.getContentPane().setLayout(jDialogRegistarEquipamentoLayout);
        jDialogRegistarEquipamentoLayout.setHorizontalGroup(
            jDialogRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jDialogRegistarEquipamentoLayout.setVerticalGroup(
            jDialogRegistarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogRegistarEquipamentoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanelRegistarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDialogConsultarEquipamento.setTitle("Consultar Equipamento");
        jDialogConsultarEquipamento.setMinimumSize(new java.awt.Dimension(596, 460));

        jButtonVoltarConsultarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarEquipamento.setText("Voltar");
        jButtonVoltarConsultarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarEquipamentoActionPerformed(evt);
            }
        });

        jTableConsultarEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneConsultarEquipamento.setViewportView(jTableConsultarEquipamento);
        if (jTableConsultarEquipamento.getColumnModel().getColumnCount() > 0) {
            jTableConsultarEquipamento.getColumnModel().getColumn(1).setHeaderValue("Observação");
        }

        jButtonEditarConsultarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEditarConsultarEquipamento.setText("Editar");
        jButtonEditarConsultarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarConsultarEquipamentoActionPerformed(evt);
            }
        });

        jButtonNovoEquipamentoConsultarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        jButtonNovoEquipamentoConsultarEquipamento.setText("Novo Equipamento");
        jButtonNovoEquipamentoConsultarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoEquipamentoConsultarEquipamentoActionPerformed(evt);
            }
        });

        jTextFieldPesquisarConsultarEquipamento.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPesquisarConsultarEquipamentoCaretUpdate(evt);
            }
        });

        jLabel9.setText("Pesquisa pelo Nome:");

        javax.swing.GroupLayout jPanelConsultarEquipamentoLayout = new javax.swing.GroupLayout(jPanelConsultarEquipamento);
        jPanelConsultarEquipamento.setLayout(jPanelConsultarEquipamentoLayout);
        jPanelConsultarEquipamentoLayout.setHorizontalGroup(
            jPanelConsultarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarEquipamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovoEquipamentoConsultarEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarConsultarEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltarConsultarEquipamento)
                        .addGap(22, 22, 22))
                    .addGroup(jPanelConsultarEquipamentoLayout.createSequentialGroup()
                        .addComponent(jScrollPaneConsultarEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanelConsultarEquipamentoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisarConsultarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelConsultarEquipamentoLayout.setVerticalGroup(
            jPanelConsultarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarEquipamentoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelConsultarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarConsultarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPaneConsultarEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarConsultarEquipamento)
                    .addComponent(jButtonEditarConsultarEquipamento)
                    .addComponent(jButtonNovoEquipamentoConsultarEquipamento))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jDialogConsultarEquipamentoLayout = new javax.swing.GroupLayout(jDialogConsultarEquipamento.getContentPane());
        jDialogConsultarEquipamento.getContentPane().setLayout(jDialogConsultarEquipamentoLayout);
        jDialogConsultarEquipamentoLayout.setHorizontalGroup(
            jDialogConsultarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultarEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogConsultarEquipamentoLayout.setVerticalGroup(
            jDialogConsultarEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultarEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogRegistarTemperaturaEquipamento.setTitle("Registar temperatura");
        jDialogRegistarTemperaturaEquipamento.setMinimumSize(new java.awt.Dimension(619, 433));

        jPanel3.setMinimumSize(new java.awt.Dimension(599, 411));

        jLabel2.setText("Equipamento:");

        jComboBoxEquipamento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxEquipamentoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquipamentoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createTitledBorder("Descrição Anomalia"));

        jTextAreaDescricaoAnomalias.setColumns(20);
        jTextAreaDescricaoAnomalias.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescricaoAnomalias);

        jButtonGuardarRegistarTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarRegistarTemperatura.setText("Guardar");
        jButtonGuardarRegistarTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistarTemperaturaActionPerformed(evt);
            }
        });

        jButtonVoltarRegistarTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarRegistarTemperatura.setText("Voltar");
        jButtonVoltarRegistarTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarTemperaturaActionPerformed(evt);
            }
        });

        jLabelNomeRegistarTemperatura.setText("jLabel4");

        jLabelTemperatura.setText("Temperatura:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jButtonGuardarRegistarTemperatura)
                        .addGap(125, 125, 125)
                        .addComponent(jButtonVoltarRegistarTemperatura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNomeRegistarTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 298, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelTemperatura)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldRegistarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(167, 167, 167))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelNomeRegistarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperatura)
                    .addComponent(jTextFieldRegistarTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarRegistarTemperatura)
                    .addComponent(jButtonVoltarRegistarTemperatura))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogRegistarTemperaturaEquipamentoLayout = new javax.swing.GroupLayout(jDialogRegistarTemperaturaEquipamento.getContentPane());
        jDialogRegistarTemperaturaEquipamento.getContentPane().setLayout(jDialogRegistarTemperaturaEquipamentoLayout);
        jDialogRegistarTemperaturaEquipamentoLayout.setHorizontalGroup(
            jDialogRegistarTemperaturaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarTemperaturaEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogRegistarTemperaturaEquipamentoLayout.setVerticalGroup(
            jDialogRegistarTemperaturaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarTemperaturaEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogConsultarTemperaturaEquipamento.setTitle("Consiltar Temperaturas");
        jDialogConsultarTemperaturaEquipamento.setMinimumSize(new java.awt.Dimension(702, 465));

        jPanel4.setPreferredSize(new java.awt.Dimension(754, 425));

        jTableConsultarTemperaturaEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Temperatura", "Data", "Hora", "Desc Anomalia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultarTemperaturaEquipamento.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jTableConsultarTemperaturaEquipamento);
        jTableConsultarTemperaturaEquipamento.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableConsultarTemperaturaEquipamento.getColumnModel().getColumnCount() > 0) {
            jTableConsultarTemperaturaEquipamento.getColumnModel().getColumn(1).setHeaderValue("Data");
            jTableConsultarTemperaturaEquipamento.getColumnModel().getColumn(2).setHeaderValue("Hora");
            jTableConsultarTemperaturaEquipamento.getColumnModel().getColumn(3).setHeaderValue("Desc Anomalia");
        }

        jButtonVoltarConsultarTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarTemperatura.setText("Voltar");
        jButtonVoltarConsultarTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarTemperaturaActionPerformed(evt);
            }
        });

        jComboBoxConsultarTemperaturaEquipamento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxConsultarTemperaturaEquipamentoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxConsultarTemperaturaEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConsultarTemperaturaEquipamentoActionPerformed(evt);
            }
        });

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por Data"));

        jLabel16.setText("Até a Data de:");

        jDateChooserTemperaturaFim1.setDateFormatString("yyyy-MM-dd");
        jDateChooserTemperaturaFim1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserTemperaturaFim1PropertyChange(evt);
            }
        });

        jDateChooserTemperaturaIni1.setDateFormatString("yyyy-MM-dd");
        jDateChooserTemperaturaIni1.setMaxSelectableDate(new java.util.Date(253370768474000L));
        jDateChooserTemperaturaIni1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserTemperaturaIni1PropertyChange(evt);
            }
        });

        jLabel17.setText("Selecione a Data de:");

        jButtonPesquisarporTemperaturaData1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        jButtonPesquisarporTemperaturaData1.setText("Pesquisar");
        jButtonPesquisarporTemperaturaData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarporTemperaturaData1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserTemperaturaFim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserTemperaturaIni1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonPesquisarporTemperaturaData1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserTemperaturaIni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserTemperaturaFim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPesquisarporTemperaturaData1))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        jButton2.setText("Ver todas as Horas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVoltarConsultarTemperatura)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxConsultarTemperaturaEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 104, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxConsultarTemperaturaEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltarConsultarTemperatura)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jDialogConsultarTemperaturaEquipamentoLayout = new javax.swing.GroupLayout(jDialogConsultarTemperaturaEquipamento.getContentPane());
        jDialogConsultarTemperaturaEquipamento.getContentPane().setLayout(jDialogConsultarTemperaturaEquipamentoLayout);
        jDialogConsultarTemperaturaEquipamentoLayout.setHorizontalGroup(
            jDialogConsultarTemperaturaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarTemperaturaEquipamentoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogConsultarTemperaturaEquipamentoLayout.setVerticalGroup(
            jDialogConsultarTemperaturaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarTemperaturaEquipamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogRegistarHorasTrabalho.setTitle("Registar Horas de Trabalho");
        jDialogRegistarHorasTrabalho.setMinimumSize(new java.awt.Dimension(520, 377));

        jPanel5.setMinimumSize(new java.awt.Dimension(500, 355));

        jLabel1.setText("Horas Realizados:");

        jTextFieldRegistarHorasTrabalho.setToolTipText("");
        jTextFieldRegistarHorasTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRegistarHorasTrabalhoActionPerformed(evt);
            }
        });

        jButtonGuardarHorasTrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarHorasTrabalho.setText("Guardar");
        jButtonGuardarHorasTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarHorasTrabalhoActionPerformed(evt);
            }
        });

        jButtonVoltaraHorasTrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltaraHorasTrabalho.setText("Voltar");
        jButtonVoltaraHorasTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaraHorasTrabalhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jTextFieldRegistarHorasTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltaraHorasTrabalho)
                    .addComponent(jButtonGuardarHorasTrabalho))
                .addGap(168, 168, 168))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonGuardarHorasTrabalho)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRegistarHorasTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButtonVoltaraHorasTrabalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelHorasUtilizador.setText("label");

        javax.swing.GroupLayout jDialogRegistarHorasTrabalhoLayout = new javax.swing.GroupLayout(jDialogRegistarHorasTrabalho.getContentPane());
        jDialogRegistarHorasTrabalho.getContentPane().setLayout(jDialogRegistarHorasTrabalhoLayout);
        jDialogRegistarHorasTrabalhoLayout.setHorizontalGroup(
            jDialogRegistarHorasTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarHorasTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogRegistarHorasTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialogRegistarHorasTrabalhoLayout.createSequentialGroup()
                        .addComponent(jLabelHorasUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDialogRegistarHorasTrabalhoLayout.setVerticalGroup(
            jDialogRegistarHorasTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogRegistarHorasTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHorasUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogConsultarHorasTrabalho.setTitle("Consultar as minhas Horas");
        jDialogConsultarHorasTrabalho.setMinimumSize(new java.awt.Dimension(821, 452));

        jTableConsultarHorasTrabalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horas de Trabalho", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableConsultarHorasTrabalho);

        jLabelConsultarHorasTrabalhoFuncionário.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelConsultarHorasTrabalhoFuncionário.setText("jLabel3");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        jButton1.setText("Ver todas as Horas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por Data"));

        jLabel11.setText("Até a Data de:");

        jDateChooserHorasFim.setDateFormatString("yyyy-MM-dd");
        jDateChooserHorasFim.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserHorasFimPropertyChange(evt);
            }
        });

        jDateChooserHorasIni.setDateFormatString("yyyy-MM-dd");
        jDateChooserHorasIni.setMaxSelectableDate(new java.util.Date(253370768474000L));
        jDateChooserHorasIni.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserHorasIniPropertyChange(evt);
            }
        });

        jLabel10.setText("Selecione a Data de:");

        jButtonPesquisarporData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        jButtonPesquisarporData.setText("Pesquisar");
        jButtonPesquisarporData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarporDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserHorasFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserHorasIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonPesquisarporData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserHorasIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserHorasFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPesquisarporData))
        );

        jButtonVoltarHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarHT.setText("Voltar");
        jButtonVoltarHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarHTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltarHT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonVoltarHT)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelConsultarHorasTrabalhoFuncionário, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(667, 667, 667))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabelConsultarHorasTrabalhoFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogConsultarHorasTrabalhoLayout = new javax.swing.GroupLayout(jDialogConsultarHorasTrabalho.getContentPane());
        jDialogConsultarHorasTrabalho.getContentPane().setLayout(jDialogConsultarHorasTrabalhoLayout);
        jDialogConsultarHorasTrabalhoLayout.setHorizontalGroup(
            jDialogConsultarHorasTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarHorasTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jDialogConsultarHorasTrabalhoLayout.setVerticalGroup(
            jDialogConsultarHorasTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarHorasTrabalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDialogConsultarHorasADMIN.setTitle("Consultar Horas dos Funcionário de Higienização");
        jDialogConsultarHorasADMIN.setMinimumSize(new java.awt.Dimension(825, 513));

        jTableConsultarHorasAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horas de Trabalho", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableConsultarHorasAdmin);

        jComboBoxConsultarHoras.setToolTipText("");
        jComboBoxConsultarHoras.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxConsultarHorasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxConsultarHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConsultarHorasActionPerformed(evt);
            }
        });

        jButtonVoltarConsultarHorasAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarHorasAdmin.setText("Voltar");
        jButtonVoltarConsultarHorasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarHorasAdminActionPerformed(evt);
            }
        });

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por Data"));

        jDateChooserConsultarHorasAdminIni.setDateFormatString("yyyy-MM-dd");
        jDateChooserConsultarHorasAdminIni.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserConsultarHorasAdminIniPropertyChange(evt);
            }
        });

        jDateChooserConsultarHorasAdminFim.setDateFormatString("yyyy-MM-dd");
        jDateChooserConsultarHorasAdminFim.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserConsultarHorasAdminFimPropertyChange(evt);
            }
        });

        jLabel12.setText("Até a Data de:");

        jLabel7.setText("Selecione a Data de:");

        jButtonConsultarHorasAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        jButtonConsultarHorasAdmin.setText("Pesquisar");
        jButtonConsultarHorasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarHorasAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jButtonConsultarHorasAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(jDateChooserConsultarHorasAdminIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserConsultarHorasAdminFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserConsultarHorasAdminIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserConsultarHorasAdminFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultarHorasAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonConsultarTodasHoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        jButtonConsultarTodasHoras.setText("Ver todas as Horas");
        jButtonConsultarTodasHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTodasHorasActionPerformed(evt);
            }
        });

        jButton3.setText("Exportar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxConsultarHoras, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConsultarTodasHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltarConsultarHorasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jComboBoxConsultarHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConsultarTodasHoras))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarConsultarHorasAdmin)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogConsultarHorasADMINLayout = new javax.swing.GroupLayout(jDialogConsultarHorasADMIN.getContentPane());
        jDialogConsultarHorasADMIN.getContentPane().setLayout(jDialogConsultarHorasADMINLayout);
        jDialogConsultarHorasADMINLayout.setHorizontalGroup(
            jDialogConsultarHorasADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarHorasADMINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogConsultarHorasADMINLayout.setVerticalGroup(
            jDialogConsultarHorasADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarHorasADMINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialog1.setMinimumSize(new java.awt.Dimension(1245, 942));

        jTableRgistarSuperficiesLimpas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pavimentos", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Paredes", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Teto", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Portas / Puxadores", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Armários", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Prateleiras", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Bancadas", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Utensílios", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Balança", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Câmara de Refrigeração", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Exaustor", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Fogão", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Janelas / Vidros", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Contentores do Lixo", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Superfícies / Dia", "1", "2", "3", "4", "5", " 6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", " 28", "29", "30", "31"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableRgistarSuperficiesLimpas.setColumnSelectionAllowed(true);
        jTableRgistarSuperficiesLimpas.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableRgistarSuperficiesLimpas.setRowHeight(20);
        jScrollPane6.setViewportView(jTableRgistarSuperficiesLimpas);
        jTableRgistarSuperficiesLimpas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableRgistarSuperficiesLimpas.getColumnModel().getColumnCount() > 0) {
            jTableRgistarSuperficiesLimpas.getColumnModel().getColumn(0).setMinWidth(135);
        }

        jButtonGuardarRegistarSuperficiesLimpas.setText("Guardar");

        jButtonVoltarRegistarSuperficiesLimpas.setText("Voltar");
        jButtonVoltarRegistarSuperficiesLimpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarSuperficiesLimpasActionPerformed(evt);
            }
        });

        jLabel5.setText("MÊS/ANO:");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jButtonGuardarRegistarSuperficiesLimpas)
                        .addGap(304, 304, 304)
                        .addComponent(jButtonVoltarRegistarSuperficiesLimpas)))
                .addGap(89, 89, 89))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarRegistarSuperficiesLimpas)
                        .addGap(28, 28, 28))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButtonVoltarRegistarSuperficiesLimpas)
                        .addGap(26, 26, 26))))
        );

        jDialogRegistarProduto.setTitle("Registar Produto");
        jDialogRegistarProduto.setMinimumSize(new java.awt.Dimension(391, 197));

        jPanel11.setMinimumSize(new java.awt.Dimension(371, 186));

        jLabel4.setText("Nome:");

        jButtonGuardarRegistarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarRegistarProduto.setText("Guardar");
        jButtonGuardarRegistarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistarProdutoActionPerformed(evt);
            }
        });

        jButtonVoltarRegistarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarRegistarProduto.setText("Voltar");
        jButtonVoltarRegistarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarProdutoActionPerformed(evt);
            }
        });

        buttonAtualizarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        buttonAtualizarProduto.setText("Atualizar");
        buttonAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(buttonAtualizarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardarRegistarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltarRegistarProduto))
                    .addComponent(jTextFieldRegistarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRegistarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarRegistarProduto)
                    .addComponent(jButtonVoltarRegistarProduto)
                    .addComponent(buttonAtualizarProduto))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jDialogRegistarProdutoLayout = new javax.swing.GroupLayout(jDialogRegistarProduto.getContentPane());
        jDialogRegistarProduto.getContentPane().setLayout(jDialogRegistarProdutoLayout);
        jDialogRegistarProdutoLayout.setHorizontalGroup(
            jDialogRegistarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegistarProdutoLayout.setVerticalGroup(
            jDialogRegistarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogPlanodeLimpeza.setMinimumSize(new java.awt.Dimension(1109, 893));

        jPanel10.setMinimumSize(new java.awt.Dimension(1100, 533));
        jPanel10.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PlanoLimpezas.PNG"))); // NOI18N
        jPanel10.add(jLabel3);
        jLabel3.setBounds(0, 0, 1090, 780);

        jButtonVoltarPlanoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarPlanoLimpeza.setText("Voltar");
        jButtonVoltarPlanoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarPlanoLimpezaActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonVoltarPlanoLimpeza);
        jButtonVoltarPlanoLimpeza.setBounds(930, 780, 130, 57);

        javax.swing.GroupLayout jDialogPlanodeLimpezaLayout = new javax.swing.GroupLayout(jDialogPlanodeLimpeza.getContentPane());
        jDialogPlanodeLimpeza.getContentPane().setLayout(jDialogPlanodeLimpezaLayout);
        jDialogPlanodeLimpezaLayout.setHorizontalGroup(
            jDialogPlanodeLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogPlanodeLimpezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogPlanodeLimpezaLayout.setVerticalGroup(
            jDialogPlanodeLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogPlanodeLimpezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jDialogRegistoLimpeza.setTitle("Registar Higienização");
        jDialogRegistoLimpeza.setMinimumSize(new java.awt.Dimension(525, 311));
        jDialogRegistoLimpeza.setPreferredSize(new java.awt.Dimension(525, 311));

        jPanel8.setMinimumSize(new java.awt.Dimension(515, 310));

        jLabelLimpezaFuncionario.setText("jLabel6");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Registar Higienização"));
        jPanel15.setMinimumSize(new java.awt.Dimension(203, 187));

        jComboBoxResgistarlimpezaSuperficie.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxResgistarlimpezaSuperficiePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxResgistarlimpezaSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResgistarlimpezaSuperficieActionPerformed(evt);
            }
        });

        jComboBoxResgistarlimpezaProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxResgistarlimpezaProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel13.setText("Selecione a Data de Limpeza:");

        jDateChooserReshitsoLimpeza.setToolTipText("");
        jDateChooserReshitsoLimpeza.setDateFormatString("yyyy-MM-dd");

        jComboBoxResgistarlimpezaCompartimento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxResgistarlimpezaCompartimentoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxResgistarlimpezaCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResgistarlimpezaCompartimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBoxResgistarlimpezaCompartimento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxResgistarlimpezaSuperficie, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxResgistarlimpezaProduto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserReshitsoLimpeza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxResgistarlimpezaCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxResgistarlimpezaSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxResgistarlimpezaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserReshitsoLimpeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonResgitarLimpezaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonResgitarLimpezaGuardar.setText("Guardar");
        jButtonResgitarLimpezaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResgitarLimpezaGuardarActionPerformed(evt);
            }
        });

        jButtonRegistarLimpezaVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonRegistarLimpezaVoltar.setText("Voltar");
        jButtonRegistarLimpezaVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarLimpezaVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabelLimpezaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonResgitarLimpezaGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jButtonRegistarLimpezaVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelLimpezaFuncionario)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonResgitarLimpezaGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistarLimpezaVoltar)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogRegistoLimpezaLayout = new javax.swing.GroupLayout(jDialogRegistoLimpeza.getContentPane());
        jDialogRegistoLimpeza.getContentPane().setLayout(jDialogRegistoLimpezaLayout);
        jDialogRegistoLimpezaLayout.setHorizontalGroup(
            jDialogRegistoLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistoLimpezaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDialogRegistoLimpezaLayout.setVerticalGroup(
            jDialogRegistoLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistoLimpezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogConsultarProdutos.setTitle("Consultar Produtos");
        jDialogConsultarProdutos.setMinimumSize(new java.awt.Dimension(630, 474));

        jButtonVoltarConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarProduto.setText("Voltar");
        jButtonVoltarConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarProdutoActionPerformed(evt);
            }
        });

        jTableConsultarProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneConsultarEquipamento1.setViewportView(jTableConsultarProdutos);

        jButtonEditarConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEditarConsultarProduto.setText("Editar");
        jButtonEditarConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarConsultarProdutoActionPerformed(evt);
            }
        });

        jButtonNovoProdutoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        jButtonNovoProdutoConsultar.setText("Registar Produto");
        jButtonNovoProdutoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoProdutoConsultarActionPerformed(evt);
            }
        });

        jTextFieldPesquisarConsultaProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPesquisarConsultaProdutoCaretUpdate(evt);
            }
        });

        jLabel8.setText("Pesquisar:");

        javax.swing.GroupLayout jPanelConsultarProdutoLayout = new javax.swing.GroupLayout(jPanelConsultarProduto);
        jPanelConsultarProduto.setLayout(jPanelConsultarProdutoLayout);
        jPanelConsultarProdutoLayout.setHorizontalGroup(
            jPanelConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovoProdutoConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditarConsultarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltarConsultarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(jPanelConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPesquisarConsultaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jScrollPaneConsultarEquipamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelConsultarProdutoLayout.setVerticalGroup(
            jPanelConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarProdutoLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButtonNovoProdutoConsultar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditarConsultarProduto)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarConsultarProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarProdutoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneConsultarEquipamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jDialogConsultarProdutosLayout = new javax.swing.GroupLayout(jDialogConsultarProdutos.getContentPane());
        jDialogConsultarProdutos.getContentPane().setLayout(jDialogConsultarProdutosLayout);
        jDialogConsultarProdutosLayout.setHorizontalGroup(
            jDialogConsultarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogConsultarProdutosLayout.setVerticalGroup(
            jDialogConsultarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jDialogRegistarFuncionario.setTitle("Registar Funcinário");
        jDialogRegistarFuncionario.setMinimumSize(new java.awt.Dimension(484, 590));

        jLabelNome.setText("Nome:");

        jLabelMorada.setText("Morada:");

        jLabelCódigoPostal.setText("Código-Postal:");

        jLabelContacto.setText("Contacto:");

        jLabelLocalidade.setText("Localidade:");

        jLabelEmail.setText("Email:");

        jLabelNIF.setText("NIF:");

        jLabelPassword.setText("Password:");

        jLabelDataNasc.setText("Data_Nasc:");

        jTextFieldConacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConactoActionPerformed(evt);
            }
        });

        jButtonGuardaRegistoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardaRegistoFuncionario.setText("Guardar");
        jButtonGuardaRegistoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardaRegistoFuncionarioActionPerformed(evt);
            }
        });

        jButtonVoltarResgistoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarResgistoFuncionario.setText("Voltar");
        jButtonVoltarResgistoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarResgistoFuncionarioActionPerformed(evt);
            }
        });

        jDateChooserRegistarFuncionário.setDateFormatString("yyyy-MM-dd");

        buttonAtualizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        buttonAtualizarFuncionario.setText("Atualizar");
        buttonAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCódigoPostal)
                            .addComponent(jLabelMorada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLocalidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelContacto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNIF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDataNasc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldMorada, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldCodigoP, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldLocalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldConacto, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldNIF, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jDateChooserRegistarFuncionário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonGuardaRegistoFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAtualizarFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltarResgistoFuncionario)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMorada)
                            .addComponent(jTextFieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCódigoPostal)
                            .addComponent(jTextFieldCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLocalidade)
                            .addComponent(jTextFieldLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldConacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContacto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail))
                        .addGap(21, 21, 21)
                        .addComponent(jLabelNIF))
                    .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDataNasc)
                    .addComponent(jDateChooserRegistarFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardaRegistoFuncionario)
                    .addComponent(jButtonVoltarResgistoFuncionario)
                    .addComponent(buttonAtualizarFuncionario))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jDialogRegistarFuncionarioLayout = new javax.swing.GroupLayout(jDialogRegistarFuncionario.getContentPane());
        jDialogRegistarFuncionario.getContentPane().setLayout(jDialogRegistarFuncionarioLayout);
        jDialogRegistarFuncionarioLayout.setHorizontalGroup(
            jDialogRegistarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegistarFuncionarioLayout.setVerticalGroup(
            jDialogRegistarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogConsultarLimpeza.setTitle("Consultar Higienização");
        jDialogConsultarLimpeza.setMinimumSize(new java.awt.Dimension(825, 513));

        jTableConsultarLimpeza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Funcionario", "Compartimento", "Superficie", "Produto", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTableConsultarLimpeza);

        jButtonVoltarConsultarLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarLimpeza.setText("Voltar");
        jButtonVoltarConsultarLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarLimpezaActionPerformed(evt);
            }
        });

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por Data"));

        jDateChooserConsultarLimpezaIni.setDateFormatString("yyyy-MM-dd");
        jDateChooserConsultarLimpezaIni.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserConsultarLimpezaIniPropertyChange(evt);
            }
        });

        jDateChooserConsultarLimpezaFim.setDateFormatString("yyyy-MM-dd");
        jDateChooserConsultarLimpezaFim.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserConsultarLimpezaFimPropertyChange(evt);
            }
        });

        jLabel14.setText("Até a Data de:");

        jLabel15.setText("Selecione a Data de:");

        jButtonConsultarLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        jButtonConsultarLimpeza.setText("Pesquisar");
        jButtonConsultarLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarLimpezaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jButtonConsultarLimpeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(jDateChooserConsultarLimpezaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserConsultarLimpezaFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserConsultarLimpezaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserConsultarLimpezaFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultarLimpeza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonConsultarTodasLaiampeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Consultar.png"))); // NOI18N
        jButtonConsultarTodasLaiampeza.setText("Guardar Excel");
        jButtonConsultarTodasLaiampeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTodasLaiampezaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVoltarConsultarLimpeza, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConsultarTodasLaiampeza, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConsultarTodasLaiampeza))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltarConsultarLimpeza)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogConsultarLimpezaLayout = new javax.swing.GroupLayout(jDialogConsultarLimpeza.getContentPane());
        jDialogConsultarLimpeza.getContentPane().setLayout(jDialogConsultarLimpezaLayout);
        jDialogConsultarLimpezaLayout.setHorizontalGroup(
            jDialogConsultarLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarLimpezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogConsultarLimpezaLayout.setVerticalGroup(
            jDialogConsultarLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarLimpezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogAtualizarUtilizador.setTitle("Atualizar Utilizador");
        jDialogAtualizarUtilizador.setMinimumSize(new java.awt.Dimension(513, 419));

        jTableAtualizarUtilizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Utillizador"
            }
        ));
        jScrollPane10.setViewportView(jTableAtualizarUtilizador);

        jButtonEditarConsultarUtilizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEditarConsultarUtilizador.setText("Atualizar");
        jButtonEditarConsultarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarConsultarUtilizadorActionPerformed(evt);
            }
        });

        jButtonVoltarConsultarUtilizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarUtilizador.setText("Voltar");
        jButtonVoltarConsultarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarUtilizadorActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecione o Utilizador:");

        javax.swing.GroupLayout jDialogAtualizarUtilizadorLayout = new javax.swing.GroupLayout(jDialogAtualizarUtilizador.getContentPane());
        jDialogAtualizarUtilizador.getContentPane().setLayout(jDialogAtualizarUtilizadorLayout);
        jDialogAtualizarUtilizadorLayout.setHorizontalGroup(
            jDialogAtualizarUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAtualizarUtilizadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialogAtualizarUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltarConsultarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialogAtualizarUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonEditarConsultarUtilizador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jDialogAtualizarUtilizadorLayout.setVerticalGroup(
            jDialogAtualizarUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAtualizarUtilizadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDialogAtualizarUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogAtualizarUtilizadorLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButtonEditarConsultarUtilizador)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonVoltarConsultarUtilizador))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jDialogRegistarCompartimento.setTitle("Registar Compartiment");
        jDialogRegistarCompartimento.setMinimumSize(new java.awt.Dimension(391, 197));

        jPanel20.setMinimumSize(new java.awt.Dimension(371, 186));

        jLabel18.setText("Nome:");

        jButtonGuardarRegistarCompartimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarRegistarCompartimento.setText("Guardar");
        jButtonGuardarRegistarCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistarCompartimentoActionPerformed(evt);
            }
        });

        jButtonVoltarRegistarCompartimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarRegistarCompartimento.setText("Voltar");
        jButtonVoltarRegistarCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarCompartimentoActionPerformed(evt);
            }
        });

        buttonAtualizarCompartimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        buttonAtualizarCompartimento.setText("Atualizar");
        buttonAtualizarCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarCompartimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(buttonAtualizarCompartimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardarRegistarCompartimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltarRegistarCompartimento))
                    .addComponent(jTextFieldRegistarCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRegistarCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarRegistarCompartimento)
                    .addComponent(jButtonVoltarRegistarCompartimento)
                    .addComponent(buttonAtualizarCompartimento))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jDialogRegistarCompartimentoLayout = new javax.swing.GroupLayout(jDialogRegistarCompartimento.getContentPane());
        jDialogRegistarCompartimento.getContentPane().setLayout(jDialogRegistarCompartimentoLayout);
        jDialogRegistarCompartimentoLayout.setHorizontalGroup(
            jDialogRegistarCompartimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarCompartimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegistarCompartimentoLayout.setVerticalGroup(
            jDialogRegistarCompartimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarCompartimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogConsultarCompartimentos.setTitle("Cpnsultar Comparimentos");
        jDialogConsultarCompartimentos.setMinimumSize(new java.awt.Dimension(630, 474));

        jButtonVoltarConsultarCompartimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarCompartimento.setText("Voltar");
        jButtonVoltarConsultarCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarCompartimentoActionPerformed(evt);
            }
        });

        jTableConsultarCompartimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compartimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneConsultarEquipamento2.setViewportView(jTableConsultarCompartimento);

        jButtonEditarConsultarCompartimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEditarConsultarCompartimento.setText("Editar");
        jButtonEditarConsultarCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarConsultarCompartimentoActionPerformed(evt);
            }
        });

        jButtonNovoCompartimentoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        jButtonNovoCompartimentoConsultar.setText("Registar Compartimento");
        jButtonNovoCompartimentoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCompartimentoConsultarActionPerformed(evt);
            }
        });

        jTextFieldPesquisarConsultaCompartimento.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPesquisarConsultaCompartimentoCaretUpdate(evt);
            }
        });

        jLabel19.setText("Pesquisar:");

        javax.swing.GroupLayout jPanelConsultarProduto1Layout = new javax.swing.GroupLayout(jPanelConsultarProduto1);
        jPanelConsultarProduto1.setLayout(jPanelConsultarProduto1Layout);
        jPanelConsultarProduto1Layout.setHorizontalGroup(
            jPanelConsultarProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarProduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovoCompartimentoConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditarConsultarCompartimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltarConsultarCompartimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(jPanelConsultarProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPesquisarConsultaCompartimento, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jScrollPaneConsultarEquipamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelConsultarProduto1Layout.setVerticalGroup(
            jPanelConsultarProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarProduto1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButtonNovoCompartimentoConsultar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditarConsultarCompartimento)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarConsultarCompartimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarProduto1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelConsultarProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarConsultaCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneConsultarEquipamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jDialogConsultarCompartimentosLayout = new javax.swing.GroupLayout(jDialogConsultarCompartimentos.getContentPane());
        jDialogConsultarCompartimentos.getContentPane().setLayout(jDialogConsultarCompartimentosLayout);
        jDialogConsultarCompartimentosLayout.setHorizontalGroup(
            jDialogConsultarCompartimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarCompartimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultarProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogConsultarCompartimentosLayout.setVerticalGroup(
            jDialogConsultarCompartimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarCompartimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultarProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogRegistarSuperficies.setTitle("Registar Superfícies");
        jDialogRegistarSuperficies.setMinimumSize(new java.awt.Dimension(549, 217));

        jPanel21.setMinimumSize(new java.awt.Dimension(527, 192));

        jLabel20.setText("Compartimento:");

        jComboBoxCompartimento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCompartimentoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxCompartimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompartimentoActionPerformed(evt);
            }
        });

        jButtonGuardarRegistarSuperficie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarRegistarSuperficie.setText("Guardar");
        jButtonGuardarRegistarSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistarSuperficieActionPerformed(evt);
            }
        });

        jButtonVoltarRegistarSuperficie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarRegistarSuperficie.setText("Voltar");
        jButtonVoltarRegistarSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarSuperficieActionPerformed(evt);
            }
        });

        jLabelTemperatura1.setText("Superfície:");

        buttonAtualizarSuperficie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        buttonAtualizarSuperficie.setText("Atualizar");
        buttonAtualizarSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarSuperficieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNomeRegistarTemperatura1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTemperatura1)
                            .addComponent(jLabel20))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCompartimento, 0, 180, Short.MAX_VALUE)
                            .addComponent(jTextFieldRegistarSuperficie))
                        .addGap(67, 67, 67)))
                .addGap(167, 167, 167))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGuardarRegistarSuperficie)
                .addGap(18, 18, 18)
                .addComponent(buttonAtualizarSuperficie)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarRegistarSuperficie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabelNomeRegistarTemperatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBoxCompartimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperatura1)
                    .addComponent(jTextFieldRegistarSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarRegistarSuperficie)
                    .addComponent(jButtonGuardarRegistarSuperficie)
                    .addComponent(buttonAtualizarSuperficie))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogRegistarSuperficiesLayout = new javax.swing.GroupLayout(jDialogRegistarSuperficies.getContentPane());
        jDialogRegistarSuperficies.getContentPane().setLayout(jDialogRegistarSuperficiesLayout);
        jDialogRegistarSuperficiesLayout.setHorizontalGroup(
            jDialogRegistarSuperficiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarSuperficiesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegistarSuperficiesLayout.setVerticalGroup(
            jDialogRegistarSuperficiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarSuperficiesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogConsultarSuperfícies.setTitle("Consultar Superfícies");
        jDialogConsultarSuperfícies.setMinimumSize(new java.awt.Dimension(702, 465));

        jPanel22.setPreferredSize(new java.awt.Dimension(754, 425));

        jTableConsultarSuperficie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Superfície"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTableConsultarSuperficie);
        jTableConsultarSuperficie.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButtonVoltarConsultarSuperficie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarSuperficie.setText("Voltar");
        jButtonVoltarConsultarSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarSuperficieActionPerformed(evt);
            }
        });

        jComboBoxConsultarSuperficie.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxConsultarSuperficiePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxConsultarSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConsultarSuperficieActionPerformed(evt);
            }
        });

        jButtonEditarConsultarSuperficie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEditarConsultarSuperficie.setText("Editar");
        jButtonEditarConsultarSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarConsultarSuperficieActionPerformed(evt);
            }
        });

        jButtonNovoSuperficie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        jButtonNovoSuperficie.setText("Registar Superfície");
        jButtonNovoSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoSuperficieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovoSuperficie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditarConsultarSuperficie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltarConsultarSuperficie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxConsultarSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jComboBoxConsultarSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButtonNovoSuperficie)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarConsultarSuperficie)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltarConsultarSuperficie)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogConsultarSuperfíciesLayout = new javax.swing.GroupLayout(jDialogConsultarSuperfícies.getContentPane());
        jDialogConsultarSuperfícies.getContentPane().setLayout(jDialogConsultarSuperfíciesLayout);
        jDialogConsultarSuperfíciesLayout.setHorizontalGroup(
            jDialogConsultarSuperfíciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarSuperfíciesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogConsultarSuperfíciesLayout.setVerticalGroup(
            jDialogConsultarSuperfíciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarSuperfíciesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogRegistrarSeleEquipamentos.setTitle("Escolha de Registo de Equipamento");
        jDialogRegistrarSeleEquipamentos.setMinimumSize(new java.awt.Dimension(491, 314));

        jButtonRegistarEquipamentoTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/temperature-icon.png"))); // NOI18N
        jButtonRegistarEquipamentoTemperatura.setText("Equipamento Temperatura");
        jButtonRegistarEquipamentoTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarEquipamentoTemperaturaActionPerformed(evt);
            }
        });

        jButtonRegistarEquipamentoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cleaning-icon.png"))); // NOI18N
        jButtonRegistarEquipamentoLimpeza.setText("Equipamento Limpeza");
        jButtonRegistarEquipamentoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarEquipamentoLimpezaActionPerformed(evt);
            }
        });

        jLabel21.setText("O que pretende Registrar?");

        jButtonVoltarSeleEquipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarSeleEquipamentos.setText("Voltar");
        jButtonVoltarSeleEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarSeleEquipamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogRegistrarSeleEquipamentosLayout = new javax.swing.GroupLayout(jDialogRegistrarSeleEquipamentos.getContentPane());
        jDialogRegistrarSeleEquipamentos.getContentPane().setLayout(jDialogRegistrarSeleEquipamentosLayout);
        jDialogRegistrarSeleEquipamentosLayout.setHorizontalGroup(
            jDialogRegistrarSeleEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistrarSeleEquipamentosLayout.createSequentialGroup()
                .addGroup(jDialogRegistrarSeleEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogRegistrarSeleEquipamentosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jDialogRegistrarSeleEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRegistarEquipamentoTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRegistarEquipamentoLimpeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVoltarSeleEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jDialogRegistrarSeleEquipamentosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jDialogRegistrarSeleEquipamentosLayout.setVerticalGroup(
            jDialogRegistrarSeleEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistrarSeleEquipamentosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistarEquipamentoTemperatura)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistarEquipamentoLimpeza)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarSeleEquipamentos)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jDialogRegistarEquipamentosLimpeza.setTitle("Registar Equipamento de Limpeza");
        jDialogRegistarEquipamentosLimpeza.setMinimumSize(new java.awt.Dimension(619, 433));

        jPanel23.setMinimumSize(new java.awt.Dimension(599, 411));

        jLabel22.setText("Compartimento:");

        jComboBoxCompartimentoEquipamento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCompartimentoEquipamentoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxCompartimentoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompartimentoEquipamentoActionPerformed(evt);
            }
        });

        jButtonGuardarRegistarEquipamentoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarRegistarEquipamentoLimpeza.setText("Guardar");
        jButtonGuardarRegistarEquipamentoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistarEquipamentoLimpezaActionPerformed(evt);
            }
        });

        jButtonVoltarRegistarEquipamentoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarRegistarEquipamentoLimpeza.setText("Voltar");
        jButtonVoltarRegistarEquipamentoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarEquipamentoLimpezaActionPerformed(evt);
            }
        });

        jLabelTemperatura2.setText("Equipamento:");

        buttonAtualizarEquipamentoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        buttonAtualizarEquipamentoLimpeza.setText("Atualizar");
        buttonAtualizarEquipamentoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarEquipamentoLimpezaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNomeRegistarTemperatura2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTemperatura2)
                            .addComponent(jLabel22))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCompartimentoEquipamento, 0, 180, Short.MAX_VALUE)
                            .addComponent(jTextFieldRegistarEquipamentoLimpeza))
                        .addGap(67, 67, 67)))
                .addGap(167, 167, 167))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGuardarRegistarEquipamentoLimpeza)
                .addGap(18, 18, 18)
                .addComponent(buttonAtualizarEquipamentoLimpeza)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarRegistarEquipamentoLimpeza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabelNomeRegistarTemperatura2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jComboBoxCompartimentoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperatura2)
                    .addComponent(jTextFieldRegistarEquipamentoLimpeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarRegistarEquipamentoLimpeza)
                    .addComponent(jButtonGuardarRegistarEquipamentoLimpeza)
                    .addComponent(buttonAtualizarEquipamentoLimpeza))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogRegistarEquipamentosLimpezaLayout = new javax.swing.GroupLayout(jDialogRegistarEquipamentosLimpeza.getContentPane());
        jDialogRegistarEquipamentosLimpeza.getContentPane().setLayout(jDialogRegistarEquipamentosLimpezaLayout);
        jDialogRegistarEquipamentosLimpezaLayout.setHorizontalGroup(
            jDialogRegistarEquipamentosLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarEquipamentosLimpezaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegistarEquipamentosLimpezaLayout.setVerticalGroup(
            jDialogRegistarEquipamentosLimpezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarEquipamentosLimpezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogRegistarEquipamentoAmbos.setMinimumSize(new java.awt.Dimension(619, 433));

        jPanel24.setMinimumSize(new java.awt.Dimension(599, 411));

        jLabel23.setText("Compartimento:");

        jComboBoxCompartimentoEquipamentoAmbos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCompartimentoEquipamentoAmbosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxCompartimentoEquipamentoAmbos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompartimentoEquipamentoAmbosActionPerformed(evt);
            }
        });

        jButtonGuardarRegistarEquipamentoLimpezaAmbos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarRegistarEquipamentoLimpezaAmbos.setText("Guardar");
        jButtonGuardarRegistarEquipamentoLimpezaAmbos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistarEquipamentoLimpezaAmbosActionPerformed(evt);
            }
        });

        jButtonVoltarRegistarEquipamentoLimpeza1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarRegistarEquipamentoLimpeza1.setText("Voltar");
        jButtonVoltarRegistarEquipamentoLimpeza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarRegistarEquipamentoLimpeza1ActionPerformed(evt);
            }
        });

        jLabelTemperatura3.setText("Equipamento:");

        buttonAtualizarEquipamentoLimpeza1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        buttonAtualizarEquipamentoLimpeza1.setText("Atualizar");
        buttonAtualizarEquipamentoLimpeza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarEquipamentoLimpeza1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNomeRegistarTemperatura3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTemperatura3)
                            .addComponent(jLabel23))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCompartimentoEquipamentoAmbos, 0, 180, Short.MAX_VALUE)
                            .addComponent(jTextFieldRegistarEquipamentoLimpezaAmbos))
                        .addGap(67, 67, 67)))
                .addGap(167, 167, 167))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGuardarRegistarEquipamentoLimpezaAmbos)
                .addGap(18, 18, 18)
                .addComponent(buttonAtualizarEquipamentoLimpeza1)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarRegistarEquipamentoLimpeza1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabelNomeRegistarTemperatura3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jComboBoxCompartimentoEquipamentoAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperatura3)
                    .addComponent(jTextFieldRegistarEquipamentoLimpezaAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarRegistarEquipamentoLimpeza1)
                    .addComponent(jButtonGuardarRegistarEquipamentoLimpezaAmbos)
                    .addComponent(buttonAtualizarEquipamentoLimpeza1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogRegistarEquipamentoAmbosLayout = new javax.swing.GroupLayout(jDialogRegistarEquipamentoAmbos.getContentPane());
        jDialogRegistarEquipamentoAmbos.getContentPane().setLayout(jDialogRegistarEquipamentoAmbosLayout);
        jDialogRegistarEquipamentoAmbosLayout.setHorizontalGroup(
            jDialogRegistarEquipamentoAmbosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarEquipamentoAmbosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegistarEquipamentoAmbosLayout.setVerticalGroup(
            jDialogRegistarEquipamentoAmbosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarEquipamentoAmbosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogRegistarPH.setTitle("Registar Plano de Higienização");
        jDialogRegistarPH.setMinimumSize(new java.awt.Dimension(656, 233));

        jButtonSelecionarPH.setText("Selecionar");
        jButtonSelecionarPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarPHActionPerformed(evt);
            }
        });

        jTextFieldNomePH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePHActionPerformed(evt);
            }
        });

        jComboBoxCompartimentosPH.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCompartimentosPHPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButtonGuardarPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarPH.setText("Guardar");
        jButtonGuardarPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPHActionPerformed(evt);
            }
        });

        jButtonRegistarPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonRegistarPH.setText("Voltar");
        jButtonRegistarPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarPHActionPerformed(evt);
            }
        });

        jButtonAtualizarPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        jButtonAtualizarPH.setText("Atualizar");
        jButtonAtualizarPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarPHActionPerformed(evt);
            }
        });

        jButtonEDTPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEDTPH.setText("Editar");
        jButtonEDTPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDTPHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogRegistarPHLayout = new javax.swing.GroupLayout(jDialogRegistarPH.getContentPane());
        jDialogRegistarPH.getContentPane().setLayout(jDialogRegistarPHLayout);
        jDialogRegistarPHLayout.setHorizontalGroup(
            jDialogRegistarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarPHLayout.createSequentialGroup()
                .addGroup(jDialogRegistarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogRegistarPHLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jDialogRegistarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxCompartimentosPH, 0, 189, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomePH))
                        .addGap(26, 26, 26)
                        .addComponent(jButtonSelecionarPH, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogRegistarPHLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonGuardarPH)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizarPH)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEDTPH)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegistarPH)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jDialogRegistarPHLayout.setVerticalGroup(
            jDialogRegistarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarPHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxCompartimentosPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialogRegistarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomePH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarPH))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jDialogRegistarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistarPH)
                    .addComponent(jButtonGuardarPH)
                    .addComponent(jButtonAtualizarPH)
                    .addComponent(jButtonEDTPH))
                .addGap(24, 24, 24))
        );

        jDialogConsultarPH.setTitle("Consultar Plano de Higienização");
        jDialogConsultarPH.setMinimumSize(new java.awt.Dimension(643, 392));

        jTableConsultarPH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compartimentos", "Ficheiro"
            }
        ));
        jTableConsultarPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultarPHMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableConsultarPH);

        jButtonVoltarConsultarPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarPH.setText("Voltar");
        jButtonVoltarConsultarPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarPHActionPerformed(evt);
            }
        });

        jButtonEditarConsultarPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEditarConsultarPH.setText("Editar");
        jButtonEditarConsultarPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarConsultarPHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogConsultarPHLayout = new javax.swing.GroupLayout(jDialogConsultarPH.getContentPane());
        jDialogConsultarPH.getContentPane().setLayout(jDialogConsultarPHLayout);
        jDialogConsultarPHLayout.setHorizontalGroup(
            jDialogConsultarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogConsultarPHLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jDialogConsultarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialogConsultarPHLayout.createSequentialGroup()
                        .addComponent(jButtonEditarConsultarPH)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltarConsultarPH))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jDialogConsultarPHLayout.setVerticalGroup(
            jDialogConsultarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarPHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialogConsultarPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarConsultarPH)
                    .addComponent(jButtonEditarConsultarPH))
                .addGap(24, 24, 24))
        );

        jDialogConsultarPH2.setTitle("Consultar Plano de Higienização");
        jDialogConsultarPH2.setMinimumSize(new java.awt.Dimension(643, 392));

        jTableConsultarPH1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compartimentos", "Ficheiro"
            }
        ));
        jTableConsultarPH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultarPH1MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTableConsultarPH1);

        jButtonVoltarConsultarPH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarPH1.setText("Voltar");
        jButtonVoltarConsultarPH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarPH1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogConsultarPH2Layout = new javax.swing.GroupLayout(jDialogConsultarPH2.getContentPane());
        jDialogConsultarPH2.getContentPane().setLayout(jDialogConsultarPH2Layout);
        jDialogConsultarPH2Layout.setHorizontalGroup(
            jDialogConsultarPH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogConsultarPH2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jDialogConsultarPH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVoltarConsultarPH1)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jDialogConsultarPH2Layout.setVerticalGroup(
            jDialogConsultarPH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarPH2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltarConsultarPH1)
                .addGap(24, 24, 24))
        );

        jDialogRegistarFT.setTitle("Regista Fichas Técnicas dos Produtos");
        jDialogRegistarFT.setMinimumSize(new java.awt.Dimension(656, 233));

        jButtonSelecionarFT.setText("Selecionar");
        jButtonSelecionarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarFTActionPerformed(evt);
            }
        });

        jTextFieldNomeFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFTActionPerformed(evt);
            }
        });

        jComboBoxProdutoFT.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxProdutoFTPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButtonGuardarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guardar.png"))); // NOI18N
        jButtonGuardarFT.setText("Guardar");
        jButtonGuardarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarFTActionPerformed(evt);
            }
        });

        jButtonRegistarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonRegistarFT.setText("Voltar");
        jButtonRegistarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarFTActionPerformed(evt);
            }
        });

        jButtonAtualizarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        jButtonAtualizarFT.setText("Atualizar");
        jButtonAtualizarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarFTActionPerformed(evt);
            }
        });

        jButtonEDTFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEDTFT.setText("Editar");
        jButtonEDTFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDTFTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogRegistarFTLayout = new javax.swing.GroupLayout(jDialogRegistarFT.getContentPane());
        jDialogRegistarFT.getContentPane().setLayout(jDialogRegistarFTLayout);
        jDialogRegistarFTLayout.setHorizontalGroup(
            jDialogRegistarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarFTLayout.createSequentialGroup()
                .addGroup(jDialogRegistarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogRegistarFTLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jDialogRegistarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxProdutoFT, 0, 189, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeFT))
                        .addGap(26, 26, 26)
                        .addComponent(jButtonSelecionarFT, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogRegistarFTLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonGuardarFT)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizarFT)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEDTFT)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegistarFT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegistarFTLayout.setVerticalGroup(
            jDialogRegistarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegistarFTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxProdutoFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialogRegistarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarFT))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jDialogRegistarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistarFT)
                    .addComponent(jButtonGuardarFT)
                    .addComponent(jButtonAtualizarFT)
                    .addComponent(jButtonEDTFT))
                .addGap(24, 24, 24))
        );

        jDialogConsultarFT.setTitle("Consultar Fichas Técnicas dos Produtos");
        jDialogConsultarFT.setMinimumSize(new java.awt.Dimension(643, 392));

        jTableConsultarFT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Ficheiro"
            }
        ));
        jTableConsultarFT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultarFTMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTableConsultarFT);

        jButtonVoltarConsultarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarFT.setText("Voltar");
        jButtonVoltarConsultarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarFTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogConsultarFTLayout = new javax.swing.GroupLayout(jDialogConsultarFT.getContentPane());
        jDialogConsultarFT.getContentPane().setLayout(jDialogConsultarFTLayout);
        jDialogConsultarFTLayout.setHorizontalGroup(
            jDialogConsultarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogConsultarFTLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jDialogConsultarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVoltarConsultarFT)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jDialogConsultarFTLayout.setVerticalGroup(
            jDialogConsultarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarFTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltarConsultarFT)
                .addGap(24, 24, 24))
        );

        jDialogConsultarEditarFT.setTitle("Consultar Fichas Técnicas dos Produtos");
        jDialogConsultarEditarFT.setMinimumSize(new java.awt.Dimension(643, 392));

        jTableConsultarEditarFT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Ficheiro"
            }
        ));
        jTableConsultarEditarFT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultarEditarFTMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTableConsultarEditarFT);

        jButtonVoltarConsultarEditarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButtonVoltarConsultarEditarFT.setText("Voltar");
        jButtonVoltarConsultarEditarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarEditarFTActionPerformed(evt);
            }
        });

        jButtonEditarConsultarEditarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButtonEditarConsultarEditarFT.setText("Editar");
        jButtonEditarConsultarEditarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarConsultarEditarFTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogConsultarEditarFTLayout = new javax.swing.GroupLayout(jDialogConsultarEditarFT.getContentPane());
        jDialogConsultarEditarFT.getContentPane().setLayout(jDialogConsultarEditarFTLayout);
        jDialogConsultarEditarFTLayout.setHorizontalGroup(
            jDialogConsultarEditarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogConsultarEditarFTLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jDialogConsultarEditarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialogConsultarEditarFTLayout.createSequentialGroup()
                        .addComponent(jButtonEditarConsultarEditarFT)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltarConsultarEditarFT))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jDialogConsultarEditarFTLayout.setVerticalGroup(
            jDialogConsultarEditarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarEditarFTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialogConsultarEditarFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarConsultarEditarFT)
                    .addComponent(jButtonEditarConsultarEditarFT))
                .addGap(24, 24, 24))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(800, 200));

        jLabelNomeLogin.setText("Nome:");

        jLabelPasswordLogin.setText("Password:");

        jComboBoxLogin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLoginActionPerformed(evt);
            }
        });

        jButtonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/loging.png"))); // NOI18N
        jButtonLogIn.setText("Log In");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jButtonLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout.png"))); // NOI18N
        jButtonLogOut.setText("Fechar");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonLogIn)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeLogin)
                            .addComponent(jLabelPasswordLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxLogin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeLogin)
                    .addComponent(jComboBoxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPasswordLogin)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int selectId(String tab, String col, String cam, String colId) {
        int resultId = 0;
        String tabela = tab;
        String coluna = col;
        String campo = cam;
        String colunaId = colId;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            sql = "select * from " + tabela + " where " + coluna + "='" + campo + "'";

            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                resultId = rs.getInt(colunaId);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return resultId;
    }
    
    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
       
        
        NomeFuncionarioLogin = jComboBoxLogin.getSelectedItem().toString();
        String pwdInserida = jPasswordFieldPassword.getText();
        idFuncionarioLogin = selectId("FUNCIONARIO", "NOME", NomeFuncionarioLogin, "IDFUNCIONARIO");

        //LIMPAR JLABEL DE BOAS VINDAS
        jLabelLoginNome.setText("Bem Vindo(a) " + NomeFuncionarioLogin);
        //jDialogJanelaPrincipal.repaint();
        
        String SelecionarUtilizador = jComboBoxLogin.getSelectedItem().toString();
        //String IndicarTemperatura = jTextFieldRegistarTemperatura.getText().toString();
        
        if (SelecionarUtilizador.equals("--Utilizador--")) {
            
            JOptionPane.showMessageDialog(this, "Selecione o seu nome de Utilizador");
        }
        else if(SelecionarUtilizador.equals("ADMINISTRADOR")){
            jPanelAdministrador.setVisible(true);
            jButtonRegistarFuncionario.setVisible(true);
            jButtonConsultarHorasTrbalhoAdmin.setVisible(true);
              jButtonEditarConsultarCompartimento.setVisible(true);
            jButtonNovoCompartimentoConsultar.setVisible(true);
            jButtonEditarConsultarSuperficie.setVisible(true);
            jButtonNovoSuperficie.setVisible(true);  
            jButtonNovoProdutoConsultar.setVisible(true); 
            jButtonEditarConsultarProduto.setVisible(true); 
             jButtonEditarConsultarEquipamento.setVisible(true); 
            jButtonNovoEquipamentoConsultarEquipamento.setVisible(true);
           VerificaLogin(pwdInserida);
        }else {
            jPanelAdministrador.setVisible(false);
            jButtonRegistarFuncionario.setVisible(false);
            jButtonConsultarHorasTrbalhoAdmin.setVisible(false);
            jButtonEditarConsultarCompartimento.setVisible(false);
            jButtonNovoCompartimentoConsultar.setVisible(false);
            jButtonEditarConsultarSuperficie.setVisible(false);
            jButtonNovoSuperficie.setVisible(false); 
            jButtonNovoProdutoConsultar.setVisible(false); 
            jButtonEditarConsultarProduto.setVisible(false); 
            jButtonEditarConsultarEquipamento.setVisible(false); 
            jButtonNovoEquipamentoConsultarEquipamento.setVisible(false);
            VerificaLogin(pwdInserida);
        }
        
        

        System.out.println("nomeFuncionario -> " + NomeFuncionarioLogin);
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonLogOut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOut2ActionPerformed
        logout();
    }//GEN-LAST:event_jButtonLogOut2ActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
       jPanelRegistar.setVisible(true);
       jPanelConsultar.setVisible(false);
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        jPanelRegistar.setVisible(false);
       jPanelConsultar.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonReLimpezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReLimpezasActionPerformed
        jLabelLimpezaFuncionario.setText("Registo da Higienização do Funcionário: "+NomeFuncionarioLogin);
        jDialogRegistoLimpeza.setLocationRelativeTo(this);
        jDialogRegistoLimpeza.setVisible(true);
        jDateChooserReshitsoLimpeza.setDate(new Date());
        
        

        
      
         jComboBoxResgistarlimpezaSuperficie.addItem("---Superficie---");
          jComboBoxCompartimentoLimpeza();
              
          
        //jComboBoxSuperficie();
        
            jComboBoxProduto();
        
    }//GEN-LAST:event_jButtonReLimpezasActionPerformed

    private void jButtonReEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReEquipamentoActionPerformed

        jDialogRegistrarSeleEquipamentos.setLocationRelativeTo(this);
        jDialogRegistrarSeleEquipamentos.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonReEquipamentoActionPerformed

    private void jButtonGuardarRegistarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistarEquipamentoActionPerformed
       String NomeEquipamento = jTextFieldRegistarEquipamento.getText();
       
       if (NomeEquipamento.equals("")) {
           JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Introduza o nome do Equipamento");
       } else {
           RegistarEquipamento();
           LimparRegistarEquipamento();
           
       }
    }//GEN-LAST:event_jButtonGuardarRegistarEquipamentoActionPerformed

    private void jButtonVoltarRegistarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarEquipamentoActionPerformed
       
        LimparRegistarEquipamento ();
        jDialogRegistarEquipamento.setVisible(false);
        
    }//GEN-LAST:event_jButtonVoltarRegistarEquipamentoActionPerformed

    private void jButtonRegistarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarEquipamentoActionPerformed
       ConsultarEquipamento ();
       jDialogConsultarEquipamento.setLocationRelativeTo(this);
       jDialogConsultarEquipamento.setVisible(true);
    }//GEN-LAST:event_jButtonRegistarEquipamentoActionPerformed

    private void jButtonNovoEquipamentoConsultarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoEquipamentoConsultarEquipamentoActionPerformed
       //limpa os campos antes de abrir senão, duplica o existente
        LimparConsultasEquipamento();
        jDialogConsultarEquipamento.setVisible(false);
        jDialogRegistarEquipamento.setLocationRelativeTo(this);
        jDialogRegistarEquipamento.setVisible(true);
        jButtonAlterarEquipamento.setVisible(false);
        jButtonGuardarRegistarEquipamento.setVisible(true);
    }//GEN-LAST:event_jButtonNovoEquipamentoConsultarEquipamentoActionPerformed

    private void jButtonEditarConsultarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarConsultarEquipamentoActionPerformed
        int linha = jTableConsultarEquipamento.getSelectedRow();
        
        if (linha == -1)
        { JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Selecione um Equipamento");
                   
        } else {
            
            BuscarNome = (String) jTableConsultarEquipamento.getValueAt(linha, 0);
            IDEquipamento = SelecionarID("EQUIPAMENTO", "NOME", BuscarNome, "IDEQUIPAMENTO" );
            
            jDialogRegistarEquipamento.setLocationRelativeTo(this);
            //jDialogRegistarEquipamento.setTitle("Editar Equipamento");
            jDialogRegistarEquipamento.setVisible(true);
            //jTextFieldRegistarEquipamento.setEnabled(false);
            jButtonAlterarEquipamento.setVisible(true);
            jButtonGuardarRegistarEquipamento.setVisible(false);
            DadosEquipamentoAlterar ();
            
        }
        
    }//GEN-LAST:event_jButtonEditarConsultarEquipamentoActionPerformed

    private void jButtonAlterarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarEquipamentoActionPerformed
        
        String nome = jTextFieldRegistarEquipamento.getText();
        
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira o Nome do Equipamento!");
        } else {
            AtualizarEquipamentos();
            jDialogRegistarEquipamento.setVisible(false);
            LimparRegistarEquipamento();
            LimparConsultasEquipamento();
            ConsultarEquipamento();
        } 
    }//GEN-LAST:event_jButtonAlterarEquipamentoActionPerformed

    private void jButtonVoltarConsultarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarEquipamentoActionPerformed
        jDialogConsultarEquipamento.setVisible(false);
        LimparConsultasEquipamento();
    }//GEN-LAST:event_jButtonVoltarConsultarEquipamentoActionPerformed

    private void jButtonReTemperaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReTemperaturasActionPerformed
        jLabelNomeRegistarTemperatura.setText("Temperatura Registada por: "+NomeFuncionarioLogin);
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        jDialogRegistarTemperaturaEquipamento.setLocationRelativeTo(this);
        jDialogRegistarTemperaturaEquipamento.setVisible(true);
        jComboBoxEquipamento();
    }//GEN-LAST:event_jButtonReTemperaturasActionPerformed

    private void jComboBoxEquipamentoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentoPopupMenuWillBecomeInvisible
        String Equipamento = jComboBoxEquipamento.getSelectedItem().toString();
        if (Equipamento.equals("--Equipamento")) {
           JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Introduza o Equipamento");
        
        }
    }//GEN-LAST:event_jComboBoxEquipamentoPopupMenuWillBecomeInvisible

    private void jComboBoxEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEquipamentoActionPerformed

    private void jButtonVoltarRegistarTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarTemperaturaActionPerformed
        LimparRegistarTemperaturaEquipamento ();
        jDialogRegistarTemperaturaEquipamento.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarRegistarTemperaturaActionPerformed

    private void jButtonGuardarRegistarTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistarTemperaturaActionPerformed
       
        //Valadições para selecionar o Equipamento e indicar a Temperatura
        
        String SelecionarEquipamento = jComboBoxEquipamento.getSelectedItem().toString();
        String IndicarTemperatura = jTextFieldRegistarTemperatura.getText().toString();
        
        if (SelecionarEquipamento.equals("---Equipamento---")) {
            JOptionPane.showMessageDialog(jDialogRegistarTemperaturaEquipamento, "Selecciona um Equipamento");
        }
        else if (IndicarTemperatura.equals("   ,  ºC")){
            JOptionPane.showMessageDialog(jDialogRegistarTemperaturaEquipamento, "Indique a Temperatura");
        }
                
        else{
            RegistarTemperaturaEquipamento();
            LimparRegistarTemperaturaEquipamento();
            jDialogRegistarTemperaturaEquipamento.setVisible(false);
        }
        
    }//GEN-LAST:event_jButtonGuardarRegistarTemperaturaActionPerformed

    private void jButtonVoltarConsultarTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarTemperaturaActionPerformed
        jDialogConsultarTemperaturaEquipamento.setVisible(false);
        LimparConsultasTemperaturaEquipamento();
    }//GEN-LAST:event_jButtonVoltarConsultarTemperaturaActionPerformed

    private void jButtonCnTemperaturasEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnTemperaturasEquipamentosActionPerformed
        jDialogConsultarTemperaturaEquipamento.setLocationRelativeTo(this);
        LimparConsultasTemperaturaEquipamento();
        jDialogConsultarTemperaturaEquipamento.setVisible(true);
        
        jComboBoxConsultarTemperaturaEquipamento(jComboBoxConsultarTemperaturaEquipamento);
        jDateChooserTemperaturaIni1.setDate(new Date());
        jDateChooserTemperaturaFim1.setDate(new Date());
        ConsultarTemperaturaEquipamento();
        LimparConsultasTemperaturaEquipamento();
    }//GEN-LAST:event_jButtonCnTemperaturasEquipamentosActionPerformed

    private void jComboBoxConsultarTemperaturaEquipamentoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxConsultarTemperaturaEquipamentoPopupMenuWillBecomeInvisible
        String nomeEquipamento = jComboBoxConsultarTemperaturaEquipamento.getSelectedItem().toString();
        idPesquisaEquipamento = selectId("EQUIPAMENTO", "NOME", nomeEquipamento, "IDEQUIPAMENTO");
        
       // if (nomeEquipamento.equals("---Equipamento---")) {
          //  idPesquisaEquipamento = 0;
         //}
            //Aqui limpa apos fazer cada select na combobox
            LimparConsultasTemperaturaEquipamento ();
            PesquisarTemperaturaEquipamento();
            
            
        System.out.println("Equipamento : " + nomeEquipamento);
         System.out.println("ID Equipamento: " + idPesquisaEquipamento);
    }//GEN-LAST:event_jComboBoxConsultarTemperaturaEquipamentoPopupMenuWillBecomeInvisible

    private void jComboBoxConsultarTemperaturaEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConsultarTemperaturaEquipamentoActionPerformed
        
    }//GEN-LAST:event_jComboBoxConsultarTemperaturaEquipamentoActionPerformed

    private void jTextFieldRegistarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRegistarEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegistarEquipamentoActionPerformed

    private void jButtonVoltaraHorasTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaraHorasTrabalhoActionPerformed
        LimparRegistarHorasTrabalho();
        jDialogRegistarHorasTrabalho.setVisible(false);
    }//GEN-LAST:event_jButtonVoltaraHorasTrabalhoActionPerformed

    private void jButtonGuardarHorasTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarHorasTrabalhoActionPerformed
         
        String horas = jTextFieldRegistarHorasTrabalho.getText().toString();
        
        if (horas.equals(" h:  min")){
            JOptionPane.showMessageDialog(jDialogRegistarHorasTrabalho, "Indique as Horas de Trabalho");
        }
        if (horas.equals("0h:00min")){
            JOptionPane.showMessageDialog(jDialogRegistarHorasTrabalho, "Horas de Trabalho nulo");
        }else{
             RegistarHorasTrabalho();
         LimparRegistarHorasTrabalho();
         
         //jDialogRegistarHorasTrabalho.setVisible(false);
        }
        
    }//GEN-LAST:event_jButtonGuardarHorasTrabalhoActionPerformed

    private void jButtonReHorasTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReHorasTrabalhoActionPerformed
        jLabelHorasUtilizador.setText("Registar Horas de Trabalho do Funcionário: "+NomeFuncionarioLogin);
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        jDialogRegistarHorasTrabalho.setLocationRelativeTo(this);
        jDialogRegistarHorasTrabalho.setVisible(true);
    }//GEN-LAST:event_jButtonReHorasTrabalhoActionPerformed

    private void jButtonCnHorasTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnHorasTrabalhoActionPerformed
        jLabelConsultarHorasTrabalhoFuncionário.setText("Horas de Trabalho do Funcionário: "+NomeFuncionarioLogin);
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        jDialogConsultarHorasTrabalho.setLocationRelativeTo(this);
        jDialogConsultarHorasTrabalho.setVisible(true);
        LimparConsultasHorasTrabalhoFuncionario();
        jDateChooserHorasIni.setDate(new Date());
        jDateChooserHorasFim.setDate(new Date());
        ConsultarHorasTrabalhoTodas();

    }//GEN-LAST:event_jButtonCnHorasTrabalhoActionPerformed

    private void jButtonConsultarHorasTrbalhoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarHorasTrbalhoAdminActionPerformed
          
        jDialogConsultarHorasADMIN.setLocationRelativeTo(this);
        jDialogConsultarHorasADMIN.setVisible(true);
        //ConsultarHorasTrabalho2();
        jDateChooserConsultarHorasAdminIni.setDate(new Date());
        jDateChooserConsultarHorasAdminFim.setDate(new Date());
        //if (jComboBoxConsultarHoras.isEnabled()){

        JComboBoxConsultarHorasTrabalhoAdmin(jComboBoxConsultarHoras);
      //}else{
           //ConsultarHorasTrabalho2(); 
        //}
        //ConsultarHorasTrabalhoAdmin();
     
        //LimparConsultasHorasTrabalhoFuncionarioAdmin();
        
    }//GEN-LAST:event_jButtonConsultarHorasTrbalhoAdminActionPerformed

    private void jButtonVoltarHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarHTActionPerformed
        
         LimparConsultasHorasTrabalhoFuncionario();
        jDialogConsultarHorasTrabalho.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarHTActionPerformed

    private void jButtonCnRegistoLimpezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnRegistoLimpezasActionPerformed
        jDialogConsultarLimpeza.setLocationRelativeTo(this);
        jDialogConsultarLimpeza.setVisible(true);
        
        jDateChooserConsultarLimpezaIni.setDate(new Date());
        jDateChooserConsultarLimpezaFim.setDate(new Date());
        //LimparConsultaLimpeza();
        PesquisarLimpezasFuncionarioPorData();
       // JComboBoxConsultarLimpeza(jComboBoxConsultarLimpeza);
    }//GEN-LAST:event_jButtonCnRegistoLimpezasActionPerformed

    private void jButtonCnPlanoHigienizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnPlanoHigienizacaoActionPerformed
        jDialogConsultarPH2.setLocationRelativeTo(this);
        jDialogConsultarPH2.setVisible(true);
        
        ConsultarPH();
        
        
    }//GEN-LAST:event_jButtonCnPlanoHigienizacaoActionPerformed

    private void jButtonVoltarPlanoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarPlanoLimpezaActionPerformed
        jDialogPlanodeLimpeza.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarPlanoLimpezaActionPerformed

    private void jButtonGuardarRegistarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistarProdutoActionPerformed
       String NomeProduto = jTextFieldRegistarProduto.getText();
       
       if (NomeProduto.equals("")) {
           JOptionPane.showMessageDialog(jDialogRegistarProduto, "Introduza o nome do Produto");
       } else {
         RegistarProduto();
         LimparRegistarProduto ();
         //jDialogRegistarProduto.setVisible(false);
       }
    }//GEN-LAST:event_jButtonGuardarRegistarProdutoActionPerformed

    private void jButtonVoltarRegistarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarProdutoActionPerformed
        jDialogRegistarProduto.setVisible(false);
        LimparRegistarProduto ();
    }//GEN-LAST:event_jButtonVoltarRegistarProdutoActionPerformed

    private void jButtonReProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReProdutosActionPerformed
         jDialogRegistarProduto.setLocationRelativeTo(this);
         jDialogRegistarProduto.setVisible(true);
         buttonAtualizarProduto.setVisible(false);
         jButtonGuardarRegistarProduto.setVisible(true);
         
    }//GEN-LAST:event_jButtonReProdutosActionPerformed

    private void jButtonVoltarRegistarSuperficiesLimpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarSuperficiesLimpasActionPerformed
        
        jDialog1.setVisible(false);
       
    }//GEN-LAST:event_jButtonVoltarRegistarSuperficiesLimpasActionPerformed

    private void jButtonVoltarConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarProdutoActionPerformed
      
        jDialogConsultarProdutos.setVisible(false);
        LimparConsultasProduto ();
    }//GEN-LAST:event_jButtonVoltarConsultarProdutoActionPerformed

    private void jButtonEditarConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarConsultarProdutoActionPerformed
        int linha = jTableConsultarProdutos.getSelectedRow();
        
        if (linha == -1)
        { JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Selecione um Produto");
                   
        } else {
            
            BuscarNome = (String) jTableConsultarProdutos.getValueAt(linha, 0);
            IDProduto = SelecionarID("PRODUTO", "PRODUTO", BuscarNome, "IDPRODUTO" );
            
            jDialogRegistarProduto.setLocationRelativeTo(this);
            //jDialogRegistarEquipamento.setTitle("Editar Equipamento");
            jDialogRegistarProduto.setVisible(true);
            //jTextFieldRegistarEquipamento.setEnabled(false);
            buttonAtualizarProduto.setVisible(true);
            jButtonGuardarRegistarProduto.setVisible(false);
            DadosProdutoAlterar ();
            
        }
    }//GEN-LAST:event_jButtonEditarConsultarProdutoActionPerformed

    private void jButtonNovoProdutoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoProdutoConsultarActionPerformed
        LimparConsultasProduto();
        jDialogConsultarProdutos.setVisible(false);
        jDialogRegistarProduto.setLocationRelativeTo(this);
        jDialogRegistarProduto.setVisible(true);
        buttonAtualizarProduto.setVisible(false);
        jButtonGuardarRegistarProduto.setVisible(true);
    }//GEN-LAST:event_jButtonNovoProdutoConsultarActionPerformed

    private void jButtonCnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnProdutoActionPerformed
        
        jDialogConsultarProdutos.setLocationRelativeTo(this);
        jDialogConsultarProdutos.setVisible(true);
        ConsultarProduto ();
        
    }//GEN-LAST:event_jButtonCnProdutoActionPerformed

    private void buttonAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarProdutoActionPerformed
        
        String nome = jTextFieldRegistarProduto.getText();
        
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira o Nome do Produto!");
        } else {
            AtualizarProduto();
            jDialogRegistarProduto.setVisible(false);
            LimparRegistarProduto();
            LimparConsultasProduto();
            ConsultarProduto();
        } 
        
    }//GEN-LAST:event_buttonAtualizarProdutoActionPerformed

    private void jTextFieldPesquisarConsultaProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarConsultaProdutoCaretUpdate
        LimparConsultasProduto ();
        PesquisaProduto();
    }//GEN-LAST:event_jTextFieldPesquisarConsultaProdutoCaretUpdate

    private void jTextFieldPesquisarConsultarEquipamentoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarConsultarEquipamentoCaretUpdate
         LimparConsultasEquipamento ();
         PesquisaEquipamento();
    }//GEN-LAST:event_jTextFieldPesquisarConsultarEquipamentoCaretUpdate

    private void jDateChooserHorasIniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserHorasIniPropertyChange
        
    }//GEN-LAST:event_jDateChooserHorasIniPropertyChange

    private void jDateChooserHorasFimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserHorasFimPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserHorasFimPropertyChange

    private void jButtonPesquisarporDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarporDataActionPerformed
        
        LimparConsultasHorasTrabalhoFuncionario();
        ConsultarHorasTrabalhoPorData();
    }//GEN-LAST:event_jButtonPesquisarporDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        LimparConsultasHorasTrabalhoFuncionario();
        ConsultarHorasTrabalhoTodas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConsultarTodasHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodasHorasActionPerformed

        LimparConsultasHorasTrabalhoFuncionarioAdmin ();
        PesquisarHorasTrabalhoFuncionarioAdmin();
    }//GEN-LAST:event_jButtonConsultarTodasHorasActionPerformed

    private void jButtonConsultarHorasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarHorasAdminActionPerformed

        LimparConsultasHorasTrabalhoFuncionarioAdmin ();
        PesquisarHorasTrabalhoFuncionarioAdminPorData();

        //PesquisarHorasTrabalhoFuncionarioAdmin();
    }//GEN-LAST:event_jButtonConsultarHorasAdminActionPerformed

    private void jDateChooserConsultarHorasAdminFimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserConsultarHorasAdminFimPropertyChange
        //if(jDateChooserConsultarHorasAdminFim.isCursorSet()){

            //}
    }//GEN-LAST:event_jDateChooserConsultarHorasAdminFimPropertyChange

    private void jDateChooserConsultarHorasAdminIniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserConsultarHorasAdminIniPropertyChange

    }//GEN-LAST:event_jDateChooserConsultarHorasAdminIniPropertyChange

    private void jButtonVoltarConsultarHorasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarHorasAdminActionPerformed
        LimparConsultasHorasTrabalhoFuncionarioAdmin();
        jDialogConsultarHorasADMIN.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarConsultarHorasAdminActionPerformed

    private void jComboBoxConsultarHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConsultarHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxConsultarHorasActionPerformed

    private void jComboBoxConsultarHorasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxConsultarHorasPopupMenuWillBecomeInvisible
        String nomeFuncionario = jComboBoxConsultarHoras.getSelectedItem().toString();
        idPesquisaFuncionario = selectId("FUNCIONARIO", "NOME", nomeFuncionario, "IDFUNCIONARIO");

            LimparConsultasHorasTrabalhoFuncionarioAdmin ();

            PesquisarHorasTrabalhoFuncionarioAdmin();

        System.out.println("Funcionario : " + nomeFuncionario);
        System.out.println("ID Funcionario: " + idPesquisaFuncionario);

    }//GEN-LAST:event_jComboBoxConsultarHorasPopupMenuWillBecomeInvisible

    private void jButtonResgitarLimpezaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResgitarLimpezaGuardarActionPerformed
       String nomeSuperficie = jComboBoxResgistarlimpezaSuperficie.getSelectedItem().toString();
       String nomeProduto = jComboBoxResgistarlimpezaProduto.getSelectedItem().toString();
       String nomeCompartimento = jComboBoxResgistarlimpezaCompartimento.getSelectedItem().toString();
        
       if (nomeCompartimento.equals("---Compartimento---")) {
           JOptionPane.showMessageDialog(jDialogRegistoLimpeza, "Introduza a Superfície");
        
        }
        else if (nomeSuperficie.equals("---Superficie---")) {
           JOptionPane.showMessageDialog(jDialogRegistoLimpeza, "Introduza a Superficie");
        }
        else if (nomeProduto.equals("---Produto---")) {
           JOptionPane.showMessageDialog(jDialogRegistoLimpeza, "Introduza o Produto");
           
        }else{
            RegistarHigienizacao();
            //LimparRegistarTemperaturaEquipamento();
            //jDialogRegistoLimpeza.setVisible(false);
        }
    }//GEN-LAST:event_jButtonResgitarLimpezaGuardarActionPerformed

    private void jComboBoxResgistarlimpezaSuperficiePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxResgistarlimpezaSuperficiePopupMenuWillBecomeInvisible
        //String nomeSuperficie = jComboBoxResgistarlimpezaSuperficie.getSelectedItem().toString();
        //idPesquisaSuperficie = selectId("SUPERFICIE_EQUIPAMENTO", "NOME", nomeSuperficie, "IDSUPERFICIE");
       // jComboBoxSuperficie();   
      
        
    }//GEN-LAST:event_jComboBoxResgistarlimpezaSuperficiePopupMenuWillBecomeInvisible

    private void jComboBoxResgistarlimpezaSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResgistarlimpezaSuperficieActionPerformed
//        jComboBoxSuperficie();
    }//GEN-LAST:event_jComboBoxResgistarlimpezaSuperficieActionPerformed

    private void jComboBoxResgistarlimpezaProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxResgistarlimpezaProdutoPopupMenuWillBecomeInvisible
      String nomeProduto = jComboBoxResgistarlimpezaProduto.getSelectedItem().toString();
        idPesquisaProduto = selectId("PRODUTO", "PRODUTO", nomeProduto, "IDPRODUTO");
    }//GEN-LAST:event_jComboBoxResgistarlimpezaProdutoPopupMenuWillBecomeInvisible

    private void jButtonRegistarLimpezaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarLimpezaVoltarActionPerformed
         jDialogRegistoLimpeza.setVisible(false);
        
    }//GEN-LAST:event_jButtonRegistarLimpezaVoltarActionPerformed

    private void jButtonRegistarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarFuncionarioActionPerformed
        jDialogRegistarFuncionario.setLocationRelativeTo(this);
        jDialogRegistarFuncionario.setVisible(true);
        jDateChooserRegistarFuncionário.setDate(new Date());
        buttonAtualizarFuncionario.setVisible(false);
        jButtonGuardaRegistoFuncionario.setVisible(true);
        LimparResgitarFuncionario();
       
    }//GEN-LAST:event_jButtonRegistarFuncionarioActionPerformed

    private void jTextFieldConactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConactoActionPerformed

    private void jButtonGuardaRegistoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardaRegistoFuncionarioActionPerformed
        String NomeFuncinario = jTextFieldNome.getText();
        String Morada = jTextFieldMorada.getText();
        String CodPostal = jTextFieldCodigoP.getText();
        String Localidade = jTextFieldLocalidade.getText();
        String Contacto = jTextFieldConacto.getText();
        String Email = jTextFieldEmail.getText();
        String NIF = jTextFieldNIF.getText();
        
        String Password = jTextFieldPassword.getText();
        
        Date data = jDateChooserRegistarFuncionário.getDate();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String Data_Nasc = formato.format(data);
        
        if (NomeFuncinario.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Nome ");
        } else if (Morada.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Morada ");
        } else if (CodPostal.equals("    -   ")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Código-Postal ");
        } else if (Localidade.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Localidade ");
        } else if (Contacto.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Contacto ");
        } else if (Email.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Email ");
        } else if (NIF.equals("         ")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o NIF ");
        } else if (Password.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Sua Password");
        } else if (Data_Nasc.equals(new Date())) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Data de Nascimento");
        } else {

            RegistarFuncionário();
            //LimparResgitarFuncionario();
            //jDialogRegistarFuncionario.setVisible(false);
        }
        
       
    }//GEN-LAST:event_jButtonGuardaRegistoFuncionarioActionPerformed

    private void jButtonVoltarResgistoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarResgistoFuncionarioActionPerformed
        
        jDialogRegistarFuncionario.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarResgistoFuncionarioActionPerformed

    private void jButtonVoltarConsultarLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarLimpezaActionPerformed
       jDialogConsultarLimpeza.setVisible(false);
       LimparConsultasLimpezas();
    }//GEN-LAST:event_jButtonVoltarConsultarLimpezaActionPerformed

    private void jDateChooserConsultarLimpezaIniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserConsultarLimpezaIniPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserConsultarLimpezaIniPropertyChange

    private void jDateChooserConsultarLimpezaFimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserConsultarLimpezaFimPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserConsultarLimpezaFimPropertyChange

    private void jButtonConsultarLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarLimpezaActionPerformed
    model = (DefaultTableModel) jTableConsultarLimpeza.getModel();      
     String DataIni = sdf.format(jDateChooserConsultarLimpezaIni.getDate());
     String DataFim = sdf.format(jDateChooserConsultarLimpezaFim.getDate());
     //String espaço ="----------------------- ";
     String Branco ="    ";
     String data ="Data de:";
     String data2 ="Até:";
     LimparConsultasLimpezas();
        //LimparConsultaLimpeza ();
//       model.addRow(new Object[]{data,DataIni});
//       model.addRow(new Object[]{Branco});
//       PesquisarLimpezasFuncionarioPorData();
//       model.addRow(new Object[]{Branco});
//       model.addRow(new Object[]{data2,DataFim});
//       model.addRow(new Object[]{espaço,espaço,espaço,espaço,espaço,espaço});
//       
       // Ao Guarda para Excel não aceita campos nulos
         model.addRow(new Object[]{data,DataIni,Branco,Branco,Branco,Branco});
       model.addRow(new Object[]{Branco,Branco,Branco,Branco,Branco,Branco});
       PesquisarLimpezasFuncionarioPorData();
       model.addRow(new Object[]{Branco,Branco,Branco,Branco,Branco,Branco});
       model.addRow(new Object[]{data2,DataFim,Branco,Branco,Branco,Branco});
      // model.addRow(new Object[]{espaço,espaço,espaço,espaço,espaço,espaço});
          
       
        //PesquisarLimpezasFuncionarioPorData();
        
    }//GEN-LAST:event_jButtonConsultarLimpezaActionPerformed

    private void jButtonConsultarTodasLaiampezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodasLaiampezaActionPerformed

        JFileChooser fc = new JFileChooser();
                int option = fc.showSaveDialog(jLabel1);
                //option
                if(option == JFileChooser.APPROVE_OPTION){
                    String filename = fc.getSelectedFile().getName(); 
                    String path = fc.getSelectedFile().getParentFile().getPath();

					int len = filename.length();
					String ext = "";
					String file = "";

					if(len > 4){
						ext = filename.substring(len-4, len);
					}

					if(ext.equals(".xls")){
						file = path + "\\" + filename; 
					}else{
						file = path + "\\" + filename + ".xls"; 
					}
					toExcel2(jTableConsultarLimpeza, new File(file));
				}
     
    }//GEN-LAST:event_jButtonConsultarTodasLaiampezaActionPerformed

    private void jTextFieldRegistarHorasTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRegistarHorasTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegistarHorasTrabalhoActionPerformed

    private void jDateChooserTemperaturaFim1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserTemperaturaFim1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserTemperaturaFim1PropertyChange

    private void jDateChooserTemperaturaIni1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserTemperaturaIni1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserTemperaturaIni1PropertyChange

    private void jButtonPesquisarporTemperaturaData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarporTemperaturaData1ActionPerformed
       LimparConsultasTemperaturaEquipamento();
       ConsultarTemperaturasPorData();
    }//GEN-LAST:event_jButtonPesquisarporTemperaturaData1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimparConsultasTemperaturaEquipamento();
        PesquisarTemperaturasEquipamento();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarFuncionarioActionPerformed
        String NomeFuncinario = jTextFieldNome.getText();
        String Morada = jTextFieldMorada.getText();
        String CodPostal = jTextFieldCodigoP.getText();
        String Localidade = jTextFieldLocalidade.getText();
        String Contacto = jTextFieldConacto.getText();
        String Email = jTextFieldEmail.getText();
        String NIF = jTextFieldNIF.getText();
        
        String Password = jTextFieldPassword.getText();
        
        Date data = jDateChooserRegistarFuncionário.getDate();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String Data_Nasc = formato.format(data);
        
        if (NomeFuncinario.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Nome ");
        } else if (Morada.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Morada ");
        } else if (CodPostal.equals("    -   ")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Código-Postal ");
        } else if (Localidade.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Localidade ");
        } else if (Contacto.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Contacto ");
        } else if (Email.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o Email ");
        } else if (NIF.equals("         ")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira o NIF ");
        } else if (Password.equals("")) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Sua Password");
        } else if (Data_Nasc.equals(new Date())) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Insira a Data de Nascimento");
        } else {

            AtualizarFuncionário();
         
            jDialogRegistarFuncionario.setVisible(false);
            LimparResgitarFuncionario();
            LimparConsultasUtilizador();
            ConsultarUtilizador();
        }
        
       
       
           
         
          
        
    }//GEN-LAST:event_buttonAtualizarFuncionarioActionPerformed

    private void jButtonAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarFuncionarioActionPerformed
        jDialogAtualizarUtilizador.setLocationRelativeTo(this);
        jDialogAtualizarUtilizador.setVisible(true);
        buttonAtualizarFuncionario.setVisible(true);
        ConsultarUtilizador ();
    }//GEN-LAST:event_jButtonAtualizarFuncionarioActionPerformed

    private void jButtonEditarConsultarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarConsultarUtilizadorActionPerformed
      
     int linha = jTableAtualizarUtilizador.getSelectedRow();
        
        if (linha == -1)
        { JOptionPane.showMessageDialog(jDialogAtualizarUtilizador, "Selecione um Utilizador");
                   
        } else {
            
            BuscarNome = (String) jTableAtualizarUtilizador.getValueAt(linha, 0);
            idFuncionario = SelecionarID("FUNCIONARIO", "NOME", BuscarNome, "IDFUNCIONARIO" );
            
            jDialogRegistarFuncionario.setLocationRelativeTo(this);
            
            jDialogRegistarFuncionario.setVisible(true);
          
            buttonAtualizarFuncionario.setVisible(true);
            jButtonGuardaRegistoFuncionario.setVisible(false);
            DadosUtilizadorAlterar ();
            
        }   
        
        
        
        
        
    }//GEN-LAST:event_jButtonEditarConsultarUtilizadorActionPerformed

    private void jButtonVoltarConsultarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarUtilizadorActionPerformed
      
        jDialogAtualizarUtilizador.setVisible(false);
        LimparConsultasUtilizador();
    }//GEN-LAST:event_jButtonVoltarConsultarUtilizadorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

                   
         JFileChooser fc = new JFileChooser();
                int option = fc.showSaveDialog(jLabel1);
                //option
                if(option == JFileChooser.APPROVE_OPTION){
                    String filename = fc.getSelectedFile().getName(); 
                    String path = fc.getSelectedFile().getParentFile().getPath();

					int len = filename.length();
					String ext = "";
					String file = "";

					if(len > 4){
						ext = filename.substring(len-4, len);
					}

					if(ext.equals(".xls")){
						file = path + "\\" + filename; 
					}else{
						file = path + "\\" + filename + ".xls"; 
					}
					toExcel(jTableConsultarHorasAdmin, new File(file));
				}
     
    
				
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonGuardarRegistarCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistarCompartimentoActionPerformed
       String NomeProduto = jTextFieldRegistarCompartimento.getText();
       
       if (NomeProduto.equals("")) {
           JOptionPane.showMessageDialog(jDialogRegistarCompartimento, "Introduza o nome do Produto");
       } else {
         RegistarCompartimento();
         LimparRegistarCompartimento ();
         //jDialogRegistarProduto.setVisible(false);
       }
        
        
        
        
    }//GEN-LAST:event_jButtonGuardarRegistarCompartimentoActionPerformed

    private void jButtonVoltarRegistarCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarCompartimentoActionPerformed
       jDialogRegistarCompartimento.setVisible(false);
        LimparRegistarCompartimento ();
    }//GEN-LAST:event_jButtonVoltarRegistarCompartimentoActionPerformed

    private void buttonAtualizarCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarCompartimentoActionPerformed
         String nome = jTextFieldRegistarCompartimento.getText();
        
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira o Nome do Compartimento!");
        } else {
            AtualizarCompartimento();
            jDialogRegistarCompartimento.setVisible(false);
            LimparRegistarCompartimento();
            LimparConsultasCompartimentos();
            ConsultarCompartimento();
        } 
        
    }//GEN-LAST:event_buttonAtualizarCompartimentoActionPerformed

    private void jButtonVoltarConsultarCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarCompartimentoActionPerformed
         jDialogConsultarCompartimentos.setVisible(false);
        LimparConsultasCompartimentos ();
    }//GEN-LAST:event_jButtonVoltarConsultarCompartimentoActionPerformed

    private void jButtonEditarConsultarCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarConsultarCompartimentoActionPerformed
        int linha = jTableConsultarCompartimento.getSelectedRow();
        
        if (linha == -1)
        { JOptionPane.showMessageDialog(jDialogConsultarCompartimentos, "Selecione um Compartimento");
                   
        } else {
            
            BuscarNome = (String) jTableConsultarCompartimento.getValueAt(linha, 0);
            IDCompartimento = SelecionarID("COMPARTIMENTOS", "COMPARTIMENTOS", BuscarNome, "IDCOMPARTIMENTOS" );
            
            jDialogRegistarCompartimento.setLocationRelativeTo(this);
            //jDialogRegistarEquipamento.setTitle("Editar Equipamento");
            jDialogRegistarCompartimento.setVisible(true);
            //jTextFieldRegistarEquipamento.setEnabled(false);
            buttonAtualizarCompartimento.setVisible(true);
            jButtonGuardarRegistarCompartimento.setVisible(false);
            DadosCompartimentoAlterar ();    
        
        
        }
        
    }//GEN-LAST:event_jButtonEditarConsultarCompartimentoActionPerformed

    private void jButtonNovoCompartimentoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCompartimentoConsultarActionPerformed
       LimparConsultasCompartimentos();
        jDialogConsultarCompartimentos.setVisible(false);
        jDialogRegistarCompartimento.setLocationRelativeTo(this);
        jDialogRegistarCompartimento.setVisible(true);
        buttonAtualizarCompartimento.setVisible(false);
        jButtonGuardarRegistarCompartimento.setVisible(true);
    }//GEN-LAST:event_jButtonNovoCompartimentoConsultarActionPerformed

    private void jTextFieldPesquisarConsultaCompartimentoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarConsultaCompartimentoCaretUpdate
        LimparConsultasCompartimentos ();
        PesquisaCompartimento();
    }//GEN-LAST:event_jTextFieldPesquisarConsultaCompartimentoCaretUpdate

    private void jButtonReEquipamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReEquipamento1ActionPerformed
        
        jDialogRegistarCompartimento.setLocationRelativeTo(this);
        jDialogRegistarCompartimento.setVisible(true);
        buttonAtualizarCompartimento.setVisible(false);
        jButtonGuardarRegistarCompartimento.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonReEquipamento1ActionPerformed

    private void jButtonCnProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnProduto1ActionPerformed
         ConsultarCompartimento ();
       jDialogConsultarCompartimentos.setLocationRelativeTo(this);
       jDialogConsultarCompartimentos.setVisible(true);
        
    }//GEN-LAST:event_jButtonCnProduto1ActionPerformed

    private void jComboBoxCompartimentoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCompartimentoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCompartimentoPopupMenuWillBecomeInvisible

    private void jComboBoxCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompartimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCompartimentoActionPerformed

    private void jButtonGuardarRegistarSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistarSuperficieActionPerformed
      
        String SelecionarCompartimento = jComboBoxCompartimento.getSelectedItem().toString();
        String IndicarSuperficie = jTextFieldRegistarSuperficie.getText().toString();
        
        if (SelecionarCompartimento.equals("---Compartimento---")) {
            JOptionPane.showMessageDialog(jDialogRegistarSuperficies, "Selecciona um Compartimento");
        }
        else if (IndicarSuperficie.equals("")){
            JOptionPane.showMessageDialog(jDialogRegistarSuperficies, "Indique a Superfície");
        }
        else{
            RegistarSuperficie();
            LimparRegistarSuperficie();
            jDialogRegistarSuperficies.setVisible(false);
        }  
        
        
        
        
    }//GEN-LAST:event_jButtonGuardarRegistarSuperficieActionPerformed

    private void jButtonVoltarRegistarSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarSuperficieActionPerformed
      jDialogRegistarSuperficies.setVisible(false);
      LimparRegistarSuperficie();
    }//GEN-LAST:event_jButtonVoltarRegistarSuperficieActionPerformed

    private void jButtonReSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReSuperficieActionPerformed
        jDialogRegistarSuperficies.setLocationRelativeTo(this);
        jDialogRegistarSuperficies.setVisible(true);
        buttonAtualizarSuperficie.setVisible(false);
        jButtonGuardarRegistarSuperficie.setVisible(true);
       
        jComboBoxCompartimento();
      
    }//GEN-LAST:event_jButtonReSuperficieActionPerformed

    private void jButtonVoltarConsultarSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarSuperficieActionPerformed
    jDialogConsultarSuperfícies.setVisible(false);
        LimparConsultasSuperficies ();
    }//GEN-LAST:event_jButtonVoltarConsultarSuperficieActionPerformed

    private void jComboBoxConsultarSuperficiePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxConsultarSuperficiePopupMenuWillBecomeInvisible
  
        
        Compartimento = jComboBoxConsultarSuperficie.getSelectedItem().toString();
        idCompartimentos = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
       // if (nomeEquipamento.equals("---Equipamento---")) {
          //  idPesquisaEquipamento = 0;
         //}
            //Aqui limpa apos fazer cada select na combobox
            LimparConsultasSuperficies ();
            PesquisarSuperficie();
            
            
        System.out.println("Compartimento : " + Compartimento);
        System.out.println("ID Compartimento: " + idCompartimentos);
        
       
    }//GEN-LAST:event_jComboBoxConsultarSuperficiePopupMenuWillBecomeInvisible

    private void jComboBoxConsultarSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConsultarSuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxConsultarSuperficieActionPerformed

    private void jButtonEditarConsultarSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarConsultarSuperficieActionPerformed
    
        int linha = jTableConsultarSuperficie.getSelectedRow();
        Compartimento=jComboBoxConsultarSuperficie.getSelectedItem().toString();
        if (linha == -1)
        { JOptionPane.showMessageDialog(jDialogConsultarSuperfícies, "Selecione uma Superfície");
                   
        } else {
            
            BuscarNome = (String) jTableConsultarSuperficie.getValueAt(linha, 0);
            IDSuperficie = SelecionarID("SUPERFICIE", "NOME", BuscarNome, "IDSUPERFICIE" );
            
            jDialogRegistarSuperficies.setLocationRelativeTo(this);
            //jDialogRegistarEquipamento.setTitle("Editar Equipamento");
            jDialogRegistarSuperficies.setVisible(true);
            jDialogConsultarSuperfícies.setVisible(false);
            //jTextFieldRegistarEquipamento.setEnabled(false);
            buttonAtualizarSuperficie.setVisible(true);
            jButtonGuardarRegistarSuperficie.setVisible(false);
            DadosSuperficieAlterar ();
            jComboBoxCompartimentoEditar();
            
        }
        
        
        
        
    }//GEN-LAST:event_jButtonEditarConsultarSuperficieActionPerformed

    private void jButtonNovoSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoSuperficieActionPerformed
        LimparConsultasSuperficies();
        jDialogConsultarSuperfícies.setVisible(false);
        jDialogRegistarSuperficies.setLocationRelativeTo(this);
        jDialogRegistarSuperficies.setVisible(true);
        buttonAtualizarSuperficie.setVisible(false);
        jButtonGuardarRegistarSuperficie.setVisible(true);
        jComboBoxCompartimento();
    }//GEN-LAST:event_jButtonNovoSuperficieActionPerformed

    private void buttonAtualizarSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarSuperficieActionPerformed
        //String SelecionarCompartimento = jComboBoxCompartimento.getSelectedItem().toString();
         String nome = jTextFieldRegistarSuperficie.getText();
        
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira o Nome da Superfície!");
        } else {
            AtualizarSuperficie();
            jDialogRegistarSuperficies.setVisible(false);
            LimparRegistarSuperficie();
            LimparConsultasSuperficies();
            ConsultarSuperficie();
         
        } 
        
        
    }//GEN-LAST:event_buttonAtualizarSuperficieActionPerformed

    private void jButtonCnSuperficiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnSuperficiesActionPerformed
        jDialogConsultarSuperfícies.setLocationRelativeTo(this);
        LimparConsultasSuperficies();
        jDialogConsultarSuperfícies.setVisible(true);
        
        jComboBoxConsultarSuperficies(jComboBoxConsultarSuperficie);
        
        ConsultarSuperficie();
        LimparConsultasSuperficies();
        
        
        
        
    }//GEN-LAST:event_jButtonCnSuperficiesActionPerformed

    private void jButtonRegistarEquipamentoTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarEquipamentoTemperaturaActionPerformed
        jDialogRegistarEquipamento.setLocationRelativeTo(this);
        jDialogRegistarEquipamento.setVisible(true);
        jButtonAlterarEquipamento.setVisible(false);
        jButtonGuardarRegistarEquipamento.setVisible(true);
    }//GEN-LAST:event_jButtonRegistarEquipamentoTemperaturaActionPerformed

    private void jComboBoxCompartimentoEquipamentoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCompartimentoEquipamentoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCompartimentoEquipamentoPopupMenuWillBecomeInvisible

    private void jComboBoxCompartimentoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompartimentoEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCompartimentoEquipamentoActionPerformed

    private void jButtonGuardarRegistarEquipamentoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistarEquipamentoLimpezaActionPerformed
       
        String SelecionarCompartimento = jComboBoxCompartimentoEquipamento.getSelectedItem().toString();
        String IndicarEquipamento = jTextFieldRegistarEquipamentoLimpeza.getText().toString();
        
        if (SelecionarCompartimento.equals("---Compartimento---")) {
            JOptionPane.showMessageDialog(jDialogRegistarEquipamentosLimpeza, "Selecciona um Compartimento");
        }
        else if (IndicarEquipamento.equals("")){
            JOptionPane.showMessageDialog(jDialogRegistarEquipamentosLimpeza, "Indique Equipamento");
        }
        else{
            RegistarEquipamentoLimpeza();
            LimparRegistarEquipamentoLimpeza();
            jDialogRegistarEquipamentosLimpeza.setVisible(false);
        }  
        
        
    }//GEN-LAST:event_jButtonGuardarRegistarEquipamentoLimpezaActionPerformed

    private void jButtonVoltarRegistarEquipamentoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarEquipamentoLimpezaActionPerformed
      jDialogRegistarEquipamentosLimpeza.setVisible(false);
      LimparRegistarEquipamentoLimpeza();
    }//GEN-LAST:event_jButtonVoltarRegistarEquipamentoLimpezaActionPerformed

    private void buttonAtualizarEquipamentoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarEquipamentoLimpezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAtualizarEquipamentoLimpezaActionPerformed

    private void jButtonRegistarEquipamentoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarEquipamentoLimpezaActionPerformed
       jDialogRegistarEquipamentosLimpeza.setLocationRelativeTo(this);
        jDialogRegistarEquipamentosLimpeza.setVisible(true);
        buttonAtualizarEquipamentoLimpeza.setVisible(false);
        jButtonGuardarRegistarEquipamentoLimpeza.setVisible(true);
       
        
        jComboBoxCompartimentoEquipamento();
    }//GEN-LAST:event_jButtonRegistarEquipamentoLimpezaActionPerformed

    private void jButtonVoltarSeleEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarSeleEquipamentosActionPerformed
      
        jDialogRegistrarSeleEquipamentos.setVisible(false);
        
    }//GEN-LAST:event_jButtonVoltarSeleEquipamentosActionPerformed

    private void jComboBoxCompartimentoEquipamentoAmbosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCompartimentoEquipamentoAmbosPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCompartimentoEquipamentoAmbosPopupMenuWillBecomeInvisible

    private void jComboBoxCompartimentoEquipamentoAmbosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompartimentoEquipamentoAmbosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCompartimentoEquipamentoAmbosActionPerformed

    private void jButtonGuardarRegistarEquipamentoLimpezaAmbosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistarEquipamentoLimpezaAmbosActionPerformed
       
        String SelecionarCompartimento = jComboBoxCompartimentoEquipamentoAmbos.getSelectedItem().toString();
        String IndicarEquipamento = jTextFieldRegistarEquipamentoLimpezaAmbos.getText().toString();
        
        if (SelecionarCompartimento.equals("---Compartimento---")) {
            JOptionPane.showMessageDialog(jDialogRegistarEquipamentosLimpeza, "Selecciona um Compartimento");
        }
        else if (IndicarEquipamento.equals("")){
            JOptionPane.showMessageDialog(jDialogRegistarEquipamentosLimpeza, "Indique Equipamento");
        }
        else{
            RegistarEquipamentoAmbos();
            //RegistarEquipamentoLimpezaAmbos();
            LimparRegistarEquipamentoLimpeza();
            jDialogRegistarEquipamentosLimpeza.setVisible(false);
        }  
         
        
    }//GEN-LAST:event_jButtonGuardarRegistarEquipamentoLimpezaAmbosActionPerformed

    private void jButtonVoltarRegistarEquipamentoLimpeza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarRegistarEquipamentoLimpeza1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarRegistarEquipamentoLimpeza1ActionPerformed

    private void buttonAtualizarEquipamentoLimpeza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarEquipamentoLimpeza1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAtualizarEquipamentoLimpeza1ActionPerformed

    private void jComboBoxResgistarlimpezaCompartimentoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxResgistarlimpezaCompartimentoPopupMenuWillBecomeInvisible
     
        
        String nomeCompartimento = jComboBoxResgistarlimpezaCompartimento.getSelectedItem().toString();
        IDCompartimento = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", nomeCompartimento, "IDCOMPARTIMENTOS");
       
                jComboBoxSuperficie();
                
                
             System.out.println("compartimento: " + nomeCompartimento);        
          System.out.println("ID compartimento: " + IDCompartimento);      
    }//GEN-LAST:event_jComboBoxResgistarlimpezaCompartimentoPopupMenuWillBecomeInvisible

    private void jComboBoxResgistarlimpezaCompartimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResgistarlimpezaCompartimentoActionPerformed
//jComboBoxSuperficie();    
       
    }//GEN-LAST:event_jComboBoxResgistarlimpezaCompartimentoActionPerformed

    private void jTextFieldNomePHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomePHActionPerformed

    private void jButtonCnFichasTecnicasProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnFichasTecnicasProdutosActionPerformed
        jDialogConsultarFT.setLocationRelativeTo(this);
        jDialogConsultarFT.setVisible(true);
        
        ConsultarFT();
        
        
    }//GEN-LAST:event_jButtonCnFichasTecnicasProdutosActionPerformed

    private void jButtonSelecionarPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarPHActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File ficheiro =chooser.getSelectedFile();
        String nomeFicheiro= ficheiro.getAbsolutePath();
        jTextFieldNomePH.setText(nomeFicheiro);
        
        //selectFile();
       //jTextFieldNomePH.setText(jfc.getSelectedFile().getName());
    }//GEN-LAST:event_jButtonSelecionarPHActionPerformed

    private void jButtonGuardarPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPHActionPerformed
        
       
        RegistarPlanoHigienizacao();
        
        //copyFile();
    }//GEN-LAST:event_jButtonGuardarPHActionPerformed

    private void jButtonRePlanoHigienizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRePlanoHigienizacaoActionPerformed
       
        jDialogRegistarPH.setLocationRelativeTo(this);
        jDialogRegistarPH.setVisible(true);
        jComboBoxCompartimentoFT();
        jButtonAtualizarPH.setVisible(false);
        jButtonGuardarPH.setVisible(true);
    }//GEN-LAST:event_jButtonRePlanoHigienizacaoActionPerformed

    private void jComboBoxCompartimentosPHPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCompartimentosPHPopupMenuWillBecomeInvisible
        Compartimento = jComboBoxCompartimentosPH.getSelectedItem().toString();
         System.out.println("Compartimento : " + Compartimento);
       
        
        
    }//GEN-LAST:event_jComboBoxCompartimentosPHPopupMenuWillBecomeInvisible

    private void jButtonRegistarPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarPHActionPerformed
       jDialogRegistarPH.setVisible(false);
       LimparRegistarPH();
    }//GEN-LAST:event_jButtonRegistarPHActionPerformed

    private void jTableConsultarPHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultarPHMouseClicked
     /*int row = jTableConsultarPH.getSelectedRow();
     String value = (jTableConsultarPH.getModel().getValueAt(row, 1).toString());
      
    if (jButton4.isSelected()){
        
    }else{
     
     try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+value);
        } catch (Exception ex)
        {
           System.err.println("SQLException: " + ex.getMessage());
        }
     }*/
    }//GEN-LAST:event_jTableConsultarPHMouseClicked

    private void jButtonVoltarConsultarPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarPHActionPerformed
      jDialogConsultarPH.setVisible(false);
       LimparCnPH();
    }//GEN-LAST:event_jButtonVoltarConsultarPHActionPerformed

    private void jButtonAtualizarPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarPHActionPerformed

       
        
        String nome = jTextFieldNomePH.getText();
        
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione o ficheiro!");
        } else {
            AtualizarPH();
             jDialogConsultarPH.setVisible(false);
              LimparCnPH();
         
            
         
        } 


    }//GEN-LAST:event_jButtonAtualizarPHActionPerformed

    private void jButtonEditarConsultarPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarConsultarPHActionPerformed
        
        int linha = jTableConsultarPH.getSelectedRow();
        if (linha == -1)
        { JOptionPane.showMessageDialog(jDialogConsultarPH, "Selecione um Compartimento");
                   
        } else {
            
            BuscarNome = (String) jTableConsultarPH.getValueAt(linha, 1);
            IDPH = SelecionarID("PLANO_HIGIENIZACAO", "FICHEIRO", BuscarNome, "IDPLANOHIGIENIZACAO" );
            
            jDialogRegistarPH.setLocationRelativeTo(this);
            //jDialogRegistarEquipamento.setTitle("Editar Equipamento");
            jDialogRegistarPH.setVisible(true);
            jDialogConsultarPH.setVisible(false);
            //jTextFieldRegistarEquipamento.setEnabled(false);
            jButtonAtualizarPH.setVisible(true);
            jButtonGuardarPH.setVisible(false);
            DadosPHAlterar ();
            
           // jComboBoxCompartimentoEditarPH();
        }
        
    }//GEN-LAST:event_jButtonEditarConsultarPHActionPerformed

    private void jTableConsultarPH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultarPH1MouseClicked
         int row = jTableConsultarPH1.getSelectedRow();
     String Caminho = (jTableConsultarPH1.getModel().getValueAt(row, 1).toString());
      
  
     
     try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+Caminho);
        } catch (Exception ex)
        {
           System.err.println("SQLException: " + ex.getMessage());
        }
     
    }//GEN-LAST:event_jTableConsultarPH1MouseClicked

    private void jButtonVoltarConsultarPH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarPH1ActionPerformed
        jDialogConsultarPH2.setVisible(false);
       LimparCnPH2();
    }//GEN-LAST:event_jButtonVoltarConsultarPH1ActionPerformed

    private void jButtonEDTPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDTPHActionPerformed
        jDialogConsultarPH.setLocationRelativeTo(this);
           
        jDialogConsultarPH.setVisible(true);
        jDialogRegistarPH.setVisible(false);
        
         LimparCnPH();
         ConsultarPH2();
    }//GEN-LAST:event_jButtonEDTPHActionPerformed

    private void jButtonSelecionarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarFTActionPerformed
      
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File ficheiro =chooser.getSelectedFile();
        String nomeFicheiro= ficheiro.getAbsolutePath();
        jTextFieldNomeFT.setText(nomeFicheiro);
        
        
    }//GEN-LAST:event_jButtonSelecionarFTActionPerformed

    private void jTextFieldNomeFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeFTActionPerformed

    private void jComboBoxProdutoFTPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProdutoFTPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProdutoFTPopupMenuWillBecomeInvisible

    private void jButtonGuardarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarFTActionPerformed
        
        RegistarFT();
        
    }//GEN-LAST:event_jButtonGuardarFTActionPerformed

    private void jButtonRegistarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarFTActionPerformed
        jDialogRegistarFT.setVisible(false);
       LimparRegistarFT();
        
        
    }//GEN-LAST:event_jButtonRegistarFTActionPerformed

    private void jButtonAtualizarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarFTActionPerformed
      
         String nome = jTextFieldNomeFT.getText();
        
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione o ficheiro!");
        } else {
            AtualizarFT();
             jDialogConsultarEditarFT.setVisible(false);
              LimparCnEditarFT();
         
            
         
        } 
        
    }//GEN-LAST:event_jButtonAtualizarFTActionPerformed

    private void jButtonEDTFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDTFTActionPerformed
        jDialogConsultarEditarFT.setLocationRelativeTo(this);
           
        jDialogConsultarEditarFT.setVisible(true);
        jDialogRegistarFT.setVisible(false);
        
         LimparCnEditarFT();
         ConsultarFT2();
    }//GEN-LAST:event_jButtonEDTFTActionPerformed

    private void jButtonCnFichasTecnicasProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnFichasTecnicasProdutos1ActionPerformed
        jDialogRegistarFT.setLocationRelativeTo(this);
        jDialogRegistarFT.setVisible(true);
        
        
        jComboBoxCompartimentoFichasTecnicas();
        jButtonAtualizarFT.setVisible(false);
        jButtonGuardarFT.setVisible(true);
    }//GEN-LAST:event_jButtonCnFichasTecnicasProdutos1ActionPerformed

    private void jTableConsultarFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultarFTMouseClicked
           int row = jTableConsultarFT.getSelectedRow();
           String Caminho = (jTableConsultarFT.getModel().getValueAt(row, 1).toString());
      
  
     
     try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+Caminho);
        } catch (Exception ex)
        {
           System.err.println("SQLException: " + ex.getMessage());
        }
     
        
        
        
    }//GEN-LAST:event_jTableConsultarFTMouseClicked

    private void jButtonVoltarConsultarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarFTActionPerformed
       jDialogConsultarFT.setVisible(false);
       LimparCnFT();
    }//GEN-LAST:event_jButtonVoltarConsultarFTActionPerformed

    private void jTableConsultarEditarFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultarEditarFTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableConsultarEditarFTMouseClicked

    private void jButtonVoltarConsultarEditarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarEditarFTActionPerformed
        jDialogConsultarEditarFT.setVisible(false);
       LimparCnEditarFT();
    }//GEN-LAST:event_jButtonVoltarConsultarEditarFTActionPerformed

    private void jButtonEditarConsultarEditarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarConsultarEditarFTActionPerformed
     
        int linha = jTableConsultarEditarFT.getSelectedRow();
        if (linha == -1)
        { JOptionPane.showMessageDialog(jDialogConsultarEditarFT, "Selecione um Produto");
                   
        } else {
            
            BuscarNome = (String) jTableConsultarEditarFT.getValueAt(linha, 1);
            IDFT = SelecionarID("FICHAS_TECNICAS", "FICHEIRO", BuscarNome, "IDFICHASTECNICAS" );
            
            jDialogRegistarFT.setLocationRelativeTo(this);
            //jDialogRegistarEquipamento.setTitle("Editar Equipamento");
            jDialogRegistarFT.setVisible(true);
            jDialogConsultarEditarFT.setVisible(false);
            //jTextFieldRegistarEquipamento.setEnabled(false);
            jButtonAtualizarFT.setVisible(true);
            jButtonGuardarFT.setVisible(false);
            DadosFTAlterar ();
            
           // jComboBoxCompartimentoEditarPH();
        }
        
        
        
    }//GEN-LAST:event_jButtonEditarConsultarEditarFTActionPerformed

    private void jComboBoxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLoginActionPerformed

    //Funçoes aqui-------------------------------------------
    private void LerFuncionario(JComboBox nomeComboBox) {
        
        //LIMPAR A COMBO
        nomeComboBox.removeAllItems();
        //CARREGAR DADOS
        Set<String> opcao = new HashSet<String>();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            //            stmt = con.createStatement();
            String nomeTabela = "FUNCIONARIO";
            String sql = "SELECT * FROM " + nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        nomeComboBox.addItem("--Utilizador--");
        Iterator<String> it = opcao.iterator();
        while (it.hasNext()) {
            nomeComboBox.addItem(it.next());
        }
    }
    
    private void VerificaLogin(String pwdInserida) {

        boolean login = false;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "FUNCIONARIO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idFuncionarioLogin + " AND PASSWORD='" + pwdInserida + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                login = true;
            }
            st.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        if (login == true) {
            System.out.println("LOGIN ACEITE");
            //COLOCAR MENU VISIBEL
//            for (Component cp : jMenuBar1.getComponents()) {
//                cp.setEnabled(true);
//            }

            //COLOCAR JANELA DE LOGIN ESCONDIDA
            for (Component cp : jPanel2.getComponents()) {
                cp.setEnabled(false);
            }

    
            jDialogJanelaInicial.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);            
            jDialogJanelaInicial.setLocationRelativeTo(this);
            jDialogJanelaInicial.setVisible(true);

            //ESCREVER O NOME DO FUNCIONARIO
            //String nomeFuncionario = selectString("FUNCIONARIO", "IDFUNCIONARIO", idFuncionarioLogin, "NOME");
            //jLabelBoasVindas.setText("Olá, " + nomeFuncionario);

            //MOSTRAR PANEL DA JANELA PRINCIPAL
            jPanelPrincipal.setVisible(true);

        } else {
            System.out.println("LOGIN ERRADO");
            JOptionPane.showMessageDialog(this, "Password Errada ! ");
            jPasswordFieldPassword.setText("");
        }

    }
    
    private void logout() {
        //FUNÇÃO PARA FECHAR TODAS AS JANELAS
        for (Window window : Higienizacao.getWindows()) {
            if (window instanceof JDialog) {
                window.dispose();
            }
        }

        //LIMPAR CAMPOS DE LOGIN
//        for (Component cp : jMenuBar1.getComponents()) {
//            cp.setEnabled(false);
//        }

        //COLOCAR JANELA DE LOGIN VISIVEL
        for (Component cp : jPanel2.getComponents()) {
            cp.setEnabled(true);
        }

        jComboBoxLogin.setSelectedIndex(0);
        jPasswordFieldPassword.setText("");
        
        idFuncionarioLogin = 0;
        NomeFuncionarioLogin = "";

    }
    
    private int SelecionarID (String tab, String col, String cam, String colId){
        int resultId = 0;
        String tabela = tab;
        String coluna = col;
        String campo = cam;
        String colunaId = colId;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            sql = "select * from " + tabela + " where " + coluna + "='" + campo + "'";

            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                resultId = rs.getInt(colunaId);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return resultId;
    }
    
    private String selectString(String tab, String col, int cam, String colNome) {
        String resultString = "";
        String tabela = tab;
        String coluna = col;
        int campo = cam;
        String colunaNome = colNome;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            sql = "select * from " + tabela + " where " + coluna + "=" + campo + " ";

            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                resultString = rs.getString(colunaNome);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return resultString;
    }
    
    private void selectFile() {
       
        jfc.setDialogTitle("Selecione o Ficheiro");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.setAcceptAllFileFilterUsed(false);
        int returnVal = jfc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            input = jfc.getSelectedFile();
        }
    }
    
    private void copyFile() {
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Por Favor selecione um Ficheiro");
            return;
        }
        try {
            File file = new File(out, nomeFile);
            System.out.println("file = " + file.getPath());
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(input)));
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(file)));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line, 0, line.length());
                bw.newLine();
            }
            br.close();
            bw.close();

        } catch (IOException e) {
            System.err.println("Exception occured:" + e.getMessage());
        }
    }
    
    public static boolean validarNif(String number) {
        // TAMANHO OBRIGATORIO TEM DE SER 9
        if (number.length() != 9) {
            return false;

        } 
       
        if (!"125689".contains(number.charAt(0) + "")) {
            return false;
        }
/*
        // CICLO PARA CONSTRUIR O ARRAY DE INTEIROS
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(number.charAt(i) + "");
        }

        
        float resultado = 0.0f;
        for (int i = 0, j = 9; i < 9; i++, j--) {
            resultado += (j * numbers[i]);
            System.out.println(resultado + " = " + j + " x " + numbers[i]);
        }

        if ((resultado % 11) != 0.0f) {
            return false;
        }*/ else {
            return true;
        }
//http://www.nif.pt/
        
    }
    //Função para carregar dados na jComboBoxEquipamento
    private void jComboBoxEquipamento(){
        //limpar a comboBoxSubProdutos
        jComboBoxEquipamento.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            sql = "select * from " + nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxEquipamento.addItem("---Equipamento---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxEquipamento.addItem(it.next());
        }
    }
    
     private void jComboBoxCompartimento(){
        //limpar a comboBoxSubProdutos
        jComboBoxCompartimento.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            sql = "select * from " + nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("COMPARTIMENTOS"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxCompartimento.addItem("---Compartimento---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxCompartimento.addItem(it.next());
        }
    }
     
      private void jComboBoxCompartimentoFT(){
        //limpar a comboBoxSubProdutos
        jComboBoxCompartimentosPH.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            sql = "select * from " + nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("COMPARTIMENTOS"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxCompartimentosPH.addItem("---Compartimento---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxCompartimentosPH.addItem(it.next());
        }
    }
      
       private void jComboBoxCompartimentoFichasTecnicas(){
        //limpar a comboBoxSubProdutos
        jComboBoxProdutoFT.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "PRODUTO";
            sql = "select * from " + nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("PRODUTO"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxProdutoFT.addItem("---Produto---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxProdutoFT.addItem(it.next());
        }
    }
     
     private void jComboBoxCompartimentoEquipamento(){
        //limpar a comboBoxSubProdutos
        jComboBoxCompartimentoEquipamento.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            sql = "select * from " + nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("COMPARTIMENTOS"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxCompartimentoEquipamento.addItem("---Compartimento---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxCompartimentoEquipamento.addItem(it.next());
        }
    }
     
     private void jComboBoxCompartimentoEditar(){
        //limpar a comboBoxSubProdutos
        jComboBoxCompartimento.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            sql = "select * from " + nomeTabela;
            //sql = "select * from " + nomeTabela+ "WHERE IDCOMPARTIMENTOS =" +IDCompartimento;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("COMPARTIMENTOS"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxCompartimento.addItem(Compartimento);
        //Iterator<String> it = matPrimNec.iterator();
        //while (it.hasNext()) {
        //    jComboBoxCompartimento.addItem(it.next());
        //}
    }
     
     private void jComboBoxCompartimentoEditarPH(){
        //limpar a comboBoxSubProdutos
        jComboBoxCompartimentosPH.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            sql = "select * from " + nomeTabela;
            //sql = "select * from " + nomeTabela+ "WHERE IDCOMPARTIMENTOS =" +IDCompartimento;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("COMPARTIMENTOS"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxCompartimentosPH.addItem(Compartimento);
        //Iterator<String> it = matPrimNec.iterator();
        //while (it.hasNext()) {
        //    jComboBoxCompartimento.addItem(it.next());
        //}
    }
    
    private void jComboBoxSuperficie(){

        jComboBoxResgistarlimpezaSuperficie.removeAllItems();
        //carregar novos dados
        
        //Compartimento = jComboBoxResgistarlimpezaCompartimento.getSelectedItem().toString();
        //idCompartimentos = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "SUPERFICIE";
           // sql = "select * from " + nomeTabela ;
            sql = "select NOME FROM " + nomeTabela + " WHERE IDCOMPARTIMENTOS = " + IDCompartimento;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxResgistarlimpezaSuperficie.addItem("---Superficie---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxResgistarlimpezaSuperficie.addItem(it.next());
        }
    }
    
    private void jComboBoxProduto(){
        //limpar a comboBoxSubProdutos
        jComboBoxResgistarlimpezaProduto.removeAllItems();
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "PRODUTO";
            sql = "select * from " + nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("PRODUTO"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxResgistarlimpezaProduto.addItem("---Produto---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxResgistarlimpezaProduto.addItem(it.next());
        }
    }
    
    private void jComboBoxCompartimentoLimpeza(){
        //limpar a comboBoxSubProdutos
        jComboBoxResgistarlimpezaCompartimento.removeAllItems();
        // Compartimento = jComboBoxResgistarlimpezaCompartimento.getSelectedItem().toString();
        //idCompartimentos = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
        //carregar novos dados
        Set<String> matPrimNec = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            sql = "select * from " + nomeTabela ;
            
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                matPrimNec.add(rs.getString("COMPARTIMENTOS"));
       
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jComboBoxResgistarlimpezaCompartimento.addItem("---Compartimento---");
        Iterator<String> it = matPrimNec.iterator();
        while (it.hasNext()) {
            jComboBoxResgistarlimpezaCompartimento.addItem(it.next());
            
        }
    }
    
    private void jComboBoxConsultarTemperaturaEquipamento(JComboBox ComboBoxConsultarTemperaturaEquipamento){
        
        ComboBoxConsultarTemperaturaEquipamento.removeAllItems();
        //carregar novos dados
        Set<String> opcao = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            sql = "select * from " + nomeTabela ;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        ComboBoxConsultarTemperaturaEquipamento.addItem("---Equipamento---");
        Iterator<String> it = opcao.iterator();
        while (it.hasNext()) {
            ComboBoxConsultarTemperaturaEquipamento.addItem(it.next());
        }
    }
    
    private void jComboBoxConsultarSuperficies(JComboBox ComboBoxConsultarSuperficies){
        
        ComboBoxConsultarSuperficies.removeAllItems();
        //carregar novos dados
        Set<String> opcao = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            sql = "select * from " + nomeTabela ;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                opcao.add(rs.getString("COMPARTIMENTOS"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        ComboBoxConsultarSuperficies.addItem("---Compartimento---");
        Iterator<String> it = opcao.iterator();
        while (it.hasNext()) {
            ComboBoxConsultarSuperficies.addItem(it.next());
        }
    }
    
    private void JComboBoxConsultarHorasTrabalhoAdmin(JComboBox JComboBoxConsultarHorasTrabalhoAdmin){
        
        JComboBoxConsultarHorasTrabalhoAdmin.removeAllItems();
        
        Set<String> opcao = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "FUNCIONARIO";
            sql = "select * from " + nomeTabela ;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        JComboBoxConsultarHorasTrabalhoAdmin.addItem("Funcionario--»");
        Iterator<String> it = opcao.iterator();
        while (it.hasNext()) {
            JComboBoxConsultarHorasTrabalhoAdmin.addItem(it.next());
        }
        
        
    }
    
    
    private void JComboBoxConsultarLimpeza(JComboBox JComboBoxConsultarLimpeza){
        
        JComboBoxConsultarLimpeza.removeAllItems();
        
        Set<String> opcao = new HashSet<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "FUNCIONARIO";
            sql = "select * from " + nomeTabela ;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        JComboBoxConsultarLimpeza.addItem("Funcionario--»");
        Iterator<String> it = opcao.iterator();
        while (it.hasNext()) {
            JComboBoxConsultarLimpeza.addItem(it.next());
        }
        
        
    }
    
    //Buscar a base de dados o dados selecionados para os introduzir na JdialogRegistarEquipamento
    private void DadosEquipamentoAlterar(){
        String NomeEquipamento = "";
        String DescrcaoEquipamento = "";
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDEQUIPAMENTO=" + IDEquipamento;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                NomeEquipamento = rs.getString("NOME");
                DescrcaoEquipamento = rs.getString("DESCRICAO_ANOMALIA");

                jTextFieldRegistarEquipamento.setText(NomeEquipamento);
                jTextAreaRegistarDescricao.setText(DescrcaoEquipamento);
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
    
    private void DadosProdutoAlterar(){
        String NomeProduto = jTextFieldRegistarProduto.getText();
        
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PRODUTO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDPRODUTO=" + IDProduto;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                NomeProduto = rs.getString("PRODUTO");
                

                jTextFieldRegistarProduto.setText(NomeProduto);
                
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
    
    private void DadosSuperficieAlterar(){
        
        String NomeSuperficie = jTextFieldRegistarSuperficie.getText();
        
            
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "SUPERFICIE";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDSUPERFICIE=" + IDSuperficie;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                NomeSuperficie = rs.getString("NOME");
                

                jTextFieldRegistarSuperficie.setText(NomeSuperficie);
                
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
    
    private void DadosPHAlterar(){
        jComboBoxCompartimentosPH.removeAllItems();
        //String NomeFicheiro = jTextFieldNomePH.getText();
         String NomeFicheiro = "";
        //Compartimento = jComboBoxCompartimentosPH.getSelectedItem().toString();
          //int idcompartimento = 0; 
        // String NomeCompartimento = jComboBoxCompartimentosPH.getSelectedItem().toString();
          String NomeCompartimento = "";
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PLANO_HIGIENIZACAO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDPLANOHIGIENIZACAO=" + IDPH;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                
       
                idcompartimento = rs.getInt("IDCOMPARTIMENTOS");
                NomeCompartimento = selectString("COMPARTIMENTOS", "IDCOMPARTIMENTOS", idcompartimento,"COMPARTIMENTOS");
                NomeFicheiro = rs.getString("FICHEIRO");
                
                 
                 jComboBoxCompartimentosPH.addItem(NomeCompartimento);
                 jTextFieldNomePH.setText(NomeFicheiro);
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        System.out.println("COmboCOompartimento -> " + NomeCompartimento);
    }
    
    private void DadosFTAlterar(){
        jComboBoxProdutoFT.removeAllItems();
        //String NomeFicheiro = jTextFieldNomePH.getText();
         String NomeFicheiro = "";
        //Compartimento = jComboBoxCompartimentosPH.getSelectedItem().toString();
          //int idcompartimento = 0; 
        // String NomeCompartimento = jComboBoxCompartimentosPH.getSelectedItem().toString();
          String NomeProduto = "";
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "FICHAS_TECNICAS";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDFICHASTECNICAS=" + IDFT;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                
       
                IDProduto = rs.getInt("IDPRODUTO");
                NomeProduto = selectString("PRODUTO", "IDPRODUTO", IDProduto,"PRODUTO");
                NomeFicheiro = rs.getString("FICHEIRO");
                
                 
                 jComboBoxProdutoFT.addItem(NomeProduto);
                 jTextFieldNomeFT.setText(NomeFicheiro);
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        System.out.println("ComboProduto -> " + NomeProduto);
    }
    
     private void DadosCompartimentoAlterar(){
        String NomeCompartimento = jTextFieldRegistarCompartimento.getText();
        
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDCOMPARTIMENTOS=" + IDCompartimento;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                NomeCompartimento = rs.getString("COMPARTIMENTOS");
                

                jTextFieldRegistarCompartimento.setText(NomeCompartimento);
                
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
    
     private void DadosUtilizadorAlterar(){
        String NomeFuncionario = jTextFieldNome.getText();
        String Morada = jTextFieldMorada.getText();
        String CodPostal = jTextFieldCodigoP.getText();
        String Localidade = jTextFieldLocalidade.getText();
        String Contacto = jTextFieldConacto.getText();
        String Email = jTextFieldEmail.getText();
        String NIF = jTextFieldNIF.getText();
        String Password = jTextFieldPassword.getText(); 
        Date data = jDateChooserRegistarFuncionário.getDate();
        
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "FUNCIONARIO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idFuncionario;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                NomeFuncionario = rs.getString("NOME");
                Morada = rs.getString("MORADA");
                CodPostal = rs.getString("COD_POSTAL");
                Localidade = rs.getString("LOCALIDADE");
                Contacto = rs.getString("CONTACTO");
                Email = rs.getString("EMAIL");
                NIF = rs.getString("NIF");
                Password = rs.getString("PASSWORD");
                data = rs.getDate("DATA_NASC");
                
                jTextFieldNome.setText(NomeFuncionario);
                jTextFieldMorada.setText(Morada);
                jTextFieldCodigoP.setText(CodPostal);
                jTextFieldLocalidade.setText(Localidade);
                jTextFieldConacto.setText(Contacto);
                jTextFieldEmail.setText(Email);
                jTextFieldNIF.setText(NIF);
                jTextFieldPassword.setText(Password);
                jDateChooserRegistarFuncionário.setDate(data);

              
                
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
    
    // Funções para Atualizar 
    
    private void AtualizarEquipamento(){
        
        String Nome = jTextFieldRegistarEquipamento.getText();
        String Descricao = jTextAreaRegistarDescricao.getText();
        
         boolean VerificarNome = false;
         
         if (Nome.equals(IDEquipamento)) {
            //AQUI IGNONAMOS A  VERIFICAÇÃO DO NOME, NAO VAMOS A BD VER SE JA EXISTE
            VerificarNome = false;
         } else if (!Nome.equals(IDEquipamento)) {
            //VERIFICAMOS NA BD SE O NOME JA EXISTE
            VerificarNome = true;
        }
         
         try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            String sql = "UPDATE " + nomeTabela + " SET DESCRICAO='" + Descricao + "' WHERE IDEQUIPAMENTO=" + IDEquipamento;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            st.executeUpdate();

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void AtualizarEquipamentos(){
          String NomeEquipamento = jTextFieldRegistarEquipamento.getText();
       String DescricaoEquipamento = jTextAreaRegistarDescricao.getText();
       
       boolean mesmoEquipamento = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE NOME='" + NomeEquipamento + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO EQUIPAMENTO-> JA EXISTE");
                mesmoEquipamento = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoEquipamento = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoEquipamento == true) {
            JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "EQUIPAMENTO";
                sql = "UPDATE " + nomeTabela + " SET NOME= '"+NomeEquipamento+"', DESCRICAO_ANOMALIA= '"+DescricaoEquipamento+"' WHERE IDEQUIPAMENTO=" + IDEquipamento;

                JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Equipamento Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
    }
    
    private void ApagarEquipamento(){
        
        String Nome = jTextFieldRegistarEquipamento.getText();
        String Descricao = jTextAreaRegistarDescricao.getText();
        
         boolean VerificarNome = false;
         
         if (Nome.equals(IDEquipamento)) {
            //AQUI IGNONAMOS A  VERIFICAÇÃO DO NOME, NAO VAMOS A BD VER SE JA EXISTE
            VerificarNome = false;
         } else if (!Nome.equals(IDEquipamento)) {
            //VERIFICAMOS NA BD SE O NOME JA EXISTE
            VerificarNome = true;
        }
         
         try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            String sql = "Delete " + nomeTabela + " SET DESCRICAO='" + Descricao + "' WHERE IDEQUIPAMENTO=" + IDEquipamento;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            st.executeUpdate();

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    // Funções para Registar
    
    private void RegistarEquipamento(){
        
       String NomeEquipamento = jTextFieldRegistarEquipamento.getText();
       String DescricaoEquipamento = jTextAreaRegistarDescricao.getText();
       
       boolean mesmoEquipamento = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE NOME='" + NomeEquipamento + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO EQUIPAMENTO-> JA EXISTE");
                mesmoEquipamento = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoEquipamento = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoEquipamento == true) {
            JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "EQUIPAMENTO";
                sql = "INSERT INTO " + nomeTabela + "(NOME,DESCRICAO_ANOMALIA)" + " values(" + "'" + NomeEquipamento + "','" + DescricaoEquipamento + "')";

                JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Equipamento Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
       
    }
    
    private void RegistarEquipamentoAmbos(){
        
       String NomeEquipamento = jTextFieldRegistarEquipamentoLimpezaAmbos.getText();
       //String DescricaoEquipamento = jTextAreaRegistarDescricao.getText();
       
       boolean mesmoEquipamento = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE NOME='" + NomeEquipamento + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO EQUIPAMENTO-> JA EXISTE");
                mesmoEquipamento = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoEquipamento = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoEquipamento == true) {
            JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "EQUIPAMENTO";
              //  sql = "INSERT INTO " + nomeTabela + "(NOME,DESCRICAO_ANOMALIA)" + " values(" + "'" + NomeEquipamento + "','" + DescricaoEquipamento + "')";

                JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Equipamento Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
       
    }
    
    private void RegistarTemperaturaEquipamento (){
       // Buscar o ID do equipamento
        Equipamento = jComboBoxEquipamento.getSelectedItem().toString();
        idEquipamento = selectId("EQUIPAMENTO", "NOME", Equipamento, "IDEQUIPAMENTO");
        
        String DescricaoAnomalias = jTextAreaDescricaoAnomalias.getText();
    
        String Temperatura = jTextFieldRegistarTemperatura.getText();
        

        //LER DATA DO SISTEMA
        Date dataAtual = new Date();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String Data = formato.format(dataAtual);
        
        Date horaAtual = new Date();
        DateFormat formatoH = new SimpleDateFormat("HH:mm:ss");
        String hora = formatoH.format(horaAtual);

      
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "TEMPERATURA_EQUIPAMENTO";
                
                //sql = "INSERT INTO " + nomeTabela2 + " (TEMPERATURA,DATA,HORA,DESC_ANOMALIA)" + " values(" + "  '" + Temperatura + "','" + Data + "','" + hora + "','" + DescricaoAnomalias + "')";
                //sql = "INSERT INTO " + nomeTabela + " (TEMPERATURA,DATA,HORA,DESC_ANOMALIA)" + " values(" + "'" + Temperatura + "','" + Data + "','" + hora + "','" + DescricaoAnomalias + "')";
                sql = "INSERT INTO " + nomeTabela + " (IDFUNCIONARIO,IDEQUIPAMENTO,TEMPERATURA,DATA,HORA,DESC_ANOMALIA)" + " values(" + "" + idFuncionarioLogin + "," + idEquipamento + ",'" + Temperatura + "','" + Data + "','" + hora + "','" + DescricaoAnomalias + "')";
                JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Temperatura Gravada Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            System.out.println("IDF -> " + idFuncionarioLogin);
            System.out.println("IDE -> " + idEquipamento);
            System.out.println("Temperatura -> " + Temperatura);
            System.out.println("Data -> " + Data);
            System.out.println("hora -> " + hora);
            System.out.println("DescricaoAnomalias -> " + DescricaoAnomalias);
   }
    
     private void RegistarSuperficie (){
       // Buscar o ID do equipamento
        Compartimento = jComboBoxCompartimento.getSelectedItem().toString();
        IDCompartimento = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
        
        
    
        String Superficie = jTextFieldRegistarSuperficie.getText();
        


      
         boolean mesmaSuperficie = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "SUPERFICIE";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE NOME='" + Superficie + "' and IDCOMPARTIMENTOS= "+IDCompartimento+"";
             System.out.println("valorCompartimentos----" +IDCompartimento);       
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DA SUPERFÍCIE JÁ EXISTE");
                mesmaSuperficie = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmaSuperficie = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmaSuperficie == true) {
            JOptionPane.showMessageDialog(jDialogRegistarSuperficies, "O nome já existe");
        }else {
        
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "SUPERFICIE";
                
               
                sql = "INSERT INTO " + nomeTabela + " (IDCOMPARTIMENTOS,NOME)" + " values(" + "" + IDCompartimento + ",'" + Superficie + "')";
                JOptionPane.showMessageDialog(jDialogRegistarSuperficies, "Superficie Gravada Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            System.out.println("IDCompartimento -> " + IDCompartimento);
            System.out.println("Superficie -> " + Superficie);
        }
   }
     
      private void RegistarEquipamentoLimpeza (){
       // Buscar o ID do equipamento
        Compartimento = jComboBoxCompartimentoEquipamento.getSelectedItem().toString();
        IDCompartimento = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
        
        
    
        String Equipamento = jTextFieldRegistarEquipamentoLimpeza.getText();
        


      
         boolean mesmoEquipamento = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "SUPERFICIE";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE NOME='" + Equipamento + "' and IDCOMPARTIMENTOS= "+IDCompartimento+"";
             System.out.println("valorCompartimentos----" +IDCompartimento);       
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO EQUIPAMENTO JÁ EXISTE");
                mesmoEquipamento = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoEquipamento = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoEquipamento == true) {
            JOptionPane.showMessageDialog(jDialogRegistarSuperficies, "O nome já existe");
        }else {
        
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "SUPERFICIE";
                
               
                sql = "INSERT INTO " + nomeTabela + " (IDCOMPARTIMENTOS,NOME)" + " values(" + "" + IDCompartimento + ",'" + Equipamento + "')";
                JOptionPane.showMessageDialog(jDialogRegistarSuperficies, "Equipamento Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            System.out.println("IDCompartimento -> " + IDCompartimento);
            System.out.println("Equipamento -> " + Equipamento);
        }
   }
   
     private void RegistarHigienizacao (){

        String nomeCompartimento = jComboBoxResgistarlimpezaCompartimento.getSelectedItem().toString();
        idpesquisaCompartimento = selectId("COMPARTIMENTOS", "COMPARTIMENTOS",nomeCompartimento, "IDCOMPARTIMENTOS" );
        
        String nomeSuperficie = jComboBoxResgistarlimpezaSuperficie.getSelectedItem().toString();
        idPesquisaSuperficie = selectId("SUPERFICIE", "NOME", nomeSuperficie, "IDSUPERFICIE");
        
        String nomeProduto = jComboBoxResgistarlimpezaProduto.getSelectedItem().toString();
        idPesquisaProduto = selectId("PRODUTO", "PRODUTO", nomeProduto, "IDPRODUTO");
        
        
        Date data = jDateChooserReshitsoLimpeza.getDate();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String Data = formato.format(data);
        
 
        Date horaAtual = new Date();
        DateFormat formatoH = new SimpleDateFormat("HH:mm:ss");
        String hora = formatoH.format(horaAtual);

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "HIGIENIZACAO";
                
                
                sql = "INSERT INTO " + nomeTabela + " (IDCOMPARTIMENTOS,IDSUPERFICIE,IDPRODUTO,IDFUNCIONARIO,DATA,HORA)" + " values(" + "" + idpesquisaCompartimento + "," + idPesquisaSuperficie + "," + idPesquisaProduto + "," + idFuncionarioLogin + ",'" + Data + "','" + hora + "')";
                JOptionPane.showMessageDialog(jDialogRegistoLimpeza, "Registo de Limpeza Guardado");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            System.out.println("IDF -> " + idFuncionarioLogin);
            System.out.println("IDC -> " + idpesquisaCompartimento);
            System.out.println("IDS -> " + idPesquisaSuperficie);
            System.out.println("IDP -> " + idPesquisaProduto);
            System.out.println("Data -> " + data);
            System.out.println("hora -> " + hora);
            
   }
    
    private void RegistarHorasTrabalho (){
       
       String HorasTrabalho = jTextFieldRegistarHorasTrabalho.getText();
       
        //LER DATA DO SISTEMA
        Date dataAtual = new Date();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String Data = formato.format(dataAtual);
        
        Date horaAtual = new Date();
        DateFormat formatoH = new SimpleDateFormat("HH:mm:ss");
        String hora = formatoH.format(horaAtual);
        int IDHorasJaRegistadas = idFuncionarioLogin;
        
        boolean HorasJaRegistadas = false;
       
        
        
       
        
         try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
         
         try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            
             String sql = "SELECT * FROM " + nomeTabela + " WHERE DATA='" + Data + "' and IDFUNCIONARIO= "+IDHorasJaRegistadas+"";
             System.out.println("valor----" +IDHorasJaRegistadas);
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\n Hora já inserida");
                HorasJaRegistadas = true;
                
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            HorasJaRegistadas = false;
            System.out.println("ERROR : " + ex);

        }//FECHA CATCH

        //VER QUAL A ACÇÃO QUE VAI SER REALIZADA
        if (HorasJaRegistadas == true) {
            JOptionPane.showMessageDialog(jDialogRegistarHorasTrabalho, "Já Registou as horas de trabalho hoje");
        } else {

         try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "HORAS_TRABALHO";
                
                sql = "INSERT INTO " + nomeTabela + " (IDFUNCIONARIO,HORAS_TRABALHO,DATA,HORA)" + " values(" + "" + idFuncionarioLogin + ",'" + HorasTrabalho + "','" + Data + "','" + hora + "')";
                JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Horas de Trabalho Gravadas Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
                jDialogRegistarHorasTrabalho.setVisible(false);
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
        }
   }
    
    private void RegistarProduto(){
        
        String NomeProduto = jTextFieldRegistarProduto.getText();
       
       boolean mesmoProduto = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PRODUTO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE PRODUTO='" + NomeProduto + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO PRODUTO JA EXISTE");
                mesmoProduto = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoProduto = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoProduto == true) {
            JOptionPane.showMessageDialog(jDialogRegistarProduto, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "PRODUTO";
                sql = "INSERT INTO " + nomeTabela + "(PRODUTO)" + " values(" + "'" + NomeProduto + "')";

                JOptionPane.showMessageDialog(jDialogRegistarEquipamento, "Produto Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
        
    }
    
private void RegistarCompartimento(){
        
        String NomeCompartimento = jTextFieldRegistarCompartimento.getText();
       
       boolean mesmoCompartimento = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE COMPARTIMENTOS='" + NomeCompartimento + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO PRODUTO JA EXISTE");
                mesmoCompartimento = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoCompartimento = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoCompartimento == true) {
            JOptionPane.showMessageDialog(jDialogRegistarCompartimento, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "COMPARTIMENTOS";
                sql = "INSERT INTO " + nomeTabela + "(COMPARTIMENTOS)" + " values(" + "'" + NomeCompartimento + "')";

                JOptionPane.showMessageDialog(jDialogRegistarCompartimento, "Compartimento Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
        
    }   

   private void RegistarPlanoHigienizacao (){

        Compartimento = jComboBoxCompartimentosPH.getSelectedItem().toString();
        IDCompartimento = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
        
        
    
        String Ficheiro = jTextFieldNomePH.getText();
        


      
         boolean mesmoFicheiro = false;
       
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PLANO_HIGIENIZACAO";
            //String sql = "SELECT * FROM " + nomeTabela + " WHERE IDCOMPARTIMENTOS='" + IDCompartimento + "' and IDPLANOHIGIENIZACAO= "+IDCompartimento+"";
             String sql = "SELECT * FROM " + nomeTabela + " WHERE IDCOMPARTIMENTOS=" + IDCompartimento + "";
             System.out.println("valorCompartimentos----" +IDCompartimento);       
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO FICHEIRO JÁ EXISTE");
                mesmoFicheiro = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoFicheiro = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoFicheiro == true) {
            JOptionPane.showMessageDialog(jDialogRegistarPH, "O Plano do Compartimento já Existe");
        }else {
        
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "PLANO_HIGIENIZACAO";
                
               
                sql = "INSERT INTO " + nomeTabela + " (IDCOMPARTIMENTOS,FICHEIRO)" + " values(" + "" + IDCompartimento + ",'" + Ficheiro + "')";
                //=con.prepareStatement(sql);
                
                JOptionPane.showMessageDialog(jDialogRegistarPH, "Ficheiro Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            System.out.println("IDCompartimento -> " + IDCompartimento);
            System.out.println("Superficie -> " + Ficheiro);
        }
   }
   
    private void RegistarFT (){
     
        Produto = jComboBoxProdutoFT.getSelectedItem().toString();
        IDProduto = selectId("PRODUTO", "PRODUTO", Produto, "IDPRODUTO");
        
        
    
        String Ficheiro = jTextFieldNomeFT.getText();
        


      /*
         boolean mesmoFicheiro = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PLANO_HIGIENIZACAO";
            //String sql = "SELECT * FROM " + nomeTabela + " WHERE IDCOMPARTIMENTOS='" + IDCompartimento + "' and IDPLANOHIGIENIZACAO= "+IDCompartimento+"";
             String sql = "SELECT * FROM " + nomeTabela + " WHERE IDCOMPARTIMENTOS=" + IDCompartimento + "";
             System.out.println("valorCompartimentos----" +IDCompartimento);       
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO FICHEIRO JÁ EXISTE");
                mesmoFicheiro = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoFicheiro = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoFicheiro == true) {
            JOptionPane.showMessageDialog(jDialogRegistarPH, "O Plano do Compartimento já Existe");
        }else { */
        
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "FICHAS_TECNICAS";
                
               
                sql = "INSERT INTO " + nomeTabela + " (IDPRODUTO,FICHEIRO)" + " values(" + "" + IDProduto + ",'" + Ficheiro + "')";
                //=con.prepareStatement(sql);
                
                JOptionPane.showMessageDialog(jDialogRegistarFT, "Ficheiro Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            System.out.println("IDCompartimento -> " + IDProduto);
            System.out.println("Ficheiro -> " + Ficheiro);
        //}
   }
    
   
    private void RegistarFuncionário(){
        
        String NomeFuncionario = jTextFieldNome.getText();
        String Morada = jTextFieldMorada.getText();
        String CodPostal = jTextFieldCodigoP.getText();
        String Localidade = jTextFieldLocalidade.getText();
        String Contacto = jTextFieldConacto.getText();
        String Email = jTextFieldEmail.getText();
        String NIF = jTextFieldNIF.getText();
        //String UserName = jTextFieldUsername.getText();
        String Password = jTextFieldPassword.getText();
        //String Data_Nasc = jTextFieldDataNasc.getText();
        
        Date data = jDateChooserRegistarFuncionário.getDate();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String Data_Nasc = formato.format(data);
        
       
       
       boolean mesmoNomeFuncionario = false;
       // ver se o nome ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "FUNCIONARIO";
          //String sql = "SELECT * FROM " + nomeTabela + " WHERE USERNAME ='" + UserName + "' OR NIF =" + NIF ;
            String sql = "SELECT * FROM " + nomeTabela + " WHERE NOME='" + NomeFuncionario + "' OR NIF=" + NIF;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nO Nome do Funcionário já existe");
                mesmoNomeFuncionario = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoNomeFuncionario = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoNomeFuncionario == true) {
            JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "O Nome ou o NIF já existe");
        }else {
            
            if (!validarNif(NIF)) {
                System.out.println("Invalido");
                JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "NIF Inválido");
            } else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "FUNCIONARIO";
                sql = "INSERT INTO " + nomeTabela + "(NOME,MORADA,COD_POSTAL,LOCALIDADE,CONTACTO,EMAIL,NIF,PASSWORD,DATA_NASC)" + " values(" + "'" + NomeFuncionario + "','" + Morada + "','" + CodPostal + "','" + Localidade + "'," + Contacto + ",'" + Email + "'," + NIF + ",'" + Password + "','" + Data_Nasc + "')";

                JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Funcionário Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
        }
    }
    
    private void AtualizarFuncionário(){
        
        String NomeFuncionario = jTextFieldNome.getText();
        String Morada = jTextFieldMorada.getText();
        String CodPostal = jTextFieldCodigoP.getText();
        String Localidade = jTextFieldLocalidade.getText();
        String Contacto = jTextFieldConacto.getText();
        String Email = jTextFieldEmail.getText();
        String NIF = jTextFieldNIF.getText();
   
        String Password = jTextFieldPassword.getText();

        
        Date data = jDateChooserRegistarFuncionário.getDate();
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String Data_Nasc = formato.format(data);
        
  
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "FUNCIONARIO";
               // sql = "UPDATE  " + nomeTabela + "(NOME,MORADA,COD_POSTAL,LOCALIDADE,CONTACTO,EMAIL,NIF,PASSWORD,DATA_NASC)" + " values(" + "'" + NomeFuncionario + "','" + Morada + "','" + CodPostal + "','" + Localidade + "'," + Contacto + ",'" + Email + "'," + NIF + ",'" + Password + "','" + Data_Nasc + "')";
                sql = "UPDATE  " + nomeTabela + " SET NOME= '"+NomeFuncionario+"', MORADA= '"+Morada+"', COD_POSTAL= '"+CodPostal+"', LOCALIDADE= '"+Localidade+"', CONTACTO= "+Contacto+", EMAIL= '"+Email+"', NIF= "+NIF+", PASSWORD= '"+Password+"', DATA_NASC= '"+Data_Nasc+"' WHERE IDFUNCIONARIO=" + idFuncionario;
                JOptionPane.showMessageDialog(jDialogRegistarFuncionario, "Funcionário Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        
    }
    
     private void AtualizarProduto(){
        
        String NomeProduto = jTextFieldRegistarProduto.getText();
       
       boolean mesmoProduto = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PRODUTO";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE PRODUTO='" + NomeProduto + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO PRODUTO JA EXISTE");
                mesmoProduto = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoProduto = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoProduto == true) {
            JOptionPane.showMessageDialog(jDialogRegistarProduto, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "PRODUTO";
                String sql = "UPDATE " + nomeTabela + " SET PRODUTO='"+ NomeProduto + "' WHERE IDPRODUTO=" + IDProduto;

                JOptionPane.showMessageDialog(jDialogRegistarProduto, "Produto Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
        
    }
     
     private void AtualizarCompartimento(){
        
        String NomeCompartimento = jTextFieldRegistarCompartimento.getText();
       
       boolean mesmoCompartimento = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            String sql = "SELECT * FROM " + nomeTabela + " WHERE COMPARTIMENTOS='" + NomeCompartimento + "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DO COMPARTIMENTO JA EXISTE");
                mesmoCompartimento = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoCompartimento = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoCompartimento == true) {
            JOptionPane.showMessageDialog(jDialogRegistarCompartimento, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "COMPARTIMENTOS";
                String sql = "UPDATE " + nomeTabela + " SET COMPARTIMENTOS='"+ NomeCompartimento + "' WHERE IDCOMPARTIMENTOS=" + IDCompartimento;

                JOptionPane.showMessageDialog(jDialogRegistarCompartimento, "Compartimento Gravado Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
        
    }
     
      private void AtualizarSuperficie(){
        String SelecionarCompartimento = jComboBoxCompartimento.getSelectedItem().toString();
        String NomeSuperficie = jTextFieldRegistarSuperficie.getText();
        
       Compartimento = jComboBoxCompartimento.getSelectedItem().toString();
        IDCompartimento = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
        String Superficie = jTextFieldRegistarSuperficie.getText();
       boolean mesmoCompartimento = false;
       // ver se o nome do equipamento ja existe
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "SUPERFICIE";
             String sql = "SELECT * FROM " + nomeTabela + " WHERE NOME='" + Superficie + "' and IDCOMPARTIMENTOS= "+IDCompartimento+"";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\n\nNOME DA SUPERFICIE JÁ EXISTE");
                mesmoCompartimento = true;
            }

            st.close();
            con.close();

        } catch (SQLException ex) {
            mesmoCompartimento = false;
            System.out.println("ERROR : " + ex);

        }
       
        if (mesmoCompartimento == true) {
            JOptionPane.showMessageDialog(jDialogRegistarSuperficies, "O nome já existe");
        }else {
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "SUPERFICIE";
                String sql = "UPDATE " + nomeTabela + " SET NOME='"+ NomeSuperficie + "', IDCOMPARTIMENTOS="+IDCompartimento+" WHERE IDSUPERFICIE=" + IDSuperficie;

                JOptionPane.showMessageDialog(jDialogRegistarCompartimento, "Superfície Alterada Com Sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        }
        
        
    }
      
       private void AtualizarPH(){
        //String SelecionarCompartimento = jComboBoxCompartimento.getSelectedItem().toString();
        String NomeFICHEIRO = jTextFieldNomePH.getText();
        
       Compartimento = jComboBoxCompartimentosPH.getSelectedItem().toString();
        IDCompartimento = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
       
      
    
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "PLANO_HIGIENIZACAO";
                String sql = "UPDATE " + nomeTabela + " SET IDCOMPARTIMENTOS="+IDCompartimento+", FICHEIRO='"+ NomeFICHEIRO + "'  WHERE IDPLANOHIGIENIZACAO=" + IDPH;

                JOptionPane.showMessageDialog(jDialogRegistarPH, "Plano de Higienização guardado com sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        System.out.println("ficheiro"+NomeFICHEIRO);
        System.out.println("Compartimento"+IDCompartimento);
        System.out.println("IDPH"+IDPH);
        
        
    }
     
        private void AtualizarFT(){
        //String SelecionarCompartimento = jComboBoxCompartimento.getSelectedItem().toString();
        String NomeFICHEIRO = jTextFieldNomeFT.getText();
        
       Produto = jComboBoxProdutoFT.getSelectedItem().toString();
        IDProduto = selectId("PRODUTO", "PRODUTO", Produto, "IDPRODUTO");
       
      
    
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       
            try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
           try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "FICHAS_TECNICAS";
                String sql = "UPDATE " + nomeTabela + " SET IDPRODUTO="+IDProduto+", FICHEIRO='"+ NomeFICHEIRO + "'  WHERE IDFICHASTECNICAS=" + IDFT;

                JOptionPane.showMessageDialog(jDialogRegistarFT, "Ficha Técnica Atualizada com sucesso !");

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                st.close();
                con.close();
            } catch (SQLException ex2) {
                System.err.println("SQLException: " + ex2.getMessage());
            } 
            
        System.out.println("ficheiro"+NomeFICHEIRO);
        System.out.println("Compartimento"+IDProduto);
        System.out.println("IDPH"+IDFT);
        
        
    }
     
      
    //Funções para Consultar 
    private void PesquisarHorasAdmin() {
         // DADOS A EPSQUISAR

        String horas_trabalho = "";
        String data = "";
        String hora = "";
        //String pesquisa = jDateChooserConsultarHorasAdminIni.getDateFormatString();
      

        model = (DefaultTableModel) jTableConsultarHorasAdmin.getModel();

        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            String DataIni = sdf.format(jDateChooserConsultarHorasAdminIni.getDate());;
            String DataFim = sdf.format(jDateChooserConsultarHorasAdminFim.getDate());;
            //sql = "select * from " + nomeTabela + " where (HORAS_TRABALHO like '%" + pesquisa + "%') ";
            sql = "select * from " + nomeTabela + " where where DATA between '" + DataIni + "' and '" + DataFim+ "'";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                horas_trabalho = rs.getString("HORAS_TRABALHO");
                data = rs.getString("DATA");
                hora = rs.getString("HORA");

                //guardar dados num arraylist e adicionalos a tabela
                model.addRow(new Object[]{horas_trabalho, data, hora});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

    }
     
    private void PesquisarTemperaturaEquipamento(){
       
       model = (DefaultTableModel) jTableConsultarTemperaturaEquipamento.getModel();
       
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "TEMPERATURA_EQUIPAMENTO";
            String Temperatura = "";
            String Data = "";
            String Hora = "";
            String Desc_Anomalia = "";
            //if (idPesquisaEquipamento !=0 ) {
                //VAMOS PESQUISAR SO PELO FORNECEDOR
                sql = "SELECT * FROM " + nomeTabela + " WHERE IDEQUIPAMENTO=" + idPesquisaEquipamento;
                System.out.println("SELECIONE EQUIPAMENTO");
      /* }*//*else{
                sql = "SELECT * FROM " + nomeTabela + " WHERE IDEQUIPAMENTO=" + idPesquisaEquipamento ;
                System.out.println("SELECT FORNCEDOR e MATERIA PRIMA");
            }*/
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                Temperatura = rs.getString("TEMPERATURA");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
                Desc_Anomalia = rs.getString("DESC_ANOMALIA");
                
                 model.addRow(new Object[]{Temperatura, Data, Hora, Desc_Anomalia});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
   }
    
    private void PesquisarSuperficie(){
       
       model = (DefaultTableModel) jTableConsultarSuperficie.getModel();
       
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "SUPERFICIE";
            String Superficie = "";
            
            //if (idPesquisaEquipamento !=0 ) {
                //VAMOS PESQUISAR SO PELO FORNECEDOR
                sql = "SELECT * FROM " + nomeTabela + " WHERE IDCOMPARTIMENTOS=" + idCompartimentos;
                System.out.println("SELECIONE COMPARTIMENTO");
      /* }*//*else{
                sql = "SELECT * FROM " + nomeTabela + " WHERE IDEQUIPAMENTO=" + idPesquisaEquipamento ;
                System.out.println("SELECT FORNCEDOR e MATERIA PRIMA");
            }*/
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                Superficie = rs.getString("NOME");
               
                
                 model.addRow(new Object[]{Superficie});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
   }
   
    private void PesquisarHorasTrabalhoFuncionarioAdmin(){
       
       model = (DefaultTableModel) jTableConsultarHorasAdmin.getModel();
      
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            String HorasTrabalho = "";
            String Data = "";
            String Hora = "";
            String DataIni = sdf.format(jDateChooserConsultarHorasAdminIni.getDate());;
            String DataFim = sdf.format(jDateChooserConsultarHorasAdminFim.getDate());;
            //if (idPesquisaEquipamento !=0 ) {
                //VAMOS PESQUISAR SO PELO FORNECEDOR
                //sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idPesquisaFuncionario;
            //
                //if(idPesquisaFuncionario == 0)
               // {
                //if(jButtonConsultarHorasAdmin.isCursorSet()){
                  //  sql = "select * from "+nomeTabela+" where IDFUNCIONARIO=" + idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
                //}else{
                    sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idPesquisaFuncionario;
                //}
                     //   sql = "select * from "+nomeTabela+" where DATA between '" + DataIni + "' and '" + DataFim + "'";
                    //}else{
                     //   sql = "select * from "+nomeTabela+" where IDFUNCIONARIO=" + idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
                   // } 
                
                System.out.println("Selecione o Funcionario");
     
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                HorasTrabalho = rs.getString("HORAS_TRABALHO");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
                
                
                 model.addRow(new Object[]{HorasTrabalho, Data, Hora});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
       System.out.println("IDDDDDDDDDD"+ idPesquisaFuncionario);
   }
    
    private void PesquisarTemperaturasEquipamento(){
       
       model = (DefaultTableModel) jTableConsultarTemperaturaEquipamento.getModel();
      
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "TEMPERATURA_EQUIPAMENTO";
             String Temperatura = "";
        String Desc_Anomalia = "";
            String Data = "";
            String Hora = "";
            
           
                    sql = "SELECT * FROM " + nomeTabela + " WHERE IDEQUIPAMENTO=" + idPesquisaEquipamento;
               
                
                System.out.println("Selecione o Funcionario");
     
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                Temperatura = rs.getString("TEMPERATURA");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
                Desc_Anomalia = rs.getString("DESC_ANOMALIA");
                
                 model.addRow(new Object[]{Temperatura, Data, Hora, Desc_Anomalia});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    
   }
    
    private void PesquisarHorasTrabalhoFuncionarioAdminPorData(){
       
       model = (DefaultTableModel) jTableConsultarHorasAdmin.getModel();
 
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            String HorasTrabalho = "";
            String Data = "";
            String Hora = "";
            String DataIni = sdf.format(jDateChooserConsultarHorasAdminIni.getDate());;
            String DataFim = sdf.format(jDateChooserConsultarHorasAdminFim.getDate());;
           
            //sql = "select * from "+nomeTabela+" where IDFUNCIONARIO=" + idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
            sql = "SELECT * FROM " + nomeTabela + " where IDFUNCIONARIO =" +idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
//if (idPesquisaEquipamento !=0 ) {
                //VAMOS PESQUISAR SO PELO FORNECEDOR
               // sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idPesquisaFuncionario;
            //
            
           
            
               // if(idPesquisaFuncionario == -1)
                //{
                        //sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idPesquisaFuncionario;
                        //sql = "select * from "+nomeTabela+" where DATA between '" + DataIni + "' and '" + DataFim + "'";
                    //}else{
                        
                    //} 
                
                System.out.println("Selecione o Funcionario");
     
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                HorasTrabalho = rs.getString("HORAS_TRABALHO");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
                
                
                 model.addRow(new Object[]{HorasTrabalho, Data, Hora});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
       System.out.println("botao"+ idPesquisaFuncionario);
   }
    
     private void PesquisarLimpeza(){
       
       model = (DefaultTableModel) jTableConsultarLimpeza.getModel();
      
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "HIGIENIZACAO";
            String nomeCompartimento= "";
            String nomeSuperficie= "";
            String nomeProduto= "";
            int idCompartimento= 0;
            int idSuperficie= 0;
            int idProduto= 0;
            String Data = "";
            String Hora = "";
            
           
         
            //if (idPesquisaEquipamento !=0 ) {
                //VAMOS PESQUISAR SO PELO FORNECEDOR
                //sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idPesquisaFuncionario;
            //
                //if(idPesquisaFuncionario == 0)
               // {
                //if(jButtonConsultarHorasAdmin.isCursorSet()){
                  //  sql = "select * from "+nomeTabela+" where IDFUNCIONARIO=" + idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
                //}else{
                    sql = "SELECT * FROM " + nomeTabela + " WHERE IDFUNCIONARIO=" + idPesquisaFuncionario;
                //}
                     //   sql = "select * from "+nomeTabela+" where DATA between '" + DataIni + "' and '" + DataFim + "'";
                    //}else{
                     //   sql = "select * from "+nomeTabela+" where IDFUNCIONARIO=" + idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
                   // } 
                
                System.out.println("Selecione o Funcionario");
     
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                
                idCompartimento = rs.getInt("IDCOMPARTIMENTOS");
                nomeCompartimento = selectString("COMPARTIMENTOS", "IDCOMPARTIMENTOS", idCompartimento,"COMPARTIMENTOS");
                
                idSuperficie = rs.getInt("IDSUPERFICIE");
                nomeSuperficie = selectString("SUPERFICIE", "IDSUPERFICIE", idSuperficie,"NOME");
                
                idProduto = rs.getInt("IDPRODUTO");
                nomeProduto = selectString("PRODUTO", "IDPRODUTO", idProduto,"PRODUTO");
                
                
                
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
                
                 
                 model.addRow(new Object[]{nomeSuperficie,nomeProduto, Data, Hora});
                 
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
       System.out.println("IDDDDDDDDDD"+ idPesquisaFuncionario);
   }
    
    private void PesquisarLimpezasFuncionarioPorData(){
       
       model = (DefaultTableModel) jTableConsultarLimpeza.getModel();
 
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "HIGIENIZACAO";
            
             String nomeSuperficie= "";
            String nomeProduto= "";
            String nomeCompartimento= "";
            String nomeFuncionario="";
            int idCompartimento=0;
            int idSuperficie= 0;
            int idProduto= 0;
            int idFuncionario=0;
            String Data = "";
            String mesma = Data;
            String Hora = "";
            String DataIni = sdf.format(jDateChooserConsultarLimpezaIni.getDate());;
            String DataFim = sdf.format(jDateChooserConsultarLimpezaFim.getDate());;
            String separador ="--------------";
             String espaço =" ";
      
            //sql = "select * from "+nomeTabela+" where IDFUNCIONARIO=" + idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
            sql = "SELECT * FROM " + nomeTabela + " where DATA between '" + DataIni + "' and '" + DataFim + "' order by DATA";
            // sql = "SELECT * FROM " + nomeTabela + " where IDFUNCIONARIO =" +idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
                
                System.out.println("Selecione o Funcionario");
     
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                idFuncionario = rs.getInt("IDFUNCIONARIO");
                nomeFuncionario = selectString("FUNCIONARIO", "IDFUNCIONARIO", idFuncionario,"NOME");
                
                idCompartimento = rs.getInt("IDCOMPARTIMENTOS");
                nomeCompartimento = selectString("COMPARTIMENTOS", "IDCOMPARTIMENTOS", idCompartimento,"COMPARTIMENTOS");
                
                idSuperficie = rs.getInt("IDSUPERFICIE");
                nomeSuperficie = selectString("SUPERFICIE", "IDSUPERFICIE", idSuperficie,"NOME");
                
                idProduto = rs.getInt("IDPRODUTO");
                nomeProduto = selectString("PRODUTO", "IDPRODUTO", idProduto,"PRODUTO");
                
                
                
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
              
              // model.addRow(new Object[]{Data});
                //model.addRow(new Object[]{nomeFuncionario,nomeCompartimento,nomeSuperficie,nomeProduto, Hora});
                

                
                String s ="" ;
    boolean exists = false;
    for (int i = 0; i < jTableConsultarLimpeza.getRowCount(); i++) {
        s = jTableConsultarLimpeza.getValueAt(i, 0).toString();

        if (Data.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Invoice Details First");
        } else {
            if (Data.equals(s)) {
                exists = true;
                break;
            }
        }
    }
    if (!exists) {
        DefaultTableModel dd = (DefaultTableModel) jTableConsultarLimpeza.getModel();
        Vector v = new Vector();
        v.add(Data);
        v.add(nomeFuncionario);
        v.add(nomeCompartimento);
        v.add(nomeSuperficie);
        v.add(nomeProduto);
        v.add(Hora);
       
        dd.addRow(v);
    } else {
        DefaultTableModel dd = (DefaultTableModel) jTableConsultarLimpeza.getModel();
        Vector v = new Vector();
        
        v.add(espaço);
//        v.add(Data);
       v.add(nomeFuncionario);
        v.add(nomeCompartimento);
        v.add(nomeSuperficie);
        v.add(nomeProduto);
        v.add(Hora);
         dd.addRow(v);
       
    }
                 
                
                
              
                
                 //model.addRow(new Object[]{espaço});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
       System.out.println("botao"+ idPesquisaFuncionario);
   }
    
     private void PesquisarLimpezasFuncionarioPorData2(){
       
       model = (DefaultTableModel) jTableConsultarLimpeza.getModel();
 
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
       try {
           
           con = DriverManager.getConnection(url);
            String nomeTabela = "HIGIENIZACAO";
            
             String nomeSuperficie= "";
            String nomeProduto= "";
            String nomeCompartimento= "";
            String nomeFuncionario="";
            int idCompartimento=0;
            int idSuperficie= 0;
            int idProduto= 0;
            int idFuncionario=0;
            String Data = "";
            String mesma = Data;
            String Hora = "";
            String DataIni = sdf.format(jDateChooserConsultarLimpezaIni.getDate());;
            String DataFim = sdf.format(jDateChooserConsultarLimpezaFim.getDate());;
            String separador ="--------------";
             String espaço =" ";
      
            //sql = "select * from "+nomeTabela+" where IDFUNCIONARIO=" + idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
            sql = "SELECT * FROM " + nomeTabela + " where DATA= '" + DataIni + "'"; 
            //String sql = "SELECT * FROM " + nomeTabela + " where IDEQUIPAMENTO= idEquipamento";            
            // sql = "SELECT * FROM " + nomeTabela + " where IDFUNCIONARIO =" +idPesquisaFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
                
                System.out.println("Selecione o Funcionario");
     
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                idFuncionario = rs.getInt("IDFUNCIONARIO");
                nomeFuncionario = selectString("FUNCIONARIO", "IDFUNCIONARIO", idFuncionario,"NOME");
                
                idCompartimento = rs.getInt("IDCOMPARTIMENTOS");
                nomeCompartimento = selectString("COMPARTIMENTOS", "IDCOMPARTIMENTOS", idCompartimento,"COMPARTIMENTOS");
                
                idSuperficie = rs.getInt("IDSUPERFICIE");
                nomeSuperficie = selectString("SUPERFICIE", "IDSUPERFICIE", idSuperficie,"NOME");
                
                idProduto = rs.getInt("IDPRODUTO");
                nomeProduto = selectString("PRODUTO", "IDPRODUTO", idProduto,"PRODUTO");
                
                
                
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
               
               //model.addRow(new Object[]{Data});
              // model.insertRow(0, new Object[]{Data});
                 model.addRow(new Object[]{nomeFuncionario,nomeCompartimento,nomeSuperficie,nomeProduto, Hora});
               
              
                
                 //model.addRow(new Object[]{espaço});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
       System.out.println("botao"+ idPesquisaFuncionario);
   }
    
    private void PesquisaProduto() {
         // DADOS A EPSQUISAR

        String nome = "";
        String pesquisa = jTextFieldPesquisarConsultaProduto.getText();

        model = (DefaultTableModel) jTableConsultarProdutos.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "PRODUTO";
        
             sql = "select * from " + nomeTabela + " where (PRODUTO like '%" + pesquisa + "%')";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                nome = rs.getString("PRODUTO");
                

                //guardar dados num arraylist e adicionalos a tabela
                model.addRow(new Object[]{nome});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

    }
    
    private void PesquisaCompartimento() {
         // DADOS A EPSQUISAR

        String nome = "";
        String pesquisa = jTextFieldPesquisarConsultaCompartimento.getText();

        model = (DefaultTableModel) jTableConsultarCompartimento.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
        
             sql = "select * from " + nomeTabela + " where (COMPARTIMENTOS like '%" + pesquisa + "%')";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                nome = rs.getString("COMPARTIMENTOS");
                

                //guardar dados num arraylist e adicionalos a tabela
                model.addRow(new Object[]{nome});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

    }
    
     private void PesquisaEquipamento() {
       

        String nome = "";
        String pesquisa = jTextFieldPesquisarConsultarEquipamento.getText();

        model = (DefaultTableModel) jTableConsultarEquipamento.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            
             sql = "select * from " + nomeTabela + " where (NOME like '%" + pesquisa + "%')";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                nome = rs.getString("NOME");
                

                //guardar dados num arraylist e adicionalos a tabela
                model.addRow(new Object[]{nome});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

    }
   
    private void ConsultarTemperaturaEquipamento(){
        
       //Equipamento = jComboBoxConsultarTemperaturaEquipamento.getSelectedItem().toString(); 
       //idEquipamento = selectId("EQUIPAMENTO", "NOME", Equipamento, "IDEQUIPAMENTO");
       
        String Temperatura = "";
        String Desc_Anomalia = "";
        String Data = "";
        String Hora = "";
        
        model = (DefaultTableModel) jTableConsultarTemperaturaEquipamento.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "TEMPERATURA_EQUIPAMENTO";
        
               
               
            String sql = "SELECT * FROM " + nomeTabela + " where IDEQUIPAMENTO= idEquipamento";
           // String sql = "SELECT * FROM TEMPERATURA_EQUIPAMENTO";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Temperatura = rs.getString("TEMPERATURA");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
                Desc_Anomalia = rs.getString("DESC_ANOMALIA");

                model.addRow(new Object[]{Temperatura, Data, Hora, Desc_Anomalia});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void ConsultarSuperficie(){
        
       //Equipamento = jComboBoxConsultarTemperaturaEquipamento.getSelectedItem().toString(); 
       //idEquipamento = selectId("EQUIPAMENTO", "NOME", Equipamento, "IDEQUIPAMENTO");
        Compartimento = jComboBoxConsultarSuperficie.getSelectedItem().toString();
        idCompartimentos = selectId("COMPARTIMENTOS", "COMPARTIMENTOS", Compartimento, "IDCOMPARTIMENTOS");
        String Superficie = "";
        
        
        model = (DefaultTableModel) jTableConsultarSuperficie.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "SUPERFICIE";
        
               
               
            String sql = "SELECT * FROM " + nomeTabela + " where IDCOMPARTIMENTOS = idCompartimentos";
           // String sql = "SELECT * FROM TEMPERATURA_EQUIPAMENTO";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Superficie = rs.getString("NOME");
               
               

                model.addRow(new Object[]{Superficie});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
   
    private void ConsultarEquipamento () {
        
        String nomeEquipamento = "";
        String descricaoEquipamento = "";

        model = (DefaultTableModel) jTableConsultarEquipamento.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "EQUIPAMENTO";
            String sql = "SELECT * FROM " + nomeTabela + "";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                nomeEquipamento = rs.getString("NOME");
                descricaoEquipamento = rs.getString("DESCRICAO_ANOMALIA");

                model.addRow(new Object[]{nomeEquipamento, descricaoEquipamento});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void ConsultarHorasTrabalhoTodas(){
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        String HorasTrabalho = "";
        String Data = "";
        String Hora = "";
       // NomeFuncionario = jComboBoxLogin.getSelectedItem().toString();
        //idFuncionario = selectId("FUNCIONARIO", "NOME", NomeFuncionario, "IDFUNCIONARIO");
        
         //NomeFuncionario = jLabelConsultarHorasTrabalhoFuncionário.getText();
         idFuncionario = selectId("FUNCIONARIO", "NOME", NomeFuncionarioLogin, "IDFUNCIONARIO");
        
         System.out.println("id"+idFuncionario);
         model = (DefaultTableModel) jTableConsultarHorasTrabalho.getModel();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            
            //FAZER O SELECT DO FUNCIONARIO QUE FEZ O LOGIN
            sql = "SELECT * FROM " + nomeTabela + " where IDFUNCIONARIO =" +idFuncionario;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                HorasTrabalho = rs.getString("HORAS_TRABALHO");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");

                model.addRow(new Object[]{HorasTrabalho, Data, Hora});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void ConsultarHorasTrabalhoPorData(){
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        String HorasTrabalho = "";
        String Data = "";
        String Hora = "";
        
        String DataFim = sdf.format(jDateChooserHorasFim.getDate());
        String DataIni= sdf.format(jDateChooserHorasIni.getDate());
       // NomeFuncionario = jComboBoxLogin.getSelectedItem().toString();
        //idFuncionario = selectId("FUNCIONARIO", "NOME", NomeFuncionario, "IDFUNCIONARIO");
        
         //NomeFuncionario = jLabelConsultarHorasTrabalhoFuncionário.getText();
         idFuncionario = selectId("FUNCIONARIO", "NOME", NomeFuncionarioLogin, "IDFUNCIONARIO");
        
         System.out.println("id"+idFuncionario);
         model = (DefaultTableModel) jTableConsultarHorasTrabalho.getModel();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            
            //FAZER O SELECT DO FUNCIONARIO QUE FEZ O LOGIN
            
            
                
            sql = "SELECT * FROM " + nomeTabela + " where IDFUNCIONARIO =" +idFuncionario+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
            
            
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                HorasTrabalho = rs.getString("HORAS_TRABALHO");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");

                model.addRow(new Object[]{HorasTrabalho, Data, Hora});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
     private void ConsultarTemperaturasPorData(){
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        String Temperatura = "";
        String Desc_Anomalia = "";
        String Data = "";
        String Hora = "";
        
        
        String DataIni= sdf.format(jDateChooserTemperaturaIni1.getDate());
        String DataFim = sdf.format(jDateChooserTemperaturaFim1.getDate());
       
         
         model = (DefaultTableModel) jTableConsultarTemperaturaEquipamento.getModel();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "TEMPERATURA_EQUIPAMENTO";
            
          
                
            sql = "SELECT * FROM " + nomeTabela + " where IDEQUIPAMENTO =" +idPesquisaEquipamento+ " and DATA between '" + DataIni + "' and '" + DataFim + "'";
            
            
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                Temperatura = rs.getString("TEMPERATURA");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");
                Desc_Anomalia = rs.getString("DESC_ANOMALIA");

                model.addRow(new Object[]{Temperatura, Data, Hora, Desc_Anomalia});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
   
    private void ConsultarHorasTrabalhoantigo(){
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        String HorasTrabalho = "";
        String Data = "";
        String Hora = "";
       // NomeFuncionario = jComboBoxLogin.getSelectedItem().toString();
        //idFuncionario = selectId("FUNCIONARIO", "NOME", NomeFuncionario, "IDFUNCIONARIO");
        
         //NomeFuncionario = jLabelConsultarHorasTrabalhoFuncionário.getText();
         idFuncionario = selectId("FUNCIONARIO", "NOME", NomeFuncionarioLogin, "IDFUNCIONARIO");
        
         System.out.println("id"+idFuncionario);
         model = (DefaultTableModel) jTableConsultarHorasAdmin.getModel();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            
            //FAZER O SELECT DO FUNCIONARIO QUE FEZ O LOGIN
            //sql = "SELECT * FROM " + nomeTabela + " where IDFUNCIONARIO =" +idFuncionario;
            sql = "SELECT * FROM " + nomeTabela + " ";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                HorasTrabalho = rs.getString("HORAS_TRABALHO");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");

                model.addRow(new Object[]{HorasTrabalho, Data, Hora});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void ConsultarHorasTrabalhoAdmin(){
    
        Funcionario = jComboBoxConsultarHoras.getSelectedItem().toString();
        idFuncionario = selectId("FUNCIONARIO", "NOME", Funcionario, "IDFUNCIONARIO");
        String HorasTrabalho = "";
        String Data = "";
        String Hora = "";
    
        model = (DefaultTableModel) jTableConsultarHorasAdmin.getModel();
        
         try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "HORAS_TRABALHO";
            
            
             //" where IDFUNCIONARIO = idFuncionario " 
            //sql = "select * from " + nomeTabela + " where DATA between '" + DataIni + "' and '" + DataFim+ "'";
           // String sql = "SELECT * FROM TEMPERATURA_EQUIPAMENTO";
             sql = "SELECT * FROM " + nomeTabela + "";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                HorasTrabalho = rs.getString("HORAS_TRABALHO");
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");

                model.addRow(new Object[]{HorasTrabalho, Data, Hora});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
}
    
    private void ConsultarProduto () {
        
        String nomeProduto = "";
       
        model = (DefaultTableModel) jTableConsultarProdutos.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PRODUTO";
            String sql = "SELECT * FROM " + nomeTabela + "";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                nomeProduto = rs.getString("PRODUTO");
                
               
                model.addRow(new Object[]{nomeProduto});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
     private void ConsultarCompartimento () {
        
        String nomeCompartimento = "";

        model = (DefaultTableModel) jTableConsultarCompartimento.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "COMPARTIMENTOS";
            String sql = "SELECT * FROM " + nomeTabela + "";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                nomeCompartimento = rs.getString("COMPARTIMENTOS");
                

                model.addRow(new Object[]{nomeCompartimento});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void ConsultarUtilizador () {
        
        String nomeUtilizador = "";

        model = (DefaultTableModel) jTableAtualizarUtilizador.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "FUNCIONARIO";
            String sql = "SELECT * FROM " + nomeTabela + "";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                nomeUtilizador = rs.getString("NOME");
                

                model.addRow(new Object[]{nomeUtilizador});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
     private void ConsultarRegistodeLimpezaFuncionario(){
        System.out.println("idfuncionario -> " + idFuncionarioLogin);
        String nomeSuperficie= "";
        String nomeProduto= "";
        int idSuperficie= 0;
        int idProduto= 0;
        String Data = "";
        String Hora = "";
        
        //String nomeSuperficie = jComboBoxResgistarlimpezaSuperficie.getSelectedItem().toString();
        //idPesquisaSuperficie = selectId("SUPERFICIE", "SUPERFICIE", nomeSuperficie, "IDSUPERFICIE");
        
        //String nomeProduto = jComboBoxResgistarlimpezaProduto.getSelectedItem().toString();
        //idPesquisaProduto = selectId("PRODUTO", "PRODUTO", nomeProduto, "IDPRODUTO");
        
         System.out.println("id"+idFuncionario);
       //  model = (DefaultTableModel) jTableRegitarLimpeza.getModel();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "HIGIENIZACAO";
            
            //FAZER O SELECT DO FUNCIONARIO QUE FEZ O LOGIN
            sql = "SELECT * FROM " + nomeTabela + " where IDFUNCIONARIO =" +idFuncionarioLogin;
            //sql = "SELECT HIGIENIZACAO .* FROM HIGIENIZACAO Inner Join SUPERFICIE ON HIGIENIZACAO.IDSUPERFICIE = SUPERFICIE.IDSUPERFICIE ORDER BY SUPERFICIE.SUPERFICIE";
             //sql = "SELECT SUPERFICIE .* FROM SUPERFICIE Inner Join HIGIENIZACAO ON SUPERFICIE.IDSUPERFICIE = HIGIENIZACAO.IDSUPERFICIE";
         
            
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
               // nomeSuperficie = rs.getString("SUPERFICIE");
               // nomeProduto = rs.getString("IDPRODUTO");
                idSuperficie = rs.getInt("IDSUPERFICIE");
                nomeSuperficie = selectString("SUPERFICIE", "IDSUPERFICIE", idSuperficie,"SUPERFICIE");
                
                idProduto = rs.getInt("IDPRODUTO");
                nomeProduto = selectString("PRODUTO", "IDPRODUTO", idProduto,"PRODUTO");
                
                
                
                Data = rs.getString("DATA");
                Hora = rs.getString("HORA");

                model.addRow(new Object[]{nomeSuperficie,nomeProduto, Data, Hora});
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
     
     private void ConsultarPH(){
        
      
        String Ficheiro = "";
        int idCompartimento= 0;
        String nomeCompartimento= "";
        
        model = (DefaultTableModel) jTableConsultarPH1.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PLANO_HIGIENIZACAO";
        
               String sql = "SELECT * FROM " + nomeTabela ;
               
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                
                Ficheiro = rs.getString("FICHEIRO");
               
               idCompartimento = rs.getInt("IDCOMPARTIMENTOS");
                nomeCompartimento = selectString("COMPARTIMENTOS", "IDCOMPARTIMENTOS", idCompartimento,"COMPARTIMENTOS");

                model.addRow(new Object[]{nomeCompartimento, Ficheiro});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
     
     private void ConsultarFT(){
        
      
        String Ficheiro = "";
        int idProduto= 0;
        String nomeProduto= "";
        
        model = (DefaultTableModel) jTableConsultarFT.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "FICHAS_TECNICAS";
        
               String sql = "SELECT * FROM " + nomeTabela ;
               
            //String sql = "SELECT * FROM " + nomeTabela + " where IDCOMPARTIMENTOS = idCompartimentos";
           // String sql = "SELECT * FROM TEMPERATURA_EQUIPAMENTO";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                
                Ficheiro = rs.getString("FICHEIRO");
               
               idProduto = rs.getInt("IDPRODUTO");
                nomeProduto = selectString("PRODUTO", "IDPRODUTO", idProduto,"PRODUTO");

                model.addRow(new Object[]{nomeProduto, Ficheiro});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
       private void ConsultarPH2(){
        
      
        String Ficheiro = "";
        int idCompartimento= 0;
        String nomeCompartimento= "";
        
        model = (DefaultTableModel) jTableConsultarPH.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "PLANO_HIGIENIZACAO";
        
               String sql = "SELECT * FROM " + nomeTabela ;
               
            //String sql = "SELECT * FROM " + nomeTabela + " where IDCOMPARTIMENTOS = idCompartimentos";
           // String sql = "SELECT * FROM TEMPERATURA_EQUIPAMENTO";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                
                Ficheiro = rs.getString("FICHEIRO");
               
               idCompartimento = rs.getInt("IDCOMPARTIMENTOS");
                nomeCompartimento = selectString("COMPARTIMENTOS", "IDCOMPARTIMENTOS", idCompartimento,"COMPARTIMENTOS");

                model.addRow(new Object[]{nomeCompartimento, Ficheiro});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
       
         private void ConsultarFT2(){
        
      
        String Ficheiro = "";
        int idProduto= 0;
        String nomeProduto= "";
        
        model = (DefaultTableModel) jTableConsultarEditarFT.getModel();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }

        try {

            con = DriverManager.getConnection(url);
            String nomeTabela = "FICHAS_TECNICAS";
        
               String sql = "SELECT * FROM " + nomeTabela ;
               
            //String sql = "SELECT * FROM " + nomeTabela + " where IDCOMPARTIMENTOS = idCompartimentos";
           // String sql = "SELECT * FROM TEMPERATURA_EQUIPAMENTO";
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                
                Ficheiro = rs.getString("FICHEIRO");
               
               idProduto = rs.getInt("IDPRODUTO");
                nomeProduto = selectString("PRODUTO", "IDPRODUTO", idProduto,"PRODUTO");

                model.addRow(new Object[]{nomeProduto, Ficheiro});
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

     public void toExcel(JTable jTableConsultarHorasAdmin, File file){
    try{
        
        TableModel model = jTableConsultarHorasAdmin.getModel();
        FileWriter excel = new FileWriter(file);

        for(int i = 0; i < model.getColumnCount(); i++){
            excel.write(model.getColumnName(i) + "\t");
        }

        excel.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                excel.write(model.getValueAt(i,j).toString()+"\t");
            }
            excel.write("\n");
        }

        excel.close();

    }catch(IOException e){ System.out.println(e); }
}
     public void toExcel2(JTable jTableConsultarLimpeza, File file){
    try{
        
        TableModel model = jTableConsultarLimpeza.getModel();
        FileWriter excel = new FileWriter(file);

        for(int i = 0; i < model.getColumnCount(); i++){
            excel.write(model.getColumnName(i) + "\t");
        }

        excel.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                excel.write(model.getValueAt(i,j).toString()+"\t");
            }
            excel.write("\n");
        }

        excel.close();

    }catch(IOException e){ System.out.println(e); }
}
//Funções para Limpar Campos
    
      private void LimpaCamposComboBoxSup() {
       

        

        jComboBoxResgistarlimpezaSuperficie.setVisible(true);
        jComboBoxResgistarlimpezaSuperficie.setSelectedIndex(0);

        jComboBoxResgistarlimpezaCompartimento.setSelectedIndex(0);

        
    }
     
    private void LimparRegistarEquipamento () {
        jTextFieldRegistarEquipamento.setText("");
        jTextAreaRegistarDescricao.setText("");
    }
    
    private void LimparRegistarTemperaturaEquipamento () {
        jTextFieldRegistarTemperatura.setText("");
        jTextAreaDescricaoAnomalias.setText("");
    }
    
     private void LimparRegistarSuperficie () {
        jTextFieldRegistarSuperficie.setText("");
       
    }
     
      private void LimparRegistarEquipamentoLimpeza () {
        jTextFieldRegistarEquipamentoLimpeza.setText("");
       
    }
    
    private void LimparConsultasEquipamento () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarEquipamento.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
    private void LimparConsultasTemperaturaEquipamento () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarTemperaturaEquipamento.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
    private void LimparConsultasSuperficies () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarSuperficie.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
    private void LimparConsultasHorasTrabalhoFuncionario () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarHorasTrabalho.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
    private void LimparConsultasProduto () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarProdutos.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
    private void LimparConsultasCompartimentos () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarCompartimento.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
     
    
    private void LimparConsultasUtilizador () {
        DefaultTableModel model = (DefaultTableModel) jTableAtualizarUtilizador.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
      private void LimparConsultasLimpezas () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarLimpeza.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
     private void LimparConsultasHorasTrabalhoFuncionarioAdmin () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarHorasAdmin.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
    private void LimparRegistarHorasTrabalho () {
        jTextFieldRegistarHorasTrabalho.setText("");
        
    }
     private void LimparRegistarPH () {
        jTextFieldNomePH.setText("");
        
    }
     
      private void LimparRegistarFT () {
        jTextFieldNomeFT.setText("");
        
    }
     
    private void LimparRegistarProduto () {
        
    jTextFieldRegistarProduto.setText("");
    }
    
     private void LimparRegistarCompartimento () {
        
    jTextFieldRegistarCompartimento.setText("");
    }
    
    /* private void LimparRegistoLimpeza () {
        DefaultTableModel model = (DefaultTableModel) jTableRegitarLimpeza.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }*/
     private void LimparCnPH () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarPH.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
     
     private void LimparCnEditarFT () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarEditarFT.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
     
     private void LimparCnFT () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarFT.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
     
     private void LimparCnPH2 () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarPH1.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
     
     private void LimparConsultaLimpeza () {
        DefaultTableModel model = (DefaultTableModel) jTableConsultarLimpeza.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++){
            model.removeRow(0);
        }
    }
    
    private void LimparResgitarFuncionario () {
        
    
     jTextFieldNome.setText("");
     jTextFieldMorada.setText("");
     jTextFieldCodigoP.setText("");
     jTextFieldLocalidade.setText("");
     jTextFieldConacto.setText("");
     jTextFieldEmail.setText("");
     jTextFieldNIF.setText("");
     
     jTextFieldPassword.setText("");
    }
    //Funçoes acabam aqui----------------------------------------
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
            java.util.logging.Logger.getLogger(Higienizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Higienizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Higienizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Higienizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Higienizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizarCompartimento;
    private javax.swing.JButton buttonAtualizarEquipamentoLimpeza;
    private javax.swing.JButton buttonAtualizarEquipamentoLimpeza1;
    private javax.swing.JButton buttonAtualizarFuncionario;
    private javax.swing.JButton buttonAtualizarProduto;
    private javax.swing.JButton buttonAtualizarSuperficie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterarEquipamento;
    private javax.swing.JButton jButtonAtualizarFT;
    private javax.swing.JButton jButtonAtualizarFuncionario;
    private javax.swing.JButton jButtonAtualizarPH;
    private javax.swing.JButton jButtonCnFichasTecnicasProdutos;
    private javax.swing.JButton jButtonCnFichasTecnicasProdutos1;
    private javax.swing.JButton jButtonCnHorasTrabalho;
    private javax.swing.JButton jButtonCnPlanoHigienizacao;
    private javax.swing.JButton jButtonCnProduto;
    private javax.swing.JButton jButtonCnProduto1;
    private javax.swing.JButton jButtonCnRegistoLimpezas;
    private javax.swing.JButton jButtonCnSuperficies;
    private javax.swing.JButton jButtonCnTemperaturasEquipamentos;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonConsultarHorasAdmin;
    private javax.swing.JButton jButtonConsultarHorasTrbalhoAdmin;
    private javax.swing.JButton jButtonConsultarLimpeza;
    private javax.swing.JButton jButtonConsultarTodasHoras;
    private javax.swing.JButton jButtonConsultarTodasLaiampeza;
    private javax.swing.JButton jButtonEDTFT;
    private javax.swing.JButton jButtonEDTPH;
    private javax.swing.JButton jButtonEditarConsultarCompartimento;
    private javax.swing.JButton jButtonEditarConsultarEditarFT;
    private javax.swing.JButton jButtonEditarConsultarEquipamento;
    private javax.swing.JButton jButtonEditarConsultarPH;
    private javax.swing.JButton jButtonEditarConsultarProduto;
    private javax.swing.JButton jButtonEditarConsultarSuperficie;
    private javax.swing.JButton jButtonEditarConsultarUtilizador;
    private javax.swing.JButton jButtonGuardaRegistoFuncionario;
    private javax.swing.JButton jButtonGuardarFT;
    private javax.swing.JButton jButtonGuardarHorasTrabalho;
    private javax.swing.JButton jButtonGuardarPH;
    private javax.swing.JButton jButtonGuardarRegistarCompartimento;
    private javax.swing.JButton jButtonGuardarRegistarEquipamento;
    private javax.swing.JButton jButtonGuardarRegistarEquipamentoLimpeza;
    private javax.swing.JButton jButtonGuardarRegistarEquipamentoLimpezaAmbos;
    private javax.swing.JButton jButtonGuardarRegistarProduto;
    private javax.swing.JButton jButtonGuardarRegistarSuperficie;
    private javax.swing.JButton jButtonGuardarRegistarSuperficiesLimpas;
    private javax.swing.JButton jButtonGuardarRegistarTemperatura;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonLogOut2;
    private javax.swing.JButton jButtonNovoCompartimentoConsultar;
    private javax.swing.JButton jButtonNovoEquipamentoConsultarEquipamento;
    private javax.swing.JButton jButtonNovoProdutoConsultar;
    private javax.swing.JButton jButtonNovoSuperficie;
    private javax.swing.JButton jButtonPesquisarporData;
    private javax.swing.JButton jButtonPesquisarporTemperaturaData1;
    private javax.swing.JButton jButtonReEquipamento;
    private javax.swing.JButton jButtonReEquipamento1;
    private javax.swing.JButton jButtonReHorasTrabalho;
    private javax.swing.JButton jButtonReLimpezas;
    private javax.swing.JButton jButtonRePlanoHigienizacao;
    private javax.swing.JButton jButtonReProdutos;
    private javax.swing.JButton jButtonReSuperficie;
    private javax.swing.JButton jButtonReTemperaturas;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JButton jButtonRegistarEquipamento;
    private javax.swing.JButton jButtonRegistarEquipamentoLimpeza;
    private javax.swing.JButton jButtonRegistarEquipamentoTemperatura;
    private javax.swing.JButton jButtonRegistarFT;
    private javax.swing.JButton jButtonRegistarFuncionario;
    private javax.swing.JButton jButtonRegistarLimpezaVoltar;
    private javax.swing.JButton jButtonRegistarPH;
    private javax.swing.JButton jButtonResgitarLimpezaGuardar;
    private javax.swing.JButton jButtonSelecionarFT;
    private javax.swing.JButton jButtonSelecionarPH;
    private javax.swing.JButton jButtonVoltarConsultarCompartimento;
    private javax.swing.JButton jButtonVoltarConsultarEditarFT;
    private javax.swing.JButton jButtonVoltarConsultarEquipamento;
    private javax.swing.JButton jButtonVoltarConsultarFT;
    private javax.swing.JButton jButtonVoltarConsultarHorasAdmin;
    private javax.swing.JButton jButtonVoltarConsultarLimpeza;
    private javax.swing.JButton jButtonVoltarConsultarPH;
    private javax.swing.JButton jButtonVoltarConsultarPH1;
    private javax.swing.JButton jButtonVoltarConsultarProduto;
    private javax.swing.JButton jButtonVoltarConsultarSuperficie;
    private javax.swing.JButton jButtonVoltarConsultarTemperatura;
    private javax.swing.JButton jButtonVoltarConsultarUtilizador;
    private javax.swing.JButton jButtonVoltarHT;
    private javax.swing.JButton jButtonVoltarPlanoLimpeza;
    private javax.swing.JButton jButtonVoltarRegistarCompartimento;
    private javax.swing.JButton jButtonVoltarRegistarEquipamento;
    private javax.swing.JButton jButtonVoltarRegistarEquipamentoLimpeza;
    private javax.swing.JButton jButtonVoltarRegistarEquipamentoLimpeza1;
    private javax.swing.JButton jButtonVoltarRegistarProduto;
    private javax.swing.JButton jButtonVoltarRegistarSuperficie;
    private javax.swing.JButton jButtonVoltarRegistarSuperficiesLimpas;
    private javax.swing.JButton jButtonVoltarRegistarTemperatura;
    private javax.swing.JButton jButtonVoltarResgistoFuncionario;
    private javax.swing.JButton jButtonVoltarSeleEquipamentos;
    private javax.swing.JButton jButtonVoltaraHorasTrabalho;
    private javax.swing.JComboBox jComboBoxCompartimento;
    private javax.swing.JComboBox jComboBoxCompartimentoEquipamento;
    private javax.swing.JComboBox jComboBoxCompartimentoEquipamentoAmbos;
    private javax.swing.JComboBox jComboBoxCompartimentosPH;
    private javax.swing.JComboBox jComboBoxConsultarHoras;
    private javax.swing.JComboBox jComboBoxConsultarSuperficie;
    private javax.swing.JComboBox jComboBoxConsultarTemperaturaEquipamento;
    private javax.swing.JComboBox jComboBoxEquipamento;
    private javax.swing.JComboBox jComboBoxLogin;
    private javax.swing.JComboBox jComboBoxProdutoFT;
    private javax.swing.JComboBox jComboBoxResgistarlimpezaCompartimento;
    private javax.swing.JComboBox jComboBoxResgistarlimpezaProduto;
    private javax.swing.JComboBox jComboBoxResgistarlimpezaSuperficie;
    private com.toedter.calendar.JDateChooser jDateChooserConsultarHorasAdminFim;
    private com.toedter.calendar.JDateChooser jDateChooserConsultarHorasAdminIni;
    private com.toedter.calendar.JDateChooser jDateChooserConsultarLimpezaFim;
    private com.toedter.calendar.JDateChooser jDateChooserConsultarLimpezaIni;
    private com.toedter.calendar.JDateChooser jDateChooserHorasFim;
    private com.toedter.calendar.JDateChooser jDateChooserHorasIni;
    private com.toedter.calendar.JDateChooser jDateChooserRegistarFuncionário;
    private com.toedter.calendar.JDateChooser jDateChooserReshitsoLimpeza;
    private com.toedter.calendar.JDateChooser jDateChooserTemperaturaFim1;
    private com.toedter.calendar.JDateChooser jDateChooserTemperaturaIni1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialogAtualizarUtilizador;
    private javax.swing.JDialog jDialogConsultarCompartimentos;
    private javax.swing.JDialog jDialogConsultarEditarFT;
    private javax.swing.JDialog jDialogConsultarEquipamento;
    private javax.swing.JDialog jDialogConsultarFT;
    private javax.swing.JDialog jDialogConsultarHorasADMIN;
    private javax.swing.JDialog jDialogConsultarHorasTrabalho;
    private javax.swing.JDialog jDialogConsultarLimpeza;
    private javax.swing.JDialog jDialogConsultarPH;
    private javax.swing.JDialog jDialogConsultarPH2;
    private javax.swing.JDialog jDialogConsultarProdutos;
    private javax.swing.JDialog jDialogConsultarSuperfícies;
    private javax.swing.JDialog jDialogConsultarTemperaturaEquipamento;
    private javax.swing.JDialog jDialogJanelaInicial;
    private javax.swing.JDialog jDialogPlanodeLimpeza;
    private javax.swing.JDialog jDialogRegistarCompartimento;
    private javax.swing.JDialog jDialogRegistarEquipamento;
    private javax.swing.JDialog jDialogRegistarEquipamentoAmbos;
    private javax.swing.JDialog jDialogRegistarEquipamentosLimpeza;
    private javax.swing.JDialog jDialogRegistarFT;
    private javax.swing.JDialog jDialogRegistarFuncionario;
    private javax.swing.JDialog jDialogRegistarHorasTrabalho;
    private javax.swing.JDialog jDialogRegistarPH;
    private javax.swing.JDialog jDialogRegistarProduto;
    private javax.swing.JDialog jDialogRegistarSuperficies;
    private javax.swing.JDialog jDialogRegistarTemperaturaEquipamento;
    private javax.swing.JDialog jDialogRegistoLimpeza;
    private javax.swing.JDialog jDialogRegistrarSeleEquipamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConsultarHorasTrabalhoFuncionário;
    private javax.swing.JLabel jLabelContacto;
    private javax.swing.JLabel jLabelCódigoPostal;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelDescricaoEquipemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelHorasUtilizador;
    private javax.swing.JLabel jLabelLimpezaFuncionario;
    private javax.swing.JLabel jLabelLocalidade;
    private javax.swing.JLabel jLabelLoginNome;
    private javax.swing.JLabel jLabelMorada;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeEquipamento;
    private javax.swing.JLabel jLabelNomeLogin;
    private javax.swing.JLabel jLabelNomeRegistarTemperatura;
    private javax.swing.JLabel jLabelNomeRegistarTemperatura1;
    private javax.swing.JLabel jLabelNomeRegistarTemperatura2;
    private javax.swing.JLabel jLabelNomeRegistarTemperatura3;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPasswordLogin;
    private javax.swing.JLabel jLabelTemperatura;
    private javax.swing.JLabel jLabelTemperatura1;
    private javax.swing.JLabel jLabelTemperatura2;
    private javax.swing.JLabel jLabelTemperatura3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelAdministrador;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JPanel jPanelConsultarEquipamento;
    private javax.swing.JPanel jPanelConsultarProduto;
    private javax.swing.JPanel jPanelConsultarProduto1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelRegistar;
    private javax.swing.JPanel jPanelRegistarEquipamento;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneConsultarEquipamento;
    private javax.swing.JScrollPane jScrollPaneConsultarEquipamento1;
    private javax.swing.JScrollPane jScrollPaneConsultarEquipamento2;
    private javax.swing.JTable jTableAtualizarUtilizador;
    private javax.swing.JTable jTableConsultarCompartimento;
    private javax.swing.JTable jTableConsultarEditarFT;
    private javax.swing.JTable jTableConsultarEquipamento;
    private javax.swing.JTable jTableConsultarFT;
    private javax.swing.JTable jTableConsultarHorasAdmin;
    private javax.swing.JTable jTableConsultarHorasTrabalho;
    private javax.swing.JTable jTableConsultarLimpeza;
    private javax.swing.JTable jTableConsultarPH;
    private javax.swing.JTable jTableConsultarPH1;
    private javax.swing.JTable jTableConsultarProdutos;
    private javax.swing.JTable jTableConsultarSuperficie;
    private javax.swing.JTable jTableConsultarTemperaturaEquipamento;
    private javax.swing.JTable jTableRgistarSuperficiesLimpas;
    private javax.swing.JTextArea jTextAreaDescricaoAnomalias;
    private javax.swing.JTextArea jTextAreaRegistarDescricao;
    private javax.swing.JTextField jTextFieldCodigoP;
    private javax.swing.JTextField jTextFieldConacto;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLocalidade;
    private javax.swing.JTextField jTextFieldMorada;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeFT;
    private javax.swing.JTextField jTextFieldNomePH;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPesquisarConsultaCompartimento;
    private javax.swing.JTextField jTextFieldPesquisarConsultaProduto;
    private javax.swing.JTextField jTextFieldPesquisarConsultarEquipamento;
    private javax.swing.JTextField jTextFieldRegistarCompartimento;
    private javax.swing.JTextField jTextFieldRegistarEquipamento;
    private javax.swing.JTextField jTextFieldRegistarEquipamentoLimpeza;
    private javax.swing.JTextField jTextFieldRegistarEquipamentoLimpezaAmbos;
    private javax.swing.JTextField jTextFieldRegistarHorasTrabalho;
    private javax.swing.JTextField jTextFieldRegistarProduto;
    private javax.swing.JTextField jTextFieldRegistarSuperficie;
    private javax.swing.JTextField jTextFieldRegistarTemperatura;
    // End of variables declaration//GEN-END:variables

    
}
