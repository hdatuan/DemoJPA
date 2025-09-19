package com.example.demoJPA.demoJPA.request;

public class InsertRoleRequest {
    // @JsonProperty("role-name")
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
