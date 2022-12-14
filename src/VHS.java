public class VHS extends Movie {
    public int currentTime = 0;


    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }
    @Override
    public void play() {
        System.out.println(scenes.get(currentTime));
        currentTime++;
        if(currentTime >= scenes.size()) {
            rewind();
        }
    }

    public void rewind(){
        currentTime = 0;
    }
}
