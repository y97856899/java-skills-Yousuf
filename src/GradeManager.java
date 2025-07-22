

public class GradeManager {
    public static String[] reverseStudentNames(String[] names) {
        String[] rev = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String org = names[i];
            String reverse = "";
            for (int j = org.length() - 1; j >= 0; j--) {
                reverse += org.charAt(j);
            }
            rev[i] = reverse;
        }
        return rev;
    }

    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else
            return 'F';
    }

    public static String[] findFailingStudents(String[] names, int[] scores) {
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                count++;
            }

        }
        String[] fail = new String[count];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                fail[index++] = names[i];
            }
        }
        return fail;

    }

    public static void main(String[] args) {

        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};


        String[] reversed = reverseStudentNames(students);
        System.out.println("Reversed Names:");
        for (String name : reversed) {
            System.out.println(name);
        }


        System.out.println("\nLetter Grades:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ": " + getLetterGrade(scores[i]));
        }


        System.out.println("\nFailing Students:");
        String[] failing = findFailingStudents(students, scores);
        for (String name : failing) {
            System.out.println(name);

        }

    }
}