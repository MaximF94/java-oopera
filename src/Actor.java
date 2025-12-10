import java.util.Objects;

public class Actor extends Person {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return (height == actor.height) &&
                (Objects.equals(getName(),actor.getName())) &&
                (Objects.equals(getSurname(),actor.getSurname()));
    }

    @Override
    public int hashCode() {
        /*
        int hash = 17;

        if(getName() != null) {
            hash = hash + getName().hashCode();
        }

        hash = hash * 31;

        if(getSurname() != null) {
            hash = hash + getSurname().hashCode();
        }

        hash = hash * 7;

        hash = hash + height;

        return hash;
        */
        return Objects.hash(super.hashCode(), height);
    }

}
