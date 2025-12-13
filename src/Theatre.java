public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor = new Actor("Иван","Иванов", Gender.MALE, 185);
        Actor actor2 = new Actor("Петров","Петр", Gender.MALE, 172);
        Actor actor3 = new Actor("Сергей","Сергеев", Gender.MALE, 175);
        Actor actor4 = new Actor("Иван","Иванов", Gender.MALE, 185);
        Actor actress = new Actor("Мария","Иванова", Gender.FEMALE, 165);
        Director director = new Director("Сергей","Сергеев",Gender.MALE);
        Director director2 = new Director("Олег","Петров",Gender.MALE);



        Composer composer = new Composer("Андрей", "Андреев", Gender.MALE);
        Choreographer choreographer = new Choreographer("Анна", "Николаева", Gender.FEMALE);

        Ballet ballet = new Ballet("Лебединое озеро",2, director, composer,
                "Текст либретто для балета", choreographer);

        Opera opera = new Opera("Кармен",3,director,composer,
                "Текст либретто для оперы", 25);

        Show show = new Show("Комедийное шоу",2, director2);

        ballet.addActorInShow(actor);
        ballet.addActorInShow(actor2);
        ballet.addActorInShow(actress);

        opera.addActorInShow(actor3);

        show.addActorInShow(actor);
        show.addActorInShow(actress);

        ballet.printActors();
        opera.printActors();
        show.printActors();

        ballet.printDirectorName();
        opera.printDirectorName();
        show.printDirectorName();
        System.out.println();

        ballet.changeActorInShow("Иванов",actor3);
        ballet.printActors();
        ballet.changeActorInShow("Иванов",actor3);

        //Вывод на экран текст либретто
        System.out.println();
        ballet.printLibretto();
        opera.printLibretto();



    }
}
