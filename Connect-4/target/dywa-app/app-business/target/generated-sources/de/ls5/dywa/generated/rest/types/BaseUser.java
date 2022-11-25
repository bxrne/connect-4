package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class BaseUser extends info.scce.dime.rest.RESTBaseImpl implements info.scce.dime.rest.RESTBaseType
 {

	private java.util.List<
	ConcreteUser
	>
	 concreteUser = new java.util.LinkedList<>();
	private boolean isconcreteUserSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("concreteUser")
	@info.scce.dime.rest.JsonRenderIndicator("isconcreteUser_ConcreteUserSet")
	public java.util.List<
	ConcreteUser
	>
	 getconcreteUser_ConcreteUser() {
		return this.concreteUser;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isconcreteUser_ConcreteUserSet() {
		return this.isconcreteUserSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("concreteUser")
	public void setconcreteUser_ConcreteUser(final java.util.List<
	ConcreteUser
	>
	 concreteUser) {
		this.concreteUser = concreteUser;
		this.isconcreteUserSet = true;
	}

	private java.lang.String
	 password;
	private boolean ispasswordSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("password")
	@info.scce.dime.rest.JsonRenderIndicator("ispasswordSet")
	public java.lang.String
	 getpassword() {
		return this.password;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean ispasswordSet() {
		return this.ispasswordSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("password")
	public void setpassword(final java.lang.String
	 password) {
		this.password = password;
		this.ispasswordSet = true;
	}

	private de.ls5.dywa.generated.rest.util.FileReference
	 image;
	private boolean isimageSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("image")
	@info.scce.dime.rest.JsonRenderIndicator("isimageSet")
	public de.ls5.dywa.generated.rest.util.FileReference
	 getimage() {
		return this.image;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isimageSet() {
		return this.isimageSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("image")
	public void setimage(final de.ls5.dywa.generated.rest.util.FileReference
	 image) {
		this.image = image;
		this.isimageSet = true;
	}

	private java.lang.String
	 username;
	private boolean isusernameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("username")
	@info.scce.dime.rest.JsonRenderIndicator("isusernameSet")
	public java.lang.String
	 getusername() {
		return this.username;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isusernameSet() {
		return this.isusernameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("username")
	public void setusername(final java.lang.String
	 username) {
		this.username = username;
		this.isusernameSet = true;
	}

	private java.lang.String
	 email;
	private boolean isemailSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("email")
	@info.scce.dime.rest.JsonRenderIndicator("isemailSet")
	public java.lang.String
	 getemail() {
		return this.email;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isemailSet() {
		return this.isemailSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("email")
	public void setemail(final java.lang.String
	 email) {
		this.email = email;
		this.isemailSet = true;
	}

	private java.lang.Long
	 wins;
	private boolean iswinsSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("wins")
	@info.scce.dime.rest.JsonRenderIndicator("iswinsSet")
	public java.lang.Long
	 getwins() {
		return this.wins;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iswinsSet() {
		return this.iswinsSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("wins")
	public void setwins(final java.lang.Long
	 wins) {
		this.wins = wins;
		this.iswinsSet = true;
	}

	private java.lang.Long
	 losses;
	private boolean islossesSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("losses")
	@info.scce.dime.rest.JsonRenderIndicator("islossesSet")
	public java.lang.Long
	 getlosses() {
		return this.losses;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean islossesSet() {
		return this.islossesSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("losses")
	public void setlosses(final java.lang.Long
	 losses) {
		this.losses = losses;
		this.islossesSet = true;
	}

	
	public static BaseUser fromDywaEntity(final de.ls5.dywa.generated.entity.models.app.BaseUser entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final BaseUser result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.models.app.BaseUser) {
			result = new de.ls5.dywa.generated.rest.types.BaseUser();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
