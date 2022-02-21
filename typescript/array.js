var score;
score = [1, 2, 3];
console.log(score);
var name1 = ["a", 2]; //<>
console.log(name1);
var employee = [[1, "Tarkesh"], [1, "Tarkesh"]];
//let employee1:[number,string]=["Tarkesh",3];
console.log(employee);
employee.push([2, "Barua"]);
console.log(employee);
var fruitname;
(function (fruitname) {
    fruitname["name"] = "abc";
    fruitname["color"] = "red";
})(fruitname || (fruitname = {}));
function getvalue() {
    return fruitname.name;
}
console.log(fruitname.name);
console.log(fruitname.color);
var fruit = ["1", "2", "3"];
console.log(fruit);
var p = ["raje"];
console.log(p);
var ara = [2, 3, 4];
console.log(ara);
var arr = ["a", { "name": "hanmant", "phone": "123" }];
console.log(arr);
