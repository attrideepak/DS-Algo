package requestpayload;

import org.json.JSONObject;

public class PostRequest {

public JSONObject postJson() {
	JSONObject requestJson = new JSONObject();
	
	requestJson.put("id", 400);
	requestJson.put("name","Dord Digo");
	requestJson.put("displayName","Digo");
	requestJson.put("status",0);
	requestJson.put("priority",1);
	requestJson.put("waitPeriod",100);
	requestJson.put("carType",3);
	requestJson.put("dealCarType",1);
	
	//String requestBody = requestJson.toString();
	
	return requestJson;
}
	
}
