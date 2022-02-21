var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var demo = /** @class */ (function () {
    function demo() {
        this.name = "raju";
    }
    return demo;
}());
var child = /** @class */ (function (_super) {
    __extends(child, _super);
    function child(cname) {
        var _this = _super.call(this) || this;
        _this.cname = cname;
        return _this;
    }
    child.prototype.print = function () {
        console.log(this.cname);
        console.log(this.name);
    };
    return child;
}(demo));
var v = new child("raje");
v.print();
