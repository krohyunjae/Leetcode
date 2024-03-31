'''
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 
'''
from collections import defaultdict


class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count = defaultdict(lambda: 0)

        for l in s:
            count[l] += 1
        
        for l in t:
            count[l] -= 1

        for x in count.values():
            if x != 0 : return False
        return True