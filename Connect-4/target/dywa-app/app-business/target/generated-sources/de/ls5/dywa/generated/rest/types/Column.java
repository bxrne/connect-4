package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Column extends info.scce.dime.rest.RESTBaseType  {

	java.util.List<
	Cell
	>
	 getcells_Cell();
	boolean iscells_CellSet();

	void setcells_Cell(final java.util.List<
	Cell
	>
	 cells);
	java.lang.Long
	 getindex();
	boolean isindexSet();

	void setindex(final java.lang.Long
	 index);

	public static Column fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Column entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Column result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Column) {
			result = new de.ls5.dywa.generated.rest.types.ColumnImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
