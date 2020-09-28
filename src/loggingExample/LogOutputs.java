package loggingExample;
import org.apache.log4j.Logger;

public class LogOutputs {
	public static void main(String [] args) {
		final Logger logger = Logger.getLogger(LogOutputs.class);
		logger.info("This is my first log");
	}
}
