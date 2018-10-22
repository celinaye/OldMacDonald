class NamedCow extends Cow
{
  private String myName;
  public NamedCow(String type, String sound, String name)
  {
    myType = type;
    mySound = sound;
    myName = name;
  }
  public NamedCow()
  {
    myType = "unknown";
    mySound = "unknown";
    myName = "unknown";
  }
  public String getName()
  {
    return myName;
  }
  public void setName(String name)
  {
    myName = name;
  }
}
