package org.writejson.pojo;

import java.util.ArrayList;

import org.writejson.pojo.Batters;
import org.writejson.pojo.Topping;

public class Root {

	private String id;

	private String type;

	private String name;

	private double ppu;

	private Batters batters;

	private ArrayList<Topping> topping;

	public Root(String id, String type, String name, double ppu, Batters batters, ArrayList<Topping> topping) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPpu() {
		return ppu;
	}

	public void setPpu(double ppu) {
		this.ppu = ppu;
	}

	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public ArrayList<Topping> getTopping() {
		return topping;
	}

	public void setTopping(ArrayList<Topping> topping) {
		this.topping = topping;
	}

}
