import 'dart:async';
import 'dart:convert';
import 'dart:html' as html;

import 'package:angular_router/angular_router.dart';
import 'package:angular/angular.dart';
import 'package:angular/security.dart';
import 'package:angular_forms/angular_forms.dart';

import 'package:app/src/app.dart';

import 'package:app/src/core/dime_process_service.dart';
//Notifications
import 'package:app/src/notification/notification_component.dart';
//Login
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/core/DIMEComponent.dart' as dime;

//Data
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/filesupport/fileuploader.dart';
import 'package:app/src/filesupport/fileselect.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/Todos.dart';
//Directives
import 'package:app/src/directives/MaxLength.dart';
import 'package:app/src/directives/DimeCustomeAttributes.dart';

//Import Services
import 'package:intl/intl.dart';
import 'package:intl/date_symbol_data_local.dart';
import 'package:markdown/markdown.dart' as markdown;
import 'package:app/src/modal/Modal.dart' as modal;
//Panel
import 'package:app/src/panel/Panel.dart' as panel;

//file guard imports
import 'package:app/src/models/FileGuardsamJQrsGwPEe2izKycOTLADgwinmsg.dart';
//special element imports
//table component imports
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "winmsg-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'WinmsgamJQrsGwPEe2izKycOTLADg.html'
)

class WinmsgamJQrsGwPEe2izKycOTLADg extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
  	// common declarations
  	bool refresh;
  	@Input()
  	bool ismajorpage = false;
  	@Input()
  	String currentbranch;
  	@Input()
  	bool modalDialog = false;
  	ChangeDetectorRef cdr;
  	@Input()
  	String runtimeId;
  	@Input()
  	String guiId;
  	final Router router;
  	final DIMEProcessService processService;
  	final DomSanitizationService domSanitizationService; 
  	// component Default Declaration
  	// table refresh flags
  	
  	
  	
  	
  	
  	// branch play again as info.scce.dime.gui.editor.graphiti.api.CButton@fa4479d4 (id: _QLiSUWweEe2-2tLdl7-gLg) in info.scce.dime.gui.editor.graphiti.api.CGUI@e89349b9 (id: _mJQrsGwPEe2izKycOTLADg)
  	@Output('actionplayagainevent') Stream<Map<String,dynamic>> get evt_actionplayagainevent => actionplayagainevent.stream;
  	StreamController<Map<String,dynamic>> actionplayagainevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	@Input()
	int winner;
	
	bool isDestroyed = true;
  
	WinmsgamJQrsGwPEe2izKycOTLADg(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Integer winner
		this.winner = 0;
						
						
		
			  	
		// branch play again declaration
		if(this.actionplayagainevent!=null) {
			  			this.actionplayagainevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		updateImageHash();
	}
	
	void updateInputs(
	{int pwinner
	})
	{
		winner = pwinner;
		
		updateWithoutInputs(updateHidden:false);
	}
	
	
	@override
	void ngOnInit() async
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		this.isDestroyed = false;
		openWebsockets();
	}
	
	void openWebsockets() {
	}
	
	
	@override
	void ngOnDestroy()
	{
	}
	
	
	void ngAfterViewInit() {
		html.window.document.dispatchEvent(new html.CustomEvent('dime-component-ready'));
		js.context.callMethod("enableTooltip",[]);
	}
	
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button play again is clicked
  			void actionplayagaineventaQLiSUWweEe2_45_2tLdl7_45_gLgEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionplayagainevent.add(data);
  		}
  		
  		
  		
  		
  		/// loads an image file download for an image component	
  		String loada3eN5cWwcEe2_45_2tLdl7_45_gLgImage(fileRef)
  		{
  			//prepare guard compound
  			FileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound guardContainer = new FileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound();
  			guardContainer.context = fileRef;
  			
  			// private interactable
  			String guardData = guardContainer.toQueryParams();
  			return guardData;
  			
  		}
  	
  		
  		
  		
  		int initOnDemandwinner()
  		{
  			return this.winner;
  		}
  		void setValuewinner(int value)
  		{
  			this.winner = value;
  		}
  		void winnersetValue(int value)
  		{
  			this.setValuewinner(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_mJQrsGwPEe2izKycOTLADgRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_mJQrsGwPEe2izKycOTLADgId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_mJQrsGwPEe2izKycOTLADg";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_mJQrsGwPEe2izKycOTLADgClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_mJQrsGwPEe2izKycOTLADgToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
