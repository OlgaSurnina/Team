public class Team {

    public static void main(String[] args) {

        byte developers = 7;
        System.out.println("Количество программистов на проекте: " + developers);

        byte testers = 1;
        System.out.println("Количество тестировщиков на одного программиста: " + testers);

        byte support = 3;
        System.out.println("Количество специалистов поддержки на одного программиста: " + support);

        int countTesters = (developers * testers);
        System.out.println("Количество тестировщиков на проекте: " + countTesters);

        int countSupport = developers * support;
        System.out.println("Количество специалистов поддержки на проекте: " + countSupport);

        int countTeam = (developers + countTesters + countSupport);
        System.out.println("Численность сотрудников проекта: " + countTeam);
    }
}
