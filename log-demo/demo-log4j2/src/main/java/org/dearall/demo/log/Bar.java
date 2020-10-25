package org.dearall.demo.log;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Bar {
	static final Logger logger = LogManager.getLogger(Bar.class.getName());

	  public void doIt() {
	    logger.error("Did it again!");
	  }
}
