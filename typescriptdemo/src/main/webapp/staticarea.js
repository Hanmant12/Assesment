var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.calculateArea = function (radius) {
        return this.PI * radius * radius;
    };
    Circle.PI = 3.1435633;
    return Circle;
}());
//newCircle:Circle = new Circle();
console.log(Circle.PI);
console.log(Circle.calculateArea(5.3345));
