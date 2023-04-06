import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Employee[] empCorp = new Employee[10];
            Id id1 = new Id();
            empCorp[0] = new Employee("Богданов Иван Андреевич", id1, 1, 100_000);
            Id id2 = new Id();
            empCorp[1] = new Employee("Воронина Анна Игоревна", id2, 1, 56_000);
            Id id3 = new Id();
            empCorp[2] = new Employee("Бражников Виктор Алексеевич", id3, 2, 73_000);
            Id id4 = new Id();
            empCorp[3] = new Employee("Григорьева Екатерина Павловна", id4, 2, 24_800);
            Id id5 = new Id();
            empCorp[4] = new Employee("Шаманов Дмитрий Владимирович", id5, 3, 48_300);
            Id id6 = new Id();
            empCorp[5] = new Employee("Антонов Егор Игорович", id6, 3, 69_990);
            Id id7 = new Id();
            empCorp[6] = new Employee("Рощин Дмитрий Владиславович", id7, 4, 67_100);
            Id id8 = new Id();
            empCorp[7] = new Employee("Полякова Александра Антоновна", id8, 4, 90_120);
            Id id9 = new Id();
            empCorp[8] = new Employee("Хасанов Ильнур Рустамович", id9, 5, 46_600);
            Id id10 = new Id();
            empCorp[9] = new Employee("Нестерров Захар Владиславович", id10, 5, 81_700);
            // for (Employee employee : empCorp) {
            //     System.out.println(employee);
            // }
            System.out.println("Данная программа показывает:" + '\n' +
                    "1. Все данные сотрудников" + '\n' +
                    "2. Сумма затрат на зарплату" + '\n' +
                    "3. Минимальная зарплата сотрудника в компании" + '\n' +
                    "4. Максимальная зарплата сотрудника в копании" + '\n' +
                    "5. Среднее значение зарплат" + '\n' +
                    "6. Список сотрудников" + '\n' +
                    "Для того чтобы узнать результат выберите пункт который Вам нужен");
            System.out.println("Введите число:");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();

            if (number == 1) {
                System.out.println("Все данные сотрудника");
                System.out.println(Calculation.list(empCorp));
            } else if (number == 2) {
                System.out.println("Сумма затрат на зарплату: " + Calculation.sumSalary(empCorp) + " рублей");
            } else if (number == 3) {
                System.out.println("Минимальная зарплата сотрудника: " + Calculation.minSalary(empCorp) + " рублей");
            } else if (number == 4) {
                System.out.println("Максимальная зарплата сотрудника: " + Calculation.maxSalary(empCorp) + " рублей");
            } else if (number == 5) {
                System.out.println("Средняя зарплата сотрудника: " + Calculation.averageSalary(empCorp) + " рублей");
            } else if (number == 6) {
                System.out.println(Calculation.name(empCorp));
                // } else if (number == 7) {
                //    System.out.println("Средняя зарплата сотрудника: " + Calculations.sumSalary1(empCorp) + " рублей");
            } else{
                System.out.println("Данные не корректны");
        }
    }
}