/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    
    private int getImp( List<Employee> employees, Employee emp ) {
        int imp = emp.importance;
        List<Integer> subordinates = emp.subordinates;
        for( int subID : subordinates ) {
            for( Employee e : employees ) {
                if( e.id == subID ) {
                    imp += getImp(employees, e);
                    break;
                }
            }
        }
        return imp;
    }
    
    public int getImportance(List<Employee> employees, int id) {
        int ans = 0;
        for( Employee emp : employees ) {
            if( emp.id == id ) {
                ans = getImp( employees, emp );
                break;
            }
        }
        return ans;
    }
}