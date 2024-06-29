import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela_utent_visualizar extends JFrame {

    public Janela_utent_visualizar() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] colunas = {"ID", "Nome", "Gênero", "Data Nascimento", "Rua", "Número", "Apartamento", "Código Postal", "Cidade", "Email"};
        Object[][] dados = {
                {1, "Utente1", "Masculino", "01/01/1990", "Rua A", 123, "Apto 101", "12345", "Cidade A", "utente1@email.com"},
                {2, "Utente2", "Feminino", "02/02/1995", "Rua B", 456, "Apto 202", "67890", "Cidade B", "utente2@email.com"},
               
        };

        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));

        JScrollPane scrollPane = new JScrollPane(tabela);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	dispose();
				new Janela_Menu_Principal();
            }
        });

        panel.add(botaoVoltar, BorderLayout.SOUTH);
        setTitle("Tabela Utente");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}
