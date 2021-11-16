package com.company;

public class Main {

    public static void main(String[] args) {
        public static void main(String[] args)
        {
            ArrayList<Student> students = new ArrayList<>();
            ArrayList<Faculty> faculties = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);
            System.out.println(FindStudent(scanner, students));

        }

        public static boolean FindStudent(Scanner scan,
                ArrayList<Student> students)
        {
            System.out.println("Input parameter: ");
            String parameter = scan.nextLine();
            if (parameter.equals("Name"))
            {
                System.out.println("Input Name");
                var name = scan.nextLine();
                var student = students.stream()
                        .filter(s -> s.getName().equals(name))
                        .findFirst();
            }

            else if (parameter.equals("FacultetNo"))
            {
                System.out.println("Input FacultetNo");
            }

            else if (parameter.equals("BornYear"))
            {
                System.out.println("Input BornYear");
            }

            else if (parameter.equals("getAvgGrade"))
            {
                System.out.println("Input getAvgGrade");
            }
            return true;
        }

        public static Faculty graduateStudent(Student student, Scanner scan)
        {
            int graduateYear = scan.nextInt();
            return new Faculty( student.getName(),
                    student.getFacultetNo(),
                    student.getBornYear(),
                    student.getAvgGrade(),
                    graduateYear);
        }
    }
}
