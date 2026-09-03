<div align="center">

# 41. First Missing Positive

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-ef4743?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/Language-C%2B%2B-6c5ce7?style=for-the-badge&labelColor=1a1a2e&logo=code)  ![Solutions](https://img.shields.io/badge/Solutions-2-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/Date-2026-09-03-0984e3?style=for-the-badge&labelColor=1a1a2e)

[![LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/first-missing-positive/)

</div>

---

## 🏷️ Topics

`Array` `Hash Table`

## 🏆 Best Performance

| Metric | This Attempt | All-time Best |
|--------|:-----------:|:------------:|
| ⚡ Runtime | 111 ms (Beats 5%) | **111 ms (Beats 5%)** |
| 💾 Memory  | 84.5 MB (Beats 5%) | **84.5 MB (Beats 5%)** |

## 💡 Solutions (2 total)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.cpp](./sol1.cpp) | `C++` | 2026-09-03 |
| 2 | [sol2.cpp](./sol2.cpp) | `C++` | 2026-09-03 ← **latest** |

---

## 📋 Problem Description

Given an unsorted integer array `nums`. Return the *smallest positive integer* that is *not present* in `nums`.

You must implement an algorithm that runs in `O(n)` time and uses `O(1)` auxiliary space.

 

**Example 1:**

```

**Input:** nums = [1,2,0]
**Output:** 3
**Explanation:** The numbers in the range [1,2] are all in the array.

```

**Example 2:**

```

**Input:** nums = [3,4,-1,1]
**Output:** 2
**Explanation:** 1 is in the array but 2 is missing.

```

**Example 3:**

```

**Input:** nums = [7,8,9,11,12]
**Output:** 1
**Explanation:** The smallest positive integer 1 is missing.

```

 

**Constraints:**

	- `1 <= nums.length <= 10^5`

	- `-2^31 <= nums[i] <= 2^31 - 1`

---

<p align="right">
  <sub>🤖 Auto-pushed by <a href="https://deveshsamant.in/">Devesh Samant</a>'s <strong>LeetSync</strong> extension</sub>
</p>
