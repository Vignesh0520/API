package org.writejson.pojo;

import java.util.ArrayList;

public class Batters {

	private ArrayList<Batter> batter;

	public ArrayList<Batter> getBatter() {
		return batter;
	}

	public void setBatter(ArrayList<Batter> batter) {
		this.batter = batter;
	}

	public Batters(ArrayList<Batter> batter) {
		super();
		this.batter = batter;
	}

}
