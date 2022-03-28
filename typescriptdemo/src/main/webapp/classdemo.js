var Student = /** @class */ (function () {
    function Student(enrollment, name) {
        this.rollNumber = enrollment;
        this.stdName = name;
    }
    Student.prototype.getName = function () {
        return this.stdName;
    };
    Student.prototype.getRollNumber = function () {
        return this.rollNumber;
    };
    return Student;
}());
var std = new Student(1, "Tarkesh");
console.log(std.getName());
console.log(std.getRollNumber());
