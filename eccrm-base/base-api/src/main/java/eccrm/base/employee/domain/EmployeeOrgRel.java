package eccrm.base.employee.domain;

import com.ycrl.base.common.CommonDomain;
import eccrm.base.org.domain.Organization;

/**
* Generated by yanhx on 2014-10-13.
*/

public class EmployeeOrgRel extends CommonDomain {

    private Employee emplyuee;
    private String employeeId;
    private Organization organization;
    private String orgId;

    public Employee getEmplyuee() {
        return emplyuee;
    }

    public void setEmplyuee(Employee emplyuee) {
        this.emplyuee = emplyuee;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public EmployeeOrgRel() {
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
