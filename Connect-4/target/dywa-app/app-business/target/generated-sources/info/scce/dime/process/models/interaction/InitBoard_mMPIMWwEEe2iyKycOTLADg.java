package info.scce.dime.process.models.interaction;

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
public final class InitBoard_mMPIMWwEEe2iyKycOTLADg implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				private int counterIterate_rYl4VWwEEe2iyKycOTLADg = 0;
				private int counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg = 0;
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.counterIterate_rYl4VWwEEe2iyKycOTLADg = ctx.counterIterate_rYl4VWwEEe2iyKycOTLADg;
					result.counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg = ctx.counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg;

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;



					result.counterIterate_rYl4VWwEEe2iyKycOTLADg = this.counterIterate_rYl4VWwEEe2iyKycOTLADg;
					result.counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg = this.counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg;

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
		private List<de.ls5.dywa.generated.entity.models.app.Column> columns_XnhvsWniEe2ZroPb56nQ4Q = new ArrayList<>();
		private de.ls5.dywa.generated.entity.models.app.Board board;
		// direct dataflow variables.
		private java.lang.Long IterateNextElement_rYz63WwEEe2iyKycOTLADg;
		private List<java.lang.Long> GetBoardWidthSuccessWidth_rYnGfWwEEe2iyKycOTLADg = new ArrayList<>();
		private java.lang.Long IterateNextElement_rYyFoWwEEe2iyKycOTLADg;
		private List<java.lang.Long> MakeColSuccessColumn_rY1wAWwEEe2iyKycOTLADg = new ArrayList<>();
		private de.ls5.dywa.generated.entity.models.app.Column Create_ColumnSuccessCreated_rYxegmwEEe2iyKycOTLADg;
		private de.ls5.dywa.generated.entity.models.app.Cell Create_CellSuccessCreated_rY2XCmwEEe2iyKycOTLADg;
		// index variables of iterate sibs.
		private int counterIterate_rYl4VWwEEe2iyKycOTLADg = 0;
		private int counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg = 0;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_rYz6wWwEEe2iyKycOTLADg,
	_rYysqmwEEe2iyKycOTLADg,
	_rY1I7mwEEe2iyKycOTLADg,
	_rYnGd2wEEe2iyKycOTLADg,
	_rY0h2mwEEe2iyKycOTLADg,
	_rYl4VWwEEe2iyKycOTLADg,
	_rY3lLWwEEe2iyKycOTLADg,
	_rY5aWmwEEe2iyKycOTLADg,
	_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg,
	_CZMeYWzPEe2dgcV8DHaeLg,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.models.app.CellController CellController;
	private final de.ls5.dywa.generated.controller.models.app.BoardController BoardController;
	private final de.ls5.dywa.generated.controller.models.app.ColumnController ColumnController;

	@Inject
	public InitBoard_mMPIMWwEEe2iyKycOTLADg(final BeanManager beanManager, de.ls5.dywa.generated.controller.models.app.CellController CellController, de.ls5.dywa.generated.controller.models.app.BoardController BoardController, de.ls5.dywa.generated.controller.models.app.ColumnController ColumnController) {
		this.beanManager = beanManager;
		this.CellController = CellController;
		this.BoardController = BoardController;
		this.ColumnController = ColumnController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public InitBoard_mMPIMWwEEe2iyKycOTLADgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._rYnGd2wEEe2iyKycOTLADg);
	}
	
	

	@Override
	public InitBoard_mMPIMWwEEe2iyKycOTLADgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private InitBoard_mMPIMWwEEe2iyKycOTLADgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _rYz6wWwEEe2iyKycOTLADg: {
					curr = execute_rYz6wWwEEe2iyKycOTLADg(ctx);
					break;
				}
				case _rYysqmwEEe2iyKycOTLADg: {
					curr = execute_rYysqmwEEe2iyKycOTLADg(ctx);
					break;
				}
				case _rY1I7mwEEe2iyKycOTLADg: {
					curr = execute_rY1I7mwEEe2iyKycOTLADg(ctx);
					break;
				}
				case _rYnGd2wEEe2iyKycOTLADg: {
					curr = execute_rYnGd2wEEe2iyKycOTLADg(ctx);
					break;
				}
				case _rY0h2mwEEe2iyKycOTLADg: {
					curr = execute_rY0h2mwEEe2iyKycOTLADg(ctx);
					break;
				}
				case _rYl4VWwEEe2iyKycOTLADg: {
					curr = execute_rYl4VWwEEe2iyKycOTLADg(ctx);
					break;
				}
				case _rY3lLWwEEe2iyKycOTLADg: {
					curr = execute_rY3lLWwEEe2iyKycOTLADg(ctx);
					break;
				}
				case _rY5aWmwEEe2iyKycOTLADg: {
					return execute_rY5aWmwEEe2iyKycOTLADg(ctx);
				}
				case _rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg: {
					curr = execute_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg(ctx);
					break;
				}
				case _CZMeYWzPEe2dgcV8DHaeLg: {
					curr = execute_CZMeYWzPEe2dgcV8DHaeLg(ctx);
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
	public static class InitBoard_mMPIMWwEEe2iyKycOTLADgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public InitBoard_mMPIMWwEEe2iyKycOTLADgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_rY5aWmwEEe2iyKycOTLADg";
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
			public de.ls5.dywa.generated.entity.models.app.Board getBoard();
			public java.lang.Long getTurn();
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

			public de.ls5.dywa.generated.entity.models.app.Board getBoard() {
				return ctx.board;
			}
			public java.lang.Long getTurn() {
				return 1l;
			}
		}
		


	// sibs
	// container for create SIB 'Create Cell'.
	public SIB_ID execute_rYz6wWwEEe2iyKycOTLADg(final Context ctx) {
		final de.ls5.dywa.generated.controller.models.app.CellController domController = this.CellController;
	
		final de.ls5.dywa.generated.entity.models.app.Cell createdObj = domController.create(null);
	
		createdObj.setvalue(ctx.IterateNextElement_rYz63WwEEe2iyKycOTLADg);
	
		ctx.Create_CellSuccessCreated_rY2XCmwEEe2iyKycOTLADg = createdObj;
	
		// branch 'success'
		return SIB_ID._rY3lLWwEEe2iyKycOTLADg;
	}
	// container for create SIB 'Create Board'.
	public SIB_ID execute_rYysqmwEEe2iyKycOTLADg(final Context ctx) {
		final de.ls5.dywa.generated.controller.models.app.BoardController domController = this.BoardController;
	
		final de.ls5.dywa.generated.entity.models.app.Board createdObj = domController.create(null);
	
		createdObj.setcolumns_Column(new ArrayList<de.ls5.dywa.generated.entity.models.app.Column>(ctx.columns_XnhvsWniEe2ZroPb56nQ4Q));
	
		ctx.board = createdObj;
	
		// branch 'success'
		return SIB_ID._CZMeYWzPEe2dgcV8DHaeLg;
	}
	// container for create SIB 'Create Column'.
	public SIB_ID execute_rY1I7mwEEe2iyKycOTLADg(final Context ctx) {
		final de.ls5.dywa.generated.controller.models.app.ColumnController domController = this.ColumnController;
	
		final de.ls5.dywa.generated.entity.models.app.Column createdObj = domController.create(null);
	
		createdObj.setindex(ctx.IterateNextElement_rYyFoWwEEe2iyKycOTLADg);
	
		de.ls5.dywa.generated.entity.models.app.Column value1 = createdObj;
		if (value1 != null) { // prevent null in lists
		ctx.columns_XnhvsWniEe2ZroPb56nQ4Q.add(value1);
		}
		ctx.Create_ColumnSuccessCreated_rYxegmwEEe2iyKycOTLADg = createdObj;
	
		// branch 'success'
		return SIB_ID._rY0h2mwEEe2iyKycOTLADg;
	}
	// container for atomic SIB 'GetBoardWidth'.
	public SIB_ID execute_rYnGd2wEEe2iyKycOTLADg(final Context ctx) {
		try {
			final List<java.lang.Long> result = info.scce.dime.app.demo.Game.getBoardWidth();
			List<java.lang.Long> value2 = result;
			if (value2 != null) { // prevent null in lists
			ctx.GetBoardWidthSuccessWidth_rYnGfWwEEe2iyKycOTLADg = new ArrayList<java.lang.Long>(value2);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'GetBoardWidth' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg;
	}
	// container for atomic SIB 'MakeCol'.
	public SIB_ID execute_rY0h2mwEEe2iyKycOTLADg(final Context ctx) {
		try {
			final List<java.lang.Long> result = info.scce.dime.app.demo.Game.makeCol(ctx.IterateNextElement_rYyFoWwEEe2iyKycOTLADg);
			List<java.lang.Long> value3 = result;
			if (value3 != null) { // prevent null in lists
			ctx.MakeColSuccessColumn_rY1wAWwEEe2iyKycOTLADg = new ArrayList<java.lang.Long>(value3);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'MakeCol' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._rYl4VWwEEe2iyKycOTLADg;
	}
	// container for iterate primitive SIB 'Iterate'.
	public SIB_ID execute_rYl4VWwEEe2iyKycOTLADg(final Context ctx) {
		final int pos = ctx.counterIterate_rYl4VWwEEe2iyKycOTLADg++;
		List<java.lang.Long> list = ctx.MakeColSuccessColumn_rY1wAWwEEe2iyKycOTLADg;
		if(list != null && pos < list.size()) {
			ctx.IterateNextElement_rYz63WwEEe2iyKycOTLADg = ctx.MakeColSuccessColumn_rY1wAWwEEe2iyKycOTLADg.get(pos);
			// branch 'next'
			return SIB_ID._rYz6wWwEEe2iyKycOTLADg;
		}
		else {
			ctx.counterIterate_rYl4VWwEEe2iyKycOTLADg = 0;
			// branch 'exit'
			return SIB_ID._rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg;
		}
		
	}
	// container for atomic SIB 'AddCell'.
	public SIB_ID execute_rY3lLWwEEe2iyKycOTLADg(final Context ctx) {
		try {
			info.scce.dime.app.demo.Game.addCell(ctx.Create_CellSuccessCreated_rY2XCmwEEe2iyKycOTLADg, ctx.Create_ColumnSuccessCreated_rYxegmwEEe2iyKycOTLADg);
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'AddCell' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._rYl4VWwEEe2iyKycOTLADg;
	}
	// container for graph i/o 'success'.
	public InitBoard_mMPIMWwEEe2iyKycOTLADgResult execute_rY5aWmwEEe2iyKycOTLADg(final Context ctx) {
		return new InitBoard_mMPIMWwEEe2iyKycOTLADgResult(new SuccessReturnImpl(ctx));
	}
	// container for iterate primitive SIB 'Iterate'.
	public SIB_ID execute_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg(final Context ctx) {
		final int pos = ctx.counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg++;
		List<java.lang.Long> list = ctx.GetBoardWidthSuccessWidth_rYnGfWwEEe2iyKycOTLADg;
		if(list != null && pos < list.size()) {
			ctx.IterateNextElement_rYyFoWwEEe2iyKycOTLADg = ctx.GetBoardWidthSuccessWidth_rYnGfWwEEe2iyKycOTLADg.get(pos);
			ctx.IterateNextElement_rYyFoWwEEe2iyKycOTLADg = ctx.GetBoardWidthSuccessWidth_rYnGfWwEEe2iyKycOTLADg.get(pos);
			// branch 'next'
			return SIB_ID._rY1I7mwEEe2iyKycOTLADg;
		}
		else {
			ctx.counterIterate_rY2__HYPHEN_MINUS__I2wEEe2iyKycOTLADg = 0;
			// branch 'exit'
			return SIB_ID._rYysqmwEEe2iyKycOTLADg;
		}
		
	}
	// container for atomic SIB 'printBoard'.
	public SIB_ID execute_CZMeYWzPEe2dgcV8DHaeLg(final Context ctx) {
		try {
			info.scce.dime.app.demo.Game.printBoard("end of InitBoard", ctx.board);
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'printBoard' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._rY5aWmwEEe2iyKycOTLADg;
	}
	
}  
