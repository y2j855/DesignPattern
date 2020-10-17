package com.tony.dp.flyweight.netdisk;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/17 18:59
 * Description:
 * 资源类，相当于享元类的内部状态
 */
public class Resource {
    private String hashId;
    private int byteSize;
    private String content;

    public Resource(String content) {
        this.content = content;
        this.hashId = HashUtil.computeHashId(content);  //文件的hash值
        this.byteSize = content.length();
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public int getByteSize() {
        return byteSize;
    }

    public void setByteSize(int byteSize) {
        this.byteSize = byteSize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
