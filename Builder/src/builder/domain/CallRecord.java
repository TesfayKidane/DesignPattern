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
public class CallRecord {

    private Customer customer;
    private Agent agent;
    private String requestInformation;
    private boolean isValid;
    private boolean isASalesLead;

    public CallRecord(Customer customer, Agent agent, String requestInformation, boolean isValid, boolean isASalesLead) {
        this.customer = customer;
        this.agent = agent;
        this.requestInformation = requestInformation;
        this.isValid = isValid;
        this.isASalesLead = isASalesLead;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getRequestInformation() {
        return requestInformation;
    }

    public void setRequestInformation(String requestInformation) {
        this.requestInformation = requestInformation;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public boolean isIsASalesLead() {
        return isASalesLead;
    }

    public void setIsASalesLead(boolean isASalesLead) {
        this.isASalesLead = isASalesLead;
    }

    @Override
    public String toString() {
        return "CallRecord{" + "customer=" + customer + ", agent=" + agent + ", requestInformation=" + requestInformation + ", isValid=" + isValid + ", isASalesLead=" + isASalesLead + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.requestInformation);
        hash = 61 * hash + (this.isValid ? 1 : 0);
        hash = 61 * hash + (this.isASalesLead ? 1 : 0);
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
        final CallRecord other = (CallRecord) obj;
        if (this.isValid != other.isValid) {
            return false;
        }
        if (this.isASalesLead != other.isASalesLead) {
            return false;
        }
        if (!Objects.equals(this.requestInformation, other.requestInformation)) {
            return false;
        }
        return true;
    }
    
    
}
