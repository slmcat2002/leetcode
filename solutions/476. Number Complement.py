class Solution(object):
  def findComplement(self, num):
    """
    :type num: int
    :rtype: int
    """
    if num == 0:
      return 1
    com = 1
    while com <= num:
      com = com * 2
    return (com - 1) ^ num

if __name__ == '__main__':
  so = Solution()
  for i in range(0, 9):
    print i, so.findComplement(i)

