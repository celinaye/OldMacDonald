public void setup()
{
  Cow c = new Cow("cow","moo");
  System.out.println(c.getType()+" goes "+c.getSound());
  Farm yeah = new Farm();
  yeah.animalSounds();
}
