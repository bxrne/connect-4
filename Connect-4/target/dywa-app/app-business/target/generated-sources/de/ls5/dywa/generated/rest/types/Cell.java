package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Cell extends info.scce.dime.rest.RESTBaseType  {

	java.lang.Long
	 getvalue();
	boolean isvalueSet();

	void setvalue(final java.lang.Long
	 value);

	public static Cell fromDywaEntity(final de.ls5.dywa.generated.entity.models.app.Cell entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Cell result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.models.app.Cell) {
			result = new de.ls5.dywa.generated.rest.types.CellImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
