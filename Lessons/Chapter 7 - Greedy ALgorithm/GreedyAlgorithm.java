import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> statesNeeded = new HashSet<>(Arrays.asList(
				"wa", "id", "mt", "or", "nv", "ca", "az", "ut"
		));

		Map<String, Set<String>> stations = new HashMap<>();
		stations.put("kone",   new HashSet<>(Arrays.asList("id", "nv", "ut")));
		stations.put("ktwo",   new HashSet<>(Arrays.asList("wa", "id", "mt")));
		stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
		stations.put("kfour",  new HashSet<>(Arrays.asList("ca", "az")));
		stations.put("kfive",  new HashSet<>(Arrays.asList("az", "nv")));

		Set<String> chosen = greedySearch(statesNeeded, stations);

		System.out.println("Final stations: " + chosen);
	}

	//not too useful for leetcode but good to know
	public static Set<String> greedySearch(Set<String> statesNeeded, Map<String, Set<String>> stations) {
		Set<String> result = new HashSet<>();

		while (!statesNeeded.isEmpty()) {
			String bestStation = null; //station will be choosing this round
			Set<String> statesCoveredByBestStation= new HashSet<>();

			//loop through all and finding the beststation for this round
			for (Map.Entry<String, Set<String>> entry : stations.entrySet()) {
				String station = entry.getKey();
				Set<String> stateForStation = entry.getValue();

				Set<String> covered = new HashSet<>(statesNeeded); //which needed states does this station cover
				covered.retainAll(stateCoveredByBestStation); //keep only the stations found in both set, like the intersection
				//retainAll is a built in method, amazing

				if (covered.size() > statesCovered.size()) { //greedy solution, when we loop, we select beststation with the most covered
					bestStation = station;
					statesCovered = covered;
				}
			}

			statesNeeded.removeAll(statesCoveredByBestStation);
			result.add(bestStation);
		}

		return result;
	}
}