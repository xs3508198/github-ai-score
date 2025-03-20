package run.mone.github.githubaiscore.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));

        // 自定义排序：按分数降序
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.score - s1.score;
            }
        });

        // 输出结果
        for (Student s : students) {
            System.out.println(s.name + ": " + s.score);
        }

        System.out.println("esssss");
    }
}
