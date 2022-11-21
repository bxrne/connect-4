package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class ColumnImpl extends info.scce.dime.rest.RESTBaseImpl implements Column
 {

	private java.util.List<
	Cell
	>
	 cells = new java.util.LinkedList<>();
	private boolean iscellsSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("cells")
	@info.scce.dime.rest.JsonRenderIndicator("iscells_CellSet")
	@java.lang.Override
	public java.util.List<
	Cell
	>
	 getcells_Cell() {
		return this.cells;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iscells_CellSet() {
		return this.iscellsSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("cells")
	@java.lang.Override
	public void setcells_Cell(final java.util.List<
	Cell
	>
	 cells) {
		this.cells = cells;
		this.iscellsSet = true;
	}

	private java.lang.Long
	 index;
	private boolean isindexSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("index")
	@info.scce.dime.rest.JsonRenderIndicator("isindexSet")
	@java.lang.Override
	public java.lang.Long
	 getindex() {
		return this.index;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isindexSet() {
		return this.isindexSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("index")
	@java.lang.Override
	public void setindex(final java.lang.Long
	 index) {
		this.index = index;
		this.isindexSet = true;
	}

	
}
