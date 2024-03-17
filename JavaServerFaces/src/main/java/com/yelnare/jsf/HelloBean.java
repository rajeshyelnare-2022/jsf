package com.yelnare.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String myUIFragment;
	private boolean v = true;
	private boolean v1  = false;
	private boolean mybool = true;
	
	public boolean isMybool() {
		return mybool;
	}
	public void setMybool(boolean mybool) {
		this.mybool = mybool;
	}
	public boolean outputTextTest() {
		return v;
	}
	public boolean outputTextTest1() {
		return v1;
	}
	public String getMyUIFragment() {
		//return myUIFragment;
		return "my1";
	}

	public void setMyUIFragment(String myUIFragment) {
		
		this.myUIFragment = myUIFragment;
	}

	String xyz = "testing exposure ";
	
	private String namenew;

	public String getNamenew() {
		return "testring 123";
	}

	public void setNamenew(String namenew) {
		this.namenew = namenew;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}