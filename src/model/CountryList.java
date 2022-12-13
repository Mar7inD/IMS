package model;

import java.util.ArrayList;

public class CountryList
{
  private ArrayList<Country> countries;

  public CountryList()
  {
    countries = new ArrayList<Country>();
  }

  public int length()
  {
    return countries.size();
  }

  public void add(Country country)
  {
    countries.add(country);
  }

  public String getCountryName(int index)
  {
    return countries.get(index).getName();
  }

  public void remove(int index)
  {
    countries.remove(index);
  }

}