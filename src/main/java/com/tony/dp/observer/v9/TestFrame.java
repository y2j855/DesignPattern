package com.tony.dp.observer.v9;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 10:37
 * Description: awt 观察者模式(Observer)
 * Observer: ActionListener
 * Observer(实现类)：MyActionListener1 MyActionListener2
 * 事件源：Button
 * 事件：ActionEvent
 */
public class TestFrame extends Frame {
    public void launch(){
        Button b = new Button("press me");
        b.addActionListener(new MyActionListener1());
        b.addActionListener(new MyActionListener2());
        this.add(b);
        this.pack();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setLocation(400,400);
        this.setVisible(true);
    }

    private class MyActionListener1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ((Button)e.getSource()).setLabel("press me agin");
            System.out.println("button pressed 1!");
        }
    }

    private class MyActionListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed 2!");
        }
    }

    public static void main(String[] args) {
        new TestFrame().launch();
    }
}
