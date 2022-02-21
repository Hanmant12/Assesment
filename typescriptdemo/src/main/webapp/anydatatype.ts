let anyDayaType:any;
anyDayaType=32;
anyDayaType="Tarkeshwar";
anyDayaType=false;
anyDayaType=[4,5,6,3,5,5];
anyDayaType={"name":"Tarkesh","phone":3434,"city":"New Delhi"};
anyDayaType=[[3,5,3],[6,6],[5],[6,5,6,87,6]];


//---------------
function greeting(name:string):void{
    console.log("Hello "+name+", How are you?");
}
greeting("Dr. Tarkeshwar Barua");


function greeting1(name:string):void{​​​​​

    console.log("Hello "+name+", How are you?");

}​​​​​

greeting1("Dr. Tarkeshwar Barua");

function addtion(a:number, b:number):number{​​​​​

    return a+b;

}​​​​​

let funCopy=greeting("Dr. Tarkeshwar");

console.log(funCopy);

let sum:number = addtion(5,3);

console.log(sum);


let myName="Tarkeshwar";

console.log(typeof(myName));

let rollno=myName;

console.log(typeof(rollno));




function neverUseKeyword(name: string): never {
    throw new Error(name);
}
function withoutParameter(): never {
    while (true) { console.log("This is Sample Code"); }
          
}
neverUseKeyword("Tarkeshwar");
withoutParameter();