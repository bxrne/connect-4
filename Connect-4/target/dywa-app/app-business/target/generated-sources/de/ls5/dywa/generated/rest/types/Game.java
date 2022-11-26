package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Game extends info.scce.dime.rest.RESTBaseType  {

	ConcreteUser
	 getplayer2();
	boolean isplayer2Set();

	void setplayer2(final ConcreteUser
	 player2);
	ConcreteUser
	 getplayer1();
	boolean isplayer1Set();

	void setplayer1(final ConcreteUser
	 player1);
	Board
	 getboard();
	boolean isboardSet();

	void setboard(final Board
	 board);

	public static Game fromDywaEntity(final de.ls5.dywa.generated.entity.models.app.Game entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Game result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.models.app.Game) {
			result = new de.ls5.dywa.generated.rest.types.GameImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
