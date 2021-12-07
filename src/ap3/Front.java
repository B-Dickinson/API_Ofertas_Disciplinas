package ap3;

import java.awt.*;

public class Front extends javax.swing.JFrame {

    Teste novoTeste = new Teste(); 
    Coordenador primeiro = new Coordenador("Anakin Skywalker", "Masculino", "03249788625", 
    "estrelaDaMorte007@outlook.com","São Luís","Maranhão","(98) 999650625");
    private boolean visualizandoOferta = false;
    private boolean adicionandoOferta = false;
    private boolean removendoOferta = false;
    private boolean modificandoOferta = false;
    private boolean acessandoHorario = false;
    private boolean acessandoPerfil = false;
    private int ofertaEscolhida = 0; // valor referente ao metodo de modificar oferta
    private boolean codigoValido = false;
    
    public Front() {
      initComponents();
      btnVoltar.setVisible(false); // back
      btnAvancar.setVisible(false); // next
      resultadoViewOferta.setVisible(false); // painel de Ver Ofertas
      resultadoMeuPerfil.setVisible(false); // painel de Meu Perfil
      painelFotoPerfil.setVisible(false); // painel de foto de perfil
      painelNovasOfertas.setVisible(false); // painel de novas ofertas
      painelRemoverOfertas.setVisible(false); // painel de remover ofertas
      painelModificaOfertas.setVisible(false); // painel de modificar ofertas
      painelQuadroHorario.setVisible(false); // painel de quadro de horários



      
        
      novoTeste.d.add(new Disciplina(1, "Matemática Básica"));
      novoTeste.d.add(new Disciplina(2, "Programação Orientada a Objetos"));
      novoTeste.d.add(new Disciplina(3, "Introdução à Informatica"));
      novoTeste.d.add(new Disciplina(4, "Algoritmos Computacionais"));
      
      novoTeste.ofertas.add(new Oferta(1, 2021, 1, 1, novoTeste.d.get(0))); // turma \ ano \ semestre \ modalidade \ disciplina
      novoTeste.ofertas.add(new Oferta(2, 2021, 2, 3, novoTeste.d.get(1)));
      novoTeste.ofertas.add(new Oferta(3, 2022, 2, 3, novoTeste.d.get(2)));
      novoTeste.ofertas.add(new Oferta(4, 2022, 1, 1, novoTeste.d.get(3)));
      novoTeste.ofertas.add(new Oferta(5, 2022, 1, 2, novoTeste.d.get(0)));
      
      novoTeste.salas.add(new Sala(1, 40));
      novoTeste.salas.add(new Sala(2, 20));         
    }

    
    // construtor dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelRemoverOfertas = new javax.swing.JPanel();
        lblMessageOfertaRemovida = new javax.swing.JLabel();
        escolhaOfertaRemover = new javax.swing.JComboBox<>();
        btnRemoverEscolhaOferta = new javax.swing.JButton();
        lblMessageCertezaOuNao = new javax.swing.JLabel();
        btnRemoverSim = new javax.swing.JButton();
        btnRemoverNao = new javax.swing.JButton();
        lblMessageRemovidaComSucesso = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        caixaDisciplinas = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        lblMessageViewOfertas = new javax.swing.JLabel();
        btnVisualizarOfertas = new javax.swing.JButton();
        btnModificaOferta = new javax.swing.JButton();
        lblMessageModificarOferta = new javax.swing.JLabel();
        btnRemoveOferta = new javax.swing.JButton();
        lblMessageRemoverOfertas = new javax.swing.JLabel();
        btnHorarioDeAula = new javax.swing.JButton();
        lblMessageQuadroHorario = new javax.swing.JLabel();
        btnMeuPerfil = new javax.swing.JButton();
        lblMessageMeuPerfil = new javax.swing.JLabel();
        btnAdicionaNovaOferta = new javax.swing.JButton();
        lblMessageAdicionarOfertas = new javax.swing.JLabel();
        resultadoViewOferta = new javax.swing.JScrollPane();
        txtResultadoViewOfertas = new javax.swing.JTextArea();
        painelNovasOfertas = new javax.swing.JPanel();
        lblAdicionaCodigoTurma = new javax.swing.JLabel();
        txtRespostaAdicionarTurma = new javax.swing.JTextField();
        lblAdicionaAno = new javax.swing.JLabel();
        txtRespostaAdicionarAno = new javax.swing.JTextField();
        lblAdicionaSemestre = new javax.swing.JLabel();
        lblAdicionaModalidade = new javax.swing.JLabel();
        lblAdicionaDisciplina = new javax.swing.JLabel();
        txtRespostaAdicionarSemestre = new javax.swing.JTextField();
        txtRespostaAdicionarDisciplina = new javax.swing.JComboBox<>();
        btnOfertaCriada = new javax.swing.JButton();
        txtRespostaAdicionarModalidade = new javax.swing.JComboBox<>();
        lblMessageOfertaCriadaSucesso = new javax.swing.JLabel();
        lblMessageOfertaErro = new javax.swing.JLabel();
        lblMessageCodigoRepetido = new javax.swing.JLabel();
        painelModificaOfertas = new javax.swing.JPanel();
        lblMessageOfertasDisponiveis = new javax.swing.JLabel();
        ofertasDisponiveis = new javax.swing.JComboBox<>();
        lblCodigoDaTurma = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        lblModalidade = new javax.swing.JLabel();
        lblDisciplina = new javax.swing.JLabel();
        txtCodigoTurma = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        btnSalvarModificacoes = new javax.swing.JButton();
        disciplinasDisponiveis = new javax.swing.JComboBox<>();
        lblMessageSalvoComSucesso = new javax.swing.JLabel();
        lblMessageInfo = new javax.swing.JLabel();
        txtModalidade = new javax.swing.JComboBox<>();
        lblCodigoExistente = new javax.swing.JLabel();
        painelQuadroHorario = new javax.swing.JPanel();
        lblMessageQuadro = new javax.swing.JLabel();
        lblSegunda = new javax.swing.JLabel();
        lblTerca = new javax.swing.JLabel();
        lblQuarta = new javax.swing.JLabel();
        lblQuinta = new javax.swing.JLabel();
        lblSexta = new javax.swing.JLabel();
        lblSabado = new javax.swing.JLabel();
        painelHorarioSemestral = new javax.swing.JPanel();
        linhaV1 = new javax.swing.JSeparator();
        linhaV2 = new javax.swing.JSeparator();
        linhaV3 = new javax.swing.JSeparator();
        linhaV4 = new javax.swing.JSeparator();
        linhaV5 = new javax.swing.JSeparator();
        linhaH1 = new javax.swing.JSeparator();
        linhaH2 = new javax.swing.JSeparator();
        linhaH3 = new javax.swing.JSeparator();
        lblDisciplinasSegunda1 = new javax.swing.JLabel();
        lblDisciplinasSegunda2 = new javax.swing.JLabel();
        lblDisciplinasSegunda3 = new javax.swing.JLabel();
        lblDisciplinasSegunda4 = new javax.swing.JLabel();
        lblDisciplinasTerca1 = new javax.swing.JLabel();
        lblDisciplinasTerca2 = new javax.swing.JLabel();
        lblDisciplinasTerca3 = new javax.swing.JLabel();
        lblDisciplinasTerca4 = new javax.swing.JLabel();
        lblQuarta1 = new javax.swing.JLabel();
        lblQuarta2 = new javax.swing.JLabel();
        lblQuarta3 = new javax.swing.JLabel();
        lblQuarta4 = new javax.swing.JLabel();
        lblQuinta1 = new javax.swing.JLabel();
        lblQuinta2 = new javax.swing.JLabel();
        lblQuinta3 = new javax.swing.JLabel();
        lblQuinta4 = new javax.swing.JLabel();
        lblSexta1 = new javax.swing.JLabel();
        lblSexta2 = new javax.swing.JLabel();
        lblSexta3 = new javax.swing.JLabel();
        lblSexta4 = new javax.swing.JLabel();
        sabado1 = new javax.swing.JLabel();
        sabado2 = new javax.swing.JLabel();
        sabado3 = new javax.swing.JLabel();
        sabado4 = new javax.swing.JLabel();
        painelFotoPerfil = new javax.swing.JPanel();
        imgFotoPerfil = new javax.swing.JLabel();
        resultadoMeuPerfil = new javax.swing.JScrollPane();
        txtResultadoViewMeuPerfil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelRemoverOfertas.setBackground(new java.awt.Color(204, 204, 204));

        lblMessageOfertaRemovida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageOfertaRemovida.setText("Oferta a ser removida:");

        escolhaOfertaRemover.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        escolhaOfertaRemover.setToolTipText("Ofertas Disponíveis");
        escolhaOfertaRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaOfertaRemoverActionPerformed(evt);
            }
        });

        btnRemoverEscolhaOferta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRemoverEscolhaOferta.setText("Remover");
        btnRemoverEscolhaOferta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemoverEscolhaOferta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRemoverEscolhaOfertaMouseMoved(evt);
            }
        });
        btnRemoverEscolhaOferta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverEscolhaOfertaMouseExited(evt);
            }
        });
        btnRemoverEscolhaOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverEscolhaOfertaActionPerformed(evt);
            }
        });

        lblMessageCertezaOuNao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageCertezaOuNao.setText("Tem certeza que deseja excluir a oferta selecionada?");

        btnRemoverSim.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRemoverSim.setText("Sim");
        btnRemoverSim.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRemoverSimMouseMoved(evt);
            }
        });
        btnRemoverSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverSimMouseExited(evt);
            }
        });
        btnRemoverSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverSimActionPerformed(evt);
            }
        });

        btnRemoverNao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRemoverNao.setText("Não");
        btnRemoverNao.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRemoverNaoMouseMoved(evt);
            }
        });
        btnRemoverNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverNaoMouseExited(evt);
            }
        });
        btnRemoverNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverNaoActionPerformed(evt);
            }
        });

        lblMessageRemovidaComSucesso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMessageRemovidaComSucesso.setForeground(new java.awt.Color(102, 204, 0));
        lblMessageRemovidaComSucesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageRemovidaComSucesso.setText("Oferta excluída com sucesso!!!");
        lblMessageRemovidaComSucesso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelRemoverOfertasLayout = new javax.swing.GroupLayout(painelRemoverOfertas);
        painelRemoverOfertas.setLayout(painelRemoverOfertasLayout);
        painelRemoverOfertasLayout.setHorizontalGroup(
            painelRemoverOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRemoverOfertasLayout.createSequentialGroup()
                .addGroup(painelRemoverOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRemoverOfertasLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lblMessageOfertaRemovida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelRemoverOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoverEscolhaOferta)
                            .addComponent(escolhaOfertaRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelRemoverOfertasLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblMessageCertezaOuNao))
                    .addGroup(painelRemoverOfertasLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(lblMessageRemovidaComSucesso))
                    .addGroup(painelRemoverOfertasLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnRemoverSim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnRemoverNao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        painelRemoverOfertasLayout.setVerticalGroup(
            painelRemoverOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRemoverOfertasLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(painelRemoverOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessageOfertaRemovida)
                    .addComponent(escolhaOfertaRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnRemoverEscolhaOferta)
                .addGap(133, 133, 133)
                .addComponent(lblMessageCertezaOuNao)
                .addGap(18, 18, 18)
                .addGroup(painelRemoverOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoverNao)
                    .addComponent(btnRemoverSim))
                .addGap(87, 87, 87)
                .addComponent(lblMessageRemovidaComSucesso)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(painelRemoverOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 730));

        lblTitulo.setBackground(new java.awt.Color(33, 111, 125));
        lblTitulo.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Lista de Ofertas");
        lblTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 153)));
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        lblSubtitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblSubtitulo.setText("Disciplinas: ");
        getContentPane().add(lblSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 166, -1, -1));

        caixaDisciplinas.setBackground(new java.awt.Color(102, 102, 102));
        caixaDisciplinas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        caixaDisciplinas.setForeground(new java.awt.Color(0, 0, 0));
        caixaDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemática Básica", "Programação Orientada a Objetos", "Introdução à Informática", "Algoritmos Computacionais" }));
        caixaDisciplinas.setToolTipText("Disciplinas Disponíveis");
        getContentPane().add(caixaDisciplinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 164, 400, 35));

        btnVoltar.setBackground(new java.awt.Color(153, 153, 153));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltar.png"))); // NOI18N
        btnVoltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVoltarMouseMoved(evt);
            }
        });
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 76, 38, 38));

        btnAvancar.setBackground(new java.awt.Color(153, 153, 153));
        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avancar.png"))); // NOI18N
        btnAvancar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAvancarMouseMoved(evt);
            }
        });
        btnAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAvancarMouseExited(evt);
            }
        });
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 76, 38, 38));

        lblMessageViewOfertas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageViewOfertas.setText("Visualizar Ofertas Disponíveis");
        getContentPane().add(lblMessageViewOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 480, -1, 26));

        btnVisualizarOfertas.setBackground(new java.awt.Color(153, 153, 153));
        btnVisualizarOfertas.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnVisualizarOfertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visualizacao.png"))); // NOI18N
        btnVisualizarOfertas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVisualizarOfertasMouseMoved(evt);
            }
        });
        btnVisualizarOfertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizarOfertasMouseExited(evt);
            }
        });
        btnVisualizarOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarOfertasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizarOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 234, 260, 240));

        btnModificaOferta.setBackground(new java.awt.Color(153, 153, 153));
        btnModificaOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModificaOferta.png"))); // NOI18N
        btnModificaOferta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnModificaOfertaMouseMoved(evt);
            }
        });
        btnModificaOferta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificaOfertaMouseExited(evt);
            }
        });
        btnModificaOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaOfertaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificaOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 536, 260, 240));

        lblMessageModificarOferta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageModificarOferta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageModificarOferta.setText("Modificar Oferta");
        getContentPane().add(lblMessageModificarOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 782, 260, -1));

        btnRemoveOferta.setBackground(new java.awt.Color(153, 153, 153));
        btnRemoveOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RemoveOfertas.png"))); // NOI18N
        btnRemoveOferta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRemoveOfertaMouseMoved(evt);
            }
        });
        btnRemoveOferta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveOfertaMouseExited(evt);
            }
        });
        btnRemoveOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOfertaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 230, 260, 244));

        lblMessageRemoverOfertas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageRemoverOfertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageRemoverOfertas.setText("Remover Oferta");
        getContentPane().add(lblMessageRemoverOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 480, 260, -1));

        btnHorarioDeAula.setBackground(new java.awt.Color(153, 153, 153));
        btnHorarioDeAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HorarioDeAula.png"))); // NOI18N
        btnHorarioDeAula.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnHorarioDeAulaMouseMoved(evt);
            }
        });
        btnHorarioDeAula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHorarioDeAulaMouseExited(evt);
            }
        });
        btnHorarioDeAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioDeAulaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHorarioDeAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 536, 260, 240));

        lblMessageQuadroHorario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageQuadroHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageQuadroHorario.setText("Quadro de Horário");
        getContentPane().add(lblMessageQuadroHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 782, 260, -1));

        btnMeuPerfil.setBackground(new java.awt.Color(153, 153, 153));
        btnMeuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magico00.png"))); // NOI18N
        btnMeuPerfil.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMeuPerfilMouseMoved(evt);
            }
        });
        btnMeuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMeuPerfilMouseExited(evt);
            }
        });
        btnMeuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeuPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnMeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 536, 260, 240));

        lblMessageMeuPerfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageMeuPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageMeuPerfil.setText("Meu Perfil");
        getContentPane().add(lblMessageMeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 782, 260, -1));

        btnAdicionaNovaOferta.setBackground(new java.awt.Color(153, 153, 153));
        btnAdicionaNovaOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdicionaOfertas.png"))); // NOI18N
        btnAdicionaNovaOferta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAdicionaNovaOfertaMouseMoved(evt);
            }
        });
        btnAdicionaNovaOferta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionaNovaOfertaMouseExited(evt);
            }
        });
        btnAdicionaNovaOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaNovaOfertaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionaNovaOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 230, 260, 244));

        lblMessageAdicionarOfertas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageAdicionarOfertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageAdicionarOfertas.setText("Adicionar Nova Oferta");
        getContentPane().add(lblMessageAdicionarOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 480, 260, -1));

        txtResultadoViewOfertas.setEditable(false);
        txtResultadoViewOfertas.setBackground(new java.awt.Color(204, 204, 204));
        txtResultadoViewOfertas.setColumns(20);
        txtResultadoViewOfertas.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtResultadoViewOfertas.setRows(5);
        resultadoViewOferta.setViewportView(txtResultadoViewOfertas);

        getContentPane().add(resultadoViewOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 990, 730));

        painelNovasOfertas.setBackground(new java.awt.Color(204, 204, 204));
        painelNovasOfertas.setBorder(new javax.swing.border.MatteBorder(null));
        painelNovasOfertas.setForeground(new java.awt.Color(204, 204, 204));

        lblAdicionaCodigoTurma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdicionaCodigoTurma.setText("Código da Turma: ");

        txtRespostaAdicionarTurma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRespostaAdicionarTurma.setPreferredSize(new java.awt.Dimension(60, 32));

        lblAdicionaAno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdicionaAno.setText("Ano: ");

        txtRespostaAdicionarAno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblAdicionaSemestre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdicionaSemestre.setText("Semestre: ");

        lblAdicionaModalidade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdicionaModalidade.setText("Modalidade:");

        lblAdicionaDisciplina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdicionaDisciplina.setText("Disciplina:");

        txtRespostaAdicionarSemestre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtRespostaAdicionarDisciplina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtRespostaAdicionarDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemática Básica  ", "Programação Orientada a Objetos  ", "Introdução à Informática  ", "Algoritmos Computacionais  " }));

        btnOfertaCriada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOfertaCriada.setText("Finalizar");
        btnOfertaCriada.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnOfertaCriadaMouseMoved(evt);
            }
        });
        btnOfertaCriada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOfertaCriadaMouseExited(evt);
            }
        });
        btnOfertaCriada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertaCriadaActionPerformed(evt);
            }
        });

        txtRespostaAdicionarModalidade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtRespostaAdicionarModalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestral", "Intensivo", "Remoto(A Distância)" }));

        lblMessageOfertaCriadaSucesso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMessageOfertaCriadaSucesso.setForeground(new java.awt.Color(102, 204, 0));
        lblMessageOfertaCriadaSucesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageOfertaCriadaSucesso.setText("Oferta adicionada com Sucesso!!!");

        lblMessageOfertaErro.setBackground(new java.awt.Color(153, 153, 153));
        lblMessageOfertaErro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMessageOfertaErro.setForeground(new java.awt.Color(255, 0, 51));
        lblMessageOfertaErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageOfertaErro.setText("Erro! Tente novamente.");

        lblMessageCodigoRepetido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMessageCodigoRepetido.setForeground(new java.awt.Color(255, 0, 51));
        lblMessageCodigoRepetido.setText("Código de turma já existente, mude-o e tente novamente");

        javax.swing.GroupLayout painelNovasOfertasLayout = new javax.swing.GroupLayout(painelNovasOfertas);
        painelNovasOfertas.setLayout(painelNovasOfertasLayout);
        painelNovasOfertasLayout.setHorizontalGroup(
            painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                                .addComponent(lblAdicionaAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRespostaAdicionarAno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                                .addComponent(lblAdicionaCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRespostaAdicionarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                                .addComponent(lblAdicionaSemestre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRespostaAdicionarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                                .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdicionaModalidade)
                                    .addComponent(lblAdicionaDisciplina))
                                .addGap(18, 18, 18)
                                .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRespostaAdicionarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRespostaAdicionarModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(btnOfertaCriada))))))
                    .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblMessageCodigoRepetido))
                    .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblMessageOfertaCriadaSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(lblMessageOfertaErro)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        painelNovasOfertasLayout.setVerticalGroup(
            painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                        .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelNovasOfertasLayout.createSequentialGroup()
                                .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAdicionaCodigoTurma)
                                    .addComponent(txtRespostaAdicionarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAdicionaAno)
                                    .addComponent(txtRespostaAdicionarAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAdicionaSemestre)
                                .addComponent(txtRespostaAdicionarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdicionaModalidade)
                        .addComponent(txtRespostaAdicionarModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(painelNovasOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdicionaDisciplina)
                    .addComponent(txtRespostaAdicionarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btnOfertaCriada)
                .addGap(55, 55, 55)
                .addComponent(lblMessageCodigoRepetido)
                .addGap(18, 18, 18)
                .addComponent(lblMessageOfertaCriadaSucesso)
                .addGap(18, 18, 18)
                .addComponent(lblMessageOfertaErro)
                .addContainerGap())
        );

        getContentPane().add(painelNovasOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 730));

        painelModificaOfertas.setBackground(new java.awt.Color(204, 204, 204));

        lblMessageOfertasDisponiveis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageOfertasDisponiveis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageOfertasDisponiveis.setText("Escolha uma Oferta:");

        ofertasDisponiveis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ofertasDisponiveis.setToolTipText("Ofertas Disponíveis");
        ofertasDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofertasDisponiveisActionPerformed(evt);
            }
        });

        lblCodigoDaTurma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigoDaTurma.setText("Código Turma:");

        lblAno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAno.setText("Ano:");

        lblSemestre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSemestre.setText("Semestre:");

        lblModalidade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblModalidade.setText("Modalidade:");

        lblDisciplina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDisciplina.setText("Disciplina:");

        txtCodigoTurma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCodigoTurma.setForeground(new java.awt.Color(255, 0, 0));

        txtAno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAno.setForeground(new java.awt.Color(255, 0, 0));

        txtSemestre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSemestre.setForeground(new java.awt.Color(255, 0, 0));

        btnSalvarModificacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvarModificacoes.setText("Salvar");
        btnSalvarModificacoes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSalvarModificacoesMouseMoved(evt);
            }
        });
        btnSalvarModificacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarModificacoesMouseExited(evt);
            }
        });
        btnSalvarModificacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarModificacoesActionPerformed(evt);
            }
        });

        disciplinasDisponiveis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        disciplinasDisponiveis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemática Básica", "Programação Orientada a Objetos", "Introdução à Informática", "Algoritmos Computacionais" }));
        disciplinasDisponiveis.setToolTipText("Disciplinas Disponíveis");

        lblMessageSalvoComSucesso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMessageSalvoComSucesso.setForeground(new java.awt.Color(51, 204, 0));
        lblMessageSalvoComSucesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessageSalvoComSucesso.setText("Salvo com Sucesso!!!");

        lblMessageInfo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblMessageInfo.setText("Obs: Caso deixe algum campo vazio, o valor já preenchido continuará sendo o mesmo.");

        txtModalidade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtModalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestral", "Intensivo", "Remoto(a Distância)" }));
        txtModalidade.setToolTipText("Modalidades Disponíveis");

        lblCodigoExistente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodigoExistente.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigoExistente.setText("Código já existente, caso queira mudá-lo, tente novamente");

        javax.swing.GroupLayout painelModificaOfertasLayout = new javax.swing.GroupLayout(painelModificaOfertas);
        painelModificaOfertas.setLayout(painelModificaOfertasLayout);
        painelModificaOfertasLayout.setHorizontalGroup(
            painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblMessageOfertasDisponiveis)
                        .addGap(12, 12, 12)
                        .addComponent(ofertasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblCodigoDaTurma)
                        .addGap(12, 12, 12)
                        .addComponent(txtCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblAno)
                        .addGap(12, 12, 12)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblSemestre)
                        .addGap(12, 12, 12)
                        .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(btnSalvarModificacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(lblMessageSalvoComSucesso))
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblMessageInfo))
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                                .addComponent(lblModalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                                .addComponent(lblDisciplina)
                                .addGap(12, 12, 12)
                                .addComponent(disciplinasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCodigoExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        painelModificaOfertasLayout.setVerticalGroup(
            painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblMessageOfertasDisponiveis))
                    .addComponent(ofertasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCodigoDaTurma))
                    .addComponent(txtCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAno))
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSemestre))
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModalidade)
                    .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(painelModificaOfertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModificaOfertasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblDisciplina))
                    .addComponent(disciplinasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMessageSalvoComSucesso)
                .addGap(26, 26, 26)
                .addComponent(lblCodigoExistente)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarModificacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(lblMessageInfo)
                .addGap(22, 22, 22))
        );

        getContentPane().add(painelModificaOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 730));

        lblMessageQuadro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMessageQuadro.setText("Quadro de Horário:");

        lblSegunda.setBackground(new java.awt.Color(153, 153, 153));
        lblSegunda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSegunda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSegunda.setText("Segunda-Feira");
        lblSegunda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSegunda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSegunda.setOpaque(true);

        lblTerca.setBackground(new java.awt.Color(153, 153, 153));
        lblTerca.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTerca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTerca.setText("Terça-Feira");
        lblTerca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTerca.setOpaque(true);

        lblQuarta.setBackground(new java.awt.Color(153, 153, 153));
        lblQuarta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblQuarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuarta.setText("Quarta-Feira");
        lblQuarta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblQuarta.setOpaque(true);

        lblQuinta.setBackground(new java.awt.Color(153, 153, 153));
        lblQuinta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblQuinta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuinta.setText("Quinta-Feira");
        lblQuinta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblQuinta.setOpaque(true);

        lblSexta.setBackground(new java.awt.Color(153, 153, 153));
        lblSexta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSexta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexta.setText("Sexta-Feira");
        lblSexta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSexta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSexta.setOpaque(true);

        lblSabado.setBackground(new java.awt.Color(153, 153, 153));
        lblSabado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSabado.setText("Sábado");
        lblSabado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSabado.setOpaque(true);

        painelHorarioSemestral.setBackground(new java.awt.Color(191, 233, 205));
        painelHorarioSemestral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelHorarioSemestral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaV1.setBackground(new java.awt.Color(0, 0, 0));
        linhaV1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        painelHorarioSemestral.add(linhaV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 0, -1, 619));

        linhaV2.setBackground(new java.awt.Color(0, 0, 0));
        linhaV2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        painelHorarioSemestral.add(linhaV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 0, -1, 619));

        linhaV3.setBackground(new java.awt.Color(0, 0, 0));
        linhaV3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        painelHorarioSemestral.add(linhaV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 0, -1, 619));

        linhaV4.setBackground(new java.awt.Color(0, 0, 0));
        linhaV4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        painelHorarioSemestral.add(linhaV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 0, -1, 619));

        linhaV5.setBackground(new java.awt.Color(0, 0, 0));
        linhaV5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        painelHorarioSemestral.add(linhaV5, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 0, -1, 619));

        linhaH1.setBackground(new java.awt.Color(0, 0, 0));
        painelHorarioSemestral.add(linhaH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 949, -1));

        linhaH2.setBackground(new java.awt.Color(0, 0, 0));
        painelHorarioSemestral.add(linhaH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 949, 10));

        linhaH3.setBackground(new java.awt.Color(0, 0, 0));
        painelHorarioSemestral.add(linhaH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, 949, 10));

        lblDisciplinasSegunda1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblDisciplinasSegunda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisciplinasSegunda1.setText("<html>Disciplinas da modalidade (Semestral)</html>");
        painelHorarioSemestral.add(lblDisciplinasSegunda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 110));

        lblDisciplinasSegunda2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblDisciplinasSegunda2.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblDisciplinasSegunda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 110));

        lblDisciplinasSegunda3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDisciplinasSegunda3.setText("<html>Disciplinas da modalidade (Semestral)</html>");
        painelHorarioSemestral.add(lblDisciplinasSegunda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 110));

        lblDisciplinasSegunda4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDisciplinasSegunda4.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblDisciplinasSegunda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 140, 110));

        lblDisciplinasTerca1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDisciplinasTerca1.setText("<html>Disciplinas da modalidade (Intensiva)</html>\n");
        painelHorarioSemestral.add(lblDisciplinasTerca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 110));

        lblDisciplinasTerca2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblDisciplinasTerca2.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblDisciplinasTerca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 140, 110));

        lblDisciplinasTerca3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblDisciplinasTerca3.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblDisciplinasTerca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 140, 110));

        lblDisciplinasTerca4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblDisciplinasTerca4.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblDisciplinasTerca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 140, 110));

        lblQuarta1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuarta1.setText("<html>Disciplinas da modalidade (Semestral)</html>");
        painelHorarioSemestral.add(lblQuarta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 140, 110));

        lblQuarta2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuarta2.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblQuarta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 140, 110));

        lblQuarta3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuarta3.setText("<html>Disciplinas da modalidade (Semestral)</html>");
        painelHorarioSemestral.add(lblQuarta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 140, 110));

        lblQuarta4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuarta4.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblQuarta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 140, 110));

        lblQuinta1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuinta1.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblQuinta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 140, 110));

        lblQuinta2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuinta2.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblQuinta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 140, 110));

        lblQuinta3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuinta3.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblQuinta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 140, 110));

        lblQuinta4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblQuinta4.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblQuinta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 140, 110));

        lblSexta1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblSexta1.setText("<html>Disciplinas da modalidade (Semestral)</html>");
        painelHorarioSemestral.add(lblSexta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 140, 110));

        lblSexta2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblSexta2.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblSexta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 140, 110));

        lblSexta3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblSexta3.setText("<html>Disciplinas da modalidade (Semestral)</html>");
        painelHorarioSemestral.add(lblSexta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 140, 110));

        lblSexta4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblSexta4.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(lblSexta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 140, 110));

        sabado1.setBackground(new java.awt.Color(244, 221, 221));
        sabado1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        sabado1.setText("<html>Disciplinas da modalidade (Distância)</html>");
        painelHorarioSemestral.add(sabado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 130, 130));

        sabado2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        sabado2.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(sabado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 130, 130));

        sabado3.setBackground(new java.awt.Color(244, 221, 221));
        sabado3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        sabado3.setText("<html>Disciplinas da modalidade (Distância)</html>");
        painelHorarioSemestral.add(sabado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 140, 130));

        sabado4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        sabado4.setText("<html>Disciplinas da modalidade (Intensiva)</html>");
        painelHorarioSemestral.add(sabado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 140, 130));

        javax.swing.GroupLayout painelQuadroHorarioLayout = new javax.swing.GroupLayout(painelQuadroHorario);
        painelQuadroHorario.setLayout(painelQuadroHorarioLayout);
        painelQuadroHorarioLayout.setHorizontalGroup(
            painelQuadroHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadroHorarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelQuadroHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessageQuadro)
                    .addGroup(painelQuadroHorarioLayout.createSequentialGroup()
                        .addComponent(lblSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTerca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblSexta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelHorarioSemestral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        painelQuadroHorarioLayout.setVerticalGroup(
            painelQuadroHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadroHorarioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblMessageQuadro)
                .addGap(24, 24, 24)
                .addGroup(painelQuadroHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTerca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(painelHorarioSemestral, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(painelQuadroHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 980, 740));

        painelFotoPerfil.setBackground(new java.awt.Color(102, 102, 102));
        painelFotoPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));

        imgFotoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotoPerfil4.png"))); // NOI18N
        imgFotoPerfil.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imgFotoPerfil.setBorder(new javax.swing.border.MatteBorder(null));
        imgFotoPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgFotoPerfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelFotoPerfil.add(imgFotoPerfil);

        getContentPane().add(painelFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, 205));

        resultadoMeuPerfil.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        resultadoMeuPerfil.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtResultadoViewMeuPerfil.setEditable(false);
        txtResultadoViewMeuPerfil.setBackground(new java.awt.Color(204, 204, 204));
        txtResultadoViewMeuPerfil.setColumns(20);
        txtResultadoViewMeuPerfil.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtResultadoViewMeuPerfil.setRows(5);
        txtResultadoViewMeuPerfil.setMargin(new java.awt.Insets(220, 360, 900, 500));
        resultadoMeuPerfil.setViewportView(txtResultadoViewMeuPerfil);

        getContentPane().add(resultadoMeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarOfertasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarOfertasMouseMoved
        
        Color minhaCor = new Color(50,83,89);
        btnVisualizarOfertas.setBackground(minhaCor);
    }//GEN-LAST:event_btnVisualizarOfertasMouseMoved

    private void btnVisualizarOfertasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarOfertasMouseExited
        
        Color padrao = new Color(153,153,153);
        btnVisualizarOfertas.setBackground(padrao);
    }//GEN-LAST:event_btnVisualizarOfertasMouseExited

    private void btnVisualizarOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarOfertasActionPerformed
        
        // Ação de Visualizar todas as Ofertas disponíveis
        
        
        
        this.visualizandoOferta = true;
        this.acessandoHorario = false;
        this.acessandoPerfil = false;
        this.adicionandoOferta = false;
        this.removendoOferta = false;
        this.modificandoOferta = false;
        
        
        resultadoViewOferta.setVisible(true);
        txtResultadoViewOfertas.setVisible(true);
        btnAdicionaNovaOferta.setVisible(false);
        btnAvancar.setVisible(false);
        btnVoltar.setVisible(true);
        btnHorarioDeAula.setVisible(false);
        btnMeuPerfil.setVisible(false);
        btnModificaOferta.setVisible(false);
        btnRemoveOferta.setVisible(false);
        btnVisualizarOfertas.setVisible(false);
        caixaDisciplinas.setVisible(false);
        lblMessageAdicionarOfertas.setVisible(false);
        lblMessageMeuPerfil.setVisible(false);
        lblMessageModificarOferta.setVisible(false);
        lblMessageQuadroHorario.setVisible(false);
        lblMessageRemoverOfertas.setVisible(false);
        lblMessageViewOfertas.setVisible(false);
        lblSubtitulo.setVisible(false);
                
        
        for(Oferta of : novoTeste.ofertas){
            txtResultadoViewOfertas.setText(txtResultadoViewOfertas.getText()
                    + of.imprimirOfertas() + "\n" + "\n" + "\n" + "\n" + "\n" );
        }
        
            if(txtResultadoViewOfertas.getText().equals("")){ // caso a lista esteja vazia
                
            String mensagem ="Lista Vazia";
            
            txtResultadoViewOfertas.setFont(new java.awt.Font("Dialog", 3, 18)); // fonte / font-style && font-weigth / font-size
            txtResultadoViewOfertas.setText("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"
                    +"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+" "+" "+" "+" "+mensagem);
            
            }
            
      
    }//GEN-LAST:event_btnVisualizarOfertasActionPerformed

    private void btnAdicionaNovaOfertaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionaNovaOfertaMouseMoved

        Color minhaCor = new Color(50,83,89);
        btnAdicionaNovaOferta.setBackground(minhaCor);        
    }//GEN-LAST:event_btnAdicionaNovaOfertaMouseMoved

    private void btnAdicionaNovaOfertaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionaNovaOfertaMouseExited

        Color padrao = new Color(153,153,153);
        btnAdicionaNovaOferta.setBackground(padrao);
    }//GEN-LAST:event_btnAdicionaNovaOfertaMouseExited

    private void btnRemoveOfertaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveOfertaMouseMoved
        
        Color minhaCor = new Color(50,83,89);
        btnRemoveOferta.setBackground(minhaCor);         
    }//GEN-LAST:event_btnRemoveOfertaMouseMoved

    private void btnRemoveOfertaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveOfertaMouseExited
        
        Color padrao = new Color(153,153,153);
        btnRemoveOferta.setBackground(padrao);        
    }//GEN-LAST:event_btnRemoveOfertaMouseExited

    private void btnModificaOfertaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaOfertaMouseMoved
        
        Color minhaCor = new Color(50,83,89);
        btnModificaOferta.setBackground(minhaCor);          
    }//GEN-LAST:event_btnModificaOfertaMouseMoved

    private void btnModificaOfertaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaOfertaMouseExited
       
        Color padrao = new Color(153,153,153);
        btnModificaOferta.setBackground(padrao);          
    }//GEN-LAST:event_btnModificaOfertaMouseExited

    private void btnHorarioDeAulaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHorarioDeAulaMouseMoved

        Color minhaCor = new Color(50,83,89);
        btnHorarioDeAula.setBackground(minhaCor);            
    }//GEN-LAST:event_btnHorarioDeAulaMouseMoved

    private void btnHorarioDeAulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHorarioDeAulaMouseExited

        Color padrao = new Color(153,153,153);
        btnHorarioDeAula.setBackground(padrao);          
    }//GEN-LAST:event_btnHorarioDeAulaMouseExited

    private void btnMeuPerfilMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMeuPerfilMouseMoved
        
        Color minhaCor = new Color(50,83,89);
        btnMeuPerfil.setBackground(minhaCor);          
    }//GEN-LAST:event_btnMeuPerfilMouseMoved

    private void btnMeuPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMeuPerfilMouseExited
        
        Color padrao = new Color(153,153,153);
        btnMeuPerfil.setBackground(padrao);         
    }//GEN-LAST:event_btnMeuPerfilMouseExited

    private void btnVoltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseMoved

        Color minhaCor = new Color(50,83,89);
        btnVoltar.setBackground(minhaCor);         
    }//GEN-LAST:event_btnVoltarMouseMoved

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited

        Color padrao = new Color(153,153,153);
        btnVoltar.setBackground(padrao);          
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnAvancarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvancarMouseMoved

        Color minhaCor = new Color(50,83,89);
        btnAvancar.setBackground(minhaCor);         
    }//GEN-LAST:event_btnAvancarMouseMoved

    private void btnAvancarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvancarMouseExited

        Color padrao = new Color(153,153,153);
        btnAvancar.setBackground(padrao);          
    }//GEN-LAST:event_btnAvancarMouseExited

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        // Ação de voltar page ( <- )
     
        
        btnAdicionaNovaOferta.setVisible(true);
        btnAvancar.setVisible(true);
        btnVoltar.setVisible(true);
        txtResultadoViewOfertas.setVisible(false);
        resultadoViewOferta.setVisible(false);
        btnHorarioDeAula.setVisible(true);
        btnMeuPerfil.setVisible(true);
        btnModificaOferta.setVisible(true);
        btnRemoveOferta.setVisible(true);
        btnVisualizarOfertas.setVisible(true);
        caixaDisciplinas.setVisible(true);
        lblMessageAdicionarOfertas.setVisible(true);
        lblMessageMeuPerfil.setVisible(true);
        lblMessageModificarOferta.setVisible(true);
        lblMessageQuadroHorario.setVisible(true);
        lblMessageRemoverOfertas.setVisible(true);
        lblMessageViewOfertas.setVisible(true);
        lblTitulo.setVisible(true);
        lblSubtitulo.setVisible(true);
        resultadoMeuPerfil.setVisible(false);
        txtResultadoViewMeuPerfil.setVisible(true);
        painelFotoPerfil.setVisible(false);
        imgFotoPerfil.setVisible(false);
        painelNovasOfertas.setVisible(false);
        painelRemoverOfertas.setVisible(false);
        painelModificaOfertas.setVisible(false);
        
        txtResultadoViewOfertas.setText(""); // coloquei aqui pq tava
        // dando erro
        
        txtRespostaAdicionarAno.setText("");
        txtRespostaAdicionarDisciplina.setSelectedIndex(0);
        txtRespostaAdicionarModalidade.setSelectedIndex(0); // zera tudo de Adicionar Ofertas
        txtRespostaAdicionarSemestre.setText("");
        txtRespostaAdicionarTurma.setText("");
        
        escolhaOfertaRemover.removeAllItems(); // remover todos os itens para evitar
        // sobreposição ao voltar a page
        ofertasDisponiveis.removeAllItems();
        
        painelQuadroHorario.setVisible(false); // painel de horarios
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // Ação de Avançar para última page acessada ( -> )
        
        if(this.visualizandoOferta == true){
            txtResultadoViewOfertas.setText("");
            btnVisualizarOfertasActionPerformed(evt);
            
        } else if(this.acessandoPerfil == true){
            btnMeuPerfilActionPerformed(evt);
        } else if(this.adicionandoOferta == true){
            btnAdicionaNovaOfertaActionPerformed(evt);
        } else if(this.removendoOferta == true) {
            btnRemoveOfertaActionPerformed(evt);
        } else if(this.modificandoOferta == true){
            btnModificaOfertaActionPerformed(evt);
        } else if(this.acessandoHorario == true){
            btnHorarioDeAulaActionPerformed(evt);
        }
        
        
        
        /*
        
            Preciso criar todas as ações de navegaçao, mas para isso,
            terei que terminar as açoes referentes aos outros botões
        
        */
        
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnMeuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuPerfilActionPerformed
        
        // Ação de imprimir dados pessoais
        
        
        this.visualizandoOferta = false;
        this.acessandoHorario = false;
        this.adicionandoOferta = false;
        this.removendoOferta = false;
        this.modificandoOferta = false;        
        this.acessandoPerfil = true;
        // otimizando a ação de voltar e avançar
        
        resultadoViewOferta.setVisible(false);
        txtResultadoViewOfertas.setVisible(false);
        btnAdicionaNovaOferta.setVisible(false);
        btnAvancar.setVisible(false);
        btnVoltar.setVisible(true);
        btnHorarioDeAula.setVisible(false);
        btnMeuPerfil.setVisible(false);
        btnModificaOferta.setVisible(false);
        btnRemoveOferta.setVisible(false);
        btnVisualizarOfertas.setVisible(false);
        caixaDisciplinas.setVisible(false);
        lblMessageAdicionarOfertas.setVisible(false);
        lblMessageMeuPerfil.setVisible(false);
        lblMessageModificarOferta.setVisible(false);
        lblMessageQuadroHorario.setVisible(false);
        lblMessageRemoverOfertas.setVisible(false);
        lblMessageViewOfertas.setVisible(false);
        lblTitulo.setVisible(true);
        lblSubtitulo.setVisible(false); 
        resultadoMeuPerfil.setVisible(true);
        txtResultadoViewMeuPerfil.setVisible(true);
        imgFotoPerfil.setVisible(true);
        painelFotoPerfil.setVisible(true);
        
        
        txtResultadoViewMeuPerfil.setText(primeiro.toString());
        
    }//GEN-LAST:event_btnMeuPerfilActionPerformed

    private void btnAdicionaNovaOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaNovaOfertaActionPerformed
        

        // Adicionando nova oferta
        
        this.visualizandoOferta = false;
        this.acessandoHorario = false;
        this.adicionandoOferta = true;
        this.removendoOferta = false;
        this.modificandoOferta = false;        
        this.acessandoPerfil = false;
        // otimizando a ação de voltar e avançar
        
        resultadoViewOferta.setVisible(false);
        txtResultadoViewOfertas.setVisible(false);
        btnAdicionaNovaOferta.setVisible(false);
        btnAvancar.setVisible(false);
        btnVoltar.setVisible(true);
        btnHorarioDeAula.setVisible(false);
        btnMeuPerfil.setVisible(false);
        btnModificaOferta.setVisible(false);
        btnRemoveOferta.setVisible(false);
        btnVisualizarOfertas.setVisible(false);
        caixaDisciplinas.setVisible(false);
        lblMessageAdicionarOfertas.setVisible(false);
        lblMessageMeuPerfil.setVisible(false);
        lblMessageModificarOferta.setVisible(false);
        lblMessageQuadroHorario.setVisible(false);
        lblMessageRemoverOfertas.setVisible(false);
        lblMessageViewOfertas.setVisible(false);
        lblTitulo.setVisible(true);
        lblSubtitulo.setVisible(false); 
        resultadoMeuPerfil.setVisible(false);
        txtResultadoViewMeuPerfil.setVisible(false);
        imgFotoPerfil.setVisible(false);
        painelFotoPerfil.setVisible(false);
        lblMessageOfertaCriadaSucesso.setVisible(false);
        lblMessageOfertaErro.setVisible(false);
        lblMessageCodigoRepetido.setVisible(false);
        
        painelNovasOfertas.setVisible(true);
        
               

    }//GEN-LAST:event_btnAdicionaNovaOfertaActionPerformed
           // Ação do botão do método de criar ofertas 
    private void btnOfertaCriadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertaCriadaActionPerformed
        
        try{
        
        int codigoTurma = Integer.parseInt(txtRespostaAdicionarTurma.getText());  
        int ano = Integer.parseInt(txtRespostaAdicionarAno.getText());
        int semestre = Integer.parseInt(txtRespostaAdicionarSemestre.getText());
        int modalidade = 0;
        
        if(txtRespostaAdicionarModalidade.getSelectedIndex() == 0){
            modalidade = 1;
        } else if(txtRespostaAdicionarModalidade.getSelectedIndex() == 1){
            modalidade = 2;
        } else if(txtRespostaAdicionarModalidade.getSelectedIndex() == 2){
            modalidade = 3;
        }
        
        
        // validando se possui oferta já com o código informado, para evitar duplicatas
        
        for(Oferta of : novoTeste.ofertas){
            if(codigoTurma == of.getTurma()){
                this.setCodigoValido(false);
                lblMessageCodigoRepetido.setVisible(true);
                lblMessageOfertaCriadaSucesso.setVisible(false);
                lblMessageOfertaErro.setVisible(false);
                break;
            } else{
                this.setCodigoValido(true);
            }
        }
        
        
        
        /*
        
        basicamente, uma validação pra cada índice de itens
        
        */
        
        if(this.getCodigoValido() == true){
            
            for(int i = 0 ; i < novoTeste.d.size();i++){
                if(txtRespostaAdicionarDisciplina.getSelectedIndex() == i){
                    novoTeste.ofertas.add(new Oferta(codigoTurma, ano, semestre, modalidade, novoTeste.d.get(i)));
                    lblMessageOfertaCriadaSucesso.setVisible(true);
                    lblMessageCodigoRepetido.setVisible(false);
                    lblMessageOfertaErro.setVisible(false);
                    break;
                }else{
                    continue;
                }
            }   
            
        } // isso impede duplicatas na criação de ofertas
        

        if(novoTeste.ofertas.isEmpty() == true){ // caso a lista esteja vazia, uma otimização
        
            for(int i = 0 ; i < novoTeste.d.size();i++){
                if(txtRespostaAdicionarDisciplina.getSelectedIndex() == i){
                    novoTeste.ofertas.add(new Oferta(codigoTurma, ano, semestre, modalidade, novoTeste.d.get(i)));
                    lblMessageOfertaCriadaSucesso.setVisible(true);
                    lblMessageCodigoRepetido.setVisible(false);
                    lblMessageOfertaErro.setVisible(false);
                    break;
                }else{
                    continue;
                }
            }              
            
        }
        
        
        /*
        
        a lógica acima é caso uma condição seja true,
        uma nova oferta é criada, deixando a mensagem de sucesso visível
        e a de erro invisível
        
        */

        } catch(Exception e){
                
                lblMessageCodigoRepetido.setVisible(false);
                lblMessageOfertaCriadaSucesso.setVisible(false);
                lblMessageOfertaErro.setVisible(true); // caso algum erro aconteça,
                // uma mensagem amigável é impressa
        }

        
    }//GEN-LAST:event_btnOfertaCriadaActionPerformed

    private void btnOfertaCriadaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOfertaCriadaMouseMoved
        
        Color minhaCor = new Color(50,83,89);
        btnOfertaCriada.setBackground(minhaCor);          
    }//GEN-LAST:event_btnOfertaCriadaMouseMoved

    private void btnOfertaCriadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOfertaCriadaMouseExited
        
        Color padrao = new Color(153,153,153);
        btnOfertaCriada.setBackground(padrao);          
    }//GEN-LAST:event_btnOfertaCriadaMouseExited

    private void btnRemoveOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOfertaActionPerformed

        

        // ação para remover ofertas
        
        this.visualizandoOferta = false;
        this.acessandoHorario = false;
        this.adicionandoOferta = false;
        this.removendoOferta = true;
        this.modificandoOferta = false;        
        this.acessandoPerfil = false;
        // otimizando a ação de voltar e avançar
        

    if(novoTeste.ofertas.isEmpty() == true){
        String caixaVazia = "Nenhuma oferta disponível";
        escolhaOfertaRemover.addItem(caixaVazia);
        btnRemoverEscolhaOferta.setVisible(false);
    } else {   
        
        for(Oferta d : novoTeste.ofertas){ // preenchendo a caixa de acordo com as ofertas já existentes
            
              String item = "Oferta "+Integer.toString(d.getTurma());
              escolhaOfertaRemover.addItem(item);

        }
              escolhaOfertaRemover.addItem("Excluir Todas");
              btnRemoverEscolhaOferta.setVisible(true);
            
    }    
        resultadoViewOferta.setVisible(false);
        txtResultadoViewOfertas.setVisible(false);
        btnAdicionaNovaOferta.setVisible(false);
        btnAvancar.setVisible(false);
        btnVoltar.setVisible(true);
        btnHorarioDeAula.setVisible(false);
        btnMeuPerfil.setVisible(false);
        btnModificaOferta.setVisible(false);
        btnRemoveOferta.setVisible(false);
        btnVisualizarOfertas.setVisible(false);
        caixaDisciplinas.setVisible(false);
        lblMessageAdicionarOfertas.setVisible(false);
        lblMessageMeuPerfil.setVisible(false);
        lblMessageModificarOferta.setVisible(false);
        lblMessageQuadroHorario.setVisible(false);
        lblMessageRemoverOfertas.setVisible(false);
        lblMessageViewOfertas.setVisible(false);
        lblTitulo.setVisible(true);
        lblSubtitulo.setVisible(false); 
        resultadoMeuPerfil.setVisible(false);
        txtResultadoViewMeuPerfil.setVisible(false);
        imgFotoPerfil.setVisible(false);
        painelFotoPerfil.setVisible(false);
        lblMessageOfertaCriadaSucesso.setVisible(false);
        lblMessageOfertaErro.setVisible(false);
        painelNovasOfertas.setVisible(false);
        painelRemoverOfertas.setVisible(true); 
        btnRemoverSim.setVisible(false);
        btnRemoverNao.setVisible(false);
        lblMessageCertezaOuNao.setVisible(false);
        lblMessageRemovidaComSucesso.setVisible(false);
        
        
    }//GEN-LAST:event_btnRemoveOfertaActionPerformed

    private void btnRemoverEscolhaOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverEscolhaOfertaActionPerformed
        
        // esse botão executa a lógica de exclusão de ofertas
        // e dá a vez para outros botões.

        lblMessageCertezaOuNao.setVisible(true);
        btnRemoverSim.setVisible(true);
        btnRemoverNao.setVisible(true);
        lblMessageRemovidaComSucesso.setVisible(false);
        
    }//GEN-LAST:event_btnRemoverEscolhaOfertaActionPerformed

    private void btnRemoverSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverSimActionPerformed
        
            // esse botão apagará a oferta e imprimirá uma mensagem de sucesso
            int ultimoNumero = novoTeste.ofertas.size();
            
        for(int i = 0; i < novoTeste.ofertas.size();i++){
            if(escolhaOfertaRemover.getSelectedIndex() == i){
                this.novoTeste.ofertas.remove(i);
            }else {    
                continue;
            }
        }
            
            if(escolhaOfertaRemover.getSelectedIndex() == ultimoNumero){ // remove tudo da lista existente
                this.novoTeste.ofertas.clear();
            }
        
            lblMessageRemovidaComSucesso.setVisible(true);
            btnRemoverSim.setVisible(false);
            btnRemoverNao.setVisible(false);
            lblMessageCertezaOuNao.setVisible(false);
    }//GEN-LAST:event_btnRemoverSimActionPerformed

    private void btnRemoverNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverNaoActionPerformed
        

            // esse botão retira a mensagem para o usuario
            // e deixa o mesmo livre pela page
            
            lblMessageCertezaOuNao.setVisible(false);
            btnRemoverNao.setVisible(false);
            btnRemoverSim.setVisible(false);
        
    }//GEN-LAST:event_btnRemoverNaoActionPerformed

    private void btnRemoverEscolhaOfertaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverEscolhaOfertaMouseMoved

        Color minhaCor = new Color(50,83,89);
        btnRemoverEscolhaOferta.setBackground(minhaCor);  
        
    }//GEN-LAST:event_btnRemoverEscolhaOfertaMouseMoved

    private void btnRemoverEscolhaOfertaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverEscolhaOfertaMouseExited

        Color padrao = new Color(153,153,153);
        btnRemoverEscolhaOferta.setBackground(padrao); 
        
    }//GEN-LAST:event_btnRemoverEscolhaOfertaMouseExited

    private void btnRemoverSimMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverSimMouseMoved

        Color minhaCor = new Color(50,83,89);
        btnRemoverSim.setBackground(minhaCor); 
        
    }//GEN-LAST:event_btnRemoverSimMouseMoved

    private void btnRemoverSimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverSimMouseExited

        Color padrao = new Color(153,153,153);
        btnRemoverSim.setBackground(padrao); 
        
    }//GEN-LAST:event_btnRemoverSimMouseExited

    private void btnRemoverNaoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverNaoMouseMoved

        Color minhaCor = new Color(50,83,89);
        btnRemoverNao.setBackground(minhaCor); 
        
    }//GEN-LAST:event_btnRemoverNaoMouseMoved

    private void btnRemoverNaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverNaoMouseExited

        Color padrao = new Color(153,153,153);
        btnRemoverNao.setBackground(padrao); 
        
    }//GEN-LAST:event_btnRemoverNaoMouseExited

    private void btnModificaOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaOfertaActionPerformed
        

        // Ação que dá acesso a page de MOdificar Ofertas
        
        this.visualizandoOferta = false;
        this.acessandoHorario = false;
        this.adicionandoOferta = false;
        this.removendoOferta = false;
        this.modificandoOferta = true;        
        this.acessandoPerfil = false;
        
        // otimizando a ação de voltar e avançar
        
        if(novoTeste.ofertas.isEmpty() == true){ // caso nao existir nenhuma oferta disponível
            String vazio = "Nenhuma oferta disponível";
            ofertasDisponiveis.addItem(vazio);
        }

        
        for(Oferta d : novoTeste.ofertas){ // preenchendo a caixa 1 de acordo com as ofertas já existentes
            
              String item = "Oferta "+Integer.toString(d.getTurma());
              ofertasDisponiveis.addItem(item);
              
        }
              
        resultadoViewOferta.setVisible(false);
        txtResultadoViewOfertas.setVisible(false);
        btnAdicionaNovaOferta.setVisible(false);
        btnAvancar.setVisible(false);
        btnVoltar.setVisible(true);
        btnHorarioDeAula.setVisible(false);
        btnMeuPerfil.setVisible(false);
        btnModificaOferta.setVisible(false);
        btnRemoveOferta.setVisible(false);
        btnVisualizarOfertas.setVisible(false);
        caixaDisciplinas.setVisible(false);
        lblMessageAdicionarOfertas.setVisible(false);
        lblMessageMeuPerfil.setVisible(false);
        lblMessageModificarOferta.setVisible(false);
        lblMessageQuadroHorario.setVisible(false);
        lblMessageRemoverOfertas.setVisible(false);
        lblMessageViewOfertas.setVisible(false);
        lblTitulo.setVisible(true);
        lblSubtitulo.setVisible(false); 
        resultadoMeuPerfil.setVisible(false);
        txtResultadoViewMeuPerfil.setVisible(false);
        imgFotoPerfil.setVisible(false);
        painelFotoPerfil.setVisible(false);
        lblMessageOfertaCriadaSucesso.setVisible(false);
        lblMessageOfertaErro.setVisible(false);
        painelNovasOfertas.setVisible(false);
        painelRemoverOfertas.setVisible(false); 
        btnRemoverSim.setVisible(false);
        btnRemoverNao.setVisible(false);
        lblMessageCertezaOuNao.setVisible(false);
        lblMessageRemovidaComSucesso.setVisible(false);
        painelModificaOfertas.setVisible(true);
        
        // alguns componentes que não quero para aparecer logo de início
        
        lblCodigoDaTurma.setVisible(false);
        lblAno.setVisible(false);
        lblModalidade.setVisible(false);
        lblSemestre.setVisible(false);
        lblDisciplina.setVisible(false);
        lblMessageInfo.setVisible(false);
        lblMessageSalvoComSucesso.setVisible(false);
        disciplinasDisponiveis.setVisible(false);
        txtAno.setVisible(false);
        txtCodigoTurma.setVisible(false);
        txtSemestre.setVisible(false);
        txtModalidade.setVisible(false);
        btnSalvarModificacoes.setVisible(false);
        lblCodigoExistente.setVisible(false);
        
        this.setCodigoValido(false);

        
    }//GEN-LAST:event_btnModificaOfertaActionPerformed

    private void ofertasDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofertasDisponiveisActionPerformed
        
        // Ação da caixa de seleção da área de MOdificar Ofertas
        
        boolean ofertaVazia = false;
        
    if(novoTeste.ofertas.isEmpty() == true){ // caso esteja vazia, só imprime a msg
                ofertaVazia = true;
    }else{
        
        
        
        for(int i = 0; i < novoTeste.ofertas.size();i++){
            if(ofertasDisponiveis.getSelectedIndex() == i){
                
               this.setOfertaEscolhida(i);
               txtCodigoTurma.setText(Integer.toString(novoTeste.ofertas.get(i).getTurma()));
               txtAno.setText(Integer.toString(novoTeste.ofertas.get(i).getAno()));
               txtSemestre.setText(Integer.toString(novoTeste.ofertas.get(i).getSemestre()));
               txtModalidade.setSelectedIndex(novoTeste.ofertas.get(i).getModalidade() - 1);
               disciplinasDisponiveis.setSelectedIndex(novoTeste.ofertas.get(i).getDisciplina().getCodigo()
                       - 1);
                            
           } 
        }
    
        
               lblCodigoDaTurma.setVisible(true);
               txtCodigoTurma.setVisible(true);
               lblAno.setVisible(true);
               txtAno.setVisible(true);
               lblSemestre.setVisible(true);
               txtSemestre.setVisible(true);
               lblModalidade.setVisible(true);
               txtModalidade.setVisible(true);
               lblDisciplina.setVisible(true);
               disciplinasDisponiveis.setVisible(true);
               btnSalvarModificacoes.setVisible(true);
               lblMessageInfo.setVisible(true);
               lblMessageSalvoComSucesso.setVisible(false);
        
    }    
    }//GEN-LAST:event_ofertasDisponiveisActionPerformed

    private void btnSalvarModificacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarModificacoesActionPerformed
        
            // verificar se o codigo de turma já existe
            
            boolean ativado = false;
            
            for(Oferta of : novoTeste.ofertas){
                if(txtCodigoTurma.getText().equals(Integer.toString(of.getTurma()))){
                    lblCodigoExistente.setVisible(true);
                    lblMessageSalvoComSucesso.setVisible(false);
                    this.setCodigoValido(false);

                    break;
                } else{
                    this.setCodigoValido(true);
                }
            }
            
            if(this.getCodigoValido() == true){
            
            // Ação de Salvar as modificações feitas em Modificar Ofertas
            
            novoTeste.ofertas.get(this.getOfertaEscolhida()).setTurma(Integer.parseInt(txtCodigoTurma.getText()));
            novoTeste.ofertas.get(this.getOfertaEscolhida()).setAno(Integer.parseInt(txtAno.getText()));
            novoTeste.ofertas.get(this.getOfertaEscolhida()).setSemestre(Integer.parseInt(txtSemestre.getText()));
            
            // condições para modalidade e disciplina
            
            
            // Modalidade
            
            if(txtModalidade.getSelectedIndex() == 0){
               novoTeste.ofertas.set(this.getOfertaEscolhida(), new Oferta(Integer.parseInt(
               txtCodigoTurma.getText()),Integer.parseInt(txtAno.getText()),Integer.parseInt(
               txtSemestre.getText()),1,novoTeste.ofertas.get(this.getOfertaEscolhida()).getDisciplina()));
            } else if(txtModalidade.getSelectedIndex() == 1){
               novoTeste.ofertas.set(this.getOfertaEscolhida(), new Oferta(Integer.parseInt(
               txtCodigoTurma.getText()),Integer.parseInt(txtAno.getText()),Integer.parseInt(
               txtSemestre.getText()),2,novoTeste.ofertas.get(this.getOfertaEscolhida()).getDisciplina()));                
            } else if(txtModalidade.getSelectedIndex() == 2){
               novoTeste.ofertas.set(this.getOfertaEscolhida(), new Oferta(Integer.parseInt(
               txtCodigoTurma.getText()),Integer.parseInt(txtAno.getText()),Integer.parseInt(
               txtSemestre.getText()),3,novoTeste.ofertas.get(this.getOfertaEscolhida()).getDisciplina()));                
            } // substituo uma nova oferta modificada no lugar da antes existente
            

            // Disciplina
            
            if(disciplinasDisponiveis.getSelectedIndex() == 0){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(0));
            } else if(disciplinasDisponiveis.getSelectedIndex() == 1){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(1));
            } else if(disciplinasDisponiveis.getSelectedIndex() == 2){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(2));
            } else if(disciplinasDisponiveis.getSelectedIndex() == 3){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(3));
            }
            
                    lblMessageSalvoComSucesso.setVisible(true);
                    lblCodigoExistente.setVisible(false);                
            
        }else {
                
            novoTeste.ofertas.get(this.getOfertaEscolhida()).setAno(Integer.parseInt(txtAno.getText()));
            novoTeste.ofertas.get(this.getOfertaEscolhida()).setSemestre(Integer.parseInt(txtSemestre.getText()));
            
            // condições para modalidade e disciplina
            
            
            // Modalidade
            
            if(txtModalidade.getSelectedIndex() == 0){
               novoTeste.ofertas.set(this.getOfertaEscolhida(), new Oferta(novoTeste.ofertas.get(this.ofertaEscolhida).getTurma(),
               Integer.parseInt(txtAno.getText()),Integer.parseInt(
               txtSemestre.getText()),1,novoTeste.ofertas.get(this.getOfertaEscolhida()).getDisciplina()));
            } else if(txtModalidade.getSelectedIndex() == 1){
               novoTeste.ofertas.set(this.getOfertaEscolhida(), new Oferta(novoTeste.ofertas.get(this.ofertaEscolhida).getTurma(),
               Integer.parseInt(txtAno.getText()),Integer.parseInt(
               txtSemestre.getText()),2,novoTeste.ofertas.get(this.getOfertaEscolhida()).getDisciplina()));                
            } else if(txtModalidade.getSelectedIndex() == 2){
               novoTeste.ofertas.set(this.getOfertaEscolhida(), new Oferta(novoTeste.ofertas.get(this.ofertaEscolhida).getTurma(),
               Integer.parseInt(txtAno.getText()),Integer.parseInt(
               txtSemestre.getText()),3,novoTeste.ofertas.get(this.getOfertaEscolhida()).getDisciplina()));                
            } // substituo uma nova oferta modificada no lugar da antes existente
            

            // Disciplina
            
            if(disciplinasDisponiveis.getSelectedIndex() == 0){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(0));
            } else if(disciplinasDisponiveis.getSelectedIndex() == 1){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(1));
            } else if(disciplinasDisponiveis.getSelectedIndex() == 2){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(2));
            } else if(disciplinasDisponiveis.getSelectedIndex() == 3){
               novoTeste.ofertas.get(this.getOfertaEscolhida()).setDisciplina(novoTeste.d.get(3));
            }
                    
                    lblMessageSalvoComSucesso.setVisible(true);
                    lblCodigoExistente.setVisible(true);          
        } 

    }//GEN-LAST:event_btnSalvarModificacoesActionPerformed

    private void btnSalvarModificacoesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarModificacoesMouseMoved
        // Ação do botão de Salvar
        
        Color minhaCor = new Color(50,83,89);
        btnSalvarModificacoes.setBackground(minhaCor); 
        
    }//GEN-LAST:event_btnSalvarModificacoesMouseMoved

    private void btnSalvarModificacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarModificacoesMouseExited
        
        
        Color padrao = new Color(153,153,153);
        btnSalvarModificacoes.setBackground(padrao);        
    }//GEN-LAST:event_btnSalvarModificacoesMouseExited

    private void btnHorarioDeAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioDeAulaActionPerformed
        // ação que exibe a page de Horários
        
        this.visualizandoOferta = false;
        this.acessandoHorario = true;
        this.adicionandoOferta = false;
        this.removendoOferta = false;
        this.modificandoOferta = false;        
        this.acessandoPerfil = false; 
        
        // otimizando a função de voltar e avançar
        
        resultadoViewOferta.setVisible(false);
        txtResultadoViewOfertas.setVisible(false);
        btnAdicionaNovaOferta.setVisible(false);
        btnAvancar.setVisible(false);
        btnVoltar.setVisible(true);
        btnHorarioDeAula.setVisible(false);
        btnMeuPerfil.setVisible(false);
        btnModificaOferta.setVisible(false);
        btnRemoveOferta.setVisible(false);
        btnVisualizarOfertas.setVisible(false);
        caixaDisciplinas.setVisible(false);
        lblMessageAdicionarOfertas.setVisible(false);
        lblMessageMeuPerfil.setVisible(false);
        lblMessageModificarOferta.setVisible(false);
        lblMessageQuadroHorario.setVisible(false);
        lblMessageRemoverOfertas.setVisible(false);
        lblMessageViewOfertas.setVisible(false);
        lblTitulo.setVisible(true);
        lblSubtitulo.setVisible(false); 
        resultadoMeuPerfil.setVisible(false);
        txtResultadoViewMeuPerfil.setVisible(false);
        imgFotoPerfil.setVisible(false);
        painelFotoPerfil.setVisible(false);
        lblMessageOfertaCriadaSucesso.setVisible(false);
        lblMessageOfertaErro.setVisible(false);
        painelNovasOfertas.setVisible(false);
        painelRemoverOfertas.setVisible(false); 
        btnRemoverSim.setVisible(false);
        btnRemoverNao.setVisible(false);
        lblMessageCertezaOuNao.setVisible(false);
        lblMessageRemovidaComSucesso.setVisible(false);
        painelModificaOfertas.setVisible(false);
        painelQuadroHorario.setVisible(true);

        // alguns componentes que não quero que apareçam de início
        
        painelHorarioSemestral.setVisible(true);
        
    }//GEN-LAST:event_btnHorarioDeAulaActionPerformed

    private void escolhaOfertaRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaOfertaRemoverActionPerformed
        // ação de escolher item em remover ofertas
        
            lblMessageCertezaOuNao.setVisible(false);
            btnRemoverNao.setVisible(false);
            btnRemoverSim.setVisible(false); 
            lblMessageRemovidaComSucesso.setVisible(false);
            
        /*
            
        Sempre que escolhermos um item, os botões e mensagens desaparecerão    
            
        */    
            
    }//GEN-LAST:event_escolhaOfertaRemoverActionPerformed

       
        

    
    
    
    /*
    
        getters and setters dos atributos boolean
        
     */
    
    
    public boolean isVisualizandoOferta() {
        return visualizandoOferta;
    }

    public void setVisualizandoOferta(boolean visualizandoOferta) {
        this.visualizandoOferta = visualizandoOferta;
    }

    public boolean isAdicionandoOferta() {
        return adicionandoOferta;
    }

    public void setAdicionandoOferta(boolean adicionandoOferta) {
        this.adicionandoOferta = adicionandoOferta;
    }

    public boolean isRemovendoOferta() {
        return removendoOferta;
    }

    public void setRemovendoOferta(boolean removendoOferta) {
        this.removendoOferta = removendoOferta;
    }

    public boolean isModificandoOferta() {
        return modificandoOferta;
    }

    public void setModificandoOferta(boolean modificandoOferta) {
        this.modificandoOferta = modificandoOferta;
    }

    public boolean isAcessandoHorario() {
        return acessandoHorario;
    }

    public void setAcessandoHorario(boolean acessandoHorario) {
        this.acessandoHorario = acessandoHorario;
    }

    public boolean isAcessandoPerfil() {
        return acessandoPerfil;
    }

    public void setAcessandoPerfil(boolean acessandoPerfil) {
        this.acessandoPerfil = acessandoPerfil;
    }

    public int getOfertaEscolhida() {
        return ofertaEscolhida;
    }

    public void setOfertaEscolhida(int ofertaEscolhida) {
        this.ofertaEscolhida = ofertaEscolhida;
    }

    public boolean getCodigoValido() {
        return codigoValido;
    }

    public void setCodigoValido(boolean codigoValido) {
        this.codigoValido = codigoValido;
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
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaNovaOferta;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnHorarioDeAula;
    private javax.swing.JButton btnMeuPerfil;
    private javax.swing.JButton btnModificaOferta;
    private javax.swing.JButton btnOfertaCriada;
    private javax.swing.JButton btnRemoveOferta;
    private javax.swing.JButton btnRemoverEscolhaOferta;
    private javax.swing.JButton btnRemoverNao;
    private javax.swing.JButton btnRemoverSim;
    private javax.swing.JButton btnSalvarModificacoes;
    private javax.swing.JButton btnVisualizarOfertas;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> caixaDisciplinas;
    private javax.swing.JComboBox<String> disciplinasDisponiveis;
    private javax.swing.JComboBox<String> escolhaOfertaRemover;
    private javax.swing.JLabel imgFotoPerfil;
    private javax.swing.JLabel lblAdicionaAno;
    private javax.swing.JLabel lblAdicionaCodigoTurma;
    private javax.swing.JLabel lblAdicionaDisciplina;
    private javax.swing.JLabel lblAdicionaModalidade;
    private javax.swing.JLabel lblAdicionaSemestre;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCodigoDaTurma;
    private javax.swing.JLabel lblCodigoExistente;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblDisciplinasSegunda1;
    private javax.swing.JLabel lblDisciplinasSegunda2;
    private javax.swing.JLabel lblDisciplinasSegunda3;
    private javax.swing.JLabel lblDisciplinasSegunda4;
    private javax.swing.JLabel lblDisciplinasTerca1;
    private javax.swing.JLabel lblDisciplinasTerca2;
    private javax.swing.JLabel lblDisciplinasTerca3;
    private javax.swing.JLabel lblDisciplinasTerca4;
    private javax.swing.JLabel lblMessageAdicionarOfertas;
    private javax.swing.JLabel lblMessageCertezaOuNao;
    private javax.swing.JLabel lblMessageCodigoRepetido;
    private javax.swing.JLabel lblMessageInfo;
    private javax.swing.JLabel lblMessageMeuPerfil;
    private javax.swing.JLabel lblMessageModificarOferta;
    private javax.swing.JLabel lblMessageOfertaCriadaSucesso;
    private javax.swing.JLabel lblMessageOfertaErro;
    private javax.swing.JLabel lblMessageOfertaRemovida;
    private javax.swing.JLabel lblMessageOfertasDisponiveis;
    private javax.swing.JLabel lblMessageQuadro;
    private javax.swing.JLabel lblMessageQuadroHorario;
    private javax.swing.JLabel lblMessageRemoverOfertas;
    private javax.swing.JLabel lblMessageRemovidaComSucesso;
    private javax.swing.JLabel lblMessageSalvoComSucesso;
    private javax.swing.JLabel lblMessageViewOfertas;
    private javax.swing.JLabel lblModalidade;
    private javax.swing.JLabel lblQuarta;
    private javax.swing.JLabel lblQuarta1;
    private javax.swing.JLabel lblQuarta2;
    private javax.swing.JLabel lblQuarta3;
    private javax.swing.JLabel lblQuarta4;
    private javax.swing.JLabel lblQuinta;
    private javax.swing.JLabel lblQuinta1;
    private javax.swing.JLabel lblQuinta2;
    private javax.swing.JLabel lblQuinta3;
    private javax.swing.JLabel lblQuinta4;
    private javax.swing.JLabel lblSabado;
    private javax.swing.JLabel lblSegunda;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JLabel lblSexta;
    private javax.swing.JLabel lblSexta1;
    private javax.swing.JLabel lblSexta2;
    private javax.swing.JLabel lblSexta3;
    private javax.swing.JLabel lblSexta4;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTerca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator linhaH1;
    private javax.swing.JSeparator linhaH2;
    private javax.swing.JSeparator linhaH3;
    private javax.swing.JSeparator linhaV1;
    private javax.swing.JSeparator linhaV2;
    private javax.swing.JSeparator linhaV3;
    private javax.swing.JSeparator linhaV4;
    private javax.swing.JSeparator linhaV5;
    private javax.swing.JComboBox<String> ofertasDisponiveis;
    private javax.swing.JPanel painelFotoPerfil;
    private javax.swing.JPanel painelHorarioSemestral;
    private javax.swing.JPanel painelModificaOfertas;
    private javax.swing.JPanel painelNovasOfertas;
    private javax.swing.JPanel painelQuadroHorario;
    private javax.swing.JPanel painelRemoverOfertas;
    private javax.swing.JScrollPane resultadoMeuPerfil;
    private javax.swing.JScrollPane resultadoViewOferta;
    private javax.swing.JLabel sabado1;
    private javax.swing.JLabel sabado2;
    private javax.swing.JLabel sabado3;
    private javax.swing.JLabel sabado4;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCodigoTurma;
    private javax.swing.JComboBox<String> txtModalidade;
    private javax.swing.JTextField txtRespostaAdicionarAno;
    private javax.swing.JComboBox<String> txtRespostaAdicionarDisciplina;
    private javax.swing.JComboBox<String> txtRespostaAdicionarModalidade;
    private javax.swing.JTextField txtRespostaAdicionarSemestre;
    private javax.swing.JTextField txtRespostaAdicionarTurma;
    private javax.swing.JTextArea txtResultadoViewMeuPerfil;
    private javax.swing.JTextArea txtResultadoViewOfertas;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}

/*

tamanho do projeto 1000/878

*/


/*

Hoje eu criei os labels para os resultados da lista de ofertas, criei animacoes de mouse
e um botao para a primeira funcionalidade 17 / 06 / 2021

*/

/*

Hoje (18/06/2021), criei as animações restantes, ícones e botões...fora isso,
comecei um tipo de sistema de navegação entre as ações feitas pelo usuário,
só não finalizei ainda devido às ações de conteúdo que não foram implementadas
ainda.

*/

/*

19/06/2021 - Primeiro método(Ver Ofertas) funcionando, tentarei dar um visual
melhor, mas, só depois

           - Método de Acessar dados do meu perfil funcionando, tentarei
adicionar um ícone central como foto de perfil...retirei o botão de avançar 
em métodos, o mesmo só aparecerá quando utilizarmos o "voltar".

Já Adicionei ícone de perfil, alinhei as margens e colori os backgrouns do
painel de foto de perfil e painel do texto.

Por ultimo, criei um painel só para Adicionar Oferta, percebi que se eu
colocar  tudo em um painel só, consigo deixar tudo invisível a hora
que eu quiser, sem precisar setar muitas coisas

Parei por hoje, preciso fazer funcionar logo, ou criar novos painéis...
amanha decido.


*/

/*

20/06/2021 - Botei as ações de adicionar oferta e remover ofertas para funcionarem, UFA!

Hoje fiz os testes e métodos para ambas funcionarem, claro que faltam uns testes ainda,
não estou totalmente confiante, porém, já é alguma coisa.

Além de pôr para funcionar, criei o painel de remover ofertas e seus componentes.

Amanhã tem mais trabalho!!! Estou quase conseguindo finalizá-lo. Graças a Deus.


*/



/*


21/06/2021 - Estou botando as ações de Modificar ofertas para funcionar

Por enquanto, as JComboBox estão funcionando, não estão sobrescrevendo nada,
enfim, por enquanto, tudo tranquilo...

Pausa....parei na tentativa te pôr o primeiro comboBox para funcionar

Fiz os dados serem preenchidos automaticamente, porém, falta finializar
a ação do botão de salvar dados modificados.


Acabo de achar uma forma de fazer funcionar as modificações...eu basicamente
substituir valores antigos por valores novos usando o .set dos métodos de ArrayList

então....quando o usuário troca os valores de uma oferta já existente, ele basicamente
está substituindo esses valores por valores novos, mesmo se ele não alterar um determinado campo.

não posso esquecer de usar o hover no botão de salvamento...


*/