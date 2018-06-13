package pojo.apps;

import java.util.List;
public class Apps
{
    private int total_results;

    private int total_pages;

    private String prev_url;

    private String next_url;

    private List<Resources> resources;

    public void setTotal_results(int total_results){
        this.total_results = total_results;
    }
    public int getTotal_results(){
        return this.total_results;
    }
    public void setTotal_pages(int total_pages){
        this.total_pages = total_pages;
    }
    public int getTotal_pages(){
        return this.total_pages;
    }
    public void setPrev_url(String prev_url){
        this.prev_url = prev_url;
    }
    public String getPrev_url(){
        return this.prev_url;
    }
    public void setNext_url(String next_url){
        this.next_url = next_url;
    }
    public String getNext_url(){
        return this.next_url;
    }
    public void setResources(List<Resources> resources){
        this.resources = resources;
    }
    public List<Resources> getResources(){
        return this.resources;
    }
}
