package MucZaBuc;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private List<Nutriment> nutriments;

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public void setNutriments(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public Fridge(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public void add(Nutriment n){
        if(!nutriments.contains(n)) {
            nutriments.add(n);
        }else{
            for(Nutriment nut : nutriments){
                if(n.equals(nut)) {
                    n.setWeight(n.getWeight() + n.getWeight());
                }
            }
        }
    }

    public void remove(Nutriment n){
        nutriments.remove(n);
    }

    public void remove(Nutriment n, Double weight){
        for(Nutriment nut : nutriments){
            if(n.equals(nut)) {
                n.setWeight(weight);
            }
        }
    }

//    Методе:

//    Додаје у листу ако већ не постоји
//    Ако већ постоји, додати повећати његову масу
//    remove(Nutriment n) - У потпуности брише
//    remove(Nutriment n, Double weight)
//    Смањује масу за прослеђену вредност (Ако постоји)
//    getNutriments()


}
