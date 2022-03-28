
interface IEmployee{​​​​​

    empCode: number;

    empName: string

}​​​​​

let emp3:Readonly<IEmployee>={​​​​​

    empCode:1,empName:"hanmant"

}​​​​​

let emp1:IEmployee={​​​​​

    empCode:1,empName:"raje"

}​​​​​

emp1.empCode=3;

emp1.empName="abc";

