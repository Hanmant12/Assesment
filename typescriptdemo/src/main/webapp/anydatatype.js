var anyDayaType;
anyDayaType = 32;
anyDayaType = "Tarkeshwar";
anyDayaType = false;
anyDayaType = [4, 5, 6, 3, 5, 5];
anyDayaType = { "name": "Tarkesh", "phone": 3434, "city": "New Delhi" };
anyDayaType = [[3, 5, 3], [6, 6], [5], [6, 5, 6, 87, 6]];
//---------------
function greeting(name) {
    console.log("Hello " + name + ", How are you?");
}
greeting("Dr. Tarkeshwar Barua");
function greeting1(name) {
    console.log("Hello " + name + ", How are you?");
}
greeting1("Dr. Tarkeshwar Barua");
function addtion(a, b) {
    return a + b;
}
var funCopy = greeting("Dr. Tarkeshwar");
console.log(funCopy);
var sum = addtion(5, 3);
console.log(sum);
var myName = "Tarkeshwar";
console.log(typeof (myName));
var rollno = myName;
console.log(typeof (rollno));
function neverUseKeyword(name) {
    throw new Error(name);
}
function withoutParameter() {
    while (true) {
        console.log("This is Sample Code");
    }
}
neverUseKeyword("Tarkeshwar");
withoutParameter();
