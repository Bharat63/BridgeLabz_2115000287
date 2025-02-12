import java.util.Scanner;

class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev, next;
    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
    private Movie head, tail;
    
    void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) head = tail = newMovie;
        else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
    
    void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) head = tail = newMovie;
        else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    
    void deleteMovie(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) temp = temp.next;
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }
    
    void searchMovieByDirectorOrRating(String director, double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director) || temp.rating == rating)
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }
    
    void displayMoviesForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }
    
    void displayMoviesReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }
    
    void updateMovieRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }
}

public class MovieManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieList list = new MovieList();
        while (true) {
            System.out.println("1. Add Movie Beginning 2. Add Movie End 3. Delete Movie 4. Search Movie 5. Display Forward 6. Display Reverse 7. Update Rating 8. Exit");
            int choice = scanner.nextInt();
            if (choice == 8) break;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Title, Director, Year, Rating:");
                    list.addMovieAtBeginning(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
                }
                case 2 -> {
                    System.out.println("Enter Title, Director, Year, Rating:");
                    list.addMovieAtEnd(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
                }
                case 3 -> {
                    System.out.println("Enter Title to Delete:");
                    list.deleteMovie(scanner.next());
                }
                case 4 -> {
                    System.out.println("Enter Director or Rating:");
                    list.searchMovieByDirectorOrRating(scanner.next(), scanner.nextDouble());
                }
                case 5 -> list.displayMoviesForward();
                case 6 -> list.displayMoviesReverse();
                case 7 -> {
                    System.out.println("Enter Title and New Rating:");
                    list.updateMovieRating(scanner.next(), scanner.nextDouble());
                }
            }
        }
        scanner.close();
    }
}
