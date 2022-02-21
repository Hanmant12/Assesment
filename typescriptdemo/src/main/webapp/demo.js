var a = 5;
console.log(a);
var dta = [["hello", 22], ["abc", 44], ["pqr", 55]];
dta[0] = ["abc", 2];
console.log(dta[0]);
var p = ["a", "p",];
// enum 
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
var code;
code = 123;
code = "abc";
function display(exam) {
    console.log(" " + exam + typeof (exam) + " ");
    if (typeof (exam) === "number") {
        console.log("code is number");
    }
}
display(123);
