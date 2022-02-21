

let score:Array<number>;
score=[1,2,3];
console.log(score);

let name1:(String|number)[]=["a",2]; //<>
console.log(name1);

let employee:[number,string][]=[[1,"Tarkesh"],[1,"Tarkesh"]];
//let employee1:[number,string]=["Tarkesh",3];
console.log(employee);
employee.push([2,"Barua"]);
console.log(employee);


enum fruitname{
	
	name="abc",color="red"
	
}

function getvalue():fruitname{
	return fruitname.name;
}
console.log(fruitname.name);
console.log(fruitname.color);
var fruit=["1","2","3"];
console.log(fruit);

var p:Array<String>=["raje"];
console.log(p);

let ara=[2,3,4];
console.log(ara);
let arr=["a",{"name":"hanmant","phone":"123"}];
console.log(arr);



enum printmedia{

newsletter=1,
magzine=getprintmedia("newsletter),




