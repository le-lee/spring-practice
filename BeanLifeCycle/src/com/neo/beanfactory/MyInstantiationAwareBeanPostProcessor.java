package com.neo.beanfactory;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends 
			InstantiationAwareBeanPostProcessorAdapter{
	//接口方法，其中经历了多次的继承和实现，InstantiationAwareBeanPostProcessor，在实例化Bean之前调用
	public Object postProcessBeforeInstantiation(Class beanClass, String beanName)
			throws BeansException{
		//仅对容器中car Bean进行处理
		if("car".equals(beanName)){
			System.out.println("InstantiationAware"
					+ " BeanPostProcessor.PostProcessBeforeInstantiation");
		}
		return null;
	}
	//接口方法，在实例化Bean后调用
	public boolean postProcessAfterInstantiation(Object bean,String beanName)
			throws BeansException{
		//仅对容器中car Bean进行处理
		if("car".equals(beanName)){
			System.out.println("InstantiationAware"
					+ " BeanPostProcessor.PostProcessAfterInstantiation");
		}
		return true;
	}
	//接口方法，在设置某个属性时调用
	public PropertyValues posProcessPropertyValues(
			PropertyValues pvs,PropertyDescriptor[]pds,Object bean,String beanName)
					throws BeansException{
		//仅对容器中car Bean进行处理，还可以通过pdst入参进行过滤
		//仅对容器中car 某个特定属性时进行处理
		if("car".equals(beanName)){
			System.out.println("InstantiationAware"
					+ " BeanPostProcessor.PostProcessPropertyValues");
		}
		return pvs;
	}
}
