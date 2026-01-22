# Memory, Arrays, and Linked Lists

## Memory Basics
- **1 byte = 1 address**
- Arrays require **one continuous block of memory**.  
  Example (size 5):  
  `[1001][1002][1003][1004][1005]`
- Linked list nodes are **scattered across memory**.  
  Example node locations:  
  `1001 → 1080 → 1040 → 1050 → ...`

Because of this:
- **Array access = O(1)** (direct index → direct address)
- **LinkedList access = O(n)** (must follow pointers one-by-one)

---

## Linked List vs Array (Speed Breakdown)

### Arrays
- Fast access: **O(1)**
- Slow insert/delete: **O(n)**  
  (because everything must shift to maintain continuous memory)

Example of deletion:
[1001, 1002, null, 1004, 1005] ← breaks array logic
[1001, 1002, 1004, 1005, null] ← after shifting (correct)


### Linked Lists
- Slow access: **O(n)**
- Fast insert/delete: **O(1)**  
  (just change pointers)

---

## Why Use Linked Lists?
Even though linked lists are slower overall:
- **Insertion is O(1)** (if you already have the pointer)
- **Deletion is O(1)** (adjust pointer of previous node)

> ⚠️ Linked list insertion is only O(1) *if you already know where to insert*.  
> Otherwise, finding the spot is **O(n)**.

---

# Questions & Answers

### 1) Why does inserting into an array take O(n)?
Even if you have extra space at the end:
- You must **shift elements to the right** so the new element can fit where you want.
- Shifting = O(n).

---

### 2) Inserting in the middle?
- **LinkedList:** just change what the node points to → **O(1)**
- **Array:** must shift elements, and if no space remains, you must **copy the whole array** to a new memory block → **O(n)** or worse.

---

### 3) Deleting an element?
- **LinkedList:** change the previous node’s pointer → **O(1)**
- **Array:** shift remaining elements left → **O(n)**

---

## Visual
![img.png](img.png)
