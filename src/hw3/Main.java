package hw3;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Gazelle", 5, "field", 40, "herbal");
        System.out.println(gazelle);
        gazelle.go();
        gazelle.eat();
        gazelle.graze();
        System.out.println();

        Herbivores giraffe = new Herbivores("Giraffe", 3, "tropical steppes", 20, "herbal");
        System.out.println(giraffe);
        giraffe.go();
        giraffe.eat();
        giraffe.graze();
        System.out.println();

        Herbivores horse = new Herbivores("Horse", 12, "field", 40, "herbal");
        System.out.println(horse);
        horse.go();
        horse.eat();
        horse.graze();
        System.out.println();

        Predators hyena = new Predators("Hyena", 9, "african savannas", 50, "meet");
        System.out.println(hyena);
        hyena.go();
        hyena.eat();
        hyena.hunt();
        System.out.println();

        Predators tiger = new Predators("Tiger", 3, "low mountains", 40, "meet");
        System.out.println(tiger);
        tiger.go();
        tiger.eat();
        tiger.hunt();
        System.out.println();

        Predators bear = new Predators("Медведь", 5, "Россия", 50, "рыба");
        System.out.println(bear);
        tiger.go();
        tiger.eat();
        tiger.hunt();
        System.out.println();

        Amphibians frog = new Amphibians("Frog", 1, "Swampy area");
        System.out.println(frog);
        frog.go();
        frog.eat();
        frog.hunt();
        System.out.println();

        Amphibians grassSnake = new Amphibians("grass-snake", 1, "forest");
        System.out.println(grassSnake);
        frog.go();
        frog.eat();
        frog.hunt();
        System.out.println();

        Flightless peacock = new Flightless("Peacock", 5, "jungle","walk");
        System.out.println(peacock);
        peacock.go();
        peacock.eat();
        peacock.walk();
        System.out.println();

        Flightless penguin = new Flightless("Penguin", 4, "Arctic Ice", "walk");
        System.out.println(penguin);
        penguin.go();
        penguin.eat();
        penguin.walk();
        System.out.println();

        Flightless dodo = new Flightless("Dodo", 2, "forest", "jump");
        System.out.println(dodo);
        dodo.go();
        dodo.eat();
        dodo.walk();
        System.out.println();

        Flying gull = new Flying("Gull", 5, "sea", "fly");
        System.out.println(gull);
        gull.go();
        gull.eat();
        gull.fly();
        System.out.println();

        Flying falcon = new Flying("Falcon", 6, "wilderness", "fly");
        System.out.println(falcon);
        falcon.go();
        falcon.eat();
        falcon.fly();
        System.out.println();

        Flying albatross = new Flying("Albatross", 4, "Southern Ocean", "fly");
        System.out.println(albatross);
        albatross.go();
        albatross.eat();
        albatross.fly();
        System.out.println();
    }
}
