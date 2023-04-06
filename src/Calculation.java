public class Calculation {
    public static int sumSalary(Employee[] empCorp) {
        int sum = 0;
        for (int i = 0; i < empCorp.length; i++) {
            sum = sum + empCorp[i].getSalary();
        }
        return sum;
    }

    // public static int sumSalary1(Employee[] empCorp) {
    //     int sum = 0;
    //       sum = empCorp[0].getSalary() + empCorp[1].getSalary();
    // return sum;
    // }

    public static int minSalary(Employee[] empCorp) {
        int min = 1000000000;
        for (int i = 0; i < empCorp.length; i++) {
            if (empCorp[i].getSalary() < min) {
                min = empCorp[i].getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] empCorp) {
        int max = 0;
        for (int i = 0; i < empCorp.length; i++) {
            if (empCorp[i].getSalary() > max) {
                max = empCorp[i].getSalary();
            }
        }
        return max;
    }

    public static String list(Employee[] empCorp) {
        System.out.println("1 отдел");
        int a = 1;
        for (int i = 0; i < empCorp.length; i++) {
            System.out.println(empCorp[i]);
            if ((i + 1) % 2 == 0) {
                if (a < 5){
                    a++;
                    System.out.println(a + " отдел");
                }
            }
        }
        return null;
    }

    public static int averageSalary(Employee[] empCorp) {
        int sum = 0;
        for (int i = 0; i < empCorp.length; i++) {
            sum = sum + empCorp[i].getSalary();
        }
        double averageSalary = (double) sum / empCorp.length;
        return (int) averageSalary;
    }

    public static String name(Employee[] empCorp) {
        for (int i = 0; i < empCorp.length; i++) {
            System.out.println("Ф.И.О. : " + empCorp[i].getName());
        }
        return null;
    }
}
