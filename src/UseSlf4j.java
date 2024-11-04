

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class UseSlf4j {

	static final Logger logger = LoggerFactory.getLogger(UseSlf4j.class);

	public static void main(String[] args) {
		logger.info("Start process {}...", UseSlf4j.class.getName());
		try {
			"".getBytes("invalidCharsetName");
		} catch (UnsupportedEncodingException e) {
			// TODO: 使用logger.error(String, Throwable)打印异常
			logger.error("get exception!", e);
		}
		logger.info("Process end.");
	}
}
