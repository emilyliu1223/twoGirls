/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReceptionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author stacyhuang
 */
public class ReceptionOrganization extends Organization{
    public ReceptionOrganization() {
        super(Organization.Type.Reception.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionRole());
        return roles;
    }
}
