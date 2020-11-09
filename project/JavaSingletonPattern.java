/**
 * Licensed Materials - Property of VK
 * 
 * (C) Copyright VK Corp. 2020. All Rights Reserved.
 * 
 */
package com.java.project;

/**
 * 
 * 
 * @author VikramK
 * 
 * 
 * 9 Nov 2020
 */
public class JavaSingletonPattern {
	public String str = "";
	private static final JavaSingletonPattern instance=null;

	private JavaSingletonPattern() {

	}

	public static JavaSingletonPattern getSingleInstance() {
		if (instance == null)
			return new JavaSingletonPattern();
		return instance;
	}

}
