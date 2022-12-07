public class Attractiveness
{
  private int mSize;
  private int mGrowth;
  private int cSituation;
  private int eStability;
  private int pStability;
  private int infrastructure;
  private int cDifference;

  public Attractiveness( int mSize, int mGrowth, int cSituation,
      int eStability, int pStability, int infrastructure, int cDifference)
  {
    this.mSize = mSize;
    this.mGrowth = mGrowth;
    this.cSituation = cSituation;
    this.eStability = eStability;
    this.pStability = pStability;
    this.infrastructure = infrastructure;
    this.cDifference = cDifference;
  }

  public int getMSize()
  {
    return mSize;
  }

  public void setMSize(int mSize)
  {
    this.mSize = mSize;
  }

  public int getMGrowth()
  {
    return mGrowth;
  }

  public void setMGrowth(int mGrowth)
  {
    this.mGrowth = mGrowth;
  }

  public int getCSituation()
  {
    return cSituation;
  }

  public void setCSituation(int cSituation)
  {
    this.cSituation = cSituation;
  }

  public int getEStability()
  {
    return eStability;
  }

  public void setEStability(int eStability)
  {
    this.eStability = eStability;
  }

  public int getPStability()
  {
    return pStability;
  }

  public void setPStability(int pStability)
  {
    this.pStability = pStability;
  }

  public int getInfrastructure()
  {
    return infrastructure;
  }

  private void setInfrastructure(int infrastructure)
  {
    this.infrastructure = infrastructure;
  }

  private int getCDifference()
  {
    return cDifference;
  }

  private void setCDifference()
  {
    this.cDifference = cDifference;
  }

}
