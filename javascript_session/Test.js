let emp = {
                empname:"Muthu",
                empno:34567,
                designation:"Trainer",
                greet(){
                    console.log(`Name: ${this.empname} | EmpNo: ${this.empno} | Designation: ${this.designation}`)
                }
            }
    
emp.greet()