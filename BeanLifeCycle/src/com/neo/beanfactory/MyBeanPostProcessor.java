package com.neo.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.neo.Car;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		Car car = (Car) bean;
		if(beanName.equals("car")){
			System.out.println("调用BeanPostProcessor postProcessorBeforeInitialization(),"
					+ "color为空，设置为默认黑色");
			car.setColor("黑色");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {
		Car car = (Car) bean;
		if(car.getMaxSpeed() >= 200){
			System.out.println("调用BeanPostProcessor postProcessorAfterInitialization(),"
					+ "将maxSpeed调整为200");
			car.setMaxSpeed(200);
		}
		return bean;
	}

}
