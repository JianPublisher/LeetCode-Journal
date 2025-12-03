class Main {
	public static void main(String[] args) {
		int n = 6;
		int[][] edges = {
				{0,1},
				{0,2},
				{1,3},
				{1,4},
				{2,5}
		};

		System.out.println(bfs(n, edges, 0));

		/*
		Explanation:
		BST always follows this structure
		START → QUEUE → VISIT → ADD NEIGHBORS → REPEAT
		 */
	}

	public List<Integer> bfs (int n , int[][] edges, int start) {
		//first we need to build adjency list
		List<List<Integer>> graph = buildAdjencyList(edges); //normally can just do it inline but we added a method here to explain

		//step 2: we do bfs setup
		Queue<Integer> q = new ArrayDeque<>();
		boolean[] visited = new boolean[n];

		visited[start] = true;
		q.add(start);

		while (!q.isEmpty()) {
			int current = q.poll();
			System.out.println("current visited" + current);

			for (int next : graph.get(current)) {
				if(!visited[next]) {
					visited[next] = true;
					q.add(next); //allows me to add the next layer to the queue, and once this is done, it loops again with while, adding the other layer in
				}
			}
		}
	}

	public List<List<Integer>> buildAdjencyList (int[][] edges) {
		//first we need to build adjency list
		//adjency list is a way to represent graph in code
		//graph is made of
		//Nodes
		//and connecting edges
		//0-1
		//0-2
		//1-3
		//1-4

		//1st we make a place to store neighbors
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		//the graph is like a list, each index gets their own list
		//Since the edges [][] is something like {[0,1], it means that the first index is the node, and the second is the neighbor
		for (int[] e : edges) {
			int node = e[0];
			int neighbor = e[1];
			graph.get(node).add(neighbor);
			graph.get(neighbor).add(node);
		}

		//Note this is undirected, so now node is connected to neighbor, and the other way round too woooo
		return graph;
	}
}