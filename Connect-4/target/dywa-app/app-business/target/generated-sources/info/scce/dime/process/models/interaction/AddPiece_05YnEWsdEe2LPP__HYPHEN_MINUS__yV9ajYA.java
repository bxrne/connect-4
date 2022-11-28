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

public final class AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.models.app.Board board;
		private java.lang.Long index = 0l;
		// direct dataflow variables.
		private java.lang.Long startTurn_TmgJ4WwJEe2izKycOTLADg;
		private java.lang.Long startNumberOfTurnsTaken_0YU8EW3IEe277rRNOuM5KQ;
		private java.lang.Long IntegerMutliplySuccessResult_DV7j0W3JEe277rRNOuM5KQ;
		private de.ls5.dywa.generated.entity.models.app.Board PlaceCoinSuccessBoard_Wgt1EWwFEe2iyKycOTLADg;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_05dfkWsdEe2LPP__HYPHEN_MINUS__yV9ajYA,
	_OxptUGtlEe2yLYR6JjFIQg,
	_NPi_MW3HEe277rRNOuM5KQ,
	_oJVFEG3HEe277rRNOuM5KQ,
	_DVdpwW3JEe277rRNOuM5KQ,
	_9__HYPHEN_MINUS__uZIW3JEe277rRNOuM5KQ,
	_bI2J8W3KEe277rRNOuM5KQ,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.models.app.Board board, java.lang.Long index, java.lang.Long numberOfTurnsTaken, java.lang.Long turn) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startNumberOfTurnsTaken_0YU8EW3IEe277rRNOuM5KQ = numberOfTurnsTaken;
		ctx.startTurn_TmgJ4WwJEe2izKycOTLADg = turn;
		ctx.board = board;
		ctx.index = index;
		
		return ctx;
	}

	public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.models.app.Board board, java.lang.Long index, java.lang.Long numberOfTurnsTaken, java.lang.Long turn) {
		final Context ctx = createContext(board, index, numberOfTurnsTaken, turn);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._DVdpwW3JEe277rRNOuM5KQ);
	}
	
	

	@Override
	public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _05dfkWsdEe2LPP__HYPHEN_MINUS__yV9ajYA: {
					return execute_05dfkWsdEe2LPP__HYPHEN_MINUS__yV9ajYA(ctx);
				}
				case _OxptUGtlEe2yLYR6JjFIQg: {
					curr = execute_OxptUGtlEe2yLYR6JjFIQg(ctx);
					break;
				}
				case _NPi_MW3HEe277rRNOuM5KQ: {
					curr = execute_NPi_MW3HEe277rRNOuM5KQ(ctx);
					break;
				}
				case _oJVFEG3HEe277rRNOuM5KQ: {
					return execute_oJVFEG3HEe277rRNOuM5KQ(ctx);
				}
				case _DVdpwW3JEe277rRNOuM5KQ: {
					curr = execute_DVdpwW3JEe277rRNOuM5KQ(ctx);
					break;
				}
				case _9__HYPHEN_MINUS__uZIW3JEe277rRNOuM5KQ: {
					curr = execute_9__HYPHEN_MINUS__uZIW3JEe277rRNOuM5KQ(ctx);
					break;
				}
				case _bI2J8W3KEe277rRNOuM5KQ: {
					return execute_bI2J8W3KEe277rRNOuM5KQ(ctx);
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
	public static class AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_05dfkWsdEe2LPP__HYPHEN_MINUS__yV9ajYA";
			this.success = success;
		}
		private Column_is_fullReturn Column_is_full;
		
		public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult(Column_is_fullReturn Column_is_full) {
			this.branchName = "Column is full";
			this.branchId = "_oJVFEG3HEe277rRNOuM5KQ";
			this.Column_is_full = Column_is_full;
		}
		private Board_is_fullReturn Board_is_full;
		
		public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult(Board_is_fullReturn Board_is_full) {
			this.branchName = "Board is full";
			this.branchId = "_bI2J8W3KEe277rRNOuM5KQ";
			this.Board_is_full = Board_is_full;
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
		public Column_is_fullReturn getColumn_is_fullReturn() {
			return Column_is_full;
		}
		public Board_is_fullReturn getBoard_is_fullReturn() {
			return Board_is_full;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>success</code>.
		 */
		public interface SuccessReturn {
			public de.ls5.dywa.generated.entity.models.app.Board getBoard();
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
				return ctx.PlaceCoinSuccessBoard_Wgt1EWwFEe2iyKycOTLADg;
			}
		}
		
		/**
		 * Interface definition for return type of branch <code>Column is full</code>.
		 */
		public interface Column_is_fullReturn {
		}
	
		/**
		 * Return type of branch <code>Column is full</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class Column_is_fullReturnImpl implements Column_is_fullReturn {

			private final Context ctx;

	        Column_is_fullReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		
		/**
		 * Interface definition for return type of branch <code>Board is full</code>.
		 */
		public interface Board_is_fullReturn {
		}
	
		/**
		 * Return type of branch <code>Board is full</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class Board_is_fullReturnImpl implements Board_is_fullReturn {

			private final Context ctx;

	        Board_is_fullReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// container for graph i/o 'success'.
	public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult execute_05dfkWsdEe2LPP__HYPHEN_MINUS__yV9ajYA(final Context ctx) {
		return new AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult(new SuccessReturnImpl(ctx));
	}
	// container for atomic SIB 'PlaceCoin'.
	public SIB_ID execute_OxptUGtlEe2yLYR6JjFIQg(final Context ctx) {
		try {
			final de.ls5.dywa.generated.entity.models.app.Board result = info.scce.dime.app.demo.Game.placeCoin(ctx.board, ctx.startTurn_TmgJ4WwJEe2izKycOTLADg, ctx.index);
			ctx.PlaceCoinSuccessBoard_Wgt1EWwFEe2iyKycOTLADg = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'PlaceCoin' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._05dfkWsdEe2LPP__HYPHEN_MINUS__yV9ajYA;
	}
	// container for atomic SIB 'CheckIsColumnFull'.
	public SIB_ID execute_NPi_MW3HEe277rRNOuM5KQ(final Context ctx) {
		if (info.scce.dime.app.demo.Game.isColumnFull(ctx.board, ctx.index)) {
			// branch 'true'
			return SIB_ID._oJVFEG3HEe277rRNOuM5KQ;
		}
		else {
			// branch 'false'
			return SIB_ID._OxptUGtlEe2yLYR6JjFIQg;
		}
	}
	// container for graph i/o 'Column is full'.
	public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult execute_oJVFEG3HEe277rRNOuM5KQ(final Context ctx) {
		return new AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult(new Column_is_fullReturnImpl(ctx));
	}
	// container for atomic SIB 'IntegerMutliply'.
	public SIB_ID execute_DVdpwW3JEe277rRNOuM5KQ(final Context ctx) {
		try {
			final java.lang.Long result = info.scce.dime.common.CommonNativeIntegerServiceLibrary.multiply(Long.valueOf(Optional.ofNullable(ctx.board).map(de.ls5.dywa.generated.entity.models.app.Board::getcolumns_Column).map(List::size).orElse(0)), Long.valueOf(Optional.ofNullable(ctx.board).map(de.ls5.dywa.generated.entity.models.app.Board::getcolumns_Column).map(List::stream).flatMap(Stream::findFirst).map(de.ls5.dywa.generated.entity.models.app.Column::getcells_Cell).map(List::size).orElse(0)));
			ctx.IntegerMutliplySuccessResult_DV7j0W3JEe277rRNOuM5KQ = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'IntegerMutliply' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._9__HYPHEN_MINUS__uZIW3JEe277rRNOuM5KQ;
	}
	// container for atomic SIB 'IntegerLess'.
	public SIB_ID execute_9__HYPHEN_MINUS__uZIW3JEe277rRNOuM5KQ(final Context ctx) {
		if (info.scce.dime.common.CommonNativeIntegerServiceLibrary.less(ctx.startNumberOfTurnsTaken_0YU8EW3IEe277rRNOuM5KQ, ctx.IntegerMutliplySuccessResult_DV7j0W3JEe277rRNOuM5KQ)) {
			// branch 'true'
			return SIB_ID._NPi_MW3HEe277rRNOuM5KQ;
		}
		else {
			// branch 'false'
			return SIB_ID._bI2J8W3KEe277rRNOuM5KQ;
		}
	}
	// container for graph i/o 'Board is full'.
	public AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult execute_bI2J8W3KEe277rRNOuM5KQ(final Context ctx) {
		return new AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult(new Board_is_fullReturnImpl(ctx));
	}
	
}  
