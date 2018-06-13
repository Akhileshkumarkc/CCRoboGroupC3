package pojo.spaces;

public class Entity {

	private String name;

	private String organization_guid;

	private String space_quota_definition_guid;

	private String isolation_segment_guid;

	private boolean allow_ssh;

	private String organization_url;

	private String developers_url;

	private String managers_url;

	private String auditors_url;

	private String apps_url;

	private String routes_url;

	private String domains_url;

	private String service_instances_url;

	private String app_events_url;

	private String events_url;

	private String security_groups_url;

	private String staging_security_groups_url;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOrganization_guid(String organization_guid) {
		this.organization_guid = organization_guid;
	}

	public String getOrganization_guid() {
		return this.organization_guid;
	}

	public void setSpace_quota_definition_guid(String space_quota_definition_guid) {
		this.space_quota_definition_guid = space_quota_definition_guid;
	}

	public String getSpace_quota_definition_guid() {
		return this.space_quota_definition_guid;
	}

	public void setIsolation_segment_guid(String isolation_segment_guid) {
		this.isolation_segment_guid = isolation_segment_guid;
	}

	public String getIsolation_segment_guid() {
		return this.isolation_segment_guid;
	}

	public void setAllow_ssh(boolean allow_ssh) {
		this.allow_ssh = allow_ssh;
	}

	public boolean getAllow_ssh() {
		return this.allow_ssh;
	}

	public void setOrganization_url(String organization_url) {
		this.organization_url = organization_url;
	}

	public String getOrganization_url() {
		return this.organization_url;
	}

	public void setDevelopers_url(String developers_url) {
		this.developers_url = developers_url;
	}

	public String getDevelopers_url() {
		return this.developers_url;
	}

	public void setManagers_url(String managers_url) {
		this.managers_url = managers_url;
	}

	public String getManagers_url() {
		return this.managers_url;
	}

	public void setAuditors_url(String auditors_url) {
		this.auditors_url = auditors_url;
	}

	public String getAuditors_url() {
		return this.auditors_url;
	}

	public void setApps_url(String apps_url) {
		this.apps_url = apps_url;
	}

	public String getApps_url() {
		return this.apps_url;
	}

	public void setRoutes_url(String routes_url) {
		this.routes_url = routes_url;
	}

	public String getRoutes_url() {
		return this.routes_url;
	}

	public void setDomains_url(String domains_url) {
		this.domains_url = domains_url;
	}

	public String getDomains_url() {
		return this.domains_url;
	}

	public void setService_instances_url(String service_instances_url) {
		this.service_instances_url = service_instances_url;
	}

	public String getService_instances_url() {
		return this.service_instances_url;
	}

	public void setApp_events_url(String app_events_url) {
		this.app_events_url = app_events_url;
	}

	public String getApp_events_url() {
		return this.app_events_url;
	}

	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}

	public String getEvents_url() {
		return this.events_url;
	}

	public void setSecurity_groups_url(String security_groups_url) {
		this.security_groups_url = security_groups_url;
	}

	public String getSecurity_groups_url() {
		return this.security_groups_url;
	}

	public void setStaging_security_groups_url(String staging_security_groups_url) {
		this.staging_security_groups_url = staging_security_groups_url;
	}

	public String getStaging_security_groups_url() {
		return this.staging_security_groups_url;
	}
}
