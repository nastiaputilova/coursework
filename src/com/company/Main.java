package com.company;

public class Main {

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Smirnov", "Alexander", "Mikhailovich", "1", 4000, 1);
        employee[1] = new Employee("Ivanov", "Ivan", "Ivanovich", "2",5000, 2);
        employee[2] = new Employee("Petrov", "Petr", "Petrovich", "3",1000, 3);
        employee[3] = new Employee("Stoianova", "Zhanna", "Arkadyevna", "4",5000, 4);
        employee[4] = new Employee("Kuznecova", "Anna", "Pavlovna", "5",3000, 5);
        employee[5] = new Employee("Nikitina", "Alena", "Sergeevna", "1",8000, 6);
        employee[6] = new Employee("Sobolev", "Artem", "Georgievich", "2",4000, 7);
        employee[7] = new Employee("Nikolaeva", "Svetlana", "Dmitrievna", "3",1000, 8);
        employee[8] = new Employee("Tarasov", "Andrey", "Vitalievich", "4",5000, 9);
        employee[9] = new Employee("Matveeva", "Sofia", "Aleksandrovna", "5",5000, 10);

        // Получить список всех сотрудников со всеми имеющимися по ним данными
        System.out.println(employee[0]);
        System.out.println(employee[1]);
        System.out.println(employee[2]);
        System.out.println(employee[3]);
        System.out.println(employee[4]);
        System.out.println(employee[5]);
        System.out.println(employee[6]);
        System.out.println(employee[7]);
        System.out.println(employee[8]);
        System.out.println(employee[9]);

        // Получить Ф. И. О. всех сотрудников
        System.out.println(employee[0].getFamilyName() + " " + employee[0].getName()+ " " + employee[0].getPatronymic());
        System.out.println(employee[1].getFamilyName() + " " + employee[1].getName()+ " " + employee[1].getPatronymic());
        System.out.println(employee[2].getFamilyName() + " " + employee[2].getName()+ " " + employee[2].getPatronymic());
        System.out.println(employee[3].getFamilyName() + " " + employee[3].getName()+ " " + employee[3].getPatronymic());
        System.out.println(employee[4].getFamilyName() + " " + employee[4].getName()+ " " + employee[4].getPatronymic());
        System.out.println(employee[5].getFamilyName() + " " + employee[5].getName()+ " " + employee[5].getPatronymic());
        System.out.println(employee[6].getFamilyName() + " " + employee[6].getName()+ " " + employee[6].getPatronymic());
        System.out.println(employee[7].getFamilyName() + " " + employee[7].getName()+ " " + employee[7].getPatronymic());
        System.out.println(employee[8].getFamilyName() + " " + employee[8].getName()+ " " + employee[8].getPatronymic());
        System.out.println(employee[9].getFamilyName() + " " + employee[9].getName()+ " " + employee[9].getPatronymic());
    }

    // Посчитать сумму затрат на зарплаты в месяц
    static int sumSalaryEmployee(Employee[] employee){
        int sum = 0;
        for (int i = 0; i < employee.length; i++){
            sum = sum + employee[i].getSalary();
        }
        System.out.println(sum);
        return sum;
    }

    // Найти сотрудника с минимальной зарплатой

    static int minSalary(Employee[] employee){
        int min = 0;
        for (int i = 0; i < employee.length; i++){
            if(employee[i].getSalary() > min){
                min = employee[i].getSalary();
            }
        }
        System.out.println(min);
        return min;
    }

    // Найти сотрудника с максимальной зарплатой

    static int maxSalary(Employee[] employee){
        int max = 0;
        for (int i = 0; i < employee.length; i++){
            if(employee[i].getSalary() < max){
                max = employee[i].getSalary();
            }
        }
        System.out.println(max);
        return max;
    }

    // Подсчитать среднее значение зарплат
    static void averageSalary(Employee[] employee){
        int sum1 = 0;
        for (int i = 0; i < employee.length; i++){
            sum1 += employee[i].getSalary();
        double average = sum1 / employee.length;
        System.out.println(average);

}

    }

}
