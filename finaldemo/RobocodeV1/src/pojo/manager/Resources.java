package pojo.manager;

public class Resources
{
    private Metadata metadata;

    private Entity entity;

    public void setMetadata(Metadata metadata){
        this.metadata = metadata;
    }
    public Metadata getMetadata(){
        return this.metadata;
    }
    public void setEntity(Entity entity){
        this.entity = entity;
    }
    public Entity getEntity(){
        return this.entity;
    }
}
