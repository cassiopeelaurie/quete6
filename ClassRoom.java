import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
   public static void main(String[] args) {
    // Ajoute des références vers plusieurs instances de la classe Wilder dans la méthode main() de Classroom

    Wilder student1 = new Wilder("Léa", true);
    Wilder student2 = new Wilder("Laurianne", true);
    Wilder student3 = new Wilder("Salomé", true);

List<Wilder> students = new ArrayList<>();
students.add(student1);
students.add(student2);
students.add(student3);

    // Pour chacune des références, affiche le retour de la méthode whoAmI() dans le terminal

    for(Wilder student : students) {
        System.out.println(student.whoAmI());
    }
   } 
}
