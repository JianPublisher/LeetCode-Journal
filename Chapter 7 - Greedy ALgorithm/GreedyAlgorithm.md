# 📘 NP-Complete Problems, Greedy Algorithms, and Approximations

## 🔹 What this chapter teaches
- How to tackle **impossible problems** with no known fast algorithm (NP-complete).
- How to **recognize NP-complete problems** so you don’t waste time searching for a fast exact solution.
- Introduction to **approximation algorithms** — fast ways to get *near-optimal* answers.

---

## 🔒 Why NP problems are hard
NP problems are **easy to check**, but **hard to solve**.

Example analogy:
- You have 1 billion locks.
- A key opens exactly one.
- Checking a lock is easy.
- Finding the right lock is extremely hard.

This is the essence of NP problems.

---

# 🍃 Greedy Algorithms
Greedy algorithms are simple and fast.

- They **do not always** give the optimal solution.
- But often give a **pretty good** solution quickly.
- Greedy looks only at **the next immediate choice**, not the full future.

Example rule:
> Always pick the biggest box that fits.

This is fast, but not guaranteed optimal.

---

# 📡 Set Cover Problem (Radio Station Example)

### Goal
Cover all required states using the **fewest number** of radio stations.

This is an **NP-hard** problem called **Set Cover**.

### States needed
{ WA, ID, MT, OR, NV, CA, AZ, UT }

shell
Copy code

### Stations
K1 → {ID, NV, UT}
K2 → {WA, ID, MT}
K3 → {OR, NV, CA}
K4 → {CA, AZ}
K5 → {AZ, NV}

yaml
Copy code

---

# 💡 Why use a greedy solution?
Trying every combination grows exponentially — far too slow.

### Greedy Set Cover steps
1. Look at each station and see how many **uncovered** states it covers.
2. Choose the station that covers **the most** uncovered states.
3. Remove those states from the needed list.
4. Repeat until everything is covered.

### Example
Pick `K2` (covers 3 states).  
Remaining:
{ OR, NV, CA, AZ, UT }

vbnet
Copy code

Next best: `K3` (covers 3 of these).  
Remaining:
{ AZ, UT }

sql
Copy code

Final solution (one possible greedy result):
{ K2, K3, K1, K4 }

yaml
Copy code

---

# 📈 Why this is an approximation algorithm
Greedy does **not** guarantee the minimum number of stations.

But it **does** guarantee that the solution is within:
O(log n) of optimal

yaml
Copy code

- Optimal might be **3 stations**
- Greedy may choose **4**
- Still very close → approximation algorithm

---

# 🧭 TSP vs Dijkstra — Very Different Problems

## 🟥 Traveling Salesperson Problem (TSP)
Goal:
> Visit **every** city exactly once and return to the start using the minimum total distance.

Facts:
- Number of possible routes = `N!` (factorial)
- Explodes extremely fast
- Both brute force and greedy fail for large inputs
- TSP is NP-complete

---

## 🟦 Dijkstra’s Algorithm
Goal:
> Find the shortest path from one node to another in a weighted graph.

Facts:
- Always picks the **lowest cost** unvisited node → a **greedy choice**
- Stops early when the target node is reached
- Works because edges must be **non-negative**
- **Dijkstra is greedy AND optimal**

---

# 🔍 Greedy ≠ Approximation
### Greedy
- A **strategy**
- Picks the best choice **locally**
- Sometimes optimal, sometimes terrible

### Approximation Algorithm
- Has a **mathematical guarantee** of closeness to the optimal answer
- Example: Set Cover greedy = `≤ ln(n)` times optimal

### Important
The Set Cover algorithm is both:
- **Greedy**
- **Approximation**

But greedy alone does **not** imply approximation.

---

# 🎉 Summary
- NP-complete problems have **no fast exact solution** known.
- Greedy is a **fast strategy**, solves some problems optimally and others approximately.
- Set Cover greedy: **greedy + approximation**.
- TSP: greedy fails, NP-complete explosion.
- Dijkstra: greedy AND optimal (non-negative weights).
- Greedy ≠ approximation — but some greedy algorithms have approximation guarantees.
