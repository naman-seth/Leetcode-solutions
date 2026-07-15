class Solution:
    def isPalindrome(self, x: str) -> bool:
        if str(x)==str(x)[::-1]:
            return True
        else:
            return False    