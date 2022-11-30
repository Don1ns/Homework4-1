public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int userAge = 10;
        if (userAge >= 18){
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (userAge < 18){
            System.out.println("Вам нет 18 лет :(");
        }

        System.out.println("Задача 2");
        int age = 12;
        if ((age >= 7) && (age <18)){
            System.out.println("Вы учитесь в школе");
        }
        if ((age >= 18) && (age <24)){
            System.out.println("Вы закончили школу, отправляйтесь в университет");
        }
        if ((age >= 24)){
            System.out.println("Вы закончили университет, и пора искать первую работу");
        }

        System.out.println("Задача 3");
        int totalSeats = 102;
        int seatPlace = 60;
        int standingPlace = totalSeats - seatPlace;
        int occupiedSeatPlace = 60;
        int occupiedStandingPlace = 42;
        if (occupiedStandingPlace + occupiedSeatPlace == totalSeats){
            System.out.println("Все места заняты");
        }
        if (occupiedStandingPlace + occupiedSeatPlace < totalSeats){
            if(occupiedSeatPlace < seatPlace){
                System.out.println("Есть сидячие места");
            }
            if(occupiedStandingPlace < standingPlace){
                System.out.println("Есть стоячие места");
            }
        }
    }
}