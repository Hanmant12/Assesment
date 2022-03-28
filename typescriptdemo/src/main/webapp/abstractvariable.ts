abstract class Person {
    abstract name: string;  // creating variable
//    constructor(name: string) {  // constructor
//        this.name = name;
//    }
    display(): void { // concreate method
        console.log(this.name);
    }
    abstract find(name: string): Person; // abstract method must be implimented in the child class
}
class Employe11 extends Person {
    name: string;
    empCode: number;
    constructor(name: string, code: number) {
        //this.name=name;
        super();
        this.empCode = code;
        this.name=name;
    }
    find(name: string): Person {
        return new Employe11(name, 1);
        //thrTow new Error("Method not implemented.");
    }
}
let emp: Person = new Employe11("TarkeshwaR", 111);
emp.display();
let emp2: Person = emp.find("Tarkesh");
console.log(emp);
console.log(emp2.display);