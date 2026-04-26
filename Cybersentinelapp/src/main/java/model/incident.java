package model;

public class incident {
    private String type;
    private String ipSource;
    private int niveaumenace;

    public incident(){
        this.type = "";
        this.ipSource = "";
        this.niveaumenace = 0;
    }

    public incident (String type, String ipSource, int niveaumenace){
        this.type = type;
        this.ipSource = ipSource;
        this.niveaumenace = niveaumenace;
    }

    public double calculerScore(){
        double Score = ((niveaumenace *1.5)/2);
        return Score;
    }

    public boolean estCritique(){
        double Score = calculerScore();
        if (Score > 7){
            return true;
        }
        return false;
    }

    public int getNiveaumenace() {
        return niveaumenace;
    }

    public String getIpSource() {
        return ipSource;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return (estCritique() ? "[Critique]" : "[Non critique]") + " " + this.type + " | " + this.ipSource + " | Menace : " + this.niveaumenace + " | Score : " + calculerScore();    }
}
