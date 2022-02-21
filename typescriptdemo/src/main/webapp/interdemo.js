var Employee = /** @class */ (function () {
    function Employee(empCode, empName) {
        this.empCode = empCode;
        this.empName = empName;
    }
    Employee.prototype.getsalray = function (num) {
        return 100;
    };
    Employee.prototype.getEmpName = function (number) {
        return "Tarkeshwar";
    };
    Employee.prototype.display = function () {
        console.log(this.empCode);
        console.log(this.empName);
    };
    return Employee;
}());
var ob = new Employee(3, "abc");
/*ob.getsalray();
ob.getEmpName();*/
ob.display();
