package pojo.manager;

public class Metadata
{
    private String guid;

    private String url;

    private String created_at;

    private String updated_at;

    public void setGuid(String guid){
        this.guid = guid;
    }
    public String getGuid(){
        return this.guid;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }
    public String getCreated_at(){
        return this.created_at;
    }
    public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }
    public String getUpdated_at(){
        return this.updated_at;
    }
}
