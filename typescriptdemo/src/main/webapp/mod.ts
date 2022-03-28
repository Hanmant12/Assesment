export class demo1
{
 demo():void
{
	console.log("hi");
}
}
export let age:number =20;
export class Employee{
    static displayEmployee(): any {
        throw new Error("Method not implemented.");
    }
    empCode:number;
    empName:string;
    constructor(name:string, code:number){
        this.empCode=code;
        this.empName=name;
    }
    displayEmployee():void{
        console.log(this.empCode+", "+this.empName);
    }
}
let companyName:string="XYZ corporation";