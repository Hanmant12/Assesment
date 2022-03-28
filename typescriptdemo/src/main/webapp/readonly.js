var emp3 = {
    empCode: 1, empName: "hanmant",
    getsalray: undefined,
    getEmpName: undefined
};
var emp1 = {
    empCode: 1, empName: "raje",
    getsalray: function (number) {
        throw new Error("Function not implemented.");
    },
    getEmpName: function (number) {
        throw new Error("Function not implemented.");
    }
};
emp1.empCode = 3;
emp1.empName = "abc";
