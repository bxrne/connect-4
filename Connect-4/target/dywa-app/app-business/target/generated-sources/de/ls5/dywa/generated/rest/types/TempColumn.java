package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface TempColumn extends info.scce.dime.rest.RESTBaseType  {

	java.util.List<
	Cell
	>
	 getcell_Cell();
	boolean iscell_CellSet();

	void setcell_Cell(final java.util.List<
	Cell
	>
	 cell);

	public static TempColumn fromDywaEntity(final de.ls5.dywa.generated.entity.models.app.TempColumn entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final TempColumn result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.models.app.TempColumn) {
			result = new de.ls5.dywa.generated.rest.types.TempColumnImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
