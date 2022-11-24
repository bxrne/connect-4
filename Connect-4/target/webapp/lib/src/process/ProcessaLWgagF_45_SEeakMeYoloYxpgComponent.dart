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
import 'package:app/src/rest/gui/Game_hri_45_8WaYEe2mp69GO3rQOwInput.dart';
import 'package:app/src/rest/gui/Game_hri_45_8WaYEe2mp69GO3rQOwBranch.dart';
import 'package:app/src/gui/Gameahri_45_8WaYEe2mp69GO3rQOw.dart';
import 'package:app/src/rest/gui/Home_dddDUGaXEe2ffZDgDpg3pAInput.dart';
import 'package:app/src/rest/gui/Home_dddDUGaXEe2ffZDgDpg3pABranch.dart';
import 'package:app/src/gui/HomeadddDUGaXEe2ffZDgDpg3pA.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,Gameahri_45_8WaYEe2mp69GO3rQOw,HomeadddDUGaXEe2ffZDgDpg3pA
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process Home -->
		<game-tag
			*ngIf="isVisible(majorSIB,'_NHhKMGhZEe2Ts87gHbvjRg')"
			[board]="majoraNHhKMGhZEe2Ts87gHbvjRgInput.board"
			[guiId]="'_hri__HYPHEN_MINUS__8WaYEe2mp69GO3rQOw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionbackevent) = "eventaNIHnIWhZEe2Ts87gHbvjRgbackTrigger(\$event)"
			(actionplacepieceevent) = "eventanR758WsdEe2LPP_45_yV9ajYAplacePieceTrigger(\$event)"
		>
		</game-tag>
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
	
	Game_hri_45_8WaYEe2mp69GO3rQOwInput majoraNHhKMGhZEe2Ts87gHbvjRgInput;
	Game_hri_45_8WaYEe2mp69GO3rQOwInput minoraNHhKMGhZEe2Ts87gHbvjRgInput;
	Home_dddDUGaXEe2ffZDgDpg3pAInput majorab46FcWhaEe2Ts87gHbvjRgInput;
	Home_dddDUGaXEe2ffZDgDpg3pAInput minorab46FcWhaEe2Ts87gHbvjRgInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process Home
	// GUISIB game
	@ViewChildren(Gameahri_45_8WaYEe2mp69GO3rQOw)
	List<Gameahri_45_8WaYEe2mp69GO3rQOw> componentaNHhKMGhZEe2Ts87gHbvjRg;
	// GUISIBs of Process Home
	// GUISIB home
	@ViewChildren(HomeadddDUGaXEe2ffZDgDpg3pA)
	List<HomeadddDUGaXEe2ffZDgDpg3pA> componentab46FcWhaEe2Ts87gHbvjRg;
	
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
		
		if(isVisible(majorSIB,'_NHhKMGhZEe2Ts87gHbvjRg')) {
			majoraNHhKMGhZEe2Ts87gHbvjRgInput = majorInput as Game_hri_45_8WaYEe2mp69GO3rQOwInput;
			if(componentaNHhKMGhZEe2Ts87gHbvjRg != null) {
				componentaNHhKMGhZEe2Ts87gHbvjRg.forEach((n)=>n.updateInputs(
					pboard:majoraNHhKMGhZEe2Ts87gHbvjRgInput.board
				));
			}
		} else if(isVisible(minorSIB,'_NHhKMGhZEe2Ts87gHbvjRg')) {
			Game_hri_45_8WaYEe2mp69GO3rQOwInput newInput = minorInput as Game_hri_45_8WaYEe2mp69GO3rQOwInput;
			bool hasChanged = minoraNHhKMGhZEe2Ts87gHbvjRgInput!=null?minoraNHhKMGhZEe2Ts87gHbvjRgInput.inpusChanged(newInput):true;
			minoraNHhKMGhZEe2Ts87gHbvjRgInput = newInput;
			if(componentaNHhKMGhZEe2Ts87gHbvjRg != null) {
				componentaNHhKMGhZEe2Ts87gHbvjRg.forEach((n)=>n.updateInputs(
					pboard:minoraNHhKMGhZEe2Ts87gHbvjRgInput.board
				));
				if(hasChanged) {
					componentaNHhKMGhZEe2Ts87gHbvjRg.forEach((n)=>n.restartComponent());			
				}
			}
		}
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
		
		
	}
	// Branches for GUISIB game of Process Home
	// Branch back
	void eventaNIHnIWhZEe2Ts87gHbvjRgbackTrigger(Map<String,dynamic> map)
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
	void eventanR758WsdEe2LPP_45_yV9ajYAplacePieceTrigger(Map<String,dynamic> map)
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
}
