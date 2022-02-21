let su=function(a:number,b:number):number{
	
	
	return a+b;
}
console.log(su(4,5));

// optional parameter
function sayhi(name:string,add?:string):string
{
	return name+" "+add;
	
}
console.log(sayhi("h","p"));
console.log(sayhi("p"));

// function overloading

function add(a:number,b:number):number;
function add(a:string,b:string):string;

function add(a:any, b:any):any
{
	return"a"+"b";
}

console.log(5,6);

// rest parameter
function greet(name:string, ...msg:string[]): string {
    return "Hi,"+name+". "+msg.join(", ")+"!";
}
console.log(greet("Raje"));
console.log(greet("hanmant","Good Morning","Good Afternoon","Good Evening"));