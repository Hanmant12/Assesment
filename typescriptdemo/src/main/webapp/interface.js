var obj = { empCode: 1,
    empName: "raje", getEmpName: function (number) { return "hanmant"; } };
console.log(obj.getEmpName);
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);
;
function addKeyValue(key, value) {
    console.log(key + ", " + value);
}
function updateKeyValue(key, value) {
    console.log(key + ", " + value);
}
var myobj = addKeyValue;
myobj(1, "hanmant");
var myobj1 = updateKeyValue;
myobj1(2, "raje");
