class Solution(object):
  def reverseWords(self, s):
    """
    :type s: str
    :rtype: str
    """
    result = ""
    lst = s.split(' ')
    for word in lst:
      R = ""
      for l in word:
        R = l + R
      result = result + " " + R
    return result[1:]
