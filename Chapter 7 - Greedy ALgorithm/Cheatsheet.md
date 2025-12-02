# 🧠 NP-Complete, Greedy, Heuristic, Approximation — Cheat Sheet

## NP-Complete
- Impossible to solve fast (no known polynomial solution)
- Easy to *check* a solution, hard to *find* one
- Examples: TSP, Set Cover

---

## Greedy Algorithm
- Picks the **best local choice** at each step
- Fast, simple
- Not always optimal
- Works only when problem has **greedy-choice property**
- Examples:
    - Dijkstra (optimal)
    - Activity selection (optimal)
    - Set Cover greedy (approximation)
    - TSP nearest neighbor (NOT optimal)

---

## Heuristic
- Fast rule-of-thumb
- Usually good, **no guarantee**
- Examples:
    - TSP nearest neighbor
    - Genetic algorithms
    - Simulated annealing

---

## Approximation Algorithm
- Solution is guaranteed to be within some factor of optimal
- Used for NP-hard problems when exact solution is too slow
- Examples:
    - Set Cover Greedy → ≤ ln(n) × optimal
    - Christofides TSP → ≤ 1.5 × optimal

---

## Differences
| Concept | Guarantee? | Strategy? | Example |
|--------|------------|-----------|---------|
| Greedy | Sometimes | Yes | Dijkstra |
| Heuristic | No | Sometimes | TSP NN |
| Approximation | Yes | Maybe | Set Cover Greedy |

---

## Summary
- **Greedy** = local best choice
- **Heuristic** = fast guess
- **Approximation** = guaranteed closeness
- **Set Cover greedy** = greedy + approximation
- **Dijkstra** = greedy + optimal
- **TSP greedy** = greedy but NOT approximation



