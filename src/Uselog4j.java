
import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Uselog4j {

	static final Log log = LogFactory.getLog(Uselog4j.class);

	public static void main(String[] args) {
		log.info("Start process...");
		try {
			"".getBytes("invalidCharsetName");
		} catch (UnsupportedEncodingException e) {
			log.error("Invalid encoding.", e);
		}
		log.info("Process end.");
	}
}
