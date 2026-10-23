import javax.swing.*;
import java.awt.*;
import gui.ClienteForm;
import gui.MedicoForm;
import gui.PacienteForm;
import gui.RecepcionistaForm;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame menu = new JFrame("Sistema da Clínica");
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setSize(360, 320);
            menu.setLocationRelativeTo(null);

            JPanel painel = new JPanel(new GridLayout(4, 1, 10, 10));
            painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JButton btnCliente = new JButton("Clientes");
            JButton btnPaciente = new JButton("Pacientes");
            JButton btnMedico = new JButton("Médicos");
            JButton btnRecepcionista = new JButton("Recepcionistas");

            btnCliente.addActionListener(e -> new ClienteForm().setVisible(true));
            btnPaciente.addActionListener(e -> new PacienteForm().setVisible(true));
            btnMedico.addActionListener(e -> new MedicoForm().setVisible(true));
            btnRecepcionista.addActionListener(e -> new RecepcionistaForm().setVisible(true));

            painel.add(btnCliente);
            painel.add(btnPaciente);
            painel.add(btnMedico);
            painel.add(btnRecepcionista);

            menu.setContentPane(painel);
            menu.setVisible(true);
        });
    }
}