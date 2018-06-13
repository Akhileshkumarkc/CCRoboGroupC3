package pojo.organizations;

public class Entity
{
    private String name;

    private boolean billing_enabled;

    private String quota_definition_guid;

    private String status;

    private String default_isolation_segment_guid;

    private String quota_definition_url;

    private String spaces_url;

    private String domains_url;

    private String private_domains_url;

    private String users_url;

    private String managers_url;

    private String billing_managers_url;

    private String auditors_url;

    private String app_events_url;

    private String space_quota_definitions_url;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBilling_enabled(boolean billing_enabled){
        this.billing_enabled = billing_enabled;
    }
    public boolean getBilling_enabled(){
        return this.billing_enabled;
    }
    public void setQuota_definition_guid(String quota_definition_guid){
        this.quota_definition_guid = quota_definition_guid;
    }
    public String getQuota_definition_guid(){
        return this.quota_definition_guid;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setDefault_isolation_segment_guid(String default_isolation_segment_guid){
        this.default_isolation_segment_guid = default_isolation_segment_guid;
    }
    public String getDefault_isolation_segment_guid(){
        return this.default_isolation_segment_guid;
    }
    public void setQuota_definition_url(String quota_definition_url){
        this.quota_definition_url = quota_definition_url;
    }
    public String getQuota_definition_url(){
        return this.quota_definition_url;
    }
    public void setSpaces_url(String spaces_url){
        this.spaces_url = spaces_url;
    }
    public String getSpaces_url(){
        return this.spaces_url;
    }
    public void setDomains_url(String domains_url){
        this.domains_url = domains_url;
    }
    public String getDomains_url(){
        return this.domains_url;
    }
    public void setPrivate_domains_url(String private_domains_url){
        this.private_domains_url = private_domains_url;
    }
    public String getPrivate_domains_url(){
        return this.private_domains_url;
    }
    public void setUsers_url(String users_url){
        this.users_url = users_url;
    }
    public String getUsers_url(){
        return this.users_url;
    }
    public void setManagers_url(String managers_url){
        this.managers_url = managers_url;
    }
    public String getManagers_url(){
        return this.managers_url;
    }
    public void setBilling_managers_url(String billing_managers_url){
        this.billing_managers_url = billing_managers_url;
    }
    public String getBilling_managers_url(){
        return this.billing_managers_url;
    }
    public void setAuditors_url(String auditors_url){
        this.auditors_url = auditors_url;
    }
    public String getAuditors_url(){
        return this.auditors_url;
    }
    public void setApp_events_url(String app_events_url){
        this.app_events_url = app_events_url;
    }
    public String getApp_events_url(){
        return this.app_events_url;
    }
    public void setSpace_quota_definitions_url(String space_quota_definitions_url){
        this.space_quota_definitions_url = space_quota_definitions_url;
    }
    public String getSpace_quota_definitions_url(){
        return this.space_quota_definitions_url;
    }
}