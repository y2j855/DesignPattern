package com.tony.dp.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 09:16
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Content c = new Content();

//        Command insertCommand = new InsertCommand(c);
//        insertCommand.doit();
//        insertCommand.undo();
//
//        Command copyCommand = new CopyCommand(c);
//        copyCommand.doit();
//        copyCommand.undo();
//
//        Command deleteCommand = new DeleteCommand(c);
//        deleteCommand.doit();
//        deleteCommand.undo();



        //利用责任链模式实现多命令undo操作
        System.out.println("========多命令对象的undo操作========");
        List<Command> commands = new ArrayList<>();
        commands.add(new InsertCommand(c));
        commands.add(new CopyCommand(c));
        commands.add(new DeleteCommand(c));

        for(Command command : commands){
            command.doit();
        }
        System.out.println(c.msg);
        for (int i = commands.size()-1; i >= 0; i--) {
            commands.get(i).undo();
        }


    }
}
