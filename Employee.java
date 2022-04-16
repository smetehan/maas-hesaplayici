public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int nowYear = 2021;
    int calisma;
    double vergi;
    double prim;
    double artis=0;





    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.calisma=calisma;
        this.calisma = this.nowYear - this.hireYear;


        this.vergi=vergi;
        this.prim=prim;
        this.artis=artis;

    }

    double tax() {

        if (this.salary > 1000) {
return this.salary*0.03;
        }

return 0;

    }

       double bonus () {
            if (this.workHours > 40) {
              return (this.workHours - 40) * 30;

            } else {
               return 0;

            }


        }
        double raiseSalary () {

            if (this.calisma <= 9) {
                return this.salary*0.05;


            }
            if (this.calisma >= 10 && this.calisma <= 19) {
                return this.salary * 0.1;

            } else {
                return this.salary * 0.15;
            }

        }
void run(){
    System.out.println("Adi : "+this.name);
    System.out.println("Maas : "+this.salary);
    System.out.println("Is baslangici : "+this.hireYear);
    System.out.println("Calisma saati :"+this.workHours);
    System.out.println("Calisma yili :"+this.calisma);
    System.out.println("Vergi miktari :"+tax() );
    System.out.println("Prim miktari :"+bonus());
    System.out.println("Zam miktari :"+raiseSalary());
    System.out.println("Toplam maas :"+(this.salary+bonus()-tax()+raiseSalary()));

}

    }

