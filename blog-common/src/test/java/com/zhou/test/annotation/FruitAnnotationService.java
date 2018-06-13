package com.zhou.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 注解实现类
 */
public class FruitAnnotationService {

	/***
	 * 获取类级别注解
	 * @param clazz
	 */
	public static void getClassAnnotation(Class<?> clazz) {
		System.out.println(String.format("=====%s", "获取类级别注解"));
		
		  boolean hasAnnotation = clazz.isAnnotationPresent(FruitInfo.class);  
		  if(hasAnnotation){
			  
			  Annotation[] annotations = clazz.getAnnotations();

				for (Annotation annotation : annotations) {
					
					
					FruitInfo fruitInfo = (FruitInfo) annotation;

					System.out.println("name" + fruitInfo.name());

					System.out.println("fruitColor" + fruitInfo.fruitColor());

					System.out.println("code" + fruitInfo.code());

					System.out.println("address" + fruitInfo.address());
				}
				System.out.println("\n\t");
			  
		  }
		  
	}
	
	
	/**
	 * 获取方法级别注解
	 * @param clazz
	 */
	public static void getMethodAnnotation(Class<?> clazz) {
		System.out.println(String.format("=====%s", "获取方法级别注解"));
	    Method[] methods = clazz.getDeclaredMethods();
	
	     for (Method method : methods) {
	    	 
	    	  /*
	           * 判断方法中是否有指定注解类型的注解
	          */
	          boolean hasAnnotation = method.isAnnotationPresent(FruitInfo.class);
	          if (hasAnnotation) {
	        	  
	        		FruitInfo fruitInfo = method.getAnnotation(FruitInfo.class);
	        		System.out.println("name" + fruitInfo.name());

	    			System.out.println("fruitColor" + fruitInfo.fruitColor());

	    			System.out.println("code" + fruitInfo.code());

	    			System.out.println("address" + fruitInfo.address());
	        	  
	          }
	     }
	}

	public static void main(String[] args) {
		FruitAnnotationService.getClassAnnotation(Apple.class);
		
		
		FruitAnnotationService.getMethodAnnotation(Apple.class);
	}

}
