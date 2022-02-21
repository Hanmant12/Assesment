class demo
{
 public name:string="raju";
 
}
class child extends demo
{
  cname:string;
 constructor(cname:string)
  {
    super();
     this.cname=cname;
  }
  
  print():void
{
  console.log(this.cname);
  console.log(this.name);
}
}
let v=new child("raje");
v.print();
