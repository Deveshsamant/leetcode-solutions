<div align="center">

# 11. Container With Most Water

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffa116?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/Language-C%2B%2B-6c5ce7?style=for-the-badge&labelColor=1a1a2e&logo=code)  ![Solutions](https://img.shields.io/badge/Solutions-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/Date-2026-09-02-0984e3?style=for-the-badge&labelColor=1a1a2e)

[![LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/container-with-most-water/)

</div>

---

## 🏷️ Topics

`Array` `Two Pointers` `Greedy`

## 🏆 Best Performance

| Metric | This Attempt | All-time Best |
|--------|:-----------:|:------------:|
| ⚡ Runtime | 0 ms (Beats 100%) | **0 ms (Beats 100%)** 🆕 |
| 💾 Memory  | 62.9 MB (Beats 49%) | **62.9 MB (Beats 49%)** |

> 🎉 **New personal best!** Runtime improved!

## 💡 Solutions (1 total)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.cpp](./sol1.cpp) | `C++` | 2026-09-02 ← **latest** |

---

## 📋 Problem Description

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `i^th` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return *the maximum amount of water a container can store*.

**Notice** that you may not slant the container.

 

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)
```

**Input:** height = [1,8,6,2,5,4,8,3,7]
**Output:** 49
**Explanation:** The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

```

**Example 2:**

```

**Input:** height = [1,1]
**Output:** 1

```

 

**Constraints:**

	- `n == height.length`

	- `2 <= n <= 10^5`

	- `0 <= height[i] <= 10^4`

---

<p align="right">
  <sub>🤖 Auto-pushed by <a href="https://deveshsamant.in/">Devesh Samant</a>'s <strong>LeetSync</strong> extension</sub>
</p>
