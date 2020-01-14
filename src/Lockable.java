public interface Lockable{

    public void setKey(int key);

    public boolean locked(boolean lock){
        if(lock = true){
            return true;
        }

        if(lock = false){
            return false;
        }
    }

    public boolean lock(int key){
        if(this.key == key){
            lock = true;
        }
    }

    public boolean unlock(int key){
        if(this.key == key){
            lock = false;
        }
    }



}