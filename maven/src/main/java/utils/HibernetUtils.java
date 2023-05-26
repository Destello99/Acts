package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetUtils {
//	1 step: Create Session factory instance
	private static SessionFactory sf;
// 2 step: Create static block
	static {
		sf = new Configuration()// it's class, create empty cong object
				.configure() // it create populated map form hibrenate cfg
				.buildSessionFactory(); // it attach singleton session factory
	}
	public static SessionFactory getFactory() {
		return sf;
	}
}
