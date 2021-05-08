import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.thedeanda.lorem.LoremIpsum;

public class Main {
	static Map<String, Element> map = new HashMap<String, Element>();
	static LoremIpsum lorem = new LoremIpsum();
	static void sample() {
		for (int i = 0; i < 16; i++) {
			String rf = UUID.randomUUID().toString();
			String k = lorem.getWords(1);
			String t = ",#"+lorem.getWords(1) + ",#" + lorem.getWords(1) + ",#" + lorem.getWords(1);
			String v = lorem.getWords(10, 20);
			Element e = new Element(rf, k, t, v);
			map.put(k, e);
		}

	}

	static void print() {
		Set<String> set = map.keySet();

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			Element e = map.get(it.next());
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		sample();
		print();
	}
}
