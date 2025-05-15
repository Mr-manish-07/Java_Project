package Practice.Functional_Interface.Built_In_Interface.AwT;


import java.awt.*;

public class firstAWT {
    // ABSTRACT WINDOW TOOLKIT
    public static void main(String[] args) {
        Frame f = new Frame("FIRST AWT WINDOW");

        Label l = new Label("Enter your name:");
        l.setBounds(50, 50, 150, 30);

        TextField tf = new TextField();
        tf.setBounds(50, 80, 150, 20);

        Button b = new Button("Click Me");
        b.setBounds(50, 110, 80, 30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
