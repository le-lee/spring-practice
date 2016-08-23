package com.neo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *
 * @author lile
 * @date   2016年8月23日 
 */
public class MakeCarByReflect {
	public static Car initByDefaultConst() throws Throwable{
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<Car> clazz  = (Class<Car>) loader.loadClass("com.neo.reflect.Car");
		Constructor<Car> cons = clazz.getDeclaredConstructor();
		Car car = (Car) cons.newInstance(null);
		
		Method setBrand = clazz.getDeclaredMethod("setBrand", String.class);
		setBrand.invoke(car, "奥迪A8");
		Method setColor = clazz.getDeclaredMethod("setColor", String.class);
		setColor.invoke(car, "酷黑");
		Method setMaxSpeed = clazz.getDeclaredMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 250);
		return car;
		
	}
	public static void main(String[] args) throws Throwable {
		Car car = initByDefaultConst();
		car.introduce();
	}
}

