interface IEmployee{
    empCode:number;
    empName:string;
    getsalray:(number) => number;
    getEmpName(number):string;  // abstract function
}
class Employee implements IEmployee {
    empCode: number;
    empName: string;
    constructor(empCode: number, empName: string) {
        this.empCode = empCode;
        this.empName=empName;
 
    }
    getsalray(num): number {
        return 100;
    }
    getEmpName(number): string {
        return "Tarkeshwar";
    }
    display():void
    {
	console.log(this.empCode);
	console.log(this.empName);
}
}
var ob=new Employee(3,"abc");
/*ob.getsalray();
ob.getEmpName();*/
ob.display();

