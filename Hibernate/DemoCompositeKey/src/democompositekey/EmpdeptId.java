package democompositekey;

import java.io.Serializable;

public class EmpdeptId implements Serializable{


     private int empId;
     private int deptId;

    public EmpdeptId() {
    }

    public EmpdeptId(int empId, int deptId) {
       this.empId = empId;
       this.deptId = deptId;
    }
   
    public int getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

}


