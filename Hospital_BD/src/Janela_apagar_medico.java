import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela_apagar_medico extends JFrame{

	private JButton adicionar, editar,apagar, visualizar, voltar, sair, limpar, add_dados;
	private JLabel id, nome; 
	private JTextField tid, tnome; 
	private Container cont;
	private JPanel p1, p2;
	public Janela_apagar_medico() 
	{
		super("Apagar Medico");
		
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.setBackground(Color.WHITE);
		
		p1 = new JPanel(new GridLayout(6,1));
		p2 = new JPanel(new GridLayout(6,1));
		
		id = new JLabel("   Id"); 
		p2.add(id);
		tid = new JTextField();
		p2.add(tid);
		
		nome = new JLabel("   Nome"); 
		p2.add(nome);
		tnome = new JTextField();
		p2.add(tnome);	
		
		limpar = new JButton("Limpar Campos");
		limpar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				tid.setText(""); 
				tnome.setText(""); 
			}
		});
		p2.add(limpar); 
		
		add_dados = new JButton("Apagar Dados Dados");
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
				new Janela_adicionar_medico();
			}
		});
		p1.add(adicionar); 
		
		editar = new JButton("Editar");
		editar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_editar_medico();
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
				new Janela_visualixar_medico();
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
		adicionar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				System.exit(0);
			}
		});
		p1.add(sair); 
		
		cont.add(p1,BorderLayout.WEST);
		cont.add(p2,BorderLayout.CENTER);
		
		setSize(1000,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
