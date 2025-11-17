package com.springCore.constructor;

import java.util.List;

public class Person {

	private String name;
	private int Age;
	
	private List<String> list;
	
    Cert cert;
	
	Person(String name, int Age , Cert cert, List<String> list){
		this.cert = cert;
		this.list = list;
		this.name = name;
		this.Age = Age;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return this.name+" : "+this.Age+":"+"{"+this.cert.name+"}"+list;
	}
	
}
 