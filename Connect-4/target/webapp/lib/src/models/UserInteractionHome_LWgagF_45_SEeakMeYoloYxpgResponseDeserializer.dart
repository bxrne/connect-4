import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/rest/gui/Home_dddDUGaXEe2ffZDgDpg3pAInput.dart';
import 'package:app/src/rest/gui/Game_hri_45_8WaYEe2mp69GO3rQOwInput.dart';
import 'package:app/src/rest/gui/Winmsg_mJQrsGwPEe2izKycOTLADgInput.dart';

class UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer extends UserInteractionResponseDeserializer {
	UserInteractionResponse deserialize(String sibId,Map<String,dynamic> map, Map<String,dynamic> cache) {
switch(sibId){		case '_b46FcWhaEe2Ts87gHbvjRg': return new Home_dddDUGaXEe2ffZDgDpg3pAInput(map,cache);
		case '_g0A7sWzHEe2dfcV8DHaeLg': return new Game_hri_45_8WaYEe2mp69GO3rQOwInput(map,cache);
		case '_bsOGAWzIEe2dfcV8DHaeLg': return new Winmsg_mJQrsGwPEe2izKycOTLADgInput(map,cache);
}		throw new Exception("Exhaustive if for: ${sibId}");
	}
}
