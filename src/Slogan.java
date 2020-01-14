
public class Slogan implements Lockable{
    private String slogan;
    private static int count;

    public Slogan(String jdi){
        slogan = jdi;
        count++;
    }

    private static int getCount(){
        return count;
    }

    public String toString(){
        String result = "";
        result += "Slogan: " + slogan;
        return result;
    }



}