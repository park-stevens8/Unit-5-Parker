public interface Lockable{

        void setKey(int key, int newKey);

        boolean locked();

        void lock(int key);

        void unlock(int key);

}