class Solution(object):
  def countBattleships(self, board):
    """
    :type board: List[List[str]]
    :rtype: int
    """
    count = 0
    for y in range(0, len(board)):
      for x in range(0, len(board[y])):
        if board[y][x] == "X":
          if x == 0 and y == 0:
            count += 1
          if x > 0 and y == 0:
            if board[y][x - 1] != "X":
              count += 1
          if x == 0 and y > 0:
            if board[y - 1][x] != "X":
              count += 1
          if x > 0 and y > 0:
            if board[y][x - 1] != "X" and board[y - 1][x] != "X":
              count += 1
    return count
