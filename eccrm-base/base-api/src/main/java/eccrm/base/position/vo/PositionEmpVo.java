package eccrm.base.position.vo;


/**
 * Generated by chenl on 2014-10-18.
 */

public class PositionEmpVo {
    private String id;
    private String empId;
    private String employeeName;
    private String positionId;
    private String positionName;
    private String orgId;
    private String orgName;

    public PositionEmpVo() {
    }

    public PositionEmpVo(String id, String positionId, String positionName, String orgId, String orgName) {
        this.id = id;
        this.positionId = positionId;
        this.positionName = positionName;
        this.orgId = orgId;
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
