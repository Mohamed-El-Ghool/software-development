
package assignment1;
public class TvClass {
    private int chanel;
    private int volumeLevel;
    private boolean on;
    public TvClass(){
    chanel=1;
    volumeLevel=5;
    }
    public void turnOn()
    {
        on=true;
    }
    public void turnOff()
    {
        on=false;
    }
    public void setChanel(int newChanel)
    {
        if(newChanel>=1&&newChanel<=120)
            chanel=newChanel;
        else
           System.out.println("Out of range");
    }
    public void setVolume(int newVolume)
    {
        if(newVolume>=1&&newVolume<=7)
            volumeLevel=newVolume;
        else
           System.out.println("Out of range");
    }
    public void chanelUp(){
        setChanel(chanel+1);
    }
    public void chanelDown(){
        setChanel(chanel-1);
    }
    public void volumeUp(){
        setVolume(volumeLevel+1);
    }
    public void volumeDown(){
        setVolume(volumeLevel-1);
    }
}
