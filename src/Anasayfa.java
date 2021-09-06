import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa extends JFrame{
    private JButton rezerveEtButton;
    private JPanel root;
    private JButton OTELEKLEButton;

    public Anasayfa(){
        setTitle("Anasayfa");
        setSize(400,400);
        setVisible(true);
        setLocation(800,250);
        add(root);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rezerveEtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        OTELEKLEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OtelEkle();
                setVisible(false);
            }
        });
    }
}
