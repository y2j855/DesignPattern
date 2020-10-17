package com.tony.dp.flyweight.netdisk;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/17 19:27
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        PanServer panServer = PanServer.getInstance();

        String fileContent = "这是一个pdf文件《设计模式：从入门到放弃》";
        LocalFile localFile1 = new LocalFile("小明的设计模式.pdf", fileContent);
        String fileKey1 = panServer.upload("小明", localFile1);

        LocalFile localFile2 = new LocalFile("大明的设计模式.pdf", fileContent);
        String fileKey2 = panServer.upload("大明", localFile2);

        panServer.download(fileKey1);
        panServer.download(fileKey2);
    }
}
