# Binary Search Basics

Binary search is like looking up a word in a dictionary.  
If the word starts with **O**, you naturally begin near the middle because that’s roughly where words starting with O appear.

Binary search only works when the input list is **sorted**.

---

## How Binary Search Works
Each step:
1. Check the **middle** element.
2. Decide whether the target is **left** or **right**.
3. Eliminate half the remaining elements.

Example (number-guessing game):
1. You pick **90**.
2. I guess **50** → “Too low.”
3. Now I know the answer is between **51–100** → half the numbers removed instantly.

---

## Logarithms (Why Binary Search Is So Fast)

Logarithms are the inverse of exponentials.

- `10^2 = 100` → `log10(100) = 2`
- `10^3 = 1000` → `log10(1000) = 3`
- `2^5 = 32` → `log2(32) = 5`

In algorithms, **log means log base 2**.

Binary search takes at most **log₂(n)** steps.

Examples:
- 8 elements → `log₂(8) = 3` steps
- 1024 elements → `log₂(1024) = 10` steps

---

## Key Rule
**Binary search only works if your list is sorted.**

---

## Practice Questions

### 1. Sorted list of 128 elements — max steps?
`log₂(128) = 7`

### 2. Double the size to 256 — max steps now?
`log₂(256) = 8`  
(Just one more step because doubling adds 1 to the exponent.)

