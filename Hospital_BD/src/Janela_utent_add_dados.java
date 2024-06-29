import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela_utent_add_dados extends JFrame{

	private JButton adicionar, editar,apagar, visualizar, voltar, sair, limpar, add_dados;
	private JLabel id, nome, genero, data_n,rua, numero, apartamento, codigop, cidade, email;
	private JTextField tid, tnome, tgenero, tdata_n,trua, tnumero, tapartamento, tcodigop, tcidade, temail;
	private Container cont;
	private JPanel p1, p2;
	public Janela_utent_add_dados() 
	{
		super("Adicionar Utente");
		
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.setBackground(Color.WHITE);
		
		p1 = new JPanel(new GridLayout(6,1));
		p2 = new JPanel(new GridLayout(22,1));
		
		id = new JLabel("   Id"); 
		p2.add(id);
		tid = new JTextField();
		p2.add(tid);
		
		nome = new JLabel("   Nome"); 
		p2.add(nome);
		tnome = new JTextField();
		p2.add(tnome);
		
		genero = new JLabel("   Genro"); 
		p2.add(genero);
		tgenero = new JTextField();
		p2.add(tgenero);
		
		data_n = new JLabel("   Data"); 
		p2.add(data_n);
		tdata_n = new JTextField();
		p2.add(tdata_n);
		
		rua = new JLabel("   Rua"); 
		p2.add(rua);
		trua = new JTextField();
		p2.add(trua);
		
		numero = new JLabel("   Numero"); 
		p2.add(numero);
		tnumero = new JTextField();
		p2.add(tnumero);
		
		apartamento = new JLabel("   Apartamento"); 
		p2.add(apartamento);
		tapartamento = new JTextField();
		p2.add(tapartamento);
		
		codigop = new JLabel("   Codigo Postal"); //nome, genero, data_n,rua, numero, apartamento, codigop, cidade, email; 
		p2.add(codigop);
		tcodigop = new JTextField();
		p2.add(tcodigop);
		
		cidade = new JLabel("   Cidade"); 
		p2.add(cidade);
		tcidade = new JTextField();
		p2.add(tcidade);
		
		email = new JLabel("   Email"); 
		p2.add(email);
		temail = new JTextField();
		p2.add(temail);
		
		limpar = new JButton("Limpar Campos");
		limpar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				tid.setText(""); 
				tnome.setText(""); 
				tgenero.setText("");
				tdata_n.setText("");
				trua.setText("");
				tnumero.setText("");
				tapartamento.setText("");
				tcodigop.setText("");
				tcidade.setText("");
				temail.setText("");
			}
		});
		p2.add(limpar); 
		
		add_dados = new JButton("Adicionar Dados");
		add_dados.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				
			}
		});
		p2.add(add_dados);
		
		adicionar = new JButton("Adicionar");
		adicionar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_utent_add_dados();
			}
		});
		p1.add(adicionar); 
		
		editar = new JButton("Editar");
		editar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_utent_editar();
			}
		});
		p1.add(editar); 
		
		apagar = new JButton("apagar");
		apagar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_utent_apagar();
			}
		});
		p1.add(apagar); 
		
		visualizar = new JButton("Visualizar");
		visualizar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_utent_visualizar();
			}
		});
		p1.add(visualizar); 
		
		voltar = new JButton("voltar");
		voltar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_Menu_Principal();
			}
		});
		p1.add(voltar);    
		
		sair  = new JButton("Sair");
		sair.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				System.exit(0);
			}
		});
		p1.add(sair); 
		
		cont.add(p1,BorderLayout.WEST);
		cont.add(p2,BorderLayout.CENTER);
		
		setSize(1000,800);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
