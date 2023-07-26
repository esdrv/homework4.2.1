package com.msaggik.homeworke;

public class Eat {
    private String name;
    private String eatDescription;
    private int eatResource;
    private String ingredients;

    public Eat (String name, String eatDescription, int eatResource, String ingredients) {

        String name1 = this.name;
        String eatDescription1 = this.eatDescription;
        int eatResource1 = this.eatResource;
        String ingredients1 = this.ingredients;
    }
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEatDescription(){
        return eatDescription;
    }

    public void setEatDescription(String eatDescription){
        this.eatDescription = eatDescription;
    }

    public int getEatResource(){
return eatResource;
    }

public void setEatResource(int eatResource){
        this.eatResource = eatResource;
}

public String getIngredients(){
        return ingredients;
}
public void setIngredients(String ingredients){
        this.ingredients = ingredients;
}


}


