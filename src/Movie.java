import java.util.ArrayList;

public abstract class Movie {
    public String title;
    public int runTime;
    ArrayList<String> scenes = new ArrayList<>();
    public abstract void play();

    public short setTitle(String title) {
        this.title = title;
        return 0;
    }

    public String printInfo(){
        return "Movie [title =" + title + runTime + "]";
    }

    public void printScenes() {
        for(int i =0;i < scenes.size(); i++) {
            System.out.println(i+ ". " + scenes.get(i));
        }
    }
}
