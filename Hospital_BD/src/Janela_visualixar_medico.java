import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela_visualixar_medico extends JFrame {

    public Janela_visualixar_medico() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] colunas = {"ID", "Nome"};
        Object[][] dados = {
                {1, "Médico1"},
                {2, "Médico2"},
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

        setTitle("Dados medicos");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}
