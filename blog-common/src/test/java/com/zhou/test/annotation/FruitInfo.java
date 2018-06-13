package com.zhou.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果名称注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitInfo {
	/**
	 * 水果名称
	 * @return
	 */
	String name();
	
	/**
	 * 水果的颜色
	 * @return
	 */
	enum Color{ BLUE,RED,GREEN};
	
	Color fruitColor() default Color.RED; 
	
	/**
	 * 水果的编号
	 * @return
	 */
	String code();
	
	/**
	 * 水果生产地址
	 * @return
	 */
	String address();
}
