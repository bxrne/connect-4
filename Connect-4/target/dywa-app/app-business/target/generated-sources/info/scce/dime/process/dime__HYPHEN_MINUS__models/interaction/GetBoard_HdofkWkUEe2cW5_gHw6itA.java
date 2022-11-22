package info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import info.scce.dime.exception.GUIEncounteredSignal;
import info.scce.dime.exception.GUIEncounteredSignal.GUIInfo;
import info.scce.dime.process.CallFrame;
import info.scce.dime.process.DIMEProcess;
import info.scce.dime.process.DIMEProcessContext;
import info.scce.dime.process.JSONContext;
import info.scce.dime.process.ProcessCallFrame;
import info.scce.dime.util.CDIUtil;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@info.scce.dime.process.RequiresDI
public final class GetBoard_HdofkWkUEe2cW5_gHw6itA implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				private int counterIterate_MUx0sWkUEe2cW5_gHw6itA = 0;
				private int counterIterate_lgq2IWmoEe2sl80VZxYqHw = 0;
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.counterIterate_MUx0sWkUEe2cW5_gHw6itA = ctx.counterIterate_MUx0sWkUEe2cW5_gHw6itA;
					result.counterIterate_lgq2IWmoEe2sl80VZxYqHw = ctx.counterIterate_lgq2IWmoEe2sl80VZxYqHw;

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;



					result.counterIterate_MUx0sWkUEe2cW5_gHw6itA = this.counterIterate_MUx0sWkUEe2cW5_gHw6itA;
					result.counterIterate_lgq2IWmoEe2sl80VZxYqHw = this.counterIterate_lgq2IWmoEe2sl80VZxYqHw;

					return result;
		        }
			}

	// attributes shaping the context variables.
	public static class Context implements DIMEProcessContext {

		// bean manager
		private BeanManager beanManager;
		
		// current eventID
		private String eventId;
		
		// last MajorSIBId
		private String lastMajorSIBId;
		
		// current MajorGUI
		private GUIInfo majorGUIState = null;

		// stack variables
		private ProcessCallFrame callStack = new ProcessCallFrame();

		// context variables.
		private List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Column> columns_XnhvsWniEe2ZroPb56nQ4Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Cell> cells_FVXm8WniEe2ZroPb56nQ4Q = new ArrayList<>();
		private java.lang.Long index_FVuzUWniEe2ZroPb56nQ4Q = 0l;
		// direct dataflow variables.
		private List<java.lang.Long> GetBoardWidthSuccessWidth_MUzC2WkUEe2cW5_gHw6itA = new ArrayList<>();
		private java.lang.Long IterateNextElement_MU04D2kUEe2cW5_gHw6itA;
		private List<java.lang.Long> GetColSuccessColumn_4pdrMWkUEe2cW5_gHw6itA = new ArrayList<>();
		private java.lang.Long IterateNextElement_lhWLkWmoEe2sl80VZxYqHw;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board Create_BoardSuccessCreated_PIyBwWniEe2ZroPb56nQ4Q;
		// index variables of iterate sibs.
		private int counterIterate_MUx0sWkUEe2cW5_gHw6itA = 0;
		private int counterIterate_lgq2IWmoEe2sl80VZxYqHw = 0;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_Hd0s0WkUEe2cW5_gHw6itA,
	_MUx0sWkUEe2cW5_gHw6itA,
	_MUzC02kUEe2cW5_gHw6itA,
	_4pKJMWkUEe2cW5_gHw6itA,
	_lgq2IWmoEe2sl80VZxYqHw,
	_7bKAkWnhEe2ZroPb56nQ4Q,
	_EsaJgWniEe2ZroPb56nQ4Q,
	_PICa4GniEe2ZroPb56nQ4Q,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.CellController CellController;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ColumnController ColumnController;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BoardController BoardController;

	@Inject
	public GetBoard_HdofkWkUEe2cW5_gHw6itA(final BeanManager beanManager, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.CellController CellController, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ColumnController ColumnController, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BoardController BoardController) {
		this.beanManager = beanManager;
		this.CellController = CellController;
		this.ColumnController = ColumnController;
		this.BoardController = BoardController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public GetBoard_HdofkWkUEe2cW5_gHw6itAResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._MUzC02kUEe2cW5_gHw6itA);
	}
	
	

	@Override
	public GetBoard_HdofkWkUEe2cW5_gHw6itAResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private GetBoard_HdofkWkUEe2cW5_gHw6itAResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _Hd0s0WkUEe2cW5_gHw6itA: {
					return execute_Hd0s0WkUEe2cW5_gHw6itA(ctx);
				}
				case _MUx0sWkUEe2cW5_gHw6itA: {
					curr = execute_MUx0sWkUEe2cW5_gHw6itA(ctx);
					break;
				}
				case _MUzC02kUEe2cW5_gHw6itA: {
					curr = execute_MUzC02kUEe2cW5_gHw6itA(ctx);
					break;
				}
				case _4pKJMWkUEe2cW5_gHw6itA: {
					curr = execute_4pKJMWkUEe2cW5_gHw6itA(ctx);
					break;
				}
				case _lgq2IWmoEe2sl80VZxYqHw: {
					curr = execute_lgq2IWmoEe2sl80VZxYqHw(ctx);
					break;
				}
				case _7bKAkWnhEe2ZroPb56nQ4Q: {
					curr = execute_7bKAkWnhEe2ZroPb56nQ4Q(ctx);
					break;
				}
				case _EsaJgWniEe2ZroPb56nQ4Q: {
					curr = execute_EsaJgWniEe2ZroPb56nQ4Q(ctx);
					break;
				}
				case _PICa4GniEe2ZroPb56nQ4Q: {
					curr = execute_PICa4GniEe2ZroPb56nQ4Q(ctx);
					break;
				}
				default: {
					throw new IllegalStateException("unhandled SIB container " + curr);
				}
			}
		}
	}
	
	/**
	 * The return type for this process. It stores the corresponding branch name 
	 * as well as the corresponding result for the branch.
	 */
	public static class GetBoard_HdofkWkUEe2cW5_gHw6itAResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public GetBoard_HdofkWkUEe2cW5_gHw6itAResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_Hd0s0WkUEe2cW5_gHw6itA";
			this.success = success;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public SuccessReturn getSuccessReturn() {
			return success;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>success</code>.
		 */
		public interface SuccessReturn {
			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board getBoard();
		}
	
		/**
		 * Return type of branch <code>success</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class SuccessReturnImpl implements SuccessReturn {

			private final Context ctx;

	        SuccessReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board getBoard() {
				return ctx.Create_BoardSuccessCreated_PIyBwWniEe2ZroPb56nQ4Q;
			}
		}
		


	// sibs
	// container for graph i/o 'success'.
	public GetBoard_HdofkWkUEe2cW5_gHw6itAResult execute_Hd0s0WkUEe2cW5_gHw6itA(final Context ctx) {
		return new GetBoard_HdofkWkUEe2cW5_gHw6itAResult(new SuccessReturnImpl(ctx));
	}
	// container for iterate primitive SIB 'Iterate'.
	public SIB_ID execute_MUx0sWkUEe2cW5_gHw6itA(final Context ctx) {
		final int pos = ctx.counterIterate_MUx0sWkUEe2cW5_gHw6itA++;
		List<java.lang.Long> list = ctx.GetBoardWidthSuccessWidth_MUzC2WkUEe2cW5_gHw6itA;
		if(list != null && pos < list.size()) {
			ctx.IterateNextElement_MU04D2kUEe2cW5_gHw6itA = ctx.GetBoardWidthSuccessWidth_MUzC2WkUEe2cW5_gHw6itA.get(pos);
			ctx.index_FVuzUWniEe2ZroPb56nQ4Q = ctx.GetBoardWidthSuccessWidth_MUzC2WkUEe2cW5_gHw6itA.get(pos);
			// branch 'next'
			return SIB_ID._4pKJMWkUEe2cW5_gHw6itA;
		}
		else {
			ctx.counterIterate_MUx0sWkUEe2cW5_gHw6itA = 0;
			// branch 'exit'
			return SIB_ID._PICa4GniEe2ZroPb56nQ4Q;
		}
		
	}
	// container for atomic SIB 'GetBoardWidth'.
	public SIB_ID execute_MUzC02kUEe2cW5_gHw6itA(final Context ctx) {
		try {
			final List<java.lang.Long> result = info.scce.dime.app.demo.Game.getBoardWidth();
			List<java.lang.Long> value0 = result;
			if (value0 != null) { // prevent null in lists
			ctx.GetBoardWidthSuccessWidth_MUzC2WkUEe2cW5_gHw6itA = new ArrayList<java.lang.Long>(value0);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'GetBoardWidth' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._MUx0sWkUEe2cW5_gHw6itA;
	}
	// container for atomic SIB 'GetCol'.
	public SIB_ID execute_4pKJMWkUEe2cW5_gHw6itA(final Context ctx) {
		try {
			final List<java.lang.Long> result = info.scce.dime.app.demo.Game.getCol(ctx.IterateNextElement_MU04D2kUEe2cW5_gHw6itA);
			List<java.lang.Long> value1 = result;
			if (value1 != null) { // prevent null in lists
			ctx.GetColSuccessColumn_4pdrMWkUEe2cW5_gHw6itA = new ArrayList<java.lang.Long>(value1);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'GetCol' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._lgq2IWmoEe2sl80VZxYqHw;
	}
	// container for iterate primitive SIB 'Iterate'.
	public SIB_ID execute_lgq2IWmoEe2sl80VZxYqHw(final Context ctx) {
		final int pos = ctx.counterIterate_lgq2IWmoEe2sl80VZxYqHw++;
		List<java.lang.Long> list = ctx.GetColSuccessColumn_4pdrMWkUEe2cW5_gHw6itA;
		if(list != null && pos < list.size()) {
			ctx.IterateNextElement_lhWLkWmoEe2sl80VZxYqHw = ctx.GetColSuccessColumn_4pdrMWkUEe2cW5_gHw6itA.get(pos);
			// branch 'next'
			return SIB_ID._7bKAkWnhEe2ZroPb56nQ4Q;
		}
		else {
			ctx.counterIterate_lgq2IWmoEe2sl80VZxYqHw = 0;
			// branch 'exit'
			return SIB_ID._EsaJgWniEe2ZroPb56nQ4Q;
		}
		
	}
	// container for create SIB 'Create Cell'.
	public SIB_ID execute_7bKAkWnhEe2ZroPb56nQ4Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.CellController domController = this.CellController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Cell createdObj = domController.create(null);
	
		createdObj.setvalue(ctx.IterateNextElement_lhWLkWmoEe2sl80VZxYqHw);
	
		de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Cell value2 = createdObj;
		if (value2 != null) { // prevent null in lists
		ctx.cells_FVXm8WniEe2ZroPb56nQ4Q.add(value2);
		}
	
		// branch 'success'
		return SIB_ID._lgq2IWmoEe2sl80VZxYqHw;
	}
	// container for create SIB 'Create Column'.
	public SIB_ID execute_EsaJgWniEe2ZroPb56nQ4Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ColumnController domController = this.ColumnController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Column createdObj = domController.create(null);
	
		createdObj.setcells_Cell(new ArrayList<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Cell>(ctx.cells_FVXm8WniEe2ZroPb56nQ4Q));
		createdObj.setindex(ctx.index_FVuzUWniEe2ZroPb56nQ4Q);
	
		de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Column value3 = createdObj;
		if (value3 != null) { // prevent null in lists
		ctx.columns_XnhvsWniEe2ZroPb56nQ4Q.add(value3);
		}
	
		// branch 'success'
		return SIB_ID._MUx0sWkUEe2cW5_gHw6itA;
	}
	// container for create SIB 'Create Board'.
	public SIB_ID execute_PICa4GniEe2ZroPb56nQ4Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BoardController domController = this.BoardController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board createdObj = domController.create(null);
	
		createdObj.setcolumns_Column(new ArrayList<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Column>(ctx.columns_XnhvsWniEe2ZroPb56nQ4Q));
	
		ctx.Create_BoardSuccessCreated_PIyBwWniEe2ZroPb56nQ4Q = createdObj;
	
		// branch 'success'
		return SIB_ID._Hd0s0WkUEe2cW5_gHw6itA;
	}
	
}  
