import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        VHS vh1 = new VHS();
        vh1.title = "Practical Magic";
        vh1.runTime = 130;
        vh1.scenes.add("When the witch flies off the roof");
        vh1.scenes.add("When they cast out the demon");
        vh1.scenes.add("When they bring brooms");
        vh1.scenes.add("When the witches dance");
        vh1.scenes.add("When the man comes back");
        VHS vh2 = new VHS();
        vh2.title = "Harry Potter";
        vh2.runTime = 120;
        vh2.scenes.add("When they crash the car");
        vh2.scenes.add("When they go to school");
        vh2.scenes.add("When they beat the bad guy");
        vh2.scenes.add("When they go to Hogsmeade");
        vh2.scenes.add("When they have potions class");
        VHS vh3 = new VHS();
        vh3.title = "Quest to Camelot";
        vh3.runTime = 75;
        vh3.scenes.add("When she loses her mother");
        vh3.scenes.add("When she leaves for camelot");
        vh3.scenes.add("When she meets him");
        vh3.scenes.add("When she falls in love");
        vh3.scenes.add("When she saves the day");
        DVD dvd1 = new DVD();
        dvd1.scenes.add("When they part");
        dvd1.scenes.add("When they meet again");
        dvd1.scenes.add("When they fight giant rats");
        dvd1.scenes.add("When they climb a cliff");
        DVD dvd2 = new DVD();
        dvd2.title = "Princess Diaries";
        dvd2.runTime = 95;
        dvd2.scenes.add("When she gets bullied");
        dvd2.scenes.add("When she meets her grandmother");
        dvd2.scenes.add("When she gets a makeover");
        dvd2.scenes.add("When she drives off");
        dvd2.scenes.add("When they kiss");
        DVD dvd3 = new DVD();
        dvd3.title = "Mean Girls";
        dvd3.runTime = 120;
        dvd3.scenes.add("When she moves");
        dvd3.scenes.add("When she meets Regina");
        dvd3.scenes.add("When she gets pushed into the trash");
        dvd3.scenes.add("When she gets a crush");
        dvd3.scenes.add("When she becomes a mean girl");

        movies.add(vh1);
        movies.add(vh2);
        movies.add(vh3);
        movies.add(dvd1);
        movies.add(dvd2);
        movies.add(dvd3);
        String answer;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to GC Blockbuster! \n" +
                    "Please Select a Movie from the list (1-6) \n");
            for (Movie film : movies) {
                System.out.println(film.title);
            }
            System.out.println("Please select a movie you want to watch:");
            int select = scan.nextInt() - 1;

            System.out.println(movies.get(select).title + "\n" +
                    movies.get(select).runTime);

            movies.get(select).play();
            movies.get(select).scenes.get(select);
            System.out.println("Watch another scene? y/n");
            answer = scan.next();

        }  while (answer.toLowerCase().equals("y"));
    }
}
