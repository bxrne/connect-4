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

public final class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.Board board;
				private java.lang.Long turn;
				// end context variables

				// begin direct dataflow variables
				private java.lang.Long gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA;
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
					result.gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA = ctx.gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA;

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
					result.gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA = this.gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA;

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
		private java.lang.Long turn = 0l;
		// direct dataflow variables.
		private java.lang.Long gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_NHhKMGhZEe2Ts87gHbvjRg,
	_b46FcWhaEe2Ts87gHbvjRg,
	_4dXEIWsdEe2LPP__HYPHEN_MINUS__yV9ajYA,
	_yfBIcWwEEe2iyKycOTLADg,
	_H0Q1cWwKEe2izKycOTLADg,
	_fyArMWwOEe2izKycOTLADg,
	_n3ZogWwPEe2izKycOTLADg,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._b46FcWhaEe2Ts87gHbvjRg);
	}
	
	
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._b46FcWhaEe2Ts87gHbvjRg);
	}

	@Override
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_NHhKMGhZEe2Ts87gHbvjRg": return executeInternal(ctx, continue_NHhKMGhZEe2Ts87gHbvjRg(ctx, slgResult));
		case "_b46FcWhaEe2Ts87gHbvjRg": return executeInternal(ctx, continue_b46FcWhaEe2Ts87gHbvjRg(ctx, slgResult));
		case "_n3ZogWwPEe2izKycOTLADg": return executeInternal(ctx, continue_n3ZogWwPEe2izKycOTLADg(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _NHhKMGhZEe2Ts87gHbvjRg: {
					curr = execute_NHhKMGhZEe2Ts87gHbvjRg(ctx);
					break;
				}
				case _b46FcWhaEe2Ts87gHbvjRg: {
					curr = execute_b46FcWhaEe2Ts87gHbvjRg(ctx);
					break;
				}
				case _4dXEIWsdEe2LPP__HYPHEN_MINUS__yV9ajYA: {
					curr = execute_4dXEIWsdEe2LPP__HYPHEN_MINUS__yV9ajYA(ctx);
					break;
				}
				case _yfBIcWwEEe2iyKycOTLADg: {
					curr = execute_yfBIcWwEEe2iyKycOTLADg(ctx);
					break;
				}
				case _H0Q1cWwKEe2izKycOTLADg: {
					curr = execute_H0Q1cWwKEe2izKycOTLADg(ctx);
					break;
				}
				case _fyArMWwOEe2izKycOTLADg: {
					curr = execute_fyArMWwOEe2izKycOTLADg(ctx);
					break;
				}
				case _n3ZogWwPEe2izKycOTLADg: {
					curr = execute_n3ZogWwPEe2izKycOTLADg(ctx);
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
	public static class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
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
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB game _NHhKMGhZEe2Ts87gHbvjRg
	private static class InputsForGUISIB_NHhKMGhZEe2Ts87gHbvjRg {
		public de.ls5.dywa.generated.rest.types.Board
		 board;
		public java.lang.Long turn;
	}
	
	
	// container for GUI SIB 'game'.
	public SIB_ID execute_NHhKMGhZEe2Ts87gHbvjRg(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.BoardREST inputsBoardREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BoardREST.class);
		
		final InputsForGUISIB_NHhKMGhZEe2Ts87gHbvjRg inputs = new InputsForGUISIB_NHhKMGhZEe2Ts87gHbvjRg();
		
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
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg:_NHhKMGhZEe2Ts87gHbvjRg:_hri-8WaYEe2mp69GO3rQOw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_NHhKMGhZEe2Ts87gHbvjRg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_NHhKMGhZEe2Ts87gHbvjRg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_NHhKMGhZEe2Ts87gHbvjRg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.models.gui.game.Game_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOwResult result = (info.scce.dime.gui.models.gui.game.Game_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOwResult) guiResult;
		if ("back".equals(result.getBranchName())) {
			// branch 'back'
			return SIB_ID._b46FcWhaEe2Ts87gHbvjRg;
		} else 
		if ("placePiece".equals(result.getBranchName())) {
			if(result.getgui__c1JK8WsdEe2LPP__HYPHEN_MINUS__yV9ajYAplacePieceReturn() != null) {
			ctx.gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA = result.getgui__c1JK8WsdEe2LPP__HYPHEN_MINUS__yV9ajYAplacePieceReturn().getIndex();
			}
			// branch 'placePiece'
			return SIB_ID._4dXEIWsdEe2LPP__HYPHEN_MINUS__yV9ajYA;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_NHhKMGhZEe2Ts87gHbvjRg(ctx);
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB home _b46FcWhaEe2Ts87gHbvjRg
	private static class InputsForGUISIB_b46FcWhaEe2Ts87gHbvjRg {
	}
	
	
	// container for GUI SIB 'home'.
	public SIB_ID execute_b46FcWhaEe2Ts87gHbvjRg(final Context ctx) {
	
		
		final InputsForGUISIB_b46FcWhaEe2Ts87gHbvjRg inputs = new InputsForGUISIB_b46FcWhaEe2Ts87gHbvjRg();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg:_b46FcWhaEe2Ts87gHbvjRg:_dddDUGaXEe2ffZDgDpg3pA", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_b46FcWhaEe2Ts87gHbvjRg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_b46FcWhaEe2Ts87gHbvjRg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_b46FcWhaEe2Ts87gHbvjRg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.models.gui.home.Home_dddDUGaXEe2ffZDgDpg3pAResult result = (info.scce.dime.gui.models.gui.home.Home_dddDUGaXEe2ffZDgDpg3pAResult) guiResult;
		if ("start_game_basic".equals(result.getBranchName())) {
			// branch 'start_game_basic'
			return SIB_ID._yfBIcWwEEe2iyKycOTLADg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_b46FcWhaEe2Ts87gHbvjRg(ctx);
		}
	}
	// container for graph abstraction 'addPiece' and sub process 'addPiece'.
	public SIB_ID execute_4dXEIWsdEe2LPP__HYPHEN_MINUS__yV9ajYA(final Context ctx) {
		final info.scce.dime.process.models.interaction.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA instance = new info.scce.dime.process.models.interaction.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA(ctx.beanManager);
	
		final info.scce.dime.process.models.interaction.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYA.AddPiece_05YnEWsdEe2LPP__HYPHEN_MINUS__yV9ajYAResult result = instance.execute(false, ctx.board, ctx.gamePlacePieceIndex_nSD1wWsdEe2LPP__HYPHEN_MINUS__yV9ajYA, ctx.turn);
	
		switch(result.getBranchName()) {
		case "success": {
			ctx.board = result.getSuccessReturn().getBoard();
			// branch 'success'
			return SIB_ID._fyArMWwOEe2izKycOTLADg;
		}
			default: throw new IllegalStateException("SIB 'addPiece' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'InitBoard' and sub process 'InitBoard'.
	public SIB_ID execute_yfBIcWwEEe2iyKycOTLADg(final Context ctx) {
		final info.scce.dime.process.models.interaction.InitBoard_mMPIMWwEEe2iyKycOTLADg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.models.interaction.InitBoard_mMPIMWwEEe2iyKycOTLADg.class);
	
		final info.scce.dime.process.models.interaction.InitBoard_mMPIMWwEEe2iyKycOTLADg.InitBoard_mMPIMWwEEe2iyKycOTLADgResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			ctx.board = result.getSuccessReturn().getBoard();
			ctx.turn = result.getSuccessReturn().getTurn();
			// branch 'success'
			return SIB_ID._NHhKMGhZEe2Ts87gHbvjRg;
		}
			default: throw new IllegalStateException("SIB 'InitBoard' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for atomic SIB 'SwitchPlayer'.
	public SIB_ID execute_H0Q1cWwKEe2izKycOTLADg(final Context ctx) {
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
		return SIB_ID._NHhKMGhZEe2Ts87gHbvjRg;
	}
	// container for atomic SIB 'CheckWin'.
	public SIB_ID execute_fyArMWwOEe2izKycOTLADg(final Context ctx) {
		if (info.scce.dime.app.demo.Game.checkWin(ctx.board, ctx.turn)) {
			// branch 'true'
			return SIB_ID._n3ZogWwPEe2izKycOTLADg;
		}
		else {
			// branch 'false'
			return SIB_ID._H0Q1cWwKEe2izKycOTLADg;
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB winmsg _n3ZogWwPEe2izKycOTLADg
	private static class InputsForGUISIB_n3ZogWwPEe2izKycOTLADg {
		public java.lang.Long winner;
	}
	
	
	// container for GUI SIB 'winmsg'.
	public SIB_ID execute_n3ZogWwPEe2izKycOTLADg(final Context ctx) {
	
		
		final InputsForGUISIB_n3ZogWwPEe2izKycOTLADg inputs = new InputsForGUISIB_n3ZogWwPEe2izKycOTLADg();
		
		inputs.winner = ctx.turn;
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg:_n3ZogWwPEe2izKycOTLADg:_mJQrsGwPEe2izKycOTLADg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_n3ZogWwPEe2izKycOTLADg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_n3ZogWwPEe2izKycOTLADg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_n3ZogWwPEe2izKycOTLADg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		// unspecified branch, show same GUI again
		return execute_n3ZogWwPEe2izKycOTLADg(ctx);
	}
	
}  
