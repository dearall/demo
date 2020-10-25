package org.dearall.demo.log;

import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;

public class Demo {

    /* 获取名字为HelloWorld的Logger，若无该Logger，则根据继承结构向父节点寻找，直到找到Root Logger为止 */
    private  static  final  Logger logger = LoggerFactory.getLogger( "HelloWorld" ); 
    public  void  method() {
    	logger.info( "Hello World!" );  // 打印日志信息
    }
}

