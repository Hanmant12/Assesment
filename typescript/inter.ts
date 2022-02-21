interface person
{
  name:string;
  id:number;
  display():string;
}
let q:person={
          name:"hanmant",
          id:6,
         display():string 
          {
            return "hi";
           }

}
   
   
console.log(q.display());
console.log(q.name);