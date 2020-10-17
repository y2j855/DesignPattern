package com.tony.dp.flyweight.netdisk;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/17 19:08
 * Description:
 */
public class LocalFile {
    private String filename;
    private String content;

    public LocalFile(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
