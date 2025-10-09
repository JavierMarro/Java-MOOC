package JavaMOOC2.Part10.Exercise16Enumclass;

public enum Education {
    PHD("PHD"),
    MA("MA"),
    BA("BA"),
    HS("HS");

    private String acronym;

    private Education(String education){
        this.acronym = education;
    }

    public String getDegree(){
        return this.acronym;
    }

}

// Model answer
// public enum Education {
 
//     HS, BA, MA, PHD
// }
