import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;


class main {
	public static void main (String[] args) {
		int n = 6; //normally given, this is the amount of vertices/node we have

		// each edge = {from, to, weight}
		int[][] edges = {
				{0,1,4},
				{0,2,1},
				{1,3,1},
				{1,4,3},
				{2,1,2},
				{2,5,7}
		};

		System.out.println(Arrays.toString(dijkstra(n, edges, 0)));
		//[0, 3, 1, 4, 6, 8] will be printed -> cost to reach the node, so cheapest cost to node 0 is 0, node 1 is 3, node 2 is 1, node 3 is 4 ...
		/*
		Dijkstra algorithm always follows this pattern:
		Start - priority queue - visit lowest cost - relax neighbors - repeat
		1) start at source node with lowest code
		2) put node in priority queue -> this so that smallest distance always comes out first
		3) visit lowest cost -> remove node with smallest distance
		4) check the neighbor and update the distance

        - Dijkstra: uses a min-heap (priority queue), good for weighted graphs
        - Hashtable used for storign distance and visited status
        - Relaxation = check if we found a cheaper path and update it.
		 */
	}

	public static int[] dijkstra(int n, int[][] edges, int start) {
		//Build the adjacency list
		List<List<int[]>> graph = buildAdjacencyList(n, edges);

		int[] dist = new int[n]; //store best known cost to reach each node -> dist[0] -> best/lowest cost to reach node 0
		Arrays.fill(dist, Integer.MAX_VALUE); //we store others as infinite because at beginning we don't know how to reach other node, so assume its far away
		//also dijkstra compares new routes to old routes, so if old routes starts as infinite, every path looks cheaper
		dist[start] = 0; // but start node gets 0 cuz its starting point


		/*
			Priority queue gives us the smallest cost to xx node, the (a, b) -> a[0] - b[0] , if negative means a comes before b
			{4, 1}   // cost 4 to reach node 1
			{1, 2}   // cost 1 to reach node 2
			{7, 5}   // cost 7 to reach node 5
			Which one is smallest?

			{1, 2}

			pq.add({"A",2}) would mean it cost 2 to reach node A - Example
			- Why do we need priority queue - because this algo always explores cheapest path
			!!! pq does not explore the graph btw !!!
		 */
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		pq.add(new int[]{0, start}); //at the beginning, I only know how to reach this node, since its starting point, and cost is 0

		while (!pq.isEmpty()) { // as long as theres nodes we haven't explore yet
			int[] cheapestInQueue = pq.poll(); //pq.poll will give us the top, so thats the cheapest cost
			int currentCost = cheapestInQueue[0]; //0 index is cost
			int node = cheapestInQueue[1]; //1 index is the node, cost to travel to the node

			// If this is an outdated entry, skip it
			// what is outdated entry..?
			// earlier you found {10, 3} is the cheapest
			// but later u find {4, 3}
			//  now it has 2 entries for node 3 since theres 2 cost, so when we access {10, 3}, the dist[3] should store 4, so we just continue, skip it
			//
			if (currentCost > dist[node]) continue;

			// Relax neighbors
			for (int[] edge : graph.get(node)) { //get all neighbor for this node, could be graph.get(0) == [ {1, 4}, {2, 1}} ]
				int neighbor = edge[0]; //to node
				int weight = edge[1]; // the cost

				// new cost = cost to reach node + edge weight
				int newCost = currentCost + weight; //we're at current node, so we want to calculate the cost to reach to the neighbor

				// If we found a cheaper path → update
				if (newCost < dist[neighbor]) {
					dist[neighbor] = newCost;
					pq.add(new int[]{newCost, neighbor}); //why do we add? because pq will take the cheapest next node and explore it
				}
			}
		}

		return dist;
	}

	public static List<List<int[]>> buildAdjacencyList (final int n, final int[][] edges) {
		List<List<int[]>> graph = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int[] e : edges) {
			int node = e[0];
			int neighbor = e[1];
			int cost = e[2];
			graph.get(node).add(new int[] {neighbor, cost});
		}

		return graph;
	}

}