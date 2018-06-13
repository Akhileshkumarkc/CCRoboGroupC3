package pojo.userdecodeInfo;

import java.util.ArrayList;
import java.util.List;

public class UserDetails {
	private String jti;

	private String sub;

	private List<String> scope;

	private String client_id;

	private String cid;

	private String azp;

	private String grant_type;

	private String user_id;

	private String origin;

	private String user_name;

	private String email;

	private int auth_time;

	private String rev_sig;

	private int iat;

	private int exp;

	private String iss;

	private String zid;

	private List<String> aud;

	public void setJti(String jti) {
		this.jti = jti;
	}

	public String getJti() {
		return this.jti;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getSub() {
		return this.sub;
	}

	public void setScope(List<String> scope) {
		this.scope = scope;
	}

	public List<String> getScope() {
		return this.scope;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_id() {
		return this.client_id;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCid() {
		return this.cid;
	}

	public void setAzp(String azp) {
		this.azp = azp;
	}

	public String getAzp() {
		return this.azp;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	public String getGrant_type() {
		return this.grant_type;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_id() {
		return this.user_id;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_name() {
		return this.user_name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setAuth_time(int auth_time) {
		this.auth_time = auth_time;
	}

	public int getAuth_time() {
		return this.auth_time;
	}

	public void setRev_sig(String rev_sig) {
		this.rev_sig = rev_sig;
	}

	public String getRev_sig() {
		return this.rev_sig;
	}

	public void setIat(int iat) {
		this.iat = iat;
	}

	public int getIat() {
		return this.iat;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getExp() {
		return this.exp;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}

	public String getIss() {
		return this.iss;
	}

	public void setZid(String zid) {
		this.zid = zid;
	}

	public String getZid() {
		return this.zid;
	}

	public void setAud(List<String> aud) {
		this.aud = aud;
	}

	public List<String> getAud(){
	        return this.aud;
	    }
}


