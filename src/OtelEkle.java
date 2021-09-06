import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Visibility;

public class OtelEkle extends JFrame{
    private JButton buttonAddHotel;
    private JButton odaEkleButton;
    private JTextField tf_name;
    private JTextField tf_;
    private JTextField textField3;
    private JPanel root;
    private Hotel hotel;
    public OtelEkle() {
        setTitle("OTEL EKLE");
        setSize(400,400);
        setVisible(true);
        setLocation(800,250);
        add(root);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonAddHotel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hotel = new Hotel("OtelIstanbul","Beşiktaş","otel@istanbul.com","0212 242 12 44",4
                        ,true,true,true,false,true,false,true,Pansiyon.ULTRA);
            }
        });
        odaEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Room room1 = new Room(2,30,true,true,false,false,true);
                hotel.addRoom(room1);
            }
        });
    }
}
