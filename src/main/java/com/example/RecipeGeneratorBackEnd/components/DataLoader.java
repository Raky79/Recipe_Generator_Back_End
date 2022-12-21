package com.example.RecipeGeneratorBackEnd.components;

import com.example.RecipeGeneratorBackEnd.models.*;
import com.example.RecipeGeneratorBackEnd.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IngredientRepository ingredientRepository;
    @Autowired
    InstructionRepository instructionRepository;

    @Autowired
    QuantityRepository quantityRepository;
    @Autowired
    RecipeRepository recipeRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        // Ingredients list for the 3 seed Recipes

        //Healthy Sausage Casserole
        // Recipe is recipeName, recipeDescription, serving, rating, DietType, CuisineType, MealType
        Recipe recipe1 = new Recipe("Healthy Sausage Casserole","A Sausage Casserole filled with healthy goodness", 4, 3, DietType.NONE, CuisineType.FRENCH, MealType.DINNER);
        recipeRepository.save(recipe1);

        //Quantity and ingredient for red pepper
        Ingredient redPepper = new Ingredient("Red Peppers");
        ingredientRepository.save(redPepper);
        Quantity redPepperQuantity1 = new Quantity(2, "Whole", redPepper, recipe1);
        quantityRepository.save(redPepperQuantity1);


        //Quantity and ingredient for Carrots
        Ingredient carrot = new Ingredient("Carrots");
        ingredientRepository.save(carrot);
        Quantity carrots = new Quantity(2, "Whole", carrot, recipe1);
        quantityRepository.save(carrots);

        //Quantity and ingredient for Red Onions
        Ingredient redOnion = new Ingredient("Red Onions");
        ingredientRepository.save(redOnion);
        Quantity redOnions = new Quantity(2, "Whole", redOnion, recipe1);
        quantityRepository.save(redOnions);

        //Quality and ingredient for Garlic
        Ingredient garlicClove = new Ingredient("Garlic Cloves");
        ingredientRepository.save(garlicClove);
        Quantity garlicCloves = new Quantity(5, "Whole", garlicClove, recipe1);
        quantityRepository.save(garlicCloves);

        //Quantity and ingredient for sausages
        Ingredient leanSausage = new Ingredient("Lean Sausages");
        ingredientRepository.save(leanSausage);
        Quantity leanSausages = new Quantity(8, "Whole", leanSausage, recipe1);
        quantityRepository.save(leanSausages);

        //Quantity and ingredient for Cherry Tomatoes
        Ingredient cherryTomato = new Ingredient("Tin peeled Cherry Tomatoes");
        ingredientRepository.save(cherryTomato);
        Quantity cherryTomatoes = new Quantity(400, "gr", cherryTomato, recipe1);
        quantityRepository.save(cherryTomatoes);

        //Quantity and ingredient for Chickpeas
        Ingredient chickpea = new Ingredient("Tin Chickpeas");
        ingredientRepository.save(chickpea);
        Quantity chickpeas = new Quantity(400, "gr", chickpea, recipe1);
        quantityRepository.save(chickpeas);

        //Quantity and ingredient for Veg Stock
        Ingredient vegStock = new Ingredient("Vegetable Stock");
        ingredientRepository.save(vegStock);
        Quantity vegetableStock = new Quantity(200, "ml", vegStock, recipe1);
        quantityRepository.save(vegetableStock);

        //Quantity and ingredient for Green Chilli
        Ingredient greenChilli = new Ingredient("Green Chilli");
        ingredientRepository.save(greenChilli);
        Quantity greenChillies = new Quantity(1, "Whole", greenChilli, recipe1);
        quantityRepository.save(greenChillies);

        //Quantity and ingredient for Paprika
        Ingredient paprika = new Ingredient("Paprika");
        ingredientRepository.save(paprika);
        Quantity paprikas = new Quantity(1, "tsp", paprika, recipe1);
        quantityRepository.save(paprikas);

        //Quantity and ingredient for French mustard
        Ingredient frenchMustard = new Ingredient("French Mustard");
        ingredientRepository.save(frenchMustard);
        Quantity french_Mustard = new Quantity(2, "tsp", frenchMustard, recipe1);
        quantityRepository.save(french_Mustard);

        //Quantity and ingredient for mixed veg
        Ingredient mixedVegetables = new Ingredient("Frozen mixed vegetables");
        ingredientRepository.save(mixedVegetables);
        Quantity frozenMixedVeg = new Quantity(100, "gr", mixedVegetables, recipe1);
        quantityRepository.save(frozenMixedVeg);

/////////////////////////////////////////
        Recipe recipe2 = new Recipe("Harissa-roasted cauliflower steaks", "Made from a few simple ingredients, this vegan cauliflower dish would not look out of place in a smart restaurant. Serve as a starter, or with a salad for lunch or a light meal. Making your own harissa is really easy, but if you’re short of time you can use a jar of ready-made harissa instead.", 2, 4, DietType.VEGAN, CuisineType.PAKISTANI, MealType.LUNCH);
        recipeRepository.save(recipe2);


        //Harissa-roasted cauliflower steaks
        //Q&I for Cauliflower
        Ingredient cauliflower = new Ingredient("Cauliflower");
        ingredientRepository.save(cauliflower);
        Quantity slicedCauliflower = new Quantity(1, "Whole", cauliflower, recipe2);
        quantityRepository.save(slicedCauliflower);

        //Q&I
        Quantity glarlicCloves = new Quantity(2, "Whole", garlicClove, recipe2);
        quantityRepository.save(glarlicCloves);

        //Q&I
        Ingredient harissaPaste = new Ingredient("Harissa Paste");
        ingredientRepository.save(harissaPaste);
        Quantity harissaSashe = new Quantity(2, "tbsp", harissaPaste, recipe2);
        quantityRepository.save(harissaSashe);

        //Q&I
        Ingredient oliveOil = new Ingredient("Olive Oil");
        ingredientRepository.save(oliveOil);
        Quantity olive_Oil = new Quantity(2, "tsp", oliveOil, recipe2);
        quantityRepository.save(olive_Oil);
        Quantity olive_Oil2 = new Quantity(125, "ml", oliveOil, recipe2);
        quantityRepository.save(olive_Oil2);

        //Q&I
        Ingredient ingredient17 = new Ingredient("Sea Salt flakes");
        ingredientRepository.save(ingredient17);

        Ingredient ingredient18 = new Ingredient("Chilli Flakes");
        ingredientRepository.save(ingredient18);

        Ingredient ingredient19 = new Ingredient("Cumin");
        ingredientRepository.save(ingredient19);

        Ingredient ingredient20 = new Ingredient("Coriander Seeds");
        ingredientRepository.save(ingredient20);

        Ingredient ingredient21 = new Ingredient("Hot smoked Paprika");
        ingredientRepository.save(ingredient21);

        Ingredient ingredient22 = new Ingredient("Garlic Cloves");
        ingredientRepository.save(ingredient22);

        Ingredient ingredient23 = new Ingredient("Large Char-grilled Pepper");
        ingredientRepository.save(ingredient23);

//        Ingredient ingredient24 = new Ingredient("", "", 0, recipe2);
//        ingredientRepository.save(ingredient24);


        Recipe recipe3 =new Recipe("Chickpea and Quinoa Salad", "A super easy and healthy mediterranean dish packed fill of nutrition and goodness.", 4, 4, DietType.VEGETARIAN, CuisineType.FRENCH, MealType.LUNCH);
        recipeRepository.save(recipe3);

        //Chickpea and Quinoa Salad
        Ingredient ingredient25 = new Ingredient("Quinoa");
        ingredientRepository.save(ingredient25);

        Ingredient ingredient26 = new Ingredient("Stock (chicken, beef or vegetable)");
        ingredientRepository.save(ingredient26);

        Ingredient ingredient27 = new Ingredient("Chickpeas");
        ingredientRepository.save(ingredient27);

        Ingredient ingredient28 = new Ingredient("Avocado");
        ingredientRepository.save(ingredient28);

        Ingredient ingredient29 = new Ingredient("Carrots");
        ingredientRepository.save(ingredient29);

        Ingredient ingredient30 = new Ingredient("Cherry Tomatoes");
        ingredientRepository.save(ingredient30);

        Ingredient ingredient31 = new Ingredient("Smoked Paprika");
        ingredientRepository.save(ingredient31);

        Ingredient ingredient32 = new Ingredient("Sea Salt");
        ingredientRepository.save(ingredient32);

        Ingredient ingredient33 = new Ingredient("Cucumber");
        ingredientRepository.save(ingredient33);

        Ingredient ingredient34 = new Ingredient(" olive oil");
        ingredientRepository.save(ingredient34);

        Ingredient ingredient35 = new Ingredient(" Black pepper");
        ingredientRepository.save(ingredient35);

        Ingredient ingredient36 = new Ingredient(" Dried oregano");
        ingredientRepository.save(ingredient36);

        Ingredient ingredient37 = new Ingredient(" Chilli flakes");
        ingredientRepository.save(ingredient37);

        Ingredient ingredient38 = new Ingredient(" Nando's hot sauce");
        ingredientRepository.save(ingredient38);



        //Instructions
        //Healthy Sausage Casserole
        Instruction instruction1 = new Instruction(1, "Preheat the oven to 220C/200C Fan/Gas 7.", recipe1);
        instructionRepository.save(instruction1);

        Instruction instruction2 = new Instruction(2, "Put the peppers, carrots, onions and garlic into a deep baking dish and roast for 20 minutes. Add the sausages and roast for a further 10 minutes.", recipe1);
        instructionRepository.save(instruction2);

        Instruction instruction3 = new Instruction(3, "Turn the oven down to 200C/180C Fan/Gas 6. Pour the tomatoes and chickpeas into the baking dish, then stir in the stock, chilli and paprika. Bake for another 35 minutes.", recipe1);
        instructionRepository.save(instruction3);

        Instruction instruction4 = new Instruction(4, "Stir in the mustard and the frozen mixed veg and return to the oven for 5 minutes. Leave to rest for 10 minutes before serving.", recipe1);
        instructionRepository.save(instruction4);

        //Harissa-roasted cauliflower steaks
        Instruction instruction5 = new Instruction(1, "To make the harissa, place all the ingredients into a food processor with a pinch of salt and blend, or use a pestle and mortar to grind until smooth.", recipe2);
        instructionRepository.save(instruction5);

        Instruction instruction6 = new Instruction(2, "Preheat the oven to 200C/180C Fan/Gas 6.", recipe2);
        instructionRepository.save(instruction6);

        Instruction instruction7 = new Instruction(3, "Rub the garlic cloves over the cauliflower steaks, then rub a teaspoon of the harissa you made and a pinch of salt over each steak, ensuring the entire steak is covered. Drizzle 1 teaspoon of the olive oil over a baking tray. Place the cauliflower on the baking tray and bake for 20 minutes. Turn over and bake for another 15 minutes (or 20–23 minutes if you like a slightly crispier texture).", recipe2);
        instructionRepository.save(instruction7);

        Instruction instruction8 = new Instruction(4, "Oil another baking tray. Wash the reserved leaves and remove any tough stalks. Put the leaves in a bowl along with 1 teaspoon of harissa and ¼ teaspoon of salt then rub the leaves to coat them in harissa. Place on the baking tray. Bake for 15 minutes, or until crisp.", recipe2);
        instructionRepository.save(instruction8);

        Instruction instruction9 = new Instruction(5, "To serve, divide the hummus between two plates and top with the cauliflower steaks. Add the crispy leaves around the plate and finish with a sprinkling of toasted pine nuts and a drizzle of harissa.", recipe2);
        instructionRepository.save(instruction9);

        //Chickpea and Quinoa Salad
        Instruction instruction10 = new Instruction(1, "Add quinoa to a sieve, wash under cold water for around 30 seconds or until\n" +
                "water is clear. Add quinoa to sauce pan with stock, smoked paprika, chilli flakes, pinch of \n" +
                "sea salt. Heat to high heat, when it comes to a boil place a lid, lower to low \n" +
                "heat and set it simmer for 15 minutes. When liquid is absorbed remove from\n" +
                "heat, let it sit for 5 minutes. Then with a fork fluff quinoa. \n", recipe3);
        instructionRepository.save(instruction10);

        Instruction instruction11 = new Instruction(2, "Drain can of chickpeas, use 1tsp of olive oil and fry for 5 minutes until soft and tender in a pan. \n" +
                "Then set aside into a bowl. Grate the carrots, chop the avocado and cucumber, wash and chop the cherry tomatoes and add to same bowl.", recipe3);
        instructionRepository.save(instruction11);

        Instruction instruction12 = new Instruction(3, "Add olive oil, paprika, sea salt, black pepper, lemon juice, oregano to bowl and mix everything together. If you want add hot nando's sauce to give it more flavour.", recipe3);
        instructionRepository.save(instruction12);

        Instruction instruction13 = new Instruction(4, "Add cooled quinoa to bowl. Mix together and enjoy!", recipe3);
        instructionRepository.save(instruction13);


        //Quantity

    }

}
