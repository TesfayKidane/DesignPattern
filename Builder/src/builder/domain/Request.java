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
public class Request {
    
    private String requestId;
    private Customer requester;
    private Agent agent;
    private String reqContent;
    private String respContent;
    private boolean isAnswered;
    private boolean isSaleLead;
    private boolean needCallback;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Customer getRequester() {
        return requester;
    }

    public void setRequester(Customer requester) {
        this.requester = requester;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public String getRespContent() {
        return respContent;
    }

    public void setRespContent(String respContent) {
        this.respContent = respContent;
    }

    public boolean isIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public boolean isIsSaleLead() {
        return isSaleLead;
    }

    public void setIsSaleLead(boolean isSaleLead) {
        this.isSaleLead = isSaleLead;
    }

    public boolean isNeedCallback() {
        return needCallback;
    }

    public void setNeedCallback(boolean needCallback) {
        this.needCallback = needCallback;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
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
        final Request other = (Request) obj;
        if (this.isAnswered != other.isAnswered) {
            return false;
        }
        if (this.isSaleLead != other.isSaleLead) {
            return false;
        }
        if (this.needCallback != other.needCallback) {
            return false;
        }
        if (!Objects.equals(this.requestId, other.requestId)) {
            return false;
        }
        if (!Objects.equals(this.reqContent, other.reqContent)) {
            return false;
        }
        if (!Objects.equals(this.respContent, other.respContent)) {
            return false;
        }
        if (!Objects.equals(this.requester, other.requester)) {
            return false;
        }
        if (!Objects.equals(this.agent, other.agent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Request{" + "requestId=" + requestId + ", requester=" + requester + ", agent=" + agent + ", reqContent=" + reqContent + ", respContent=" + respContent + ", isAnswered=" + isAnswered + ", isSaleLead=" + isSaleLead + ", needCallback=" + needCallback + '}';
    }    
}
