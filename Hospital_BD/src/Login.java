import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame
{
	private JLabel nome, senha;
	private JTextField tnome;
	private JPasswordField tsenha;
	private JButton logar, sair, cadastro;
	private JCheckBox verificar;
	private JComboBox box;
	private String nomes[] = {"Bruno","Manjate"};
	private JPanel p1, butoespanel, senhapanel;
	private Container cont;
	public Login() 
	{
		super("Login Hospital");
		
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.setBackground(Color.WHITE);
		
		aparencia();
		
		p1 = new JPanel(new GridLayout(6,1));
		
		nome = new JLabel("     Nome");
		p1.add(nome);
		box = new JComboBox(nomes);
		p1.add(box);
		
		senha = new JLabel("     Senha");
		p1.add(senha);
		
		senhapanel = new JPanel(new GridLayout(1,2)); 
		
		tsenha = new JPasswordField(50);
		senhapanel.add(tsenha);
		
		verificar =    new JCheckBox("Verificar Senha");
		senhapanel.add(verificar);
		
		p1.add(senhapanel);
		
		butoespanel = new JPanel(new GridLayout(1,2));
		
		logar = new JButton("Logar");
		logar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_Menu_Principal();
			}
		});
		butoespanel.add(logar);
		
		cadastro = new JButton("Cadastro");
		cadastro.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				dispose();
				new Janela_Menu_Principal();
			}
		});
		butoespanel.add(cadastro);
		
		p1.add(butoespanel);
		
		sair  = new JButton("Sair");
		sair.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
			{
				System.exit(0);
			}
		});
		p1.add(sair); 
		
		cont.add(p1, BorderLayout.EAST); 
		
		setSize(1200,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void aparencia()
	{
				try 
				{
					for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
					{
						if ("Nimbus".equals(info.getName())) 
						{
							UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				}catch (Exception e) 
				{
					e.printStackTrace();
				}
	}
	
	public static void main(String [] args) 
	{
		new Login();
	}
}
