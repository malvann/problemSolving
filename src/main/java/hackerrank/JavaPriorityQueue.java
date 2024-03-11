package hackerrank;

import java.util.*;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eventsNum = scanner.nextInt();
        List<String> events = new ArrayList<>();
        while (eventsNum-- > -1) events.add(scanner.nextLine());

        List<String> students = new Priorities().getStudents(events);
        System.out.println(students.isEmpty()
                ? "EMPTY"
                : String.join("\n", students));
    }
}

record Student(int id, String name, double cgpa) implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        if (o.cgpa != this.cgpa) return Double.compare(o.cgpa, this.cgpa);
        if (!Objects.equals(this.name, o.name)) return this.name.compareTo(o.name);
        return Integer.compare(this.id, o.id);
    }
}

class Priorities {
    public List<String> getStudents(List<String> events) {
        TreeSet<Student> queue = new TreeSet<>();
        for (String event : events) {
            if (event.isEmpty()) continue;
            if (event.startsWith("S") && !queue.isEmpty()) queue.remove(queue.first());
            else if (event.startsWith("E")) {
                String[] data = event.split(" ");
                queue.add(new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2])));
            }
        }
        return queue.stream().map(Student::name).toList();
    }
}
