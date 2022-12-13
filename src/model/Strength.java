package model;

public class Strength
{
  private double mShare;
  private double cDemand;
  private double cBehaviour;
  private double dChannel;

  public Strength( double mShare, double cBehaviour, double cDemand, double dChannel)
  {
    this.mShare = mShare;
    this.cBehaviour = cBehaviour;
    this.cDemand = cDemand;
    this.dChannel = dChannel;
  }

  public double getMShare()
  {
    return mShare;
  }

  public void setmShare(int mShare)
  {
    this.mShare = mShare;
  }

  public double getCDemand()
  {
    return cDemand;
  }

  public void setCDemand(int cDemand)
  {
    this.cDemand = cDemand;
  }

  public double getCBehaviour()
  {
    return cBehaviour;
  }

  public void setCBehaviour()
  {
    this.cBehaviour = cBehaviour;
  }

  public double getDChannel()
  {
    return dChannel;
  }

  public void setDChannel()
  {
    this.dChannel = dChannel;
  }
}
