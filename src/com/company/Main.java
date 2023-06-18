package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  //  TreeSet<Candidate> treeSet1 = new TreeSet<>(Comparator.comparing(Candidate::getResumeRelevance), Comparator.reverseOrder())//.Comparator.comparing(Candidate :: getAssessment, Comparator.reverseOrder());
 // TreeSet<Candidate> treeSet2 = new TreeSet<>(Comparator.comparing(Candidate::getResumeRelevance), Comparator.comparing(Candidate :: getAssessment));
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите информацию о кандидате (для завершения введите пустую строку):");
                TreeSet<Candidate> treeSet1 = new TreeSet<>(Comparator.comparing(Candidate::getResumeRelevance, Comparator.reverseOrder()).thenComparing(Candidate :: getAssessment, Comparator.reverseOrder()));
                addItem(treeSet1);

            } catch (Exception e) {
                System.out.println("Неверно введены данные");
        }
    }
    public static void addItem(TreeSet<Candidate> treeSet) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Фамилия Имя Отчество, пол, возраст, релевантность резюме, оценка на собеседовании: ПО ПРИМЕРУ");
            String name = scanner.nextLine();
            if(name.equals("")){
                printCandidate(treeSet);
                break;
            }
                String[] parse = name.split(", ");
                String names = parse[0];
                String genderOfAPerson = parse[1];
                String age = parse[2];
                String resumeRelevance = parse[3];
                String assessment = parse[4];
                treeSet.add(new Candidate(names, genderOfAPerson, age, Integer.parseInt(resumeRelevance), Integer.parseInt(assessment)));

        }
    }
    static void printCandidate(Set<Candidate> candidates ){
        for (Candidate candidate: candidates) {
            System.out.println(candidate);
        }
    }
}
