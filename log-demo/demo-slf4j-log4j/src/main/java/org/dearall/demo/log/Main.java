package org.dearall.demo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().test();
	}

}


class Test {
	//slf4j 获取 Logger 的静态工厂方法
    final  Logger logger = LoggerFactory.getLogger(Test.class);
    public void test() {
    	logger.info("hello, my name is {}.", "Michael");
        
        // 记录debug级别的信息  
        logger.debug("This is log4j debug message.");  
        // 记录info级别的信息  
        logger.info("This is log4j info message.");  
        // 记录error级别的信息  
        logger.error("This is log4j error message.");  
    }
}