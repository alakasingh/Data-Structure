# 🧩 Bracket Matcher (Stack-Based Validation)

<p align="center">
  <img src="images/technique.png" width="1000"/>
</p>

<p align="center">
  🚀 Validating parentheses using Stack (LIFO) <br>
  ⚡ Clean | Visual | Interview-Ready
</p>

![Python](https://img.shields.io/badge/Python-3.10-blue)
![Algorithm](https://img.shields.io/badge/Topic-Stack-green)
![Complexity](https://img.shields.io/badge/Time-O(n)-orange)
![Status](https://img.shields.io/badge/Project-Complete-brightgreen)

## 🎥 Visual Walkthrough

### Step 1: Push Opening Brackets & Match Closing Brackets
<p align="center">
  <img src="images/opening.png" width="1000"/>
</p>



### Step 3: Final Validation
<p align="center">
  <img src="images/closing.png" width="1000"/>
</p>

## 🧪 Dry Run Example

Input: `([])`

| Step | Character | Stack | Action |
|------|----------|------|--------|
| 1    | (        | (    | Push   |
| 2    | [        | ([   | Push   |
| 3    | ]        | (    | Pop    |
| 4    | )        |      | Pop    |

✅ Stack is empty → Valid

## ❌ Common Mistakes

- Not checking empty stack before popping
- Ignoring mismatched types like `(]`
- Not validating leftover elements in stack

## 🌍 Real-World Applications

- Compiler syntax checking
- Expression evaluation
- Code editors (auto bracket matching)

## 📊 Complexity Explained

- We traverse the string once → O(n)
- Stack operations (push/pop) are O(1)
- In worst case, all elements go into stack → O(n) space
