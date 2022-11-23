import 'dart:convert';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/data/Data.dart' as Data;
class FileGuardaAzErgWsWEe2LPP_45_yV9ajYACompound {
		
		FileReference context;
		
		SecurityInputsFileGuardaAzErgWsWEe2LPP_45_yV9ajYACompound securityInputs;
		
		
		FileGuardaAzErgWsWEe2LPP_45_yV9ajYACompound() {
			securityInputs = new SecurityInputsFileGuardaAzErgWsWEe2LPP_45_yV9ajYACompound();
		}
		
		String toQueryParams() {
			List<String> params = new List();
			return "?" + params.join("&");
		}
		
		String toJSON() {
			return jsonEncode(this.toJSOG());
		}
		
		Map<String,dynamic> toJSOG() {
			Map<String,dynamic> jsonObj = new Map();
			Map<Object,dynamic> objects = new Map();
			if(context!=null) {
				jsonObj["context"] = context.toJSOG(objects);
			}
			else{
				jsonObj["context"] = null;
			}
			jsonObj["securityInputsForInteractable"] = securityInputs.toJSOG(objects);
			return jsonObj;
		}
}

class SecurityInputsFileGuardaAzErgWsWEe2LPP_45_yV9ajYACompound {
	SecurityInputsFileGuardaAzErgWsWEe2LPP_45_yV9ajYACompound() {
	}
	Map<String,dynamic> toJSOG(Map<Object,dynamic> objects) {
		Map<String,dynamic> jsonObj = new Map();
		return jsonObj;
	}
}

