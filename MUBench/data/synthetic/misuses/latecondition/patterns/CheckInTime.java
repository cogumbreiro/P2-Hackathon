import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CheckInTime {
	public void pattern(List<String> list) {
		Map<String, Collection<String>> map = new HashMap<>();
		for (String entry : list) {
			String category = entry.substring(0, 4);
			if (map.containsKey(category)) {
				map.put(category, new HashSet<>());
			}
			map.get(category).add(entry);
		}
	}
}
