public class Strength extends Country
{
  private int mShare;
  private int pFitDemand;
  private int pFitBehaviour;
  private int distribution;

  public Strength(String name, int mShare, int pFitDemand, int pFitBehaviour, int distribution)
  {
    super (name);
    this.mShare = mShare;
    this.pFitDemand = pFitDemand;
    this.pFitBehaviour = pFitBehaviour;
    this.distribution = distribution;
  }
}
