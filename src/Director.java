public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    public void countNumberOfShows() {
        numberOfShows++;
    }

    public void printDirectorName() {
        System.out.println(getName() + " " +getSurname());
    }

    @Override
    public String toString() {
        return "Director{" +
                "numberOfShows=" + numberOfShows + '\'' +
                super.toString() + '}';
    }
}
