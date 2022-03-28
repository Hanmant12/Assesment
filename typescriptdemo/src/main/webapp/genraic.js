function getArray(items) {
    return new Array().concat(items);
}
var array1 = getArray([3, 4, 2, 4, 5, 6, 3, 5, 3, 4]);
var array2 = getArray(['One', 'Two', 'Three', 'Four']);
array1.push("Five");
array2.push(555);
console.log(array1);
console.log(array2);
// generic
function getArrya(item) {
    return new Array().concat(item);
}
var k = getArrya([1, 2, 3, 4]);
var b = getArrya(["a", "b"]);
console.log(k);
console.log(b);
