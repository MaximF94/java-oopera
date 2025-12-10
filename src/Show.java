import java.util.ArrayList;

public class Show {
    private String title;
    private  int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public void addActorInShow(Actor actor) {
        if(!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Актер " + actor.getName() + " " + actor.getSurname() + " уже был добавлен в список");
        }
    }

    public void changeActorInShow(Actor changeableActor, Actor changeActor) {
        if(listOfActors.contains(changeableActor)) {
            listOfActors.remove(changeableActor);
            listOfActors.add(changeActor);
        } else {
            System.out.println("Заменяемый актер " + changeableActor.getName() + " " + changeableActor.getSurname()
                    + " не найден в списке");
        }
    }

    public void printActors() {
        System.out.println("Список актеров " + this.title + ":");
        for(Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname());
        }
        System.out.println();
    }

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.director.countNumberOfShows();
        listOfActors = new ArrayList<>();
    }
}
