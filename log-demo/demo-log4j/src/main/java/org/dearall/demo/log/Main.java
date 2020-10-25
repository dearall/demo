package org.dearall.demo.log;

import org.apache.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().test();
	}

}


class Test {
	
	//log4j 获取 Logger 的静态工厂方法
    final Logger logger = Logger.getLogger(Test.class);
    public void test() {
        
        // 记录debug级别的信息  
        logger.debug("This is log4j debug message.");  
        // 记录info级别的信息  
        logger.info("This is log4j info message.");  
        // 记录error级别的信息  
        logger.error("This is log4j error message.");  
    }
}