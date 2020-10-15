package com.tony.dp.observer.v9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 10:49
 * Description: 自己实现awt Observer模式
 */
public class Test {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new MyActionListener1());
        b.addActionListener(new MyActionListener2());
        b.buttonPressed();
    }
}

class Button{
    private List<ActionListener> actionListenerList = new ArrayList<>();

    public void buttonPressed(){
        ActionEvent e = new ActionEvent(System.currentTimeMillis(),this);
        for (int i = 0; i < actionListenerList.size(); i++) {
            ActionListener listener = actionListenerList.get(i);
            listener.actionPerformed(e);
        }
    }

    public void addActionListener(ActionListener actionListener){
        actionListenerList.add(actionListener);
    }
}

interface ActionListener{
    public void actionPerformed(ActionEvent e);
}

class MyActionListener1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed 1!");
    }
}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed 2!");
    }
}

class ActionEvent{
    long when;
    Object source;

    public ActionEvent(long when, Object source) {
        this.when = when;
        this.source = source;
    }

    public long getWhen() {
        return when;
    }

    public Object getSource() {
        return source;
    }
}