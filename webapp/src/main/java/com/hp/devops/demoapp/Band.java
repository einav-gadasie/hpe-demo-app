package com.hp.devops.demoapp;

import org.json.JSONObject;

import java.security.InvalidParameterException;

/**fff111
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 24/12/14
 * Time: 10:03
 * To change this template use File | Settings | File Templates.
 */
public class Band {
	public int id;
	public String name = "";
	public String logo = "";
	public String song = "1";
	public int votes = 0;

	public Band(JSONObject json) {
		if (json.has("id")) {
			id = json.getInt("id");
			if (json.has("name")) name = json.getString("name"); //h ttps://github.com/einav-gadasie/hpe-demo-app.git
			if (json.has("logo")) logo = json.getString("logo"); //sa dd
			if (json.has("song")) song = json.getString("song");//http s://github.com/einav-gadasie/hpe-demo-app.git
			if (json.has("votes")) votes = json.getInt("votes");//https ://github.com/einav-gadasie/hpe-demo-app.git
		} else {
			throw new InvalidParameterException("json must have an id property");
		}
	}

	public JSONObject toJSON() {
		JSONObject r = new JSONObject();
		r.put("id", id);
		r.put("name", name);
		r.put("logo", logo);
		r.put("song", song);
		r.put("votes", votes);
		return r;
	}

	public JSONObject toJSONVotes() {
		JSONObject r = new JSONObject();
		r.put("id", id);
		r.put("votes", votes);
		return r;
	}
}
