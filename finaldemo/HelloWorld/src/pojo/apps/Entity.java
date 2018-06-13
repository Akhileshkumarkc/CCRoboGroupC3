package pojo.apps;


import java.util.List;
public class Entity
{
    private String name;

    private boolean production;

    private String space_guid;

    private String stack_guid;

    private String buildpack;

    private String detected_buildpack;

    private String detected_buildpack_guid;

    private Environment_json environment_json;

    private int memory;

    private int instances;

    private int disk_quota;

    private String state;

    private String version;

    private String command;

    private boolean console;

    private String debug;

    private String staging_task_id;

    private String package_state;

    private String health_check_type;

    private int health_check_timeout;

    private String health_check_http_endpoint;

    private String staging_failed_reason;

    private String staging_failed_description;

    private boolean diego;

    private String docker_image;

    private Docker_credentials docker_credentials;

    private String package_updated_at;

    private String detected_start_command;

    private boolean enable_ssh;

    private List<Integer> ports;

    private String space_url;

    private String stack_url;

    private String routes_url;

    private String events_url;

    private String service_bindings_url;

    private String route_mappings_url;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setProduction(boolean production){
        this.production = production;
    }
    public boolean getProduction(){
        return this.production;
    }
    public void setSpace_guid(String space_guid){
        this.space_guid = space_guid;
    }
    public String getSpace_guid(){
        return this.space_guid;
    }
    public void setStack_guid(String stack_guid){
        this.stack_guid = stack_guid;
    }
    public String getStack_guid(){
        return this.stack_guid;
    }
    public void setBuildpack(String buildpack){
        this.buildpack = buildpack;
    }
    public String getBuildpack(){
        return this.buildpack;
    }
    public void setDetected_buildpack(String detected_buildpack){
        this.detected_buildpack = detected_buildpack;
    }
    public String getDetected_buildpack(){
        return this.detected_buildpack;
    }
    public void setDetected_buildpack_guid(String detected_buildpack_guid){
        this.detected_buildpack_guid = detected_buildpack_guid;
    }
    public String getDetected_buildpack_guid(){
        return this.detected_buildpack_guid;
    }
    public void setEnvironment_json(Environment_json environment_json){
        this.environment_json = environment_json;
    }
    public Environment_json getEnvironment_json(){
        return this.environment_json;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public int getMemory(){
        return this.memory;
    }
    public void setInstances(int instances){
        this.instances = instances;
    }
    public int getInstances(){
        return this.instances;
    }
    public void setDisk_quota(int disk_quota){
        this.disk_quota = disk_quota;
    }
    public int getDisk_quota(){
        return this.disk_quota;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String getVersion(){
        return this.version;
    }
    public void setCommand(String command){
        this.command = command;
    }
    public String getCommand(){
        return this.command;
    }
    public void setConsole(boolean console){
        this.console = console;
    }
    public boolean getConsole(){
        return this.console;
    }
    public void setDebug(String debug){
        this.debug = debug;
    }
    public String getDebug(){
        return this.debug;
    }
    public void setStaging_task_id(String staging_task_id){
        this.staging_task_id = staging_task_id;
    }
    public String getStaging_task_id(){
        return this.staging_task_id;
    }
    public void setPackage_state(String package_state){
        this.package_state = package_state;
    }
    public String getPackage_state(){
        return this.package_state;
    }
    public void setHealth_check_type(String health_check_type){
        this.health_check_type = health_check_type;
    }
    public String getHealth_check_type(){
        return this.health_check_type;
    }
    public void setHealth_check_timeout(int health_check_timeout){
        this.health_check_timeout = health_check_timeout;
    }
    public int getHealth_check_timeout(){
        return this.health_check_timeout;
    }
    public void setHealth_check_http_endpoint(String health_check_http_endpoint){
        this.health_check_http_endpoint = health_check_http_endpoint;
    }
    public String getHealth_check_http_endpoint(){
        return this.health_check_http_endpoint;
    }
    public void setStaging_failed_reason(String staging_failed_reason){
        this.staging_failed_reason = staging_failed_reason;
    }
    public String getStaging_failed_reason(){
        return this.staging_failed_reason;
    }
    public void setStaging_failed_description(String staging_failed_description){
        this.staging_failed_description = staging_failed_description;
    }
    public String getStaging_failed_description(){
        return this.staging_failed_description;
    }
    public void setDiego(boolean diego){
        this.diego = diego;
    }
    public boolean getDiego(){
        return this.diego;
    }
    public void setDocker_image(String docker_image){
        this.docker_image = docker_image;
    }
    public String getDocker_image(){
        return this.docker_image;
    }
    public void setDocker_credentials(Docker_credentials docker_credentials){
        this.docker_credentials = docker_credentials;
    }
    public Docker_credentials getDocker_credentials(){
        return this.docker_credentials;
    }
    public void setPackage_updated_at(String package_updated_at){
        this.package_updated_at = package_updated_at;
    }
    public String getPackage_updated_at(){
        return this.package_updated_at;
    }
    public void setDetected_start_command(String detected_start_command){
        this.detected_start_command = detected_start_command;
    }
    public String getDetected_start_command(){
        return this.detected_start_command;
    }
    public void setEnable_ssh(boolean enable_ssh){
        this.enable_ssh = enable_ssh;
    }
    public boolean getEnable_ssh(){
        return this.enable_ssh;
    }
    public void setPorts(List<Integer> ports){
        this.ports = ports;
    }
    public List<Integer> getPorts(){
        return this.ports;
    }
    public void setSpace_url(String space_url){
        this.space_url = space_url;
    }
    public String getSpace_url(){
        return this.space_url;
    }
    public void setStack_url(String stack_url){
        this.stack_url = stack_url;
    }
    public String getStack_url(){
        return this.stack_url;
    }
    public void setRoutes_url(String routes_url){
        this.routes_url = routes_url;
    }
    public String getRoutes_url(){
        return this.routes_url;
    }
    public void setEvents_url(String events_url){
        this.events_url = events_url;
    }
    public String getEvents_url(){
        return this.events_url;
    }
    public void setService_bindings_url(String service_bindings_url){
        this.service_bindings_url = service_bindings_url;
    }
    public String getService_bindings_url(){
        return this.service_bindings_url;
    }
    public void setRoute_mappings_url(String route_mappings_url){
        this.route_mappings_url = route_mappings_url;
    }
    public String getRoute_mappings_url(){
        return this.route_mappings_url;
    }
}