package pojo.manager;

public class Entity
{
    private boolean admin;

    private boolean active;

    private String default_space_guid;

    private String username;

    private String spaces_url;

    private String organizations_url;

    private String managed_organizations_url;

    private String billing_managed_organizations_url;

    private String audited_organizations_url;

    private String managed_spaces_url;

    private String audited_spaces_url;

    public void setAdmin(boolean admin){
        this.admin = admin;
    }
    public boolean getAdmin(){
        return this.admin;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public boolean getActive(){
        return this.active;
    }
    public void setDefault_space_guid(String default_space_guid){
        this.default_space_guid = default_space_guid;
    }
    public String getDefault_space_guid(){
        return this.default_space_guid;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setSpaces_url(String spaces_url){
        this.spaces_url = spaces_url;
    }
    public String getSpaces_url(){
        return this.spaces_url;
    }
    public void setOrganizations_url(String organizations_url){
        this.organizations_url = organizations_url;
    }
    public String getOrganizations_url(){
        return this.organizations_url;
    }
    public void setManaged_organizations_url(String managed_organizations_url){
        this.managed_organizations_url = managed_organizations_url;
    }
    public String getManaged_organizations_url(){
        return this.managed_organizations_url;
    }
    public void setBilling_managed_organizations_url(String billing_managed_organizations_url){
        this.billing_managed_organizations_url = billing_managed_organizations_url;
    }
    public String getBilling_managed_organizations_url(){
        return this.billing_managed_organizations_url;
    }
    public void setAudited_organizations_url(String audited_organizations_url){
        this.audited_organizations_url = audited_organizations_url;
    }
    public String getAudited_organizations_url(){
        return this.audited_organizations_url;
    }
    public void setManaged_spaces_url(String managed_spaces_url){
        this.managed_spaces_url = managed_spaces_url;
    }
    public String getManaged_spaces_url(){
        return this.managed_spaces_url;
    }
    public void setAudited_spaces_url(String audited_spaces_url){
        this.audited_spaces_url = audited_spaces_url;
    }
    public String getAudited_spaces_url(){
        return this.audited_spaces_url;
    }
}

