package Builder;

/** "Produkt" */
class Pizza {
    String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough)     { this.dough = dough; }
    public void setSauce(String sauce)     { this.sauce = sauce; }
    public void setTopping(String topping) { this.topping = topping; }


    //for tests
    public String getDescription(){
        return "Dough: " + dough + ", Sauce: " + sauce + ", Topping: " + topping;
    }
}