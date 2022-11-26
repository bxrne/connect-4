package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class ResultImpl extends info.scce.dime.rest.RESTBaseImpl implements Result
 {

	private ConcreteUser
	 loser;
	private boolean isloserSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("loser")
	@info.scce.dime.rest.JsonRenderIndicator("isloserSet")
	@java.lang.Override
	public ConcreteUser
	 getloser() {
		return this.loser;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isloserSet() {
		return this.isloserSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("loser")
	@java.lang.Override
	public void setloser(final ConcreteUser
	 loser) {
		this.loser = loser;
		this.isloserSet = true;
	}

	private ConcreteUser
	 winner;
	private boolean iswinnerSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("winner")
	@info.scce.dime.rest.JsonRenderIndicator("iswinnerSet")
	@java.lang.Override
	public ConcreteUser
	 getwinner() {
		return this.winner;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iswinnerSet() {
		return this.iswinnerSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("winner")
	@java.lang.Override
	public void setwinner(final ConcreteUser
	 winner) {
		this.winner = winner;
		this.iswinnerSet = true;
	}

	
}
