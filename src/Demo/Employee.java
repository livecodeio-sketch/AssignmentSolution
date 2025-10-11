package Demo;

class Address{
    int houseNo;
    String streetName;
    String cityName;
    String pinCode;
    Address(int houseNo, String streetName, String cityName, String pinCode){
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.cityName = cityName;
        this.pinCode = pinCode;
    }
}

public class Employee {
    String empId;
    String name;
    String dept;
    Address ad;
    Employee(String empId, String name, String dept, Address ad){
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.ad = ad;
    }

    public static void main(String[] args) {
        Address ad = new Address(7,
                "Dubai kurukku santhu",
                "Dubai",
                "777777");

        Employee goms = new Employee("7.5",
                "Goms",
                "IT",
                ad);

        Employee siva = new Employee("12",
                "Siva",
                "Machines",
                ad);

        Address newAd = new Address(6,
                "Dalal Street",
                "Mumbai",
                "456789"
                );

        goms.ad = newAd;

        System.out.println(goms.dept);
        System.out.println(siva.name);

    }
}
