package pojo.userinfo;

public class UserInfo {
	  private String user_id;
	  private String sub;
	  private String user_name;
	  private String given_name;
	  private String family_name;
	  private String email;
	  private String phone_number = null;
	  private float previous_logon_time;
	  private String name;


	 // Getter Methods 

	  public String getUser_id() {
	    return user_id;
	  }

	  public String getSub() {
	    return sub;
	  }

	  public String getUser_name() {
	    return user_name;
	  }

	  public String getGiven_name() {
	    return given_name;
	  }

	  public String getFamily_name() {
	    return family_name;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public String getPhone_number() {
	    return phone_number;
	  }

	  public float getPrevious_logon_time() {
	    return previous_logon_time;
	  }

	  public String getName() {
	    return name;
	  }

	 // Setter Methods 

	  public void setUser_id( String user_id ) {
	    this.user_id = user_id;
	  }

	  public void setSub( String sub ) {
	    this.sub = sub;
	  }

	  public void setUser_name( String user_name ) {
	    this.user_name = user_name;
	  }

	  public void setGiven_name( String given_name ) {
	    this.given_name = given_name;
	  }

	  public void setFamily_name( String family_name ) {
	    this.family_name = family_name;
	  }

	  public void setEmail( String email ) {
	    this.email = email;
	  }

	  public void setPhone_number( String phone_number ) {
	    this.phone_number = phone_number;
	  }

	  public void setPrevious_logon_time( float previous_logon_time ) {
	    this.previous_logon_time = previous_logon_time;
	  }

	  public void setName( String name ) {
	    this.name = name;
	  }
	}