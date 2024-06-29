import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Janela_utente_Principal extends JFrame 
{
	private JButton adicionar, editar,apagar, visualizar, voltar, sair;
	private Container cont;
	private JPanel p1;
	public Janela_utente_Principal() 
	{
		super("Hopsital Dados Utente");
		
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.setBackground(Color.WHITE);
		
		p1 = new JPanel(new GridLayout(6,1));
		
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
		
		ImageIcon backGroundImage = new ImageIcon("yes.jpg");
		JLabel imagem = new JLabel(backGroundImage);
		cont.add(imagem);
		
		cont.add(p1,BorderLayout.WEST);
		
		setSize(1000,800);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
