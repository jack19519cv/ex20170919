import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame  extends Frame{

    private Button BtnExit = new Button("exit");
    private Button Add = new Button("add");
    private Label lb = new Label("0");
    private int n=0;
    public  MainFrame(){
        init();
    }
    private void init(){
        this.setResizable(false);
        this.setBounds(100,120,400,300);
        this.setLayout(null);
        BtnExit.setBounds(150,110,80,30);
        BtnExit.setBackground(new Color(100, 193,200));
       Add.setBounds(150,80,80,30);
       lb.setBounds(150,150,80,30);

      this.add(BtnExit);
      this.add(Add);
      this.add(lb);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        BtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              n++;
              lb.setText(Integer.toString(n));
            }
        });
    }

}
