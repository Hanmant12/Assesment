class Circle{
    static PI:number=3.1435633;
    static calculateArea(radius:number):number{
        return this.PI*radius*radius;
    }
}
//newCircle:Circle = new Circle();
 console.log(Circle.PI);
console.log(Circle.calculateArea(5.3345));