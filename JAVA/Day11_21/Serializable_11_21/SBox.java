package Serializable_11_21;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SBox implements Serializable {
	String s;
	public SBox(String s) {
		this.s = s;
	}
	public String get() {
		return s;
	}
}
