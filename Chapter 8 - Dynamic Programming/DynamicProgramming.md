# ⭐ Dynamic Programming (DP)

DP is a technique for solving hard problems by breaking them into **subproblems**, solving those subproblems first, and **reusing** their results.

It looks similar to divide-and-conquer, but they are **not** the same:

- **Divide & Conquer:** subproblems are **independent**.
- **Dynamic Programming:** subproblems **overlap**, and answers are reused to avoid recomputation.

---

# ⭐ DP = Smart Caching (Two Styles)

## 1) Memoization → Top-Down + Caching
- Uses **recursion**.
- When a subproblem is solved once, **store** the result.
- Next time the same subproblem appears, **reuse** the cached value.
- Example: Fibonacci using recursion + memo array.
- You only compute the subproblems you actually need.

## 2) Tabulation → Bottom-Up + Table
- Uses **iteration**.
- Build solutions from **smallest → largest**.
- Fill a table where each entry depends on previously computed entries.
- Example:  
  `dp[i] = dp[i-1] + dp[i-2]`
- Entire table is built ahead of time (no recursion).

> Memoization and tabulation are both **caching**, just in different directions.

---

# ⭐ When DP Works
DP is effective when:
- Subproblems **overlap** (the same work would be repeated).
- Problem has **optimal substructure**  
  (best solution can be built from best subsolutions).
- Decisions do **not** change the structure of future subproblems.

**Examples:**  
Knapsack, Fibonacci, longest subsequence, edit distance.

---

# ⭐ When DP Fails
DP does **not** work well when:
- A choice affects future choices in non-predictable ways  
  (subproblems are no longer independent).
- Fractional choices are allowed (e.g., fractional knapsack → use Greedy).
- The problem cannot be divided into meaningful subproblems.

---

# ⭐ Core DP Notes (from the book)
- DP shines in **optimization** problems with constraints.
- Good DP problems can be broken into **discrete subproblems**.
- Most DP solutions use a **grid/table** or a **1D dp array**.
- Each cell or index represents a **subproblem**.
- There is no one-size-fits-all formula — each DP problem needs its own **recurrence relation**.

---

# ⭐ Summary
Dynamic Programming =  
**Break problem → solve subproblems → cache results → build final answer.**

Memoization = top-down recursion + caching.  
Tabulation = bottom-up iteration + caching.

DP works only when the structure of the problem allows results to be **reused safely**.
