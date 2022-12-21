import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Products> foodBasket = new HashSet<>();

        Products mango = new Products("Манго", 99.95, 25.1);
        Products pear = new Products("Груши", 77.6, 55.3);
        Products orange = new Products("Апельсины", 30.4, 25.3);
        Products pomegranate = new Products("Гранат", 23.5, 25.3);
        Products bread = new Products("Хлеб", 23.5, 25.3);
        Products milk = new Products("Молоко", 23.5, 25.3);
        Products eggs = new Products("Яйца", 23.5, 25.3);
        Products cherry = new Products("Вишня", 500.5, 3.3);
        Products cucumbers = new Products("Огурцы", 23.5, 25.3);


        Set<Recipe> allRecipe = new HashSet<>();
        Recipe saladFresh = new Recipe("Салат");
        Recipe fruitDish = new Recipe("Фруктовая тарелка");
        Recipe omelet = new Recipe("Омлет с вишней");
        Recipe omelet2 = new Recipe("Омлет с вишней2");

        saladFresh.addRecipeInSet(allRecipe);
        fruitDish.addRecipeInSet(allRecipe);
        omelet.addRecipeInSet(allRecipe);
        omelet2.addRecipeInSet(allRecipe);

        System.out.println("\n========");
        System.out.println("Домашнее задание часть 1");
        System.out.println("Задание 2");

        saladFresh.addProductInRecipe(mango, 3);
        saladFresh.addProductInRecipe(cucumbers, 2);
        fruitDish.addProductInRecipe(pear, 3);
        fruitDish.addProductInRecipe(pomegranate, 2);
        omelet.addProductInRecipe(milk, 0);
        omelet.addProductInRecipe(eggs, 3);
        omelet.addProductInRecipe(bread, 4);

        System.out.println("\n========");
        System.out.println("Домашнее задание часть 1");
        System.out.println("Задание 3");

        Task3 task3 = new Task3();
        task3.addInTask3("12", 12);
        System.out.println(task3.taskMap);
        task3.addInTask3("12", 13);
        System.out.println(task3.taskMap);

        System.out.println("\n========");
        System.out.println("Домашнее задание часть 2");
        System.out.println("Задание 1");

        Map<String, List<Integer>> hW3Task1 = new HashMap<>();
        List<Integer> integerList = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList2 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList3 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList4 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList5 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        hW3Task1.put("Один", integerList);
        hW3Task1.put("Два", integerList2);
        hW3Task1.put("Три", integerList3);
        hW3Task1.put("Четыре", integerList4);
        hW3Task1.put("Пять", integerList5);
        System.out.println(hW3Task1);

        Map<String, Integer> targetHW3Task1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> target : hW3Task1.entrySet()) {
            targetHW3Task1.put(target.getKey(), calcSumOfList(target.getValue()));
        }
        System.out.println(targetHW3Task1);

        System.out.println("\n========");
        System.out.println("Домашнее задание часть 2");
        System.out.println("Задание 2");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 10; i++) {
            String s = "String" + i;
            linkedHashMap.put(i, s);
        }
        System.out.println(linkedHashMap);


    }

    public static int calcSumOfList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}

