import 'dart:convert';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/data/Data.dart' as Data;
class FileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound {
		
		FileReference context;
		
		SecurityInputsFileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound securityInputs;
		
		
		FileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound() {
			securityInputs = new SecurityInputsFileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound();
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

class SecurityInputsFileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound {
	SecurityInputsFileGuarda3eN5cWwcEe2_45_2tLdl7_45_gLgCompound() {
	}
	Map<String,dynamic> toJSOG(Map<Object,dynamic> objects) {
		Map<String,dynamic> jsonObj = new Map();
		return jsonObj;
	}
}

