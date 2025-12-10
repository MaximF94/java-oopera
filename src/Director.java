public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    public void countNumberOfShows() {
        numberOfShows++;
    }

    @Override
    public String toString() {
        return "Director{" +
                "numberOfShows=" + numberOfShows + '\'' +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", gender=" + getGender() +
                '}';
    }
}
