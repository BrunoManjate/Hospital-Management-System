import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela_visualizar_medicamento extends JFrame {

    public Janela_visualizar_medicamento() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] colunas = {"ID", "Nome", "Laboratório"};
        Object[][] dados = {
                {1, "Medicamento1", "Laboratório A"},
                {2, "Medicamento2", "Laboratório B"},
                // Adicione mais dados conforme necessário
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

        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}
