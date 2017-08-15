class Solution(object):
  def newInteger(self, n):
    """
    :type n: int
    :rtype: int
    """
    base = 9
    result = 0
    exp = 0
    while True:
      q = n / base
      r = n % base
      n = q
      result = result + pow(10, exp) * r
      if q == 0:
        break
      exp += 1
    return result

