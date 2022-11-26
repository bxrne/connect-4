package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Result extends info.scce.dime.rest.RESTBaseType  {

	ConcreteUser
	 getloser();
	boolean isloserSet();

	void setloser(final ConcreteUser
	 loser);
	ConcreteUser
	 getwinner();
	boolean iswinnerSet();

	void setwinner(final ConcreteUser
	 winner);

	public static Result fromDywaEntity(final de.ls5.dywa.generated.entity.models.app.Result entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Result result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.models.app.Result) {
			result = new de.ls5.dywa.generated.rest.types.ResultImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
