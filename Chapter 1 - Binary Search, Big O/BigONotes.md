# Big O Notation

Big O notation describes the **worst-case runtime** of an algorithm.  
It lets you compare how many operations an algorithm needs as your input size grows.

- **O(n)** → n steps
- **O(log n)** → log n steps
- Used to compare algorithm efficiency
- Not measured in seconds — measured by **growth rate**

---

## Common Big O Runtimes

1. **O(log n)** — Logarithmic time
    - Example: **Binary search**
    - Gets dramatically faster as the list gets larger.

2. **O(n)** — Linear time
    - Example: **Simple search**

3. **O(n log n)** — Fast sorting
    - Example: **Quicksort**

4. **O(n²)** — Slow sorting
    - Example: **Selection sort**

5. **O(n!)** — Extremely slow
    - Example: **Traveling Salesperson Problem**
        - Checks every possible route permutation.

---

## Visual Examples
![img.png](img.png)

![img_1.png](img_1.png)

---

## Key Takeaways

- **Binary search is far faster than simple search.**
- **O(log n)** becomes much faster than **O(n)** as input grows.
- Algorithm speed is about **how the number of operations grows**, not real-time seconds.
- Big O notation describes this growth behavior.

