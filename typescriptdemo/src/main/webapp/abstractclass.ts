/*abstract class Person1{
    name: string;
    constructor(name: string){
        this.name=name;
    }   
    display(): void{ // concreate method
        console.log(this.name);
    }
    abstract find(string : string):Person;
}
class Employe111 extends Person1{
    empCode: number;
    constructor(name:string, code:number){
        //this.name=name;
        super(name);
        this.empCode=code;
    }
    find(string: string): Person {
    return new Employe11(string, 1);
            //throw new Error("Method not implemented.");
    }
}
let emp11:Person1= new Employe11("TarkeshwaR", 111);
emp11.display();
let emp22:Person =emp.find("Tarkesh");
console.log(emp);
console.log(emp2);*/