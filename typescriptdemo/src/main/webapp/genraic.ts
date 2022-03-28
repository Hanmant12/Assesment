function getArray(items: any[]) : any[]{
    return new Array().concat(items);
}
let array1=getArray([3,4,2,4,5,6,3,5,3,4]);
let array2=getArray(['One','Two', 'Three', 'Four']);
array1.push("Five");
array2.push(555);
console.log(array1);
console.log(array2);


// generic
function getArrya<t>(item:t[]):t[]
{
	return new Array().concat(item);
}
let k=getArrya<number>([1,2,3,4]);
let b=getArrya<String>(["a","b"]);
console.log(k);
console.log(b);