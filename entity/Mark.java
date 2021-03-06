package entity;
// Generated Apr 11, 2016 12:24:46 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mark generated by hbm2java
 */
public class Mark  implements java.io.Serializable {


     private Integer markId;
     private String markName;
     private Set addCandidates = new HashSet(0);
     private Set votings = new HashSet(0);

    public Mark() {
    }

	
    public Mark(String markName) {
        this.markName = markName;
    }
    public Mark(String markName, Set addCandidates, Set votings) {
       this.markName = markName;
       this.addCandidates = addCandidates;
       this.votings = votings;
    }
   
    public Integer getMarkId() {
        return this.markId;
    }
    
    public void setMarkId(Integer markId) {
        this.markId = markId;
    }
    public String getMarkName() {
        return this.markName;
    }
    
    public void setMarkName(String markName) {
        this.markName = markName;
    }
    public Set getAddCandidates() {
        return this.addCandidates;
    }
    
    public void setAddCandidates(Set addCandidates) {
        this.addCandidates = addCandidates;
    }
    public Set getVotings() {
        return this.votings;
    }
    
    public void setVotings(Set votings) {
        this.votings = votings;
    }




}


