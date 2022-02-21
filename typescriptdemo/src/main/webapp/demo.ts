let a:number=5;
console.log(a);
let dta:[string,number][]=[["hello",22],["abc",44],["pqr",55]];
dta[0]=["abc",2];
console.log(dta[0]);

let p:Array<String>=["a","p",];


// enum 
enum fruitname{
	
	name="abc",color="red"
	
}

function getvalue():fruitname{
	return fruitname.name;
}
console.log(fruitname.name);
console.log(fruitname.color);


let code:(string|number);
code=123;
code="abc";

function display(exam:number)
{
	console.log(" "+exam+typeof(exam)+" ");
	if(typeof(exam)==="number")
	{
		console.log("code is number");
		
	}
}
display(123);





