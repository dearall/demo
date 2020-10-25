package org.dearall.demo.log;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    // 定义一个静态的日志器变量，引用名为 Main 的 Class 实例
    private static final Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
        
		// 设置一个简单的配置，日志显示在控制台中
        logger.info("Entering application.");
        Bar bar = new Bar();
        bar.doIt();
        logger.info("Exiting application.");
	}
}
