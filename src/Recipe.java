import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Recipe {


    private HashMap<Products,Integer> productsMap;
    private double sumProducts;
    private String name;

    public Recipe(String name) {

        this.productsMap = new HashMap<>();
        this.name = name;
    }


    public HashMap<Products,Integer> getProductsMap() {
        return productsMap;
        }
    public double getSumProducts() {
        return sumProducts;
            }
    public String getName() {
        return name;
            }

    public void addProductInRecipe(Products products, int amount) {
        amount = amount == 0 ? 1 : amount;
        this.productsMap.put(products, amount);
        for (Products product : this.productsMap.keySet() ) {
            this.sumProducts += product.getCost() * this.productsMap.get(product);
                        }
                    }
    public void addRecipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " уже находится в множестве");
        }
    }


     @Override
     public String toString() {
         return "Recipe{" +
                 "recipeSet=" + productsMap +
                 ", sumProducts=" + sumProducts +
                 ", name='" + name + '\'' +
                 '}';
     }



         @Override
        public int hashCode() {
        return Objects.hash(productsMap, sumProducts, name);
         }
                            }

