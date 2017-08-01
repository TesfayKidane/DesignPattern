/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.domain;

import java.util.Objects;

/**
 *
 * @author Tesfay
 */
public class Agent {

    private String agentId;
    private Address workLocation;

    public Agent() {
    }

    public Agent(String agentId, Address workLocation) {
        this.agentId = agentId;
        this.workLocation = workLocation;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Address getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(Address workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Agent{" + "agentId=" + agentId + ", workLocation=" + workLocation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.agentId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agent other = (Agent) obj;
        if (!Objects.equals(this.agentId, other.agentId)) {
            return false;
        }
        return true;
    }
}
