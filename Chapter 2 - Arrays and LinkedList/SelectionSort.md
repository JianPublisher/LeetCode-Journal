# Selection Sort

Selection sort loops through the list, repeatedly finding the **smallest** (or largest) value and placing it in the correct position.

- Runtime: **O(n²)**
- Simple to understand, but **not fast**
- Faster alternative: **Quicksort (O(n log n))**

---

## Why Selection Sort Is O(n²)

Selection sort performs multiple scans of the array:

1. **Scan entire array** to find the smallest → place at index 0
2. **Scan remaining elements** to find the next smallest → place at index 1
3. Repeat…

The scans look like:

- First: `n` items
- Second: `n - 1`
- Third: `n - 2`
- …
- Last: `1`

This produces the series:

n + (n−1) + (n−2) + ... + 1

csharp
Copy code

Which equals:

n(n + 1) / 2 → O(n²)

yaml
Copy code

---

## Variations of Selection Sort

There are two common ways to implement it:

### 1) Find the **smallest** element
- Append it to a **new array**
- Continue until original array is empty

### 2) Find the **largest** element
- Place it at the **end of the same array**
- Continue filling from the back

---

## Summary
- Easy algorithm, but inefficient for large lists
- Performs many repeated scans
- **Always O(n²)** regardless of input
- Prefer **quicksort** or other O(n log n) algorithms for performance