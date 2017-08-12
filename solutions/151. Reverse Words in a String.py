class Solution(object):
  def reverseWords(self, s):
    """
    :type s: str
    :rtype: str
    """
    result = ""
    current_word = ""
    for a in s:
      if not (a == " "):
        current_word += a
      else:
        if len(current_word) == 0:
          continue
        result = " " + current_word + result
        current_word = ""
    if len(current_word) > 0:
      result = current_word + result
    if result.startswith(' '):
      result = result[1:]
    return result

if __name__ == '__main__':
  so = Solution()
  print so.reverseWords("the sky is blue")
  print so.reverseWords("a     b")
  print so.reverseWords("a ")

