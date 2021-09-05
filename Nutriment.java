package MucZaBuc;


public abstract class Nutriment extends Grocery {
    //Поља: weight - Изражено у грамима, kcal - Калорије на 100г, proteins - Протеини на 100г
    //carbohydrates,fats, fiber
    private Double weight;
    private Double proteins;
    private Double carbohydrates;
    private Double fats;
    private Double fiber;

    public Nutriment(String company, String name, Double kcal, Double weight,
                     Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(company, name, kcal);
        this.weight = weight;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment(String company, String name, Double weight, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(company, name);
        this.weight = weight;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment(Double aDouble, Double weight, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        this.weight = weight;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment(Double weight, Double kcal, Double proteins, String carbohydrates, String fats, String fiber) {
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getProteins() {
        return proteins;
    }

    public void setProteins(Double proteins) {
        this.proteins = proteins;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public Double getFiber() {
        return fiber;
    }

    public void setFiber(Double fiber) {
        this.fiber = fiber;
    }

    public boolean equals(Nutriment o){
        return (this.getName().equals(o.getName()) && this.getCompany().equals(o.getCompany()));
    }

    //*update(company,name,weight,kcal,proteins,carbohydrates,fats,fiber)
//За све параметре користити Object типове: нпр Double уместо Double (да бисмо
//могли да проследимо null)
//Омогућава промену било ког од прослеђених својстава (као set, али све одједном)
//Ако се проследи null за неки од параметара, вредност остаје иста

//  - Укупан број калорија, getTotalProteins() - Укупан број протеина??

// - За све изнад - Укупан број нутријента??
//toString()
//    Company: { company }
//    Name: { name }
//    Weight: 100g
//    Kcal: { kcal }
//    Proteins: { proteins }%
//    Carbohydrates: { carbohydrates }%
//    Fats: { fats }%
//    Fiber: { fiber }%

    @Override
    public String toString() {
        return "Company: " + getCompany() + '\'' +
                "Name: " + getName() + '\'' +
                "Weight: " + getWeight() + " g"+ '\'' +
                "Kcal: " + getKcal() +
                "Proteins: " + getProteins() +" %"+ '\'' +
                "Carbohydrates: '" + getCarbohydrates() + " %"+'\'' +
                "Fats: " + getFats() +" %" + '\'' +
                "Fiber: " + getFiber() + " %"+ '\'';
    }
    //totalNutrientTable()
    //Враћа све исто као toString, али рачуна конкретне вредности за све нутријенте
    //(уместо у процентима)
    //нпр: Weight: 100g - Proteins: 10g
    //А у случају да је за исти производ Weight: 210g - Proteins: 21g
    }




