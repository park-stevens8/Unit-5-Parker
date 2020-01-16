
public class Slogan implements Lockable{
    private String slogan;
    private static int count;
    public boolean locked;
    private int key;

    public Slogan(String jdi, int key){
        slogan = jdi;
        locked = false;
        this.key = key;
    }

    public boolean locked(){return locked; }

    public void setKey(int key, int newKey){
        if(this.key == key){
            key = newKey;
        }
    }

    public void lock(int key){
        if(this.key == key){
            locked = true;
        }
    }

    public void unlock(int key){
        if(this.key == key){
            locked = false;
        }
    }

    public String toString(){

        if (locked == true) {
            String str = "";
            str += "Your key was incorrect, please enter a new one.";
            return str;
        }

        if(locked == false) {
           String result = "";
           result += "Slogan: " + slogan;
           return result;
       }
    }



}