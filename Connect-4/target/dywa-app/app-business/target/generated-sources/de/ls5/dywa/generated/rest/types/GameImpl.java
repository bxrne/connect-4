package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class GameImpl extends info.scce.dime.rest.RESTBaseImpl implements Game
 {

	private ConcreteUser
	 player2;
	private boolean isplayer2Set;
	
	@com.fasterxml.jackson.annotation.JsonProperty("player2")
	@info.scce.dime.rest.JsonRenderIndicator("isplayer2Set")
	@java.lang.Override
	public ConcreteUser
	 getplayer2() {
		return this.player2;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isplayer2Set() {
		return this.isplayer2Set;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("player2")
	@java.lang.Override
	public void setplayer2(final ConcreteUser
	 player2) {
		this.player2 = player2;
		this.isplayer2Set = true;
	}

	private ConcreteUser
	 player1;
	private boolean isplayer1Set;
	
	@com.fasterxml.jackson.annotation.JsonProperty("player1")
	@info.scce.dime.rest.JsonRenderIndicator("isplayer1Set")
	@java.lang.Override
	public ConcreteUser
	 getplayer1() {
		return this.player1;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isplayer1Set() {
		return this.isplayer1Set;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("player1")
	@java.lang.Override
	public void setplayer1(final ConcreteUser
	 player1) {
		this.player1 = player1;
		this.isplayer1Set = true;
	}

	private Board
	 board;
	private boolean isboardSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("board")
	@info.scce.dime.rest.JsonRenderIndicator("isboardSet")
	@java.lang.Override
	public Board
	 getboard() {
		return this.board;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isboardSet() {
		return this.isboardSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("board")
	@java.lang.Override
	public void setboard(final Board
	 board) {
		this.board = board;
		this.isboardSet = true;
	}

	
}
