import java.util.Scanner;

public class DVD extends Movie{
    @Override
    public void play() {
        System.out.println("Please select which scene you would like to watch? Select 0-" + scenes.size());
        Scanner scan = new Scanner(System.in);
        printScenes();
        int answer = scan.nextInt();
        System.out.println(scenes.get(answer));
    }
}
