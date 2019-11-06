class Employee{
    private int salary = 0;
    private int hours = 0;
    public void getInfo(int salary, int hours){
        this.salary = salary;
        this.hours = hours;
    }
    public void addSalary(){
        if(salary > 500){
            salary += 10;
        }
    }

    public void addWorkHours(){
        if(hours > 5){
            salary += 5;
        }
    }
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.getInfo(500, 8);
        emp.addSalary();
        emp.addWorkHours();
        System.out.println(emp.salary);
    }
}
