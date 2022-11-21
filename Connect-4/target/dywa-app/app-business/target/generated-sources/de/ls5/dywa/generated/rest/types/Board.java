package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Board extends info.scce.dime.rest.RESTBaseType  {

	java.util.List<
	Column
	>
	 getcolumns_Column();
	boolean iscolumns_ColumnSet();

	void setcolumns_Column(final java.util.List<
	Column
	>
	 columns);

	public static Board fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Board result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board) {
			result = new de.ls5.dywa.generated.rest.types.BoardImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
