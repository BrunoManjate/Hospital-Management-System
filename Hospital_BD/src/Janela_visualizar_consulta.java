import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela_visualizar_consulta extends JFrame
{
	
	public Janela_visualizar_consulta() 
	{
		
        JPanel panel = new JPanel(new BorderLayout());

       
        String[] colunas = {"Utente", "Data", "Medicamentos", "Sala", "Médico", "Relatório"};
        Object[][] dados = {
                {"Utente1", "01/01/2023", "Medicamento1", "Sala1", "Médico1", "Relatório1"},
                {"Utente2", "02/01/2023", "Medicamento2", "Sala2", "Médico2", "Relatório2"},
                
        };

        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));

        JScrollPane scrollPane = new JScrollPane(tabela);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	dispose();
				new Janela_Menu_Principal();
            }
        });

        panel.add(botaoVoltar, BorderLayout.SOUTH);

        JFrame frame = new JFrame("Tabela de Medicamentos");
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
