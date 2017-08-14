class Solution(object):
  def complexNumberMultiply(self, a, b):
    """
    :type a: str
    :type b: str
    :rtype: str
    """
    aRp, aIp = self.getRpAndIp(a)
    bRp, bIp = self.getRpAndIp(b)
    cRp = (aRp * bRp) - (aIp * bIp)
    cIp = (aIp * bRp) + (aRp * bIp)
    return str(cRp) + "+" + str(cIp) + "i"

  def getRpAndIp(self, num):
    Rp = num.split('+')[0]
    Ip = num.split('+')[1].replace('i', '')
    return int(Rp), int(Ip)
