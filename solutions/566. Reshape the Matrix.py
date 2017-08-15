class Solution(object):
  def matrixReshape(self, nums, r, c):
    """
    :type nums: List[List[int]]
    :type r: int
    :type c: int
    :rtype: List[List[int]]
    """
    line = []
    for row in nums:
      for n in row:
        line.append(n)
    if len(line) != r * c:
      return nums
    result = []
    ind = 0
    for row in range(0, r):
      new_line = []
      for col in range(0, c):
        new_line.append(line[ind])
        ind += 1
      result.append(new_line)
    return result
