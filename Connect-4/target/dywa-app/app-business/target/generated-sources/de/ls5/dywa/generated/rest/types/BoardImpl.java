package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class BoardImpl extends info.scce.dime.rest.RESTBaseImpl implements Board
 {

	private java.util.List<
	Column
	>
	 columns = new java.util.LinkedList<>();
	private boolean iscolumnsSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("columns")
	@info.scce.dime.rest.JsonRenderIndicator("iscolumns_ColumnSet")
	@java.lang.Override
	public java.util.List<
	Column
	>
	 getcolumns_Column() {
		return this.columns;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iscolumns_ColumnSet() {
		return this.iscolumnsSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("columns")
	@java.lang.Override
	public void setcolumns_Column(final java.util.List<
	Column
	>
	 columns) {
		this.columns = columns;
		this.iscolumnsSet = true;
	}

	
}
