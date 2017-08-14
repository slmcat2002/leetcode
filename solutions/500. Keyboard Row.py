import re
class Solution(object):
  def findWords(self, words):
    """
    :type words: List[str]
    :rtype: List[str]
    """
    return filter(lambda x: re.match('^[qwertyuiop]+$|^[asdfghjkl]+$|^[zxcvbnm]+$', x.lower()), words)


if __name__ == '__main__':
  so = Solution()
  print so.findWords(["QwQ","AsA","a","qwa", "zaa"])
