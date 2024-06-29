import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela_apagar_consulta extends JFrame{

	private JButton adicionar, editar,apagar, visualizar, voltar, sair, limpar, add_dados;
	private JLabel utente, data, medicamentos, sala, medico, relatorio;
	private JTextField tutente, tdata, tmedicamentos, tsala, tmedico, trelatorio;
	private Container cont;
	private JPanel p1, p2;
	public Janela_apagar_consulta() 
	{
		super("Apagar Utente");
		
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.setBackground(Color.WHITE);
		
		p1 = new JPanel(new GridLayout(6,1));
		p2 = new JPanel(new GridLayout(14,1));
		
		utente = new JLabel("   Utente"); 
		p2.add(utente);
		tutente = new JTextField();
		p2.add(tutente);
		
		data = new JLabel("   Data Hora"); 
		p2.add(data);
		tdata = new JTextField();
		p2.add(tdata);
		
		medicamentos = new JLabel("   Medicamentos"); 
		p2.add(medicamentos);
		tmedicamentos = new JTextField();
		p2.add(tmedicamentos);
		
		sala = new JLabel("   Sala"); 
		p2.add(sala);
		tsala = new JTextField();
		p2.add(tsala);
		
		medico = new JLabel("   Medico"); 
		p2.add(medico);
		tmedico = new JTextField();
		p2.add(tmedico);
		
		relatorio = new JLabel("   Relatorio"); 
		p2.add(relatorio);
		trelatorio = new JTextField();
		p2.add(trelatorio);
		
		
		limpar = new JButton("Limpar Campos");
		limpar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				tutente.setText(""); 
				tsala.setText(""); 
				tmedico.setText("");
				tdata.setText("");
				trelatorio.setText("");
				tmedicamentos.setText("");
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
				Janela_visualizar_consulta a = new Janela_visualizar_consulta();
				
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
