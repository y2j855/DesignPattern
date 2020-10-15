package com.tony.dp.observer.wechat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 15:16
 * Description:awt(DEM)观察者模式
 */
public class MouseEvent {
    private Frame frame;
    private Button button;

    public MouseEvent() {
        frame = new Frame("点击按钮触发点击事件，控制台将打印日志");
        frame.setBounds(300, 200, 600, 300);
        frame.setLayout(new FlowLayout());

        button = new Button("this is a button");
        button.setFont(new Font("Default", 0, 30));
        frame.add(button);

        dealwithEvent();

        frame.setVisible(true);
    }

    /**
     * 事件监听器以及处理事件
     */
    private void dealwithEvent() {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        button.addActionListener(new ActionListener() {
            private int eventCount = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(String.format("动作事件发生 %d 次" ,eventCount++));
            }
        });
    }

    public static void main(String[] args) {
        new MouseEvent();
    }
}
