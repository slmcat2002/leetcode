import heapq
class Solution(object):
  def smallestRange(self, nums):
    """
    :type nums: List[List[int]]
    :rtype: List[int]
    """
    window = []
    for row in range(0, len(nums)):
      nd = Node(value=nums[row][0], row=row, index=0)
      heapq.heappush(window, nd)
    start = -100000
    end = 100000
    while len(window) == len(nums):
      left = heapq.nsmallest(1, window, key=lambda k: k.value)[0]
      right = heapq.nlargest(1, window, key=lambda k: k.value)[0]
      if right.value - left.value < end - start:
        end = right.value
        start = left.value
      window.remove(left)
      if len(nums[left.row]) > left.index + 1:
        new_node = Node(value=nums[left.row][left.index + 1],
                        row=left.row,
                        index=left.index + 1)
        heapq.heappush(window, new_node)
    return [start, end]


class Node(object):
  def __init__(self, value, row, index):
    self.value = value
    self.row = row
    self.index = index


if __name__ == '__main__':
  so = Solution()
  print so.smallestRange([[1], [2,4], [3,5]])
  print so.smallestRange([[4,10,15,24,26], [0,9,12,20], [5,18,22,30]])
  print so.smallestRange([[1,2,3,4,5], [20,40], [30,50]])
  print so.smallestRange([[1,2,3],[1,2,3],[1,2,3]])







