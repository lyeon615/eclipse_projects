package edu.bit.ex;

public class Circle {
	private double radius;
	private double circleArea;


	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getCircleArea() {	
		return radius*radius*3.14;
	}
	public void getCircleArea(double circleArea) {
		this.circleArea = circleArea;
	}

}
