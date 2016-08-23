package com.neo.reflect;
/**
 *
 * @author lile
 * @date   2016年8月23日 
 */
public class MakeCar {
	public static void main(String[] args) {
		Car car0 = new Car();
		Car car1 = new Car("奥迪","酷黑",250);
		car0.introduce();
		car1.introduce();
	}
}

