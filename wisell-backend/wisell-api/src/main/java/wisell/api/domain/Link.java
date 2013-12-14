package wisell.api.domain;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Link {
	String type;
	String href;
	String relationship;
	/**
	 * To write as link header
	 * 
	 * @return
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder("<");
		builder.append(href).append(">; rel=").append(relationship);
		if (type != null)
			builder.append("; type=").append(type);
		return builder.toString();
	}

	private static Pattern parse = Pattern.compile("<(.+)>\\s*;\\s*(.+)");

	/**
	 * For unmarshalling Link Headers. Its not an efficient or perfect algorithm
	 * and does make a few assumptiosn
	 * 
	 * @param val
	 * @return
	 */
	public static Link valueOf(String val) {
		Matcher matcher = parse.matcher(val);
		if (!matcher.matches())
			throw new RuntimeException("Failed to parse link: " + val);
		Link link = new Link();
		link.href = matcher.group(1);
		String[] props = matcher.group(2).split(";");
		HashMap<String, String> map = new HashMap<String, String>();
		for (String prop : props) {
			String[] split = prop.split("=");
			map.put(split[0].trim(), split[1].trim());
		}
		if (map.containsKey("rel")) {
			link.relationship = map.get("rel");
		}
		if (map.containsKey("type")) {
			link.type = map.get("type");
		}
		return link;
	}

}
