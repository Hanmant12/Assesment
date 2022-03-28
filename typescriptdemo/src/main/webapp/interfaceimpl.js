var Employee1 = /** @class */ (function () {
    function Employee1(empcode, empname) {
        this.empCode = empcode;
        this.name = empname;
    }
    Employee1.prototype.display = function () {
        console.log(this.empCode + ", " + this.name);
    };
    return Employee1;
}());
var yourObj = new Employee1(1, "Tarkesh");
var yourObj1 = new Employee1(2, "Barua");
yourObj.display();
console.log(yourObj1.empCode);
