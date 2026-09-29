import java.awt.*;

class Myframe extends Frame{
    Label l;
    TextField tf;
    Button b;

    public Myframe(){
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");
        add(l);
        add(tf);
        add(b);
    }
}

public class FirstApp {
    static void main(String[] args) {
        Myframe mf = new Myframe();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
