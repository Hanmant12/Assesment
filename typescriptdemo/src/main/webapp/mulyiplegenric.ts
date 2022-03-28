function display<t,u>(a:t,b:u):void
{
	console.log("name"+a+" "+b);
}
display<number,string>(1,"hi");
display<number,string>(1,"hello");