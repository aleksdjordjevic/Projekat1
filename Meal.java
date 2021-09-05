package MucZaBuc;

 import java.util.List;
        import java.util.UUID;

public class Meal implements Energy {

    private UUID id;
    private List<Nutriment> nutriments;
    private String name;
    private Double kcal;

    public Meal(UUID id, List<Nutriment> nutriments, String name) {
        this.id = id;
        this.nutriments = nutriments;
        this.name = name;
    }

    public Meal(List<Nutriment> nutriments, String name) {
        this.id = UUID.randomUUID();
        this.nutriments = nutriments;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public void setNutriments(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //void add(Nutriment n)
    // Ако не постоји, додаје у листу, aко постоји повећава његову масу
    public void addNutriment(Nutriment n) {
        if (nutriments.contains(n)) {
            System.out.println("Vec postoji");
        } else {
            nutriments.add(n);
        }
    }

    public void remove(Nutriment n) {
        nutriments.remove(n);
    }

    @Override
    public Double getKcal() {
        Double calories = 0.0;
        for(Nutriment n : nutriments){
            calories = calories + n.getKcal();
        }
        return calories;
    }

    public Double getProteins(){
        Double proteins = 0.0;
        for(Nutriment n : nutriments){
            proteins = proteins + n.getProteins();
        }
        return proteins;
    }

    public Double getFiber(){
        Double fiber = 0.0;
        for(Nutriment n : nutriments){
            fiber = fiber + n.getFiber();
        }
        return fiber;
    }

    public Double getCarbohydrates(){
        Double carbohydrates = 0.0;
        for(Nutriment n : nutriments){
            carbohydrates = carbohydrates + n.getCarbohydrates();
        }
        return carbohydrates;
    }

    public boolean equals(Meal o){
        return this.id.equals(o.id);
    }
}
