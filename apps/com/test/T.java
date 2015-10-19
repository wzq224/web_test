package com.test;

import org.apache.log4j.Logger;

public class T {
	private static Logger logger = Logger.getLogger(T.class); 
	public T(){
		System.out.println("t");
		
		// System.out.println("This is println message.");  

        // 记录debug级别的信息  
        logger.debug("TTT,This is debug message.");  
        // 记录info级别的信息  
        logger.info("TTT,This is info message.");  
        // 记录error级别的信息  
        logger.error("TTT,This is error message."); 
	}
	
	
	
	public void show(){
		System.out.println("show");
	}
	
	public void show2(){
		System.out.println("show2");
	}
	
}
