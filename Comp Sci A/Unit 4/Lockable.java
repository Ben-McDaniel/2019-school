public interface Lockable{
    public void setKey(int k);
    public String lock(int k);
    public String unlock(int k);
    public boolean locked(int k);
}