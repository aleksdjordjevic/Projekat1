package MucZaBuc;

import java.util.ArrayList;
import java.util.List;

public class Meals {

    private List<Meal> meals;

    public Meals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public void add(Meal m){
        meals.add(m);
    }

    public List<Meal> search(String s){
        List<Meal> result = new ArrayList<Meal>();
        for(Meal m : meals){
            if(m.getName().contains(s)){
                result.add(m);
            }
        }
        return result;
    }

    public List<Nutriment> search(List<Nutriment> nutriment){
        List result = new ArrayList<Meal>();
        for(Meal m : meals){
            if(m.getNutriments().equals(nutriment)){
                result.add(m);
            }
        }
        return result;
    }

    public List<Nutriment> search(Double kcal){
        List result = new ArrayList<Meal>();
        for(Meal m : meals){
            if(Double.compare(kcal, m.getKcal()) <= 0){
                result.add(m);
            }
        }
        return result;
    }

    public List<Nutriment> search(String s, List<Nutriment> nutriment, Double kcal){
        List result = new ArrayList<Meal>();
        result.add(search(kcal));
        result.add(search(s));
        result.add(search(nutriment));
        return result;
    }

    //Методе:

//boolean add(Meal m) - Додаје јело ако већ не постоји
//void remove(Meal m) - Ако постоји у листи, избацује m
//List<Meal> search(String s) - Враћа сва јела која садрже String s у имену
//*List<Meal> search(List<Nutriment> nutriment) - Враћа она јела која могу да се
//направе уз помоћ прослеђене листе намирница
//Коришћење: Корисник унесе све што има у фрижидеру, метода му враћа све
//што може да направи уз помоћ ствари које већ има
//List<Meal> search(Double kcal) - Враћа сва јела са мање од kcal калорија
//toString() - Исписује сва јела:
//[{ id }] | Name: { name }
//нпр. [57b53f64-0809-11ec-9a03-0242ac130003] | Name: Шпагете са
//пилећим сосом

    @Override
    public String toString() { //KAKO DA VIDI NAME,
        String s = "";
        for(Meal m : meals){
            s += "Id: " + m.getId() + " Name:" + m.getName() + "\n";
        }
        return s;
    }


//*Додатно: Шта ако желимо да претражујемо по више параметара?
}
