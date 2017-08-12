# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def constructMaximumBinaryTree(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        if len(nums) == 0:
          return None
        if len(nums) == 1:
          return TreeNode(nums[0])
        mid = self.max(nums)
        left = nums[:mid]
        right = nums[mid + 1:]
        tn = TreeNode(nums[mid])
        tn.left = self.constructMaximumBinaryTree(left)
        tn.right = self.constructMaximumBinaryTree(right)
        return tn

    def max(self, arr):
      if len(arr) == 0:
        return None
      m = 0
      c = 0
      for i in range(0, len(arr)):
        if arr[i] > c:
          m = i
          c = arr[i]
      return m

