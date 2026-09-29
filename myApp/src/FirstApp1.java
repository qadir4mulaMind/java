import java.awt.*;

public class FirstApp1 extends Frame {
    Label l;
    TextField tf;
    Button b;

    public FirstApp1(){
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");
        add(l);
        add(tf);
        add(b);
    }
    static void main(String[] args) {
        FirstApp1 mf = new FirstApp1();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}