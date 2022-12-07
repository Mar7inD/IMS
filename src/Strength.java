public class Strength
{
  private int mShare;
  private int cDemand;
  private int cBehaviour;
  private int dChannel;

  public Strength( int mShare, int cDemand, int cBehaviour, int dChannel)
  {
    this.mShare = mShare;
    this.cDemand = cDemand;
    this.cBehaviour = cBehaviour;
    this.dChannel = dChannel;
  }

  public int getMShare()
  {
    return mShare;
  }

  public void setmShare(int mShare)
  {
    this.mShare = mShare;
  }

  public int getCDemand()
  {
    return cDemand;
  }

  public void setCDemand(int cDemand)
  {
    this.cDemand = cDemand;
  }

  public int getCBehaviour()
  {
    return cBehaviour;
  }

  public void setCBehaviour()
  {
    this.cBehaviour = cBehaviour;
  }

  public int getDChannel()
  {
    return dChannel;
  }

  public void setDChannel()
  {
    this.dChannel = dChannel;
  }
}
