package demo02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Maven_Sonar {


	private static Logger logger = LogManager.getLogger(Maven_Sonar.class);

		    public static void main( String[] args )
		    {
		        
		        
		        logger.info("This is info");
		        logger.error("This is error");
		        logger.warn("This is Warning");
		    }
		}
