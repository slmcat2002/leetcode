class Solution(object):
  def distributeCandies(self, candies):
    """
    :type candies: List[int]
    :rtype: int
    """
    kind = set()
    for c in candies:
      kind.add(c)
    return min(len(kind), len(candies) / 2)
