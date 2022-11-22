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
//special element imports
//table component imports
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "home-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'HomeadddDUGaXEe2ffZDgDpg3pA.html'
)

class HomeadddDUGaXEe2ffZDgDpg3pA extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	
  	// branch start_game_basic as info.scce.dime.gui.editor.graphiti.api.CButton@81b8a43 (id: _k2BaEGacEe24gf5J_KrBHg) in info.scce.dime.gui.editor.graphiti.api.CGUI@babc49d6 (id: _dddDUGaXEe2ffZDgDpg3pA)
  	@Output('actionstartxxgamexxbasicevent') Stream<Map<String,dynamic>> get evt_actionstartxxgamexxbasicevent => actionstartxxgamexxbasicevent.stream;
  	StreamController<Map<String,dynamic>> actionstartxxgamexxbasicevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	
	bool isDestroyed = true;
  
	HomeadddDUGaXEe2ffZDgDpg3pA(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
						
						
		
			  	
		// branch start_game_basic declaration
		if(this.actionstartxxgamexxbasicevent!=null) {
			  			this.actionstartxxgamexxbasicevent = new StreamController<Map<String,dynamic>>();  				
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
	)
	{
		
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
  		
  		
  		
  		
  	
  		/// callback, if the button start_game_basic is clicked
  			void actionstartxxgamexxbasiceventak2BaEGacEe24gf5J_KrBHgEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionstartxxgamexxbasicevent.add(data);
  		}
  		/// callback, if the button Label is clicked
  			void actionlabeleventalepcIGajEe24gf5J_KrBHgEventTrigger()
  		
  		{
  			// static button redirect
  			html.window.location.href='https://www.wikihow.com/Play-Connect-4';
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_dddDUGaXEe2ffZDgDpg3pARootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_dddDUGaXEe2ffZDgDpg3pAId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_dddDUGaXEe2ffZDgDpg3pA";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_dddDUGaXEe2ffZDgDpg3pAClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_dddDUGaXEe2ffZDgDpg3pAToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
