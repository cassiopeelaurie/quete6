class Wilder {

    // Ajoute les attributs String firstname et boolean aware
   
       private String firstname;
       private boolean aware;

    // Crée un constructeur permettant d'initialiser firstname et aware

       public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
       }

    // Getters et Setters

    public String getFirstname() {
        return firstname;
    }

    public String setFirstname(String firstname) {
        return this.firstname = firstname;
    }

    public boolean IsAware() {
        return aware;
    }

    public boolean SetIsAware(boolean aware) {
        return this.aware = aware;
    }

    // Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware

       public String whoAmI() {
        return "My name is " + firstname + " and I am " + (aware ? "aware" : "not aware") + ".";
    }
       public static void main(String[] args) {
        Wilder person = new Wilder("brigitte", false);
        System.out.println(person.whoAmI());
    }
}

// static
//méthode classe / méthode instance de classe
//héritage
//interface
//polymorphisme
//surcharge
//encapsulation