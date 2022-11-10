import javax.swing.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // creating instance of JFrame
    JFrame f = new JFrame();

    JLabel b = new JLabel("Click the button below for");
    JLabel b1 = new JLabel("the class that you want to run."); 
    JLabel b2 = new JLabel("Alternatively, run from the console with:");
    JLabel b3 = new JLabel("Ex: javac ColorChooser.java PictureExplorer.java");

    // creating instance of JButton
    JButton cc = new JButton("ColorChooser");
    JButton pe = new JButton("PictureExplorer");
    JButton iawt = new JButton("IntArrayWorkerTester");
    JButton pic = new JButton("Picture");
    JButton pt = new JButton("PictureTester");

    // x axis, y axis, width, height
    b.setBounds(80, 10, 300, 40);
    b1.setBounds(80, 30, 300, 40);
    b2.setBounds(80, 50, 300, 40);
    b3.setBounds(80, 70, 300, 40);

    // buttons
    cc.setBounds(80, 120, 250, 30);
    pe.setBounds(80, 160, 250, 30);
    iawt.setBounds(80, 200, 250, 30);
    pic.setBounds(80, 240, 250, 30);
    pt.setBounds(80, 280, 250, 30);

    // add event listener
    cc.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("ColorChooser is running...");
        ColorChooser.main(args);
      }
    });
    pe.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("PictureExplorer is running...");
        PictureExplorer.main(args);
      }
    });
    iawt.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("IntArrayWorkerTester is running...");
        IntArrayWorkerTester.main(args);
      }
    });
    pic.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Picture is running...");
        Picture.main(args);
      }
    });
    pt.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("PictureTester is running...");
        PictureTester.main(args);
      }
    });

    // add button to JFrame
    f.add(b);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(cc);
    f.add(pe);
    f.add(iawt);
    f.add(pic);
    f.add(pt);

    f.setSize(400, 400);
    f.setLayout(null);
    // make the frame visible
    f.setVisible(true);
  }
}