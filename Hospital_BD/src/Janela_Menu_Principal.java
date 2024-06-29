import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Janela_Menu_Principal extends JFrame{

	private JButton utent, consulta, medico, medicamento, sala,dados_programador, sair;
	private Container cont;
	private JPanel p1;
	public Janela_Menu_Principal() 
	{
		super("Bem Vindo ao Hopsital");
		
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.setBackground(Color.WHITE);
		
		p1 = new JPanel(new GridLayout(8,1));
		
		utent = new JButton("Utente");
		utent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_utente_Principal();
			}
		});
		p1.add(utent);
		
		consulta = new JButton("Consulta");
		consulta.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_principal_consulta();
			}
		});
		p1.add(consulta);  
		
		medico = new JButton("medico");
		medico.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_principal_medico();
			}
		});
		p1.add(medico);
		
		medicamento = new JButton("medicamento");
		medicamento.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_principal_medicamento();
			}
		});
		p1.add(medicamento);
		
		sala = new JButton("Sala");
		sala.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_principal_sala();
			}
		});
		p1.add(sala); 
		
		dados_programador = new JButton("Dados do programadores");
		dados_programador.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				JOptionPane.showMessageDialog(null, "Dados Dos Programadores\nNome:\nCodigo:\nNome:\nCodigo:\nNome:\nCodigo:");
			}
		});
		p1.add(dados_programador);
		
		sair = new JButton("Sair");
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
