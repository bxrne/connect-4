package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class TempColumnImpl extends info.scce.dime.rest.RESTBaseImpl implements TempColumn
 {

	private java.util.List<
	Cell
	>
	 cell = new java.util.LinkedList<>();
	private boolean iscellSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("cell")
	@info.scce.dime.rest.JsonRenderIndicator("iscell_CellSet")
	@java.lang.Override
	public java.util.List<
	Cell
	>
	 getcell_Cell() {
		return this.cell;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iscell_CellSet() {
		return this.iscellSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("cell")
	@java.lang.Override
	public void setcell_Cell(final java.util.List<
	Cell
	>
	 cell) {
		this.cell = cell;
		this.iscellSet = true;
	}

	
}
