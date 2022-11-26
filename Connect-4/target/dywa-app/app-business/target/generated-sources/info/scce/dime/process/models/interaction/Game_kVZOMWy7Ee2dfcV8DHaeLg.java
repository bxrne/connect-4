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

public final class Game_kVZOMWy7Ee2dfcV8DHaeLg implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.Board board;
				private java.lang.Long turn;
				private java.lang.Long index;
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.board != null) {
						result.board = de.ls5.dywa.generated.rest.types.Board.fromDywaEntity(ctx.board, objectCache);
						de.ls5.dywa.generated.rest.types.BoardSelective.copy(ctx.board, result.board, objectCache);
					}
					result.turn = ctx.turn;
					result.index = ctx.index;

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.board != null) {
						result.board = contextTransformer.transform(this.board);
					}
					result.turn = this.turn;
					result.index = this.index;

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
		private de.ls5.dywa.generated.entity.models.app.Board board;
		private de.ls5.dywa.generated.entity.models.app.BaseUser player2;
		private de.ls5.dywa.generated.entity.models.app.BaseUser player1;
		private java.lang.Long turn = 0l;
		private java.lang.Long index = 0l;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_AyKlQWzGEe2dfcV8DHaeLg,
	_g0A7sWzHEe2dfcV8DHaeLg,
	__FR6wWzHEe2dfcV8DHaeLg,
	_KiYQMWzIEe2dfcV8DHaeLg,
	_Q8__HYPHEN_MINUS__VEGzIEe2dfcV8DHaeLg,
	_bsOGAWzIEe2dfcV8DHaeLg,
	_Og0icW0aEe2yY46ZtG__HYPHEN_MINUS__Oww,
	_0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public Game_kVZOMWy7Ee2dfcV8DHaeLg(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.models.app.BaseUser player1, de.ls5.dywa.generated.entity.models.app.BaseUser player2) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.player1 = player1;
		ctx.player2 = player2;
		
		return ctx;
	}

	public Game_kVZOMWy7Ee2dfcV8DHaeLgResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.models.app.BaseUser player1, de.ls5.dywa.generated.entity.models.app.BaseUser player2) {
		final Context ctx = createContext(player1, player2);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._AyKlQWzGEe2dfcV8DHaeLg);
	}
	
	
	public Game_kVZOMWy7Ee2dfcV8DHaeLgResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.models.app.BaseUser player1, de.ls5.dywa.generated.entity.models.app.BaseUser player2) {
		final Context ctx = createContext(player1, player2);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._AyKlQWzGEe2dfcV8DHaeLg);
	}

	@Override
	public Game_kVZOMWy7Ee2dfcV8DHaeLgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_g0A7sWzHEe2dfcV8DHaeLg": return executeInternal(ctx, continue_g0A7sWzHEe2dfcV8DHaeLg(ctx, slgResult));
		case "_bsOGAWzIEe2dfcV8DHaeLg": return executeInternal(ctx, continue_bsOGAWzIEe2dfcV8DHaeLg(ctx, slgResult));
		case "_0-I9sW2uEe2LvMTOtZFiXQ": return executeInternal(ctx, continue_0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Game_kVZOMWy7Ee2dfcV8DHaeLgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _AyKlQWzGEe2dfcV8DHaeLg: {
					curr = execute_AyKlQWzGEe2dfcV8DHaeLg(ctx);
					break;
				}
				case _g0A7sWzHEe2dfcV8DHaeLg: {
					curr = execute_g0A7sWzHEe2dfcV8DHaeLg(ctx);
					break;
				}
				case __FR6wWzHEe2dfcV8DHaeLg: {
					curr = execute__FR6wWzHEe2dfcV8DHaeLg(ctx);
					break;
				}
				case _KiYQMWzIEe2dfcV8DHaeLg: {
					curr = execute_KiYQMWzIEe2dfcV8DHaeLg(ctx);
					break;
				}
				case _Q8__HYPHEN_MINUS__VEGzIEe2dfcV8DHaeLg: {
					curr = execute_Q8__HYPHEN_MINUS__VEGzIEe2dfcV8DHaeLg(ctx);
					break;
				}
				case _bsOGAWzIEe2dfcV8DHaeLg: {
					curr = execute_bsOGAWzIEe2dfcV8DHaeLg(ctx);
					break;
				}
				case _Og0icW0aEe2yY46ZtG__HYPHEN_MINUS__Oww: {
					curr = execute_Og0icW0aEe2yY46ZtG__HYPHEN_MINUS__Oww(ctx);
					break;
				}
				case _0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ: {
					curr = execute_0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ(ctx);
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
	public static class Game_kVZOMWy7Ee2dfcV8DHaeLgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		

	}
	
	// model branches.


	// sibs
	// container for graph abstraction 'InitBoard' and sub process 'InitBoard'.
	public SIB_ID execute_AyKlQWzGEe2dfcV8DHaeLg(final Context ctx) {
		final info.scce.dime.process.models.interaction.InitBoard_mMPIMWwEEe2iyKycOTLADg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.models.interaction.InitBoard_mMPIMWwEEe2iyKycOTLADg.class);
	
		final info.scce.dime.process.models.interaction.InitBoard_mMPIMWwEEe2iyKycOTLADg.InitBoard_mMPIMWwEEe2iyKycOTLADgResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			ctx.board = result.getSuccessReturn().getBoard();
			ctx.turn = result.getSuccessReturn().getTurn();
			// branch 'success'
			return SIB_ID._g0A7sWzHEe2dfcV8DHaeLg;
		}
			default: throw new IllegalStateException("SIB 'InitBoard' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB game _g0A7sWzHEe2dfcV8DHaeLg
	private static class InputsForGUISIB_g0A7sWzHEe2dfcV8DHaeLg {
		public de.ls5.dywa.generated.rest.types.Board
		 board;
		public java.lang.Long turn;
	}
	
	
	// container for GUI SIB 'game'.
	public SIB_ID execute_g0A7sWzHEe2dfcV8DHaeLg(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.BoardREST inputsBoardREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BoardREST.class);
		
		final InputsForGUISIB_g0A7sWzHEe2dfcV8DHaeLg inputs = new InputsForGUISIB_g0A7sWzHEe2dfcV8DHaeLg();
		
		{
			de.ls5.dywa.generated.rest.types.Board
			 result = null;
			de.ls5.dywa.generated.entity.models.app.Board obj = ctx.board;
			
			de.ls5.dywa.generated.rest.types.Board restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_GameBoardSelectivex1_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw
					restTO = inputsBoardREST.read_GameBoardSelectivex1_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Board.fromDywaEntity(obj, objectCache);
					}
					// GameBoardSelectivex1_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw
					de.ls5.dywa.generated.rest.types.GameBoardSelectivex1_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.board = result;
		}
		inputs.turn = ctx.turn;
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.models.interaction.Game_kVZOMWy7Ee2dfcV8DHaeLg:_g0A7sWzHEe2dfcV8DHaeLg:_hri-8WaYEe2mp69GO3rQOw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_g0A7sWzHEe2dfcV8DHaeLg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_g0A7sWzHEe2dfcV8DHaeLg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_g0A7sWzHEe2dfcV8DHaeLg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.models.gui.game.Game_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOwResult result = (info.scce.dime.gui.models.gui.game.Game_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOwResult) guiResult;
		if ("back".equals(result.getBranchName())) {
			// branch 'back'
			return SIB_ID._0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ;
		} else 
		if ("placePiece".equals(result.getBranchName())) {
			if(result.getgui__c1JK8WsdEe2LPP__HYPHEN_MINUS__yV9ajYAplacePieceReturn() != null) {
			ctx.board = (de.ls5.dywa.generated.entity.models.app.Board)result.getgui__c1JK8WsdEe2LPP__HYPHEN_MINUS__yV9ajYAplacePieceReturn().getBoard();
			ctx.index = result.getgui__c1JK8WsdEe2LPP__HYPHEN_MINUS__yV9ajYAplacePieceReturn().getIndex();
			}
			// branch 'placePiece'
			return SIB_ID._Og0icW0aEe2yY46ZtG__HYPHEN_MINUS__Oww;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_g0A7sWzHEe2dfcV8DHaeLg(ctx);
		}
	}
	// container for graph abstraction 'addPiece' and sub process 'addPiece'.
	public SIB_ID execute__FR6wWzHEe2dfcV8DHaeLg(final Context ctx) {
		final info.scce.dime.process.models.interaction.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA instance = new info.scce.dime.process.models.interaction.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA(ctx.beanManager);
	
		final info.scce.dime.process.models.interaction.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult result = instance.execute(false, ctx.board, ctx.index, ctx.turn);
	
		switch(result.getBranchName()) {
		case "success": {
			ctx.board = result.getSuccessReturn().getBoard();
			// branch 'success'
			return SIB_ID._KiYQMWzIEe2dfcV8DHaeLg;
		}
			default: throw new IllegalStateException("SIB 'addPiece' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for atomic SIB 'CheckWin'.
	public SIB_ID execute_KiYQMWzIEe2dfcV8DHaeLg(final Context ctx) {
		if (info.scce.dime.app.demo.Game.checkWin(ctx.board, ctx.turn)) {
			// branch 'true'
			return SIB_ID._bsOGAWzIEe2dfcV8DHaeLg;
		}
		else {
			// branch 'false'
			return SIB_ID._Q8__HYPHEN_MINUS__VEGzIEe2dfcV8DHaeLg;
		}
	}
	// container for atomic SIB 'SwitchPlayer'.
	public SIB_ID execute_Q8__HYPHEN_MINUS__VEGzIEe2dfcV8DHaeLg(final Context ctx) {
		try {
			final java.lang.Long result = info.scce.dime.app.demo.Game.switchPlayer(ctx.turn);
			ctx.turn = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'SwitchPlayer' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._g0A7sWzHEe2dfcV8DHaeLg;
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB winmsg _bsOGAWzIEe2dfcV8DHaeLg
	private static class InputsForGUISIB_bsOGAWzIEe2dfcV8DHaeLg {
		public java.lang.Long winner;
	}
	
	
	// container for GUI SIB 'winmsg'.
	public SIB_ID execute_bsOGAWzIEe2dfcV8DHaeLg(final Context ctx) {
	
		
		final InputsForGUISIB_bsOGAWzIEe2dfcV8DHaeLg inputs = new InputsForGUISIB_bsOGAWzIEe2dfcV8DHaeLg();
		
		inputs.winner = ctx.turn;
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.models.interaction.Game_kVZOMWy7Ee2dfcV8DHaeLg:_bsOGAWzIEe2dfcV8DHaeLg:_mJQrsGwPEe2izKycOTLADg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_bsOGAWzIEe2dfcV8DHaeLg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_bsOGAWzIEe2dfcV8DHaeLg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_bsOGAWzIEe2dfcV8DHaeLg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.models.gui.winmsg.Winmsg_mJQrsGwPEe2izKycOTLADgResult result = (info.scce.dime.gui.models.gui.winmsg.Winmsg_mJQrsGwPEe2izKycOTLADgResult) guiResult;
		if ("play_again".equals(result.getBranchName())) {
			// branch 'play again'
			return SIB_ID._AyKlQWzGEe2dfcV8DHaeLg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_bsOGAWzIEe2dfcV8DHaeLg(ctx);
		}
	}
	// container for atomic SIB 'CheckIsColumnFull'.
	public SIB_ID execute_Og0icW0aEe2yY46ZtG__HYPHEN_MINUS__Oww(final Context ctx) {
		if (info.scce.dime.app.demo.Game.isColumnFull(ctx.board, ctx.index)) {
			// branch 'true'
			return SIB_ID._g0A7sWzHEe2dfcV8DHaeLg;
		}
		else {
			// branch 'false'
			return SIB_ID.__FR6wWzHEe2dfcV8DHaeLg;
		}
	}
	// container for graph abstraction 'Home' and sub process 'Home'.
	public SIB_ID execute_0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ(final Context ctx) {
		final info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg instance = new info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.models.interaction.Game_kVZOMWy7Ee2dfcV8DHaeLg:_0-I9sW2uEe2LvMTOtZFiXQ", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult result = instance.execute(ctx.callStack );
	
		return continue_0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ(ctx, result);
	}
	
	public SIB_ID continue_0__HYPHEN_MINUS__I9sW2uEe2LvMTOtZFiXQ(Context ctx, Object slgResult) {
		final info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult result = (info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
			default: throw new IllegalStateException("SIB 'Home' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
}  
