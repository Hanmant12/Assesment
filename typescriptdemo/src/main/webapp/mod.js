"use strict";
exports.__esModule = true;
exports.Employee = exports.age = exports.demo1 = void 0;
var demo1 = /** @class */ (function () {
    function demo1() {
    }
    demo1.prototype.demo = function () {
        console.log("hi");
    };
    return demo1;
}());
exports.demo1 = demo1;
exports.age = 20;
var Employee = /** @class */ (function () {
    function Employee(name, code) {
        this.empCode = code;
        this.empName = name;
    }
    Employee.displayEmployee = function () {
        throw new Error("Method not implemented.");
    };
    Employee.prototype.displayEmployee = function () {
        console.log(this.empCode + ", " + this.empName);
    };
    return Employee;
}());
exports.Employee = Employee;
var companyName = "XYZ corporation";
