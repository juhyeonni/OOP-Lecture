package objectclass;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFinal extends JFrame {

  public MyFinal() {
    super("MyFinal");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
    setLayout(new FlowLayout());

    JButton btn = new JButton("버튼");
    add(btn);
    setVisible(rootPaneCheckingEnabled);
  }

  public static void main(String[] args) {
    new MyFinal();
  }
}
