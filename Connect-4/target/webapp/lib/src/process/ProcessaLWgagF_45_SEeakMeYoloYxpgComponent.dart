// root Home process combines all front end sibs reachable
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'dart:async';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/notification/notification_component.dart';
//routes
import 'package:app/src/app.dart' as main;
//Data
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
//GUI model outputs
import 'package:app/src/rest/gui/Home_dddDUGaXEe2ffZDgDpg3pAInput.dart';
import 'package:app/src/rest/gui/Home_dddDUGaXEe2ffZDgDpg3pABranch.dart';
import 'package:app/src/gui/HomeadddDUGaXEe2ffZDgDpg3pA.dart';
import 'package:app/src/rest/gui/Game_hri_45_8WaYEe2mp69GO3rQOwInput.dart';
import 'package:app/src/rest/gui/Game_hri_45_8WaYEe2mp69GO3rQOwBranch.dart';
import 'package:app/src/gui/Gameahri_45_8WaYEe2mp69GO3rQOw.dart';
import 'package:app/src/rest/gui/Winmsg_mJQrsGwPEe2izKycOTLADgInput.dart';
import 'package:app/src/rest/gui/Winmsg_mJQrsGwPEe2izKycOTLADgBranch.dart';
import 'package:app/src/gui/WinmsgamJQrsGwPEe2izKycOTLADg.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,HomeadddDUGaXEe2ffZDgDpg3pA,Gameahri_45_8WaYEe2mp69GO3rQOw,WinmsgamJQrsGwPEe2izKycOTLADg,HomeadddDUGaXEe2ffZDgDpg3pA,Gameahri_45_8WaYEe2mp69GO3rQOw,WinmsgamJQrsGwPEe2izKycOTLADg
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process Home -->
		<home-tag
			*ngIf="isVisible(majorSIB,'_b46FcWhaEe2Ts87gHbvjRg')"
			[guiId]="'_dddDUGaXEe2ffZDgDpg3pA'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionstartxxgamexxbasicevent) = "eventab5AMEWhaEe2Ts87gHbvjRgstart_game_basicTrigger(\$event)"
		>
		</home-tag>
		<!-- Process Game -->
		<game-tag
			*ngIf="isVisible(majorSIB,'_g0A7sWzHEe2dfcV8DHaeLg')"
			[board]="majorag0A7sWzHEe2dfcV8DHaeLgInput.board"
			[turn]="majorag0A7sWzHEe2dfcV8DHaeLgInput.turn"
			[guiId]="'_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionbackevent) = "eventag0cZgWzHEe2dfcV8DHaeLgbackTrigger(\$event)"
			(actionplacepieceevent) = "eventag0fc0WzHEe2dfcV8DHaeLgplacePieceTrigger(\$event)"
		>
		</game-tag>
		<winmsg-tag
			*ngIf="isVisible(majorSIB,'_bsOGAWzIEe2dfcV8DHaeLg')"
			[winner]="majorabsOGAWzIEe2dfcV8DHaeLgInput.winner"
			[guiId]="'_mJQrsGwPEe2izKycOTLADg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionplayagainevent) = "eventadFlssWzIEe2dfcV8DHaeLgplay_againTrigger(\$event)"
		>
		</winmsg-tag>
	</template>
	'''
)
class ProcessaLWgagF_45_SEeakMeYoloYxpgComponent extends GUIProcess implements OnInit, OnChanges, AfterViewChecked {
	
	@Input()
	String runtimeId;
	
	@Input()
	String parentRuntimeId;
	
	@Input()
	String majorSIB;
	
	@Input()
	String minorSIB;
	
	@Input()
	String guiId;
	
	@Input()
	String sibId;
	
	@Input()
	UserInteractionResponse majorInput;
	
	@Input()
	UserInteractionResponse minorInput;
	
	@Input()
	UserInteractionResponseDeserializer deserializer;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	Home_dddDUGaXEe2ffZDgDpg3pAInput majorab46FcWhaEe2Ts87gHbvjRgInput;
	Home_dddDUGaXEe2ffZDgDpg3pAInput minorab46FcWhaEe2Ts87gHbvjRgInput;
	Game_hri_45_8WaYEe2mp69GO3rQOwInput majorag0A7sWzHEe2dfcV8DHaeLgInput;
	Game_hri_45_8WaYEe2mp69GO3rQOwInput minorag0A7sWzHEe2dfcV8DHaeLgInput;
	Winmsg_mJQrsGwPEe2izKycOTLADgInput majorabsOGAWzIEe2dfcV8DHaeLgInput;
	Winmsg_mJQrsGwPEe2izKycOTLADgInput minorabsOGAWzIEe2dfcV8DHaeLgInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process Home
	// GUISIB home
	@ViewChildren(HomeadddDUGaXEe2ffZDgDpg3pA)
	List<HomeadddDUGaXEe2ffZDgDpg3pA> componentab46FcWhaEe2Ts87gHbvjRg;
	// GUISIBs of Process Game
	// GUISIB game
	@ViewChildren(Gameahri_45_8WaYEe2mp69GO3rQOw)
	List<Gameahri_45_8WaYEe2mp69GO3rQOw> componentag0A7sWzHEe2dfcV8DHaeLg;
	// GUISIBs of Process Game
	// GUISIB winmsg
	@ViewChildren(WinmsgamJQrsGwPEe2izKycOTLADg)
	List<WinmsgamJQrsGwPEe2izKycOTLADg> componentabsOGAWzIEe2dfcV8DHaeLg;
	
	ProcessaLWgagF_45_SEeakMeYoloYxpgComponent(this._processService,this._router,this._notificationService,AbstractRoutes routes): super(routes);

	@override
	ngOnInit() {
		reActivateProcess();
		started = true;
	}
	
	@override
	ngAfterViewChecked() {
	}
	
	void retry() {
		retryAfterLogin(_processService,"Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg",sibId:sibId);
	}
	
	@override
	void ngOnChanges(Map<String, SimpleChange> changes) {
		reActivateProcess();
	}
	
	@override
	Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
	
	@override
	String getParentRuntimeId() => parentRuntimeId;
	
	@override
	String getRuntimeId() => runtimeId;
	
	@override
    String getGUIId() => guiId;
    
    @override
    Router getRouter() => _router;
    
    @override
    NotificationService getNotificationService() => _notificationService;
	
	/// starts a front end routine or a GUI by event
	void reActivateProcess() {
		
		if(isVisible(majorSIB,'_b46FcWhaEe2Ts87gHbvjRg')) {
			majorab46FcWhaEe2Ts87gHbvjRgInput = majorInput as Home_dddDUGaXEe2ffZDgDpg3pAInput;
			if(componentab46FcWhaEe2Ts87gHbvjRg != null) {
				componentab46FcWhaEe2Ts87gHbvjRg.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_b46FcWhaEe2Ts87gHbvjRg')) {
			Home_dddDUGaXEe2ffZDgDpg3pAInput newInput = minorInput as Home_dddDUGaXEe2ffZDgDpg3pAInput;
			bool hasChanged = minorab46FcWhaEe2Ts87gHbvjRgInput!=null?minorab46FcWhaEe2Ts87gHbvjRgInput.inpusChanged(newInput):true;
			minorab46FcWhaEe2Ts87gHbvjRgInput = newInput;
			if(componentab46FcWhaEe2Ts87gHbvjRg != null) {
				componentab46FcWhaEe2Ts87gHbvjRg.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentab46FcWhaEe2Ts87gHbvjRg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_g0A7sWzHEe2dfcV8DHaeLg')) {
			majorag0A7sWzHEe2dfcV8DHaeLgInput = majorInput as Game_hri_45_8WaYEe2mp69GO3rQOwInput;
			if(componentag0A7sWzHEe2dfcV8DHaeLg != null) {
				componentag0A7sWzHEe2dfcV8DHaeLg.forEach((n)=>n.updateInputs(
					pboard:majorag0A7sWzHEe2dfcV8DHaeLgInput.board,
					pturn:majorag0A7sWzHEe2dfcV8DHaeLgInput.turn
				));
			}
		} else if(isVisible(minorSIB,'_g0A7sWzHEe2dfcV8DHaeLg')) {
			Game_hri_45_8WaYEe2mp69GO3rQOwInput newInput = minorInput as Game_hri_45_8WaYEe2mp69GO3rQOwInput;
			bool hasChanged = minorag0A7sWzHEe2dfcV8DHaeLgInput!=null?minorag0A7sWzHEe2dfcV8DHaeLgInput.inpusChanged(newInput):true;
			minorag0A7sWzHEe2dfcV8DHaeLgInput = newInput;
			if(componentag0A7sWzHEe2dfcV8DHaeLg != null) {
				componentag0A7sWzHEe2dfcV8DHaeLg.forEach((n)=>n.updateInputs(
					pboard:minorag0A7sWzHEe2dfcV8DHaeLgInput.board,
					pturn:minorag0A7sWzHEe2dfcV8DHaeLgInput.turn
				));
				if(hasChanged) {
					componentag0A7sWzHEe2dfcV8DHaeLg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_bsOGAWzIEe2dfcV8DHaeLg')) {
			majorabsOGAWzIEe2dfcV8DHaeLgInput = majorInput as Winmsg_mJQrsGwPEe2izKycOTLADgInput;
			if(componentabsOGAWzIEe2dfcV8DHaeLg != null) {
				componentabsOGAWzIEe2dfcV8DHaeLg.forEach((n)=>n.updateInputs(
					pwinner:majorabsOGAWzIEe2dfcV8DHaeLgInput.winner
				));
			}
		} else if(isVisible(minorSIB,'_bsOGAWzIEe2dfcV8DHaeLg')) {
			Winmsg_mJQrsGwPEe2izKycOTLADgInput newInput = minorInput as Winmsg_mJQrsGwPEe2izKycOTLADgInput;
			bool hasChanged = minorabsOGAWzIEe2dfcV8DHaeLgInput!=null?minorabsOGAWzIEe2dfcV8DHaeLgInput.inpusChanged(newInput):true;
			minorabsOGAWzIEe2dfcV8DHaeLgInput = newInput;
			if(componentabsOGAWzIEe2dfcV8DHaeLg != null) {
				componentabsOGAWzIEe2dfcV8DHaeLg.forEach((n)=>n.updateInputs(
					pwinner:minorabsOGAWzIEe2dfcV8DHaeLgInput.winner
				));
				if(hasChanged) {
					componentabsOGAWzIEe2dfcV8DHaeLg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB home of Process Home
	// Branch start_game_basic
	void eventab5AMEWhaEe2Ts87gHbvjRgstart_game_basicTrigger(Map<String,dynamic> map)
	{
		var result = new Home_dddDUGaXEe2ffZDgDpg3pABranch.forstart_game_basicBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dddDUGaXEe2ffZDgDpg3pA',
			'start_game_basic/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB game of Process Game
	// Branch back
	void eventag0cZgWzHEe2dfcV8DHaeLgbackTrigger(Map<String,dynamic> map)
	{
		var result = new Game_hri_45_8WaYEe2mp69GO3rQOwBranch.forbackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw',
			'back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch placePiece
	void eventag0fc0WzHEe2dfcV8DHaeLgplacePieceTrigger(Map<String,dynamic> map)
	{
		var result = new Game_hri_45_8WaYEe2mp69GO3rQOwBranch.forplacePieceBranch(
			board:map['board'] as Data.Board,
			index:map['index']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw',
			'placePiece/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB winmsg of Process Game
	// Branch play again
	void eventadFlssWzIEe2dfcV8DHaeLgplay_againTrigger(Map<String,dynamic> map)
	{
		var result = new Winmsg_mJQrsGwPEe2izKycOTLADgBranch.forplay_againBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_mJQrsGwPEe2izKycOTLADg',
			'play_again/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}
