interface IEmployee{  
	  empCode:number;
     empName:string;
    //salray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"raje",
                    getEmpName(number):string{return "hanmant";}};
console.log(obj.getEmpName);
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);


// functional interface
 interface KeyValueProcessor{ 
	 // functional interface    (key: number, value:string):void;
	   (key: number, value:string):void;
};
function  addKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
function  updateKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
let myobj:KeyValueProcessor = addKeyValue;
  myobj(1,"hanmant");
  let myobj1:KeyValueProcessor = updateKeyValue;
 myobj1(2,"raje");