var su = function (a, b) {
    return a + b;
};
console.log(su(4, 5));
// optional parameter
function sayhi(name, add) {
    return name + " " + add;
}
console.log(sayhi("h", "p"));
console.log(sayhi("p"));
function add(a, b) {
    return "a" + "b";
}
console.log(5, 6);
// rest parameter
function greet(name) {
    var msg = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        msg[_i - 1] = arguments[_i];
    }
    return "Hi," + name + ". " + msg.join(", ") + "!";
}
console.log(greet("Raje"));
console.log(greet("hanmant", "Good Morning", "Good Afternoon", "Good Evening"));
