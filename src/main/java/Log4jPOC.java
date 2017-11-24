import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jPOC {

    public static Logger logger = LoggerFactory.getLogger(Log4jPOC.class);

    public static void main(String args[]){

        logger.debug("Logging Debug");
        logger.info("Logging Info");
        logger.trace("Logging Trace");
        logger.error("Logging Error");

    }
}
