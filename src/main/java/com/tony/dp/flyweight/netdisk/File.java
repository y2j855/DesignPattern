package com.tony.dp.flyweight.netdisk;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/17 19:00
 * Description:
 * 用户的文件类，resource为内部状态
 * owner和filename为外部状态
 */
public class File {
    protected String owner;
    protected String filename;
    protected Resource resource;

    public File(String owner, String filename) {
        this.owner = owner;
        this.filename = filename;
    }

    public String fileMeta(){
        if(this.owner == null || filename == null || resource == null){
            return "未知文件";
        }
        return owner + "-" + filename + resource.getHashId();
    }

    public String display(){
        return fileMeta() + ",资源内容：" + getResource().toString();
    }

    public Resource getResource() {
        return resource;
    }

    public String getOwner() {
        return owner;
    }

    public String getFilename() {
        return filename;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
