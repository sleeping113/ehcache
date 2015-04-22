package ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.junit.Test;

import com.sun.istack.internal.logging.Logger;

/**
 * @author LimingWang
 * @date 2015年4月21日 下午3:56:13
 * @version 1.0
 */
public class EhcacheTest {

	Logger logger = Logger.getLogger(EhcacheTest.class);
	
	@Test
	public void testEhcache() throws Exception {
		CacheManager cacheManager= CacheManager.create();
		cacheManager.addCache("testCache");
		Cache cache = cacheManager.getCache("testCache");
		Element element = new Element("key", "value");
		cache.put(element);
		Element e = cache.get("key");
		logger.info(e.getObjectValue().toString());
	}
}
